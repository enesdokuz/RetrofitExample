package com.enesdokuz.retrofit.interfaces;

/***
 * Retrofit
 * enesdokuz enesdokuz 2019-10-15
 ***/
public interface ApiResponseInterface {
    void onApiResponse(Object model, Boolean isSuccess, int type);
}
