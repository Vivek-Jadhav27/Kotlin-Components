package com.example.datepicker

import android.app.DatePickerDialog
import android.icu.util.Calendar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.Locale

class MainActivity : AppCompatActivity() {

    private lateinit var tvDate : TextView
    private lateinit var btnPicker : Button
    private  val calendar = Calendar.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvDate = findViewById(R.id.text_datePicker)
        btnPicker = findViewById(R.id.btn_datePicker)

        btnPicker.setOnClickListener{
            showDatePicker()
        }

    }

    private fun showDatePicker() {
        val datePickerDialog = DatePickerDialog(
            this,
            { DatePicker, year, monthOfYear, dayOfMonth ->
                val selectedDate: Calendar = Calendar.getInstance()
                selectedDate.set(year, monthOfYear, dayOfMonth)

                val dateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
                val formattedDate = dateFormat.format(selectedDate.time)
                tvDate.text = "Selected Date:" +formattedDate
                // Now you can use the formattedDate as needed
                // For example, you can show it in a TextView or perform any other operation.
            },
            // Set initial date if needed, otherwise pass 0, 0, 0
            calendar.get(Calendar.YEAR),
            calendar.get(Calendar.MONTH),
            calendar.get(Calendar.DAY_OF_MONTH)
        )

        datePickerDialog.show()
    }

}