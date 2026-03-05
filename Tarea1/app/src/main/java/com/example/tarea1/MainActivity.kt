package com.example.tarea1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_textfields -> {
                    loadFragment(TextFieldsFragment())
                    true
                }
                R.id.nav_buttons -> {
                    loadFragment(ButtonsFragment())
                    true
                }
                R.id.nav_selection -> {
                    loadFragment(SelectionFragment())
                    true
                }
                R.id.nav_lists -> {
                    loadFragment(ListsFragment())
                    true
                }
                R.id.nav_info -> {
                    loadFragment(InfoFragment())
                    true
                }
                else -> false
            }
        }

        // Set default fragment
        if (savedInstanceState == null) {
            bottomNavigation.selectedItemId = R.id.nav_textfields
        }
    }

    fun navigateToTab(itemId: Int) {
        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigation.selectedItemId = itemId
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}