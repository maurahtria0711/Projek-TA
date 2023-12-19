package com.example.attire

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class minangkabau : AppCompatActivity() {
    private lateinit var Image_booking: ImageView
    private lateinit var backminangkabau: Button
    private lateinit var readminangkabau: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_minangkabau)

        Image_booking = findViewById(R.id.image_minangkabau)
        backminangkabau = findViewById(R.id.backminang)
        readminangkabau = findViewById(R.id.readminangkabau)


        Image_booking.setOnClickListener {
            val move = Intent(this@minangkabau, booking::class.java)
            startActivity(move)

        }

        backminangkabau.setOnClickListener {
            val move = Intent(this@minangkabau, item::class.java)
            startActivity(move)

        }

        readminangkabau.setOnClickListener {
            val move = Intent(this@minangkabau, rmminangkabau::class.java)
            startActivity(move)
        }
    }
}