package com.app.ramenddak.ui.component

import android.content.Intent
import android.util.Log
import com.app.ramenddak.R
import com.app.ramenddak.databinding.ActivityQuestionTwoBinding
import com.example.presentation.base.BaseActivity

class QuestionTwoActivity :
    BaseActivity<ActivityQuestionTwoBinding>(R.layout.activity_question_two) {
    private var questionOne = ""

    override fun init() {
        questionOne = intent.getStringExtra("question-ONE").toString()
        Log.d("TAAAG", questionOne)
        onClick()
    }

    private fun onClick() {
        val questionThreeIntent = Intent(this, QuestionThreeActivity::class.java)
        val resultIntent = Intent(this, ResultActivity::class.java)
        with(binding) {
            yesBtn.setOnClickListener {
                if (questionOne == "YES") {
                    resultIntent.putExtra("ramen", arrayOf("틈새라면", "킹뚜컹", "멸치 칼국수 매운맛"))
                    startActivity(resultIntent)
                } else {
                    questionThreeIntent.putExtra("question", "불닭 시리즈는 어때?")
                    questionThreeIntent.putExtra("YesText", "불닭?\n쉬워ㅋㅋ")
                    questionThreeIntent.putExtra("NoText", "식상해..")
                    startActivity(questionThreeIntent)
                }
            }
            noBtn.setOnClickListener {
                if (questionOne == "YES") {
                    questionThreeIntent.putExtra("question", "하얀 국물은 어때?")
                    questionThreeIntent.putExtra("YesText", "그걸로 가던가\nㅋㅋ")
                    questionThreeIntent.putExtra("NoText", "ㅋㅋ 왜저래")
                    startActivity(questionThreeIntent)
                } else {
                    questionThreeIntent.putExtra("question", "짜장라면은 어때?")
                    questionThreeIntent.putExtra("YesText", "하오츠~\n하오츠~")
                    questionThreeIntent.putExtra("NoText", "니 치팔러마?")
                    startActivity(questionThreeIntent)
                }
            }
            midleBtn.setOnClickListener {
                if (questionOne == "YES") {
                    resultIntent.putExtra("ramen", arrayOf("신라면", "진매", "진짬뽕", "열라면"))
                    startActivity(resultIntent)
                } else {
                    resultIntent.putExtra("ramen", arrayOf("콕콕콕 라면볶이", "크림진짬뽕, 간짬뽕", "사천짜파게티"))
                    startActivity(resultIntent)
                }
            }
        }
    }
}