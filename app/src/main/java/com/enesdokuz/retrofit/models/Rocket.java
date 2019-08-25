package com.enesdokuz.retrofit.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/***
 * Retrofit
 * Enes Dokuz enesdokuz
 * www.enesdokuz.com
 * 2019-08-25
 ***/
public class Rocket {

    @SerializedName("rocket_id")
    @Expose
    public String rocketId;
    @SerializedName("rocket_name")
    @Expose
    public String rocketName;
    @SerializedName("rocket_type")
    @Expose
    public String rocketType;
    @SerializedName("first_stage")
    @Expose
    public FirstStage firstStage;
    @SerializedName("second_stage")
    @Expose
    public SecondStage secondStage;
    @SerializedName("fairings")
    @Expose
    public Fairings fairings;
}
