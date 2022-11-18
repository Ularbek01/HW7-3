package com.example.hw_m3_lesson7

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

fun AppCompatActivity.addFragment(view: Int, fragment: Fragment) {
    supportFragmentManager.beginTransaction().add(view, fragment).commit()
}