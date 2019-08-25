package com.enesdokuz.retrofit.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/***
 * Retrofit
 * Enes Dokuz enesdokuz
 * www.enesdokuz.com
 * 2019-08-25
 ***/
public class Payload {

    @SerializedName("payload_id")
    @Expose
    public String payloadId;
    @SerializedName("norad_id")
    @Expose
    public List<Object> noradId = null;
    @SerializedName("reused")
    @Expose
    public Boolean reused;
    @SerializedName("customers")
    @Expose
    public List<String> customers = null;
    @SerializedName("nationality")
    @Expose
    public String nationality;
    @SerializedName("manufacturer")
    @Expose
    public String manufacturer;
    @SerializedName("payload_type")
    @Expose
    public String payloadType;
    @SerializedName("payload_mass_kg")
    @Expose
    public Integer payloadMassKg;
    @SerializedName("payload_mass_lbs")
    @Expose
    public Integer payloadMassLbs;
    @SerializedName("orbit")
    @Expose
    public String orbit;
    @SerializedName("orbit_params")
    @Expose
    public OrbitParams orbitParams;
}
