package com.oswaldo.vixtest.home.data.dto


import com.google.gson.annotations.SerializedName

data class PortraitFillImageX(
    @SerializedName("filePath")
    val filePath: String,
    @SerializedName("imageRole")
    val imageRole: String,
    @SerializedName("link")
    val link: String,
    @SerializedName("mediaType")
    val mediaType: String
)