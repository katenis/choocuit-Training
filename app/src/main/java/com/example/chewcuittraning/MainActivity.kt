package com.example.chewcuittraning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startButton.setOnClickListener{
            val intent = Intent(this, TrainingActivity::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
        }

        startTextButton.setOnClickListener{
            val intent = Intent(this, TrainingActivity::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
        }
    }
}