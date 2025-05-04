package com.example.mobileapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignupPage: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup) // Ensure your layout file is named correctly

        // Find buttons by ID
        val registerButton = findViewById<Button>(R.id.loginButton)
        val loginButton = findViewById<TextView>(R.id.signuploginbtn)

        // Redirect to Login Page on Register Button Click
        registerButton.setOnClickListener {
            val intent = Intent(this, Loginpage::class.java)
            startActivity(intent)
        }

        // Redirect to Login Page on Login Button Click
        loginButton.setOnClickListener {
            val intent = Intent(this, Loginpage::class.java)
            startActivity(intent)
        }
    }
}