
# Date Picker #

To create a Date Picker in Kotlin follow below steps


- Step 1: Add colors in Colors.xml
- Step 2: Add  button and textview in MainActivity.xml

        <Button
        android:id="@+id/btn_datePicker"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Pick a Date"
        android:textColor="@color/white"
        android:textSize="20sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.461" />

        <TextView
        android:id="@+id/text_datePicker"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Selected Date"
        android:textColor="@color/blue"
        android:textSize="25dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/btn_datePicker"
        app:layout_constraintVertical_bias="0.158" />

- Step 3: Add datePicker in MainActivity.kts

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

<img src= "https://github.com/Vivek-Jadhav27/Kotlin-Components/assets/85949907/4462f057-2713-4b8b-9630-0a0168028ba0"  height = 700 width = 300 />
<img src= "https://github.com/Vivek-Jadhav27/Kotlin-Components/assets/85949907/c5160991-6b3f-43b9-995d-22c86af5d54b"  height = 700 width = 300 />







