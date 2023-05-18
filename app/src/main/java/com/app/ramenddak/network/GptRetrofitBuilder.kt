package com.app.ramenddak.network

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object GptRetrofitBuilder {
    private val BASE_URL = "https://api.openai.com/v1/"

    val client = OkHttpClient.Builder()
        .connectTimeout(30, TimeUnit.SECONDS) // 연결 시간 초과 설정
        .readTimeout(30, TimeUnit.SECONDS) // 읽기 시간 초과 설정
        .build()

    val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build()

    val api = retrofit.create(ChatGptApi::class.java)
}