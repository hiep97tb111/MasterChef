package com.example.masterchef

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashAct: AppCompatActivity() {
    private val timeDelayed: Long = 5000L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.act_splash)

        estimateTimeAnimation()

    }

    private fun estimateTimeAnimation() {
        Handler().postDelayed(
            {
               startActivity(Intent(this, MainAct::class.java))
               finish()
        }, timeDelayed)
    }
}