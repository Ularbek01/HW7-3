package com.example.hw_m3_lesson7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.hw_m3_lesson7.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.name.text = intent.getStringExtra(BottomFragment.KEY_FOR_NAME)
        binding.artist.text = intent.getStringExtra(BottomFragment.KEY_FOR_ARTIST)
    }
}