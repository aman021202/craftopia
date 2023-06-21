package com.example.craftopia_master

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuthException

class MainActivity : AppCompatActivity() {

    lateinit var auth:FirebaseAuthException


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}