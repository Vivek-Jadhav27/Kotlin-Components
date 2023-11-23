package com.example.animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var textView1: TextView
    private lateinit var button1: Button
    private lateinit var animation1: Animation
    private lateinit var textView2: TextView
    private lateinit var button2: Button
    private lateinit var animation2: Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView1 = findViewById(R.id.textview1)
        button1 = findViewById(R.id.button1)
        animation1 = AnimationUtils.loadAnimation(this, R.anim.fade_in)
        button1.setOnClickListener{
            textView1.visibility = View.VISIBLE
            textView1.startAnimation(animation1)
        }

        textView2 = findViewById(R.id.textview2)
        button2 = findViewById(R.id.button2)
        animation2 = AnimationUtils.loadAnimation(this, R.anim.fade_out)
        button2.setOnClickListener{
            textView2.visibility = View.VISIBLE
            textView2.startAnimation(animation2)
        }
    }
}