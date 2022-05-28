package com.example.android.asanas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class asanasplashscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_asanasplashscreen)
        supportActionBar?.hide()
        Handler().postDelayed({
            val intent = Intent(this@asanasplashscreen,MainActivity::class.java)
            startActivity(intent)
            finish()
        },2000)
    }
}