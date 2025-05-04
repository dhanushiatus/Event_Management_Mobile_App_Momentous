package com.example.mobileapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView


class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.BottomNavigationView)
        BottomNavigationHelper.setupBottomNavigation(this, bottomNavigationView)
        // Find the notification ImageView
        val notification: ImageView = findViewById(R.id.notification)

        // Set an OnClickListener on the notification ImageView
        notification.setOnClickListener {
            // Start the MyEventsPage activity
            val intent = Intent(this, Events::class.java)
            startActivity(intent)


        }
    }
}
