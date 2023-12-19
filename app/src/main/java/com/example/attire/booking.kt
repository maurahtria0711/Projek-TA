package com.example.attire

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.math.min

class booking : AppCompatActivity() {
    private lateinit var Button_1hari: Button
    private lateinit var Button_2hari: Button
    private lateinit var Button_3hari: Button
    private lateinit var Button_4hari: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_booking)

        Button_1hari = findViewById(R.id.satu)
        Button_2hari = findViewById(R.id.dua)
        Button_3hari = findViewById(R.id.tiga)
        Button_4hari = findViewById(R.id.empat)



        Button_1hari.setOnClickListener {
            val move = Intent(this@booking, pembayaran::class.java)
            startActivity(move)
        }

        Button_2hari.setOnClickListener {
            val move = Intent(this@booking, pembayaran::class.java)
            startActivity(move)
        }

        Button_3hari.setOnClickListener {
            val move = Intent(this@booking, pembayaran::class.java)
            startActivity(move)
        }

        Button_4hari.setOnClickListener {
            val move = Intent(this@booking, pembayaran::class.java)
            startActivity(move)


        }

        }
    }