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
                intent.putExtra("question-ONE", "YES")
                startActivity(intent)
            }
            noBtn.setOnClickListener {
                intent.putExtra("question-ONE", "NO")
                startActivity(intent)
            }
        }
    }
}