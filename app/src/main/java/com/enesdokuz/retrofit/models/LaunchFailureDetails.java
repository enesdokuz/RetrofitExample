package com.enesdokuz.retrofit.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/***
 * Retrofit
 * Enes Dokuz enesdokuz
 * www.enesdokuz.com
 * 2019-08-25
 ***/
public class LaunchFailureDetails {

    @SerializedName("time")
    @Expose
    public Integer time;
    @SerializedName("altitude")
    @Expose
    public Object altitude;
    @SerializedName("reason")
    @Expose
    public String reason;
}
