package com.app.ramenddak.ui.component

import android.content.Intent
import com.app.ramenddak.R
import com.app.ramenddak.databinding.ActivityQuestionThreeBinding
import com.example.presentation.base.BaseActivity

class QuestionThreeActivity :
    BaseActivity<ActivityQuestionThreeBinding>(R.layout.activity_question_three) {
    private var keyWords = intent.getStringExtra("keyWords").toString()

    override fun init() {
        onClick()
    }

    private fun onClick() {
        with(binding) {
            yesBtn.setOnClickListener {
                startActitivty("자극적인")
            }
            noBtn.setOnClickListener {
                startActitivty("담백한")
            }
        }
    }

    private fun startActitivty(word: String) {
        val intent = Intent(this, QuestionFourActivity::class.java)

        intent.putExtra("keyWords", "$keyWords $word")
        startActivity(intent)
    }
}