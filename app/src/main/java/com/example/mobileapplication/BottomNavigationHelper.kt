@file:Suppress("DEPRECATION")

package com.example.mobileapplication

import android.app.Activity
import android.content.Intent
import com.google.android.material.bottomnavigation.BottomNavigationView

object BottomNavigationHelper {

    fun setupBottomNavigation(activity: Activity, bottomNavigationView: BottomNavigationView) {
        when (activity::class.java) {
            HomeActivity::class.java -> bottomNavigationView.selectedItemId = R.id.home
            Category::class.java -> bottomNavigationView.selectedItemId = R.id.categories
            Events::class.java -> bottomNavigationView.selectedItemId = R.id.events
            Favourite::class.java -> bottomNavigationView.selectedItemId = R.id.favourite
            ProfilePage::class.java -> bottomNavigationView.selectedItemId = R.id.profile
        }
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    if (activity !is HomeActivity) {
                        activity.startActivity(Intent(activity, HomeActivity::class.java))
                        activity.finish()
                    }
                    true
                }
                R.id.categories -> {
                    if (activity !is Category) {
                        activity.startActivity(Intent(activity, Category::class.java))
                        activity.finish()
                    }
                    true
                }
                R.id.events -> {
                    if (activity !is Events) {
                        activity.startActivity(Intent(activity, Events::class.java))
                        activity.finish()
                    }
                    true
                }
                R.id.favourite -> {
                    if (activity !is Favourite) {
                        activity.startActivity(Intent(activity, Favourite::class.java))
                        activity.finish()
                    }
                    true
                }
                R.id.profile -> {
                    if (activity !is ProfilePage) {
                        activity.startActivity(Intent(activity, ProfilePage::class.java))
                        activity.finish()
                    }
                    true
                }
                else -> false
            }
        }
    }
}