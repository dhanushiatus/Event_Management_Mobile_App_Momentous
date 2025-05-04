package com.example.mobileapplication

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.bottomnavigation.BottomNavigationView

class ProfilePage: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile)

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.BottomNavigationView)
        BottomNavigationHelper.setupBottomNavigation(this, bottomNavigationView)

        // Find the TextViews by ID
        val setting1 = findViewById<TextView>(R.id.setting1)
        val setting2 = findViewById<TextView>(R.id.setting2)
        val favourite = findViewById<TextView>(R.id.favourite)
        val logout = findViewById<TextView>(R.id.logout)
        val subscription = findViewById<TextView>(R.id.textView12)

        // Set click listeners for each TextView
        setting1.setOnClickListener {
            val intent = Intent(this, Settings::class.java)
            startActivity(intent)
        }

        setting2.setOnClickListener {
            val intent = Intent(this, Settings::class.java)
            startActivity(intent)
        }

        favourite.setOnClickListener {
            val intent = Intent(this, Favourite::class.java) // Navigate to Favourite activity
            startActivity(intent)
        }

        logout.setOnClickListener {
            val intent = Intent(this, Loginpage::class.java)
            startActivity(intent)
        }

        subscription.setOnClickListener {
            val intent = Intent(this, Subscription::class.java)
            startActivity(intent)
        }
    }
}
