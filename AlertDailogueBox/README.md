
# Alert DialogueBox #

To create an Alert DialogueBox in Kotlin follow below steps

- Step 1: Add colors in Colors.xml
- Step 2: Add  button  in MainActivity.xml

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

- Step 3: create  DialogueBox  in R.Layout named sucessdbox.xml
       
        <androidx.constraintlayout.widget.ConstraintLayout  
        xmlns:android="http://schemas.android.com/apk/res/android"
         xmlns:app="http://schemas.android.com/apk/res-auto"
         xmlns:tools="http://schemas.android.com/tools"
         android:id="@+id/successconstraint"
         android:layout_width="300dp"
         android:layout_height="wrap_content"
         tools:ignore="TextSizeCheck">

            <androidx.constraintlayout.widget.ConstraintLayout
                android:id="@+id/constraintLayout"
                android:layout_width="300dp"
                android:layout_height="wrap_content"
                app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent">

        <TextView
            android:id="@+id/textView"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="35dp"
            android:text="Success"
            android:textColor="@color/black"
            android:textSize="20sp"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintHorizontal_bias="0.502"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent" />

        <TextView
            android:id="@+id/textView2"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="16dp"
            android:text="Transaction Successfully Completed"
            android:textColor="@color/black"
            android:textSize="14sp"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toBottomOf="@+id/textView" />

        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="12dp"
            android:layout_marginBottom="10sp"
            android:text="Ok"
            android:backgroundTint="@color/green"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toBottomOf="@+id/textView2" />

        </androidx.constraintlayout.widget.ConstraintLayout>

        <ImageView
            android:id="@+id/imageView"
            android:layout_width="50dp"
            android:layout_height="50dp"
            android:layout_marginStart="40dp"
            android:layout_marginEnd="40dp"
            android:src="@drawable/check"
            app:layout_constraintTop_toTopOf="@id/constraintLayout"
            app:layout_constraintBottom_toTopOf="@id/constraintLayout"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"

            />
        </androidx.constraintlayout.widget.ConstraintLayout>


- Step 4: Add DialogueBox in MainActivity.kts


        private fun showSuccessDialogue() {
        
        val dialog = Dialog(this)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(true)
        dialog.setContentView(R.layout.successdbox)
        dialog.show()
        }

<img src="https://github.com/Vivek-Jadhav27/Kotlin-Components/assets/85949907/3227fd29-f5be-4b07-9eee-9782dfa6a19f" height=700 width=300 />

<img src="https://github.com/Vivek-Jadhav27/Kotlin-Components/assets/85949907/ffc3d721-b166-4620-8107-5f69cbc4e569" height=700 width=300 />

