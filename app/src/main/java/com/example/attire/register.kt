package com.example.attire

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.widget.Button

class register : AppCompatActivity() {
    private lateinit var ButtonSignUp : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_register)

        ButtonSignUp = findViewById(R.id.button1)

        ButtonSignUp.setOnClickListener {
            val move = Intent(this@register, login::class.java)
            startActivity(move)
        }
    }
}