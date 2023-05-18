package com.app.ramenddak.network.dto

import com.google.gson.annotations.SerializedName

data class UsageDto(
    @SerializedName("prompt_tokens")
    val prompt_tokens: Int,
    @SerializedName("completion_tokens")
    val completion_tokens: Int,
    @SerializedName("total_tokens")
    val total_tokens: Int
)
