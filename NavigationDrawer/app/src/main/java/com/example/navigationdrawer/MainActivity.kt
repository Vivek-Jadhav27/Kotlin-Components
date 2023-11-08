package com.example.navigationdrawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.MenuItem
import android.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationBarMenuView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() ,NavigationView.OnNavigationItemSelectedListener {

    private lateinit var  drawerlayout :DrawerLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawerlayout = findViewById(R.id.drawerlayout)

        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        val navigationView = findViewById<NavigationView>(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener(this)

        val toggle = ActionBarDrawerToggle(this,drawerlayout,toolbar,R.string.open_nav,R.string.close_nav)
        drawerlayout.addDrawerListener(toggle)
        toggle.syncState()

        if (savedInstanceState == null){

            supportFragmentManager.beginTransaction().replace(R.id.frame_Container,HomeFragment()).commit()
            navigationView.setCheckedItem(R.id.nav_home)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.nav_home -> supportFragmentManager.beginTransaction().replace(R.id.frame_Container,HomeFragment()).commit()
            R.id.nav_info -> supportFragmentManager.beginTransaction().replace(R.id.frame_Container,InfoFragment()).commit()
            R.id.nav_settings -> supportFragmentManager.beginTransaction().replace(R.id.frame_Container,SettingFragment()).commit()
        }
        drawerlayout.closeDrawer(GravityCompat.START)
        return true
    }

    override fun onBackPressed() {
        super.onBackPressed()
        if(drawerlayout.isDrawerOpen(GravityCompat.START)){
            drawerlayout.closeDrawer(GravityCompat.START)
        }
        else{
            onBackPressedDispatcher.onBackPressed()
        }

    }
}