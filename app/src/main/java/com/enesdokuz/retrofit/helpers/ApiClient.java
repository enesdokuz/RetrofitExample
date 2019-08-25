package com.enesdokuz.retrofit.helpers;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/***
 * Retrofit
 * Enes Dokuz enesdokuz
 * www.enesdokuz.com
 * 2019-08-25
 ***/
public class ApiClient {

    public static OkHttpClient getClient() {
        OkHttpClient.Builder b = new OkHttpClient.Builder();
        b.readTimeout(1, TimeUnit.MINUTES);
        b.writeTimeout(1, TimeUnit.MINUTES);
        return b.build();
    }

    private static Retrofit retrofit = null;
    private static String Base_Url = "https://api.spacexdata.com/";

    public static Retrofit getRetrofit() {

        if (retrofit == null) {

            retrofit = new Retrofit.Builder()
                    .baseUrl(Base_Url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(getClient())
                    .build();
            return retrofit;
        }
        return retrofit;
    }
}
