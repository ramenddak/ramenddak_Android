package com.app.ramenddak.ui.component

import android.content.Intent
import com.app.ramenddak.R
import com.app.ramenddak.databinding.ActivityQuestionTwoBinding
import com.example.presentation.base.BaseActivity

class QuestionTwoActivity :
    BaseActivity<ActivityQuestionTwoBinding>(R.layout.activity_question_two) {
    private var keyWords = intent.getStringExtra("keyWords").toString()

    override fun init() {
        onClick()
    }

    private fun onClick() {
        with(binding) {
            yesBtn.setOnClickListener {
                startActitivty("매운")
            }
            noBtn.setOnClickListener {
                startActitivty("적당히 매콤한")
            }
            midleBtn.setOnClickListener {
                startActitivty("맵지 않은")
            }
        }
    }

    private fun startActitivty(word: String) {
        val intent = Intent(this, QuestionThreeActivity::class.java)

        intent.putExtra("keyWords", "$keyWords $word")
        startActivity(intent)
    }
}