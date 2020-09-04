package com.example.practiceproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreen : AppCompatActivity() {

    internal val TIME_OUT = 3000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed(
            {
                startActivity(Intent(this@SplashScreen,MainActivity::class.java))
                finish()
            },TIME_OUT.toLong())
    }
}