package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SendMoneyActivity : AppCompatActivity() {
    lateinit var btncancel: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_send_money)
        btncancel=findViewById(R.id.btncancel)
        btncancel.setOnClickListener {
            val intent= Intent(this,BMICalculatorActivity::class.java)
            startActivity(intent)
        }
    }
}