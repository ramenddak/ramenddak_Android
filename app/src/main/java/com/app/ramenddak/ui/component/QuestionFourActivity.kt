package com.app.ramenddak.ui.component

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
    }
}