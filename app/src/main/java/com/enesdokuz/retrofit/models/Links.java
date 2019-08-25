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
public class Links {

    @SerializedName("mission_patch")
    @Expose
    public String missionPatch;
    @SerializedName("mission_patch_small")
    @Expose
    public String missionPatchSmall;
    @SerializedName("reddit_campaign")
    @Expose
    public Object redditCampaign;
    @SerializedName("reddit_launch")
    @Expose
    public Object redditLaunch;
    @SerializedName("reddit_recovery")
    @Expose
    public Object redditRecovery;
    @SerializedName("reddit_media")
    @Expose
    public Object redditMedia;
    @SerializedName("presskit")
    @Expose
    public Object presskit;
    @SerializedName("article_link")
    @Expose
    public String articleLink;
    @SerializedName("wikipedia")
    @Expose
    public String wikipedia;
    @SerializedName("video_link")
    @Expose
    public String videoLink;
    @SerializedName("youtube_id")
    @Expose
    public String youtubeId;
    @SerializedName("flickr_images")
    @Expose
    public List<Object> flickrImages = null;
}
