package com.example.ola

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        val btn1=findViewById<Button>(R.id.location)
        btn1.setOnClickListener {
            val alertDialog= AlertDialog.Builder(this)
            alertDialog.setTitle("Alert")
            alertDialog.setMessage("Do you want to continue?")
            alertDialog.setPositiveButton("Yes"){
                    dialog,which->
                startActivity(Intent(this,Welcome2Activity::class.java))
            }
            alertDialog.setNegativeButton("No"){
                    dialog,which->
                startActivity(Intent(this,WelcomeActivity::class.java))
            }
            alertDialog.create()
            alertDialog.show()
        }
    }
}