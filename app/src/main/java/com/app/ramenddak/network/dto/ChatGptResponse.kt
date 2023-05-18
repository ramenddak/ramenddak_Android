package com.app.ramenddak.network.dto

import com.google.gson.annotations.SerializedName

data class ChatGptResponse(
    @SerializedName("id")
    val id: String,
    @SerializedName("object")
    val `object`: String,
    @SerializedName("created")
    val created: Int,
    @SerializedName("choices")
    val choices: List<ChoicesDto>,
    @SerializedName("usage")
    val usage: UsageDto
)