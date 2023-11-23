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

        val dialog = Dialog(this)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(true)
        dialog.setContentView(R.layout.successdbox)
        dialog.show()
    }
}
