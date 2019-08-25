package com.enesdokuz.retrofit.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/***
 * Retrofit
 * Enes Dokuz enesdokuz
 * www.enesdokuz.com
 * 2019-08-25
 ***/
public class LaunchSite {

    @SerializedName("site_id")
    @Expose
    public String siteId;
    @SerializedName("site_name")
    @Expose
    public String siteName;
    @SerializedName("site_name_long")
    @Expose
    public String siteNameLong;
}
