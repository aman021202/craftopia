package com.example.craftopia_master

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import com.google.firebase.auth.FirebaseAuthException

class MainActivity : AppCompatActivity() {

 private lateinit var logo: ImageView
   private lateinit var splash1: ImageView
   private lateinit var splash2:ImageView
   private lateinit var splash3:ImageView
   private lateinit var splash4:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logo= findViewById(R.id.imageView)
        splash1= findViewById(R.id.splash1)
        splash2= findViewById(R.id.splash2)
        splash3= findViewById(R.id.splash3)
        splash4= findViewById(R.id.splash4)

        val animationalLeftToRight:Animation=AnimationUtils.loadAnimation(applicationContext,R.anim.left_to_right)
        splash1.startAnimation(animationalLeftToRight)
        splash3.startAnimation(animationalLeftToRight)

        val animationRightToLeft: Animation = AnimationUtils.loadAnimation(applicationContext, R.anim.right_to_left)
        splash2.startAnimation(animationRightToLeft)
        splash4.startAnimation(animationRightToLeft)

    }
}