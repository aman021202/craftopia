package com.example.craftopia_master

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btn = findViewById<TextView>(R.id.Signup)
        btn.setOnClickListener{
            val intent = Intent(this, sign_up::class.java)
            startActivity(intent)
        }
    }
}