package com.example.onbordingscreen

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2


class MainActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager2
    private lateinit var prevbtn: Button
    private lateinit var nextbtn: Button
    private lateinit var startbtn: Button
    private lateinit var skiptbtn: Button
    private lateinit var viewPagerAdapter: ViewPagerAdapter
    private lateinit var dotLayout :LinearLayout
    private lateinit var dots : Array<TextView?>
    private var isIndicatorSetupForPosition0 = false

    override fun onStart() {
        super.onStart()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.hide()

        prevbtn = findViewById(R.id.btn_prev)
        nextbtn =findViewById(R.id.btn_next)
        startbtn = findViewById(R.id.btn_start)
        skiptbtn = findViewById(R.id.btn_skip)
        prevbtn.visibility = View.INVISIBLE
        startbtn.visibility = View.INVISIBLE

        prevbtn.setOnClickListener{
            if (getitem(0)>0){
                viewPager.setCurrentItem(getitem(-1),true)
            }

        }
        nextbtn.setOnClickListener{
            if (getitem(0)<2){

                viewPager.setCurrentItem(getitem(1),true)
            }
        }
        startbtn.setOnClickListener{
            startActivity(Intent(this,MainActivity2::class.java))
        }
        skiptbtn.setOnClickListener{
            startActivity(Intent(this,MainActivity2::class.java))
        }

        dotLayout = findViewById(R.id.dotLayout)
        viewPager = findViewById(R.id.viewPager)

        viewPagerAdapter = ViewPagerAdapter(this)
        viewPager.adapter = viewPagerAdapter
        setupindicator(0)

        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                if (position >0) {
                    setupindicator(position)
                    isIndicatorSetupForPosition0 = true
                }
                if (position ==0 && isIndicatorSetupForPosition0){
                    setupindicator(position)
                }
                setBtnVisibility(position)
            }
        })
    }

    private fun setBtnVisibility(position: Int) {

        when (position) {
            0 -> {
                prevbtn.visibility = View.INVISIBLE
                nextbtn.visibility = View.VISIBLE
                startbtn.visibility = View.INVISIBLE
            }
            1 -> {
                prevbtn.visibility = View.VISIBLE
                nextbtn.visibility = View.VISIBLE
                startbtn.visibility = View.INVISIBLE
            }
            else -> {
                prevbtn.visibility = View.VISIBLE
                nextbtn.visibility = View.INVISIBLE
                startbtn.visibility = View.VISIBLE
            }
        }
    }

    fun setupindicator(position: Int) {
        Log.d("MainActivity", "Setup Indicator called for position: $position")
        dots = arrayOfNulls(3)
        dotLayout.removeAllViews()

        for (i in 0 until 3) {
            dots[i] = TextView(this)
            dots[i]?.text = "\u2022"
            dots[i]?.textSize = 35F
            dots[i]?.setTextColor(resources.getColor(R.color.grey, applicationContext.theme))
            dotLayout.addView(dots[i])
        }

            dots[position]?.setTextColor(resources.getColor(R.color.blue, applicationContext.theme))

    }

    private fun getitem(i: Int): Int {
        return viewPager.currentItem + i
    }
}