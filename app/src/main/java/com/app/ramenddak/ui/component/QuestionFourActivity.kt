package com.app.ramenddak.ui.component

import android.content.Intent
import com.app.ramenddak.R
import com.app.ramenddak.databinding.ActivityQuestionFourBinding
import com.example.presentation.base.BaseActivity

class QuestionFourActivity :
    BaseActivity<ActivityQuestionFourBinding>(R.layout.activity_question_four) {
    private lateinit var keyWords: String
    override fun init() {
        keyWords = intent.getStringExtra("keyWords").toString()
        onClick()
    }

    private fun onClick() {
        with(binding) {
            yesBtn.setOnClickListener {
                startActitivty("")
            }
            noBtn.setOnClickListener {
                startActitivty("저렴한")
            }
        }
    }

    private fun startActitivty(word: String) {
        val intent = Intent(this, ResultActivity::class.java)

        intent.putExtra("keyWords", "$keyWords $word")
        startActivity(intent)
    }
}