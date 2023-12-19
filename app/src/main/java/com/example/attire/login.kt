package com.example.attire

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView

class login : AppCompatActivity() {
    private lateinit var Button_Signin : Button
    private lateinit var TextRegister : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_login)

        TextRegister = findViewById(R.id.txtregister)
        Button_Signin = findViewById(R.id.btn1)

        TextRegister.setOnClickListener {
            val move = Intent(this@login, register::class.java)
            startActivity(move)
        }

        Button_Signin.setOnClickListener {
            val move = Intent(this@login, item::class.java)
            startActivity(move)
        }


    }
}