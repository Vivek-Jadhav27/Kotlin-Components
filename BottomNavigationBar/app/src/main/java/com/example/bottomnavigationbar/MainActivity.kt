package com.example.bottomnavigationbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var bottomnavigationbar : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomnavigationbar = findViewById(R.id.bottom_navoigationbar)
        replaceFragment(HomeFragment())
        bottomnavigationbar.setOnItemSelectedListener {
            menuItem ->
            when(menuItem.itemId){
                R.id.bottom_home ->{
                  replaceFragment(HomeFragment())
                  true
                }
                R.id.bottom_profile ->{
                    replaceFragment(ProfileFragment())
                    true
                }
                else -> false
            }
        }

    }

    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.frame_container , fragment).commit()
    }
}