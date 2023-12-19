package com.example.attire

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class melayu : AppCompatActivity() {
    private lateinit var Image_booking: ImageView
    private lateinit var backmelayu: Button
    private lateinit var readmelayu: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_melayu)

        Image_booking = findViewById(R.id.image_melayu)
        backmelayu = findViewById(R.id.backmelayu)
        readmelayu = findViewById(R.id.readmelayu)

            Image_booking.setOnClickListener {
                val move = Intent(this@melayu, booking::class.java)
                startActivity(move)

            }

        backmelayu.setOnClickListener {
            val move = Intent(this@melayu, item::class.java)
            startActivity(move)

        }

        readmelayu.setOnClickListener {
            val move = Intent(this@melayu, rmmelayu::class.java)
            startActivity(move)
        }


        }
    }