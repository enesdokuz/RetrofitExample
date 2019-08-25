package com.enesdokuz.retrofit.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/***
 * Retrofit
 * Enes Dokuz enesdokuz
 * www.enesdokuz.com
 * 2019-08-25
 ***/
public class Telemetry {

    @SerializedName("flight_club")
    @Expose
    public Object flightClub;
}
