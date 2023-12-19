package com.example.attire

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button

class rmmelayu : AppCompatActivity() {
    private lateinit var descmelayu: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_rmmelayu)

        descmelayu = findViewById(R.id.br_melayu)

        descmelayu.setOnClickListener {
            val move = Intent(this@rmmelayu, melayu::class.java)
            startActivity(move)
        }
    }
}