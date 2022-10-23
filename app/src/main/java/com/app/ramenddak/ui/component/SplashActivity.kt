package com.app.ramenddak.ui.component

import android.content.Intent
import android.os.Handler
import android.view.animation.AnimationUtils
import com.app.ramenddak.R
import com.app.ramenddak.databinding.ActivitySplashBinding
import com.example.presentation.base.BaseActivity

class SplashActivity : BaseActivity<ActivitySplashBinding>(R.layout.activity_splash) {
    override fun init() {
        animation()
        showMain()
    }

    private fun animation() {
        val startAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation)
        binding.startBtn.startAnimation(startAnimation)
    }

    private fun showMain() {
        binding.startBtn.setOnClickListener {
            startActivity(Intent(this, StartActivity::class.java))
        }
    }
}