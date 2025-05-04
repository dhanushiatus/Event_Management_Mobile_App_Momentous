package com.example.mobileapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class UserOnb1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.userscreen1)

        val nextButton = findViewById<Button>(R.id.next1)
        nextButton.setOnClickListener {
            goToNextScreen()
        }
    }

    private fun goToNextScreen() {
        val intent = Intent(this, UserOnb2::class.java)
        startActivity(intent)
       }

}