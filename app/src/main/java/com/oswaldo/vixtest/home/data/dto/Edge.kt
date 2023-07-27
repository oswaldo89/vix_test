package com.oswaldo.vixtest.home.data.dto


import com.google.gson.annotations.SerializedName

data class Edge(
    @SerializedName("cursor")
    val cursor: String,
    @SerializedName("node")
    val node: Node
)