package com.app.ramenddak.ui.component

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
    }
}