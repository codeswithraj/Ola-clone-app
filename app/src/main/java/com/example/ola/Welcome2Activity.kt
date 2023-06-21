package com.example.ola

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Welcome2Activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome2)
        val btn=findViewById<Button>(R.id.locationAllowBtn)
        btn.setOnClickListener {
            startActivity(Intent(this,homepageActivity::class.java))
        }
    }
}