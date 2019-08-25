package com.enesdokuz.retrofit.models;

import android.content.Intent;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/***
 * Retrofit
 * Enes Dokuz enesdokuz
 * www.enesdokuz.com
 * 2019-08-25
 ***/
public class OrbitParams {

    @SerializedName("reference_system")
    @Expose
    public String referenceSystem;
    @SerializedName("regime")
    @Expose
    public String regime;
    @SerializedName("longitude")
    @Expose
    public Object longitude;
    @SerializedName("semi_major_axis_km")
    @Expose
    public Object semiMajorAxisKm;
    @SerializedName("eccentricity")
    @Expose
    public Object eccentricity;
    @SerializedName("periapsis_km")
    @Expose
    public Integer periapsisKm;
    @SerializedName("apoapsis_km")
    @Expose
    public Integer apoapsisKm;
    @SerializedName("inclination_deg")
    @Expose
    public Integer inclinationDeg;
    @SerializedName("period_min")
    @Expose
    public Object periodMin;
    @SerializedName("lifespan_years")
    @Expose
    public Object lifespanYears;
    @SerializedName("epoch")
    @Expose
    public Object epoch;
    @SerializedName("mean_motion")
    @Expose
    public Object meanMotion;
    @SerializedName("raan")
    @Expose
    public Object raan;
    @SerializedName("arg_of_pericenter")
    @Expose
    public Object argOfPericenter;
    @SerializedName("mean_anomaly")
    @Expose
    public Object meanAnomaly;

}
