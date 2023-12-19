package com.example.attire

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button

class rmminangkabau : AppCompatActivity() {
    private lateinit var descminang: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_rmminangkabau)

        descminang = findViewById(R.id.br_minang)

        descminang.setOnClickListener {
            val move = Intent(this@rmminangkabau, minangkabau::class.java)
            startActivity(move)
        }

    }
}