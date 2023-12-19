package com.example.attire

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class batak : AppCompatActivity() {
    private lateinit var Image_booking: ImageView
    private lateinit var backmandailing: Button
    private lateinit var readbatak: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_batak)

        Image_booking = findViewById(R.id.image_batak)
        backmandailing = findViewById(R.id.backmandailing)
        readbatak = findViewById(R.id.readmandailing)


            Image_booking.setOnClickListener {
                val move = Intent(this@batak, booking::class.java)
                startActivity(move)

            }

        backmandailing.setOnClickListener {
            val move = Intent(this@batak, item::class.java)
            startActivity(move)
        }
            readbatak.setOnClickListener {
                val move = Intent(this@batak, rmmandailing::class.java)
                startActivity(move)

        }
    }
}