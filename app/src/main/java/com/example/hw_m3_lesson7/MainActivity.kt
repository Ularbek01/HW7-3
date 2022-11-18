 package com.example.hw_m3_lesson7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addFragment(R.id.top_container, TopFragment())
        addFragment(R.id.bottom_container, BottomFragment())
    }
}