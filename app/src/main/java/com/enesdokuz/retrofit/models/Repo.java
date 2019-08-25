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
public class Repo {

    @SerializedName("flight_number")
    @Expose
    public Integer flightNumber;
    @SerializedName("mission_name")
    @Expose
    public String missionName;
    @SerializedName("mission_id")
    @Expose
    public List<Object> missionId = null;
    @SerializedName("upcoming")
    @Expose
    public Boolean upcoming;
    @SerializedName("launch_year")
    @Expose
    public String launchYear;
    @SerializedName("launch_date_unix")
    @Expose
    public Integer launchDateUnix;
    @SerializedName("launch_date_utc")
    @Expose
    public String launchDateUtc;
    @SerializedName("launch_date_local")
    @Expose
    public String launchDateLocal;
    @SerializedName("is_tentative")
    @Expose
    public Boolean isTentative;
    @SerializedName("tentative_max_precision")
    @Expose
    public String tentativeMaxPrecision;
    @SerializedName("tbd")
    @Expose
    public Boolean tbd;
    @SerializedName("launch_window")
    @Expose
    public Integer launchWindow;
    @SerializedName("rocket")
    @Expose
    public Rocket rocket;
    @SerializedName("ships")
    @Expose
    public List<Object> ships = null;
    @SerializedName("telemetry")
    @Expose
    public Telemetry telemetry;
    @SerializedName("reuse")
    @Expose
    public Reuse reuse;
    @SerializedName("launch_site")
    @Expose
    public LaunchSite launchSite;
    @SerializedName("launch_success")
    @Expose
    public Boolean launchSuccess;
    @SerializedName("launch_failure_details")
    @Expose
    public LaunchFailureDetails launchFailureDetails;
    @SerializedName("links")
    @Expose
    public Links links;
    @SerializedName("details")
    @Expose
    public String details;
    @SerializedName("static_fire_date_utc")
    @Expose
    public String staticFireDateUtc;
    @SerializedName("static_fire_date_unix")
    @Expose
    public Integer staticFireDateUnix;
    @SerializedName("timeline")
    @Expose
    public Timeline timeline;
    @SerializedName("crew")
    @Expose
    public Object crew;
    @SerializedName("last_wiki_update")
    @Expose
    public Object lastWikiUpdate;
    @SerializedName("is_date_from_wiki")
    @Expose
    public Object isDateFromWiki;
}
