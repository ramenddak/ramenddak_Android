package com.app.ramenddak.network.dto

import com.google.gson.annotations.SerializedName

data class ChatDto(
    @SerializedName("role")
    val role: String,
    @SerializedName("content")
    val content: String
)
