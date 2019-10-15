package com.enesdokuz.retrofit.services;

import com.enesdokuz.retrofit.interfaces.ApiInterface;
import com.enesdokuz.retrofit.interfaces.ApiResponseInterface;
import com.enesdokuz.retrofit.models.Repo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/***
 * Retrofit
 * enesdokuz enesdokuz 2019-10-15
 ***/
public class RetrofitService {

    private static RetrofitService instance = null;
    private static final String BASE_URL = "https://api.spacexdata.com/";
    private ApiInterface apiInterface;

    private RetrofitService() {
        Retrofit retrofit = new Retrofit.Builder()
                .client(getClient())
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        apiInterface = retrofit.create(ApiInterface.class);
    }

    public static RetrofitService getInstance() {
        if (instance == null) {
            instance = new RetrofitService();
        }
        return instance;
    }

    private static OkHttpClient getClient() {

        OkHttpClient.Builder b = new OkHttpClient.Builder();
        b.readTimeout(30, TimeUnit.SECONDS);
        b.writeTimeout(60, TimeUnit.SECONDS);
        return b.build();
    }

    private <T> void callRetrofit(final ApiResponseInterface apiResponseInterface, Call<T> call, final int type) {
        try {
            call.enqueue(new Callback<T>() {
                @Override
                public void onResponse(Call<T> call, Response<T> response) {
                    if (response.body() != null) {
                        apiResponseInterface.onApiResponse(response.body(), true, type);
                    }
                }

                @Override
                public void onFailure(Call<T> call, Throwable t) {
                    apiResponseInterface.onApiResponse("", false, type);
                }
            });
        } catch (Exception e) {

        }
    }

    public void getRepo(ApiResponseInterface apiResponseInterface, int type) {
        Call<List<Repo>> call = apiInterface.getRepo();
        callRetrofit(apiResponseInterface, call, type);
    }

}