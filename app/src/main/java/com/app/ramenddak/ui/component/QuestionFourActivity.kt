package com.app.ramenddak.ui.component

import android.content.Intent
import com.app.ramenddak.R
import com.app.ramenddak.databinding.ActivityQuestionFourBinding
import com.example.presentation.base.BaseActivity

class QuestionFourActivity :
    BaseActivity<ActivityQuestionFourBinding>(R.layout.activity_question_four) {
    override fun init() {
        with(binding) {
            question.text = intent.getStringExtra("question")
            yesBtn.text = intent.getStringExtra("YesText")
            noBtn.text = intent.getStringExtra("NoText")
        }
        onClick(intent.getStringExtra("question")!!)
    }

    private fun onClick(question: String) {
        val resultIntent = Intent(this, ResultActivity::class.java)
        with(binding) {
            yesBtn.setOnClickListener {
                if (question.contains("차가운건")) {
                    resultIntent.putExtra("ramen", arrayOf("진 비빔면", "팔도 비빔면", "둥지 비빔면"))
                    startActivity(resultIntent)
                } else {
                    resultIntent.putExtra(
                        "ramen",
                        arrayOf("삼양라멸", "육개장", "김치사발면", "왕뚜껑", "새우탕", "둥지 물냉", "멸치 칼국수 순한맛")
                    )
                    startActivity(resultIntent)
                }
            }
            noBtn.setOnClickListener {
                if (question.contains("차가운건")) {
                    resultIntent.putExtra("ramen", arrayOf("콕콕콕 스파게티", "콕콕콕 치즈볶이", "크림진짬뽕"))
                    startActivity(resultIntent)
                } else {
                    resultIntent.putExtra("ramen", arrayOf("너구리", "카구리", "참깨라면", "튀김우동", "진라면 순한맛"))
                    startActivity(resultIntent)
                }
            }
        }
    }
}