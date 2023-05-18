package com.app.ramenddak.ui.component

import android.content.Intent
import com.app.ramenddak.R
import com.app.ramenddak.databinding.ActivityMainBinding
import com.example.presentation.base.BaseActivity

class QuestionOneActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    override fun init() {
        onClick()
    }

    private fun onClick() {
        val intent = Intent(this, QuestionTwoActivity::class.java)
        with(binding) {
            yesBtn.setOnClickListener {
                startActitivty("국물이 있는")
            }
            noBtn.setOnClickListener {
                startActitivty("국물이 없는")
            }
        }
    }

    private fun startActitivty(word: String) {
        val intent = Intent(this, QuestionThreeActivity::class.java)

        intent.putExtra("keyWords", word)
        startActivity(intent)
    }
}