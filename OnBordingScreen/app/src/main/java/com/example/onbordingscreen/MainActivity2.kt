package com.example.onbordingscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        
    }
    override fun onBackPressed() {
        // Finish the current activity and all parent activities
        finishAffinity()
    }
}