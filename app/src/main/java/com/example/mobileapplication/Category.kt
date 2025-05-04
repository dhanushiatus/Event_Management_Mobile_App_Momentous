package com.example.mobileapplication

import android.os.Bundle
import android.widget.Button
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class Category : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.category) // Set the layout to events.xml

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.BottomNavigationView)
        BottomNavigationHelper.setupBottomNavigation(this, bottomNavigationView)

        val addNewEventButton: Button = findViewById(R.id.addNewEvent)
        addNewEventButton.setOnClickListener {
            // Navigate to Events Activity
            val intent = Intent(this, Events::class.java)
            startActivity(intent)
        }
    }
}