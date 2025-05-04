package com.example.mobileapplication

import android.content.DialogInterface
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class Events: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.events)

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.BottomNavigationView)
        BottomNavigationHelper.setupBottomNavigation(this, bottomNavigationView)

        val bookNowButton: Button = findViewById(R.id.bookNowButton)

        bookNowButton.setOnClickListener {
            // Create and show a dialog when "Book Now" is clicked
            AlertDialog.Builder(this)
                .setTitle("Booking Successful")
                .setMessage("Your booking has been successfully completed! Our agent will contact you shorty")
                .setPositiveButton("OK") { dialog, _ ->
                    // Handle the "OK" button click (optional)
                    dialog.dismiss()
                }
                .setCancelable(false) // Optional: makes the dialog non-dismissible by tapping outside
                .show()
        }
    }
}

