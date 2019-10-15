package com.enesdokuz.retrofit.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/***
 * Retrofit
 * Enes Dokuz enesdokuz
 * www.enesdokuz.com
 * 2019-08-25
 ***/
public class Reuse {

    @SerializedName("core")
    @Expose
    public Boolean core;
    @SerializedName("side_core1")
    @Expose
    public Boolean sideCore1;
    @SerializedName("side_core2")
    @Expose
    public Boolean sideCore2;
    @SerializedName("fairings")
    @Expose
    public Boolean fairings;
    @SerializedName("capsule")
    @Expose
    public Boolean capsule;

    public void setCore(Boolean core) {
        this.core = core;
    }

    public Boolean getCore() {
        return core;
    }
}
