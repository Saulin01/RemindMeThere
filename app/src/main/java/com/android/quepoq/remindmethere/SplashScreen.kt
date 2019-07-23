package com.android.quepoq.remindmethere

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreen : AppCompatActivity() {

    private val SPLASH_TIME_OUT:Long=500 // 3 sec
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)


        Handler().postDelayed({

            startActivity(Intent(this,MainActivity::class.java))

            finish()
        }, SPLASH_TIME_OUT)
    }

}
