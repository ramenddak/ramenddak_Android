package com.app.ramenddak.ui.component

import android.util.Log
import android.widget.Toast
import com.app.ramenddak.R
import com.app.ramenddak.databinding.ActivityResultBinding
import com.app.ramenddak.network.GptRetrofitBuilder
import com.app.ramenddak.network.dto.ChatDto
import com.app.ramenddak.network.dto.ChatGptRequest
import com.app.ramenddak.network.dto.ChatGptResponse
import com.example.presentation.base.BaseActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ResultActivity : BaseActivity<ActivityResultBinding>(R.layout.activity_result) {
    private val keyWords = listOf("따뜻한", "고소한", "국물")
    override fun init() {
        getGptAns()
    }

    private fun getGptAns() {
        GptRetrofitBuilder.api.getChatCompletion(
            ChatGptRequest(
                model = "gpt-3.5-turbo",
                messages = listOf(
                    ChatDto(
                        role = "user",
                        content = keyWords.toString() + "라면 한가지만 추천해줘"
                    )
                )
            )
        ).enqueue(object : Callback<ChatGptResponse> {
            override fun onResponse(
                call: Call<ChatGptResponse>,
                response: Response<ChatGptResponse>
            ) {
                Log.d("GPT Ans", response.body().toString())
                setAnswerOnUi(response.body()!!.choices[0].message.content)
            }

            override fun onFailure(call: Call<ChatGptResponse>, t: Throwable) {
                Log.d("GPT", t.toString())
                Toast.makeText(this@ResultActivity, "라면 추천을 실패했습니다...", Toast.LENGTH_SHORT).show()
            }

        })
    }

    private fun setAnswerOnUi(ans: String) {
        binding.ramenName.text = ans
    }
}