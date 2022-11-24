package com.app.ramenddak.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.app.ramenddak.R
import java.util.*
import kotlin.collections.ArrayList

class QuestionActivity : AppCompatActivity() {

    private val cost = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

       var left = findViewById(R.id.left)as TextView


        var right = findViewById(R.id.right)as TextView


        var quest: TextView = findViewById(R.id.quest)as TextView


        left.setOnClickListener {
            left.setText("그거 좋다. 현승아")
            right.setText("그만해 ㅋㅋ")
            quest.setText("매운맛 좋아해?")
        }

        right.setOnClickListener {
            left.setText("그거 좋다. 현승아")
            right.setText("그만해 ㅋㅋ")
            quest.setText("매운맛 좋아해?")
        }



    }
}