package com.oswaldo.vixtest.home.data.dto


import com.google.gson.annotations.SerializedName

data class HeroTarget(
    @SerializedName("badges")
    val badges: List<String>,
    @SerializedName("contentUsage")
    val contentUsage: Any,
    @SerializedName("dateModified")
    val dateModified: String,
    @SerializedName("dateReleased")
    val dateReleased: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("genres")
    val genres: List<String>,
    @SerializedName("id")
    val id: String,
    @SerializedName("imageAssets")
    val imageAssets: List<ImageAsset>,
    @SerializedName("ratings")
    val ratings: List<Rating>,
    @SerializedName("title")
    val title: String,
    @SerializedName("videoType")
    val videoType: String,
    @SerializedName("videoTypeData")
    val videoTypeData: VideoTypeData,
    @SerializedName("vodAvailability")
    val vodAvailability: VodAvailability
)