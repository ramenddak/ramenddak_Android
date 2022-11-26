package com.app.ramenddak.ui.component

import android.content.Intent
import com.app.ramenddak.R
import com.app.ramenddak.databinding.ActivityQuestionThreeBinding
import com.example.presentation.base.BaseActivity

class QuestionThreeActivity :
    BaseActivity<ActivityQuestionThreeBinding>(R.layout.activity_question_three) {

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
        val questionFourIntent = Intent(this, QuestionFourActivity::class.java)
        with(binding) {
            yesBtn.setOnClickListener {
                if (question.contains("하얀")) {
                    resultIntent.putExtra("ramen", arrayOf("꼬꼬면", "나가사끼 짬뽕", "사리곰탕"))
                    startActivity(resultIntent)
                } else if (question.contains("불닭")) {
                    resultIntent.putExtra(
                        "ramen",
                        arrayOf(
                            "치즈 불닭볶음면",
                            "까르보 불닭볶음면",
                            "짜장 불닭볶음면",
                            "핵불닭볶음면",
                            "4가지 치즈불닭볶음면",
                            "크림 까르보 불닭볶음면"
                        )
                    )
                    startActivity(resultIntent)
                } else {
                    resultIntent.putExtra("ramen", arrayOf("짜파게티", "공화춘"))
                    startActivity(resultIntent)
                }
            }
            noBtn.setOnClickListener {
                if (question.contains("하얀")) {
                    questionFourIntent.putExtra("question", "면발은 어떤게 좋아?")
                    questionFourIntent.putExtra("YesText", "얇은걸로\n가던가ㅋㅋ")
                    questionFourIntent.putExtra("NoText", "굵은걸로 줘봐\n한번ㅋㅋ")
                    startActivity(questionFourIntent)
                } else if (question.contains("불닭")) {
                    resultIntent.putExtra("ramen", arrayOf("홍라면", "신볶", "틈새볶음면"))
                    startActivity(resultIntent)
                } else {
                    questionFourIntent.putExtra("question", "차가운건 어때?")
                    questionFourIntent.putExtra("YesText", "어디 한번\n줘봐 ㅋㅋ")
                    questionFourIntent.putExtra("NoText", "치워주라 ㅋㅋ")
                    startActivity(questionFourIntent)
                }
            }
        }
    }
}