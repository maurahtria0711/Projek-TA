package com.example.attire

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.widget.Button

class item : AppCompatActivity() {
    private lateinit var Button_minang : Button
    private lateinit var Button_mandailing : Button
    private lateinit var Button_melayu : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_item)

        Button_minang = findViewById(R.id.minangkabau)
        Button_mandailing = findViewById(R.id.mandailing)
        Button_melayu = findViewById(R.id.melayu)

        Button_minang.setOnClickListener {
            val move = Intent(this@item, minangkabau::class.java)
            startActivity(move)
        }

        Button_mandailing.setOnClickListener {
            val move = Intent(this@item, batak::class.java)
            startActivity(move)
        }

        Button_melayu.setOnClickListener {
            val move = Intent(this@item, melayu::class.java)
            startActivity(move)
        }
    }
}