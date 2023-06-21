package com.example.ola

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.hbb20.CountryCodePicker


class InputNumberActivity : AppCompatActivity() {
    lateinit var buttonSendOtp: Button
    lateinit var phoneNumber: String
    private lateinit var auth: FirebaseAuth
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_number)
        val back=findViewById<ImageView>(R.id.backBtn)
        back.setOnClickListener {
            startActivity(Intent(this,theme1Activity::class.java))
        }

        FirebaseApp.initializeApp(this)
        auth = Firebase.auth
        val phone = findViewById<EditText>(R.id.contact)
        val ccp = findViewById<CountryCodePicker>(R.id.countryCode)
        buttonSendOtp = findViewById(R.id.loginBtn)

        buttonSendOtp.setOnClickListener {
            if (TextUtils.isEmpty(phone.getText().toString())){
                Toast.makeText(this, "Please input number", Toast.LENGTH_SHORT).show()
            }
            else {
                ccp.registerCarrierNumberEditText(phone)
                phoneNumber = ccp.fullNumberWithPlus.replace(" ", "")
                val intent = Intent(this, verifyOTPActivity::class.java)
                intent.putExtra("phone", phoneNumber)
                startActivity(intent)
            }

        }

    }


}