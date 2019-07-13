package com.pamelaahill.alcchallenge1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val aboutButton = findViewById<Button>(R.id.button_about)
        aboutButton.setOnClickListener {
            startActivity(Intent(this@MainActivity, AboutActivity::class.java))
        }

        val profileButton = findViewById<Button>(R.id.button_profile)
        profileButton.setOnClickListener {
            startActivity(Intent(this@MainActivity, ProfileActivity::class.java))
        }
    }
}
