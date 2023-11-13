package com.example.alertdailoguebox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    private lateinit var sucessbtn:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sucessbtn = findViewById(R.id.materialButton)

        sucessbtn.setOnClickListener{
            showSuccessDialogue()
        }
    }

    private fun showSuccessDialogue() {

        val successConstraintLayout:ConstraintLayout =findViewById(R.id.successconstraint)

        val view = LayoutInflater.from(this).inflate(R.layout.successdbox,successConstraintLayout)

        val builder : AlertDialog.Builder = AlertDialog.Builder(this)

        builder.setView(view)

        val dialog :AlertDialog = builder.create()
    }
}