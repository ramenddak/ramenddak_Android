package com.app.ramenddak.network.dto

import com.google.gson.annotations.SerializedName

data class ChatGptRequest(
    @SerializedName("model") val model: String,
    @SerializedName("messages") val messages: List<ChatDto>
)