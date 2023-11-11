package com.example.onbordingscreen

import android.os.Bundle
import android.text.SpannableString
import android.view.View
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
    private lateinit var viewPagerAdapter: ViewPagerAdapter
    private lateinit var dotLayout :LinearLayout

    override fun onStart() {
        super.onStart()
        setUpindicator(0)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.hide()
        prevbtn = findViewById(R.id.btn_prev)
        nextbtn =findViewById(R.id.btn_next)
        startbtn = findViewById(R.id.btn_start)
        viewPager = findViewById(R.id.viewPager)
        dotLayout = findViewById(R.id.dotLayout)
        setUpindicator(0)
        viewPagerAdapter = ViewPagerAdapter(this)
        viewPager.adapter = viewPagerAdapter

        prevbtn.visibility = View.INVISIBLE
        startbtn.visibility = View.INVISIBLE;

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


        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                setUpindicator(position);
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

    private fun setUpindicator(position: Int) {
        val dots = arrayOfNulls<TextView>(4)
        dotLayout.removeAllViews()

        for (i in 0 until 3) {
            dots[i] = TextView(this)
            dots[i]?.text = "\u2022"
            dots[i]?.textSize = 35F
            dots[i]?.setTextColor(resources.getColor(R.color.grey, applicationContext.theme))
            dotLayout.addView(dots[i])
        }
        if (position in 0 until 3) {
            dots[position]?.setTextColor(resources.getColor(R.color.blue, applicationContext.theme))
        }
    }

    private fun getitem(i: Int): Int {
        return viewPager.currentItem + i
    }
}