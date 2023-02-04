package com.meuprimeiroprojeto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Splash_Scream : AppCompatActivity() {

    private val SPLASH_TIME: Long = 5000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_scream)

       Handler().postDelayed({
            startActivity(Intent (this, MainActivity::class.java))
            finish()
        }, SPLASH_TIME)
    }
}