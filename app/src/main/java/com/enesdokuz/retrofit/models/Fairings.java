package com.enesdokuz.retrofit.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/***
 * Retrofit
 * Enes Dokuz enesdokuz
 * www.enesdokuz.com
 * 2019-08-25
 ***/
public class Fairings {

    @SerializedName("reused")
    @Expose
    public Boolean reused;
    @SerializedName("recovery_attempt")
    @Expose
    public Boolean recoveryAttempt;
    @SerializedName("recovered")
    @Expose
    public Boolean recovered;
    @SerializedName("ship")
    @Expose
    public Object ship;
}
