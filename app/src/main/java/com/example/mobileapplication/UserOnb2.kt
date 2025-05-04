package com.example.mobileapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class UserOnb2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.userscreen2)

        val previousButton = findViewById<Button>(R.id.previousButton)
        val nextButton = findViewById<Button>(R.id.next2)

        // Navigate to the previous screen (UserOnb1)
        previousButton.setOnClickListener {
            val intent = Intent(this, UserOnb1::class.java)
            startActivity(intent)
            finish() // Optional: Closes the current activity
        }

        // Navigate to the next screen (UserOnb3)
        nextButton.setOnClickListener {
            val intent = Intent(this, UserOnb3::class.java)
            startActivity(intent)
            finish() // Optional: Closes the current activity
            }
        }
}