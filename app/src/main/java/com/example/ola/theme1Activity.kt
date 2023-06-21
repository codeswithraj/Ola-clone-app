package com.example.ola

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.Button
import android.widget.TextView

class theme1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_theme1)
        val btn=findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            startActivity(Intent(this,InputNumberActivity::class.java))
        }
        setupHyperlink()
    }
    fun setupHyperlink() {
        val linkTextView = findViewById<TextView>(R.id.terms)
        val linkTextView1= findViewById<TextView>(R.id.privacy)
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
        linkTextView.setLinkTextColor(Color.BLACK)
        linkTextView1.setMovementMethod(LinkMovementMethod.getInstance());
        linkTextView1.setLinkTextColor(Color.BLACK)
    }
}