package com.app.ramenddak.network.dto

import com.google.gson.annotations.SerializedName

data class ChoicesDto(
    @SerializedName("index")
    val index: Int,
    @SerializedName("message")
    val message: ChatDto,
    @SerializedName("finish_reason")
    val finish_reason: String
)
