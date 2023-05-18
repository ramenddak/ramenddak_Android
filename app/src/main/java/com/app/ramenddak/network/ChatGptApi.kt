package com.app.ramenddak.network

import com.app.ramenddak.network.dto.ChatGptRequest
import com.app.ramenddak.network.dto.ChatGptResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface ChatGptApi {
    @Headers(
        "Content-Type: application/json",
        "Authorization: Bearer ${Secret.API_KEY}"
    )
    @POST("chat/completions")
    fun getChatCompletion(@Body body: ChatGptRequest): Call<ChatGptResponse>
}