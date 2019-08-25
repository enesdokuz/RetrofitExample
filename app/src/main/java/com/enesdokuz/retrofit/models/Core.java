package com.enesdokuz.retrofit.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/***
 * Retrofit
 * Enes Dokuz enesdokuz
 * www.enesdokuz.com
 * 2019-08-25
 ***/
public class Core {

    @SerializedName("core_serial")
    @Expose
    public String coreSerial;
    @SerializedName("flight")
    @Expose
    public Integer flight;
    @SerializedName("block")
    @Expose
    public Object block;
    @SerializedName("gridfins")
    @Expose
    public Boolean gridfins;
    @SerializedName("legs")
    @Expose
    public Boolean legs;
    @SerializedName("reused")
    @Expose
    public Boolean reused;
    @SerializedName("land_success")
    @Expose
    public Object landSuccess;
    @SerializedName("landing_intent")
    @Expose
    public Boolean landingIntent;
    @SerializedName("landing_type")
    @Expose
    public Object landingType;
    @SerializedName("landing_vehicle")
    @Expose
    public Object landingVehicle;
}
