package com.example.mobileapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class Favourite : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.favourites) // Set the layout to category.xml

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.BottomNavigationView)
        BottomNavigationHelper.setupBottomNavigation(this, bottomNavigationView)

        // Button to go to Events page


        // Button to add to favourites
        val addToFavouritesButton: Button = findViewById(R.id.addToFavourites)
        addToFavouritesButton.setOnClickListener {
            // Show an AlertDialog to confirm adding to favourites
            showAddToFavouritesDialog()
        }
    }

    private fun showAddToFavouritesDialog() {
        // Build the AlertDialog
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Add to Favourites")
        builder.setMessage("Do you want to add this item to your favourites?")

        // Positive button (Yes)
        builder.setPositiveButton("Yes") { _, _ ->
            // Show a message that item is added to favourites
            Toast.makeText(this, "Item added to Favourites", Toast.LENGTH_SHORT).show()
        }

        // Negative button (No)
        builder.setNegativeButton("No") { dialog, _ ->
            dialog.dismiss() // Dismiss the dialog if "No" is clicked
        }

        // Create and show the dialog
        builder.create().show()
    }
}
