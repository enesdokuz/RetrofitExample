package com.enesdokuz.retrofit.interfaces;

import com.enesdokuz.retrofit.models.Repo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/***
 * Retrofit
 * Enes Dokuz enesdokuz
 * www.enesdokuz.com
 * 2019-08-25
 ***/
public interface ApiInterface {

    @GET("/v2/launches")
    Call<List<Repo>> getRepo();
}
