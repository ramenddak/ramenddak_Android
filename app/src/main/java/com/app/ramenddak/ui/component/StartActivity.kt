package com.app.ramenddak.ui.component

import android.content.Intent
import com.app.ramenddak.R
import com.app.ramenddak.databinding.ActivityStartBinding
import com.example.presentation.base.BaseActivity

class StartActivity : BaseActivity<ActivityStartBinding>(R.layout.activity_start) {
    override fun init() {
        binding.goMain.setOnClickListener {
            startActivity(Intent(this, QuestionOneActivity::class.java))
        }
    }
}