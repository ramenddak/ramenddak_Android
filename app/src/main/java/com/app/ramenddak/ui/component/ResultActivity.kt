package com.app.ramenddak.ui.component

import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP
import android.util.Log
import android.widget.Toast
import com.app.ramenddak.R
import com.app.ramenddak.databinding.ActivityResultBinding
import com.app.ramenddak.network.GptRetrofitBuilder
import com.app.ramenddak.network.dto.ChatDto
import com.app.ramenddak.network.dto.ChatGptRequest
import com.app.ramenddak.network.dto.ChatGptResponse
import com.app.ramenddak.ui.base.LottieDialog
import com.example.presentation.base.BaseActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ResultActivity : BaseActivity<ActivityResultBinding>(R.layout.activity_result) {
    private lateinit var keyWords: String
    private val dialog = LottieDialog()

    override fun init() {
        window.statusBarColor = getColor(R.color.white)
        dialog.show(supportFragmentManager, "loading_lottie")
        keyWords = intent.getStringExtra("keyWords").toString()
        Log.d("keyword",keyWords)
        getGptAns()
        goMainBtnOnClick()
    }

    private fun getGptAns() {
        GptRetrofitBuilder.api.getChatCompletion(
            ChatGptRequest(
                model = "gpt-3.5-turbo",
                messages = listOf(
                    ChatDto(
                        role = "user",
                        content = keyWords + "시중에 파는 라면 한가지만 추천해줘 이유와 함께 30글자로 자연스럽게 설명해줘"
                    )
                )
            )
        ).enqueue(object : Callback<ChatGptResponse> {
            override fun onResponse(
                call: Call<ChatGptResponse>,
                response: Response<ChatGptResponse>
            ) {
                Log.d("GPT Ans", response.code().toString())
                setAnswerOnUi(response.body()!!.choices[0].message.content)
                dialog.dismiss()
            }

            override fun onFailure(call: Call<ChatGptResponse>, t: Throwable) {
                Log.d("GPT", t.toString())
                Toast.makeText(this@ResultActivity, "라면 추천을 실패했습니다...", Toast.LENGTH_SHORT).show()
                dialog.dismiss()
            }

        })
    }

    private fun setAnswerOnUi(ans: String) {
        binding.ramenExplanation.text = ans
    }

    private fun goMainBtnOnClick() {
        binding.goMainBtn.setOnClickListener {
            val intent = Intent(this, StartActivity::class.java)
            intent.addFlags(FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }
    }
}