package com.example.myappli

import android.os.Bundle
import android.os.CountDownTimer
import android.os.SystemClock
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        view_timer.isCountDown = true
        view_timer.base = SystemClock.elapsedRealtime() + 121000
        view_timer.start()

    }
}