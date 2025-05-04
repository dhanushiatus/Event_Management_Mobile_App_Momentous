package com.example.mobileapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class Subscription : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.subscription)  // Set your layout file here

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.BottomNavigationView)
        BottomNavigationHelper.setupBottomNavigation(this, bottomNavigationView)

        // Handle Back button click to go to the Profile page
        val backButton = findViewById<ImageView>(R.id.back)
        backButton.setOnClickListener {
            // Navigate to Profile Activity (replace ProfileActivity::class.java with the actual class for Profile)
            val intent = Intent(this, ProfilePage::class.java)
            startActivity(intent)
            finish() // End this activity so the user can't come back to this screen by pressing back
        }

        // Handle "Proceed to Payment" button click to go to the Home page
        val proceedToPaymentButton = findViewById<Button>(R.id.purchase)
        proceedToPaymentButton.setOnClickListener {
            // Navigate to Home Activity (replace HomeActivity::class.java with your actual Home Activity)
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish() // End this activity so the user can't come back to this screen by pressing back
        }
    }
}
