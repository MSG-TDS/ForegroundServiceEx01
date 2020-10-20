package com.example.foregroundserviceex01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnStop.setOnClickListener {
            val intent = Intent(this, Foreground::class.java)
            stopService(intent)
        }

        btnStart.setOnClickListener {
            val intent = Intent(this, Foreground::class.java)
            ContextCompat.startForegroundService(this, intent)
        }
    }
}