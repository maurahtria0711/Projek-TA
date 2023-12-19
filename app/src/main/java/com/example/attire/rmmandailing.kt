package com.example.attire

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button

class rmmandailing : AppCompatActivity() {
    private lateinit var descmandailing: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_rmmandailing)

        descmandailing = findViewById(R.id.br_mandailing)

        descmandailing.setOnClickListener {
            val move = Intent(this@rmmandailing, batak::class.java)
            startActivity(move)
        }
    }
}
