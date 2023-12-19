package com.example.attire

import android.content.ClipData.Item
import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.widget.ImageView

class Home : AppCompatActivity() {
    private  lateinit var Image_next : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_home)

        Image_next = findViewById(R.id.image_home)

        Image_next.setOnClickListener {
            val move = Intent(this@Home, login::class.java)
            startActivity(move)
        }
    }
}