package com.example.mobileapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class UserOnb3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.userscreen3)

        // Find the button by its ID
        val nextButton = findViewById<Button>(R.id.next3)

        // Set click listener to navigate to LoginActivity
        nextButton.setOnClickListener {
            val intent = Intent(this, Loginpage::class.java)
            startActivity(intent)
        }
       }
}