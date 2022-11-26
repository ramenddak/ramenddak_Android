package com.app.ramenddak.ui.component

import com.app.ramenddak.R
import com.app.ramenddak.databinding.ActivityResultBinding
import com.example.presentation.base.BaseActivity
import java.util.*


class ResultActivity : BaseActivity<ActivityResultBinding>(R.layout.activity_result) {
    private lateinit var ramen: Array<String>
    override fun init() {
        ramen = intent.getStringArrayExtra("ramen")!!
        chooseRamen()
    }

    private fun chooseRamen() {
        val randomIndex = Random().nextInt(ramen.size)
        binding.ramenName.text = ramen[randomIndex]
    }
}