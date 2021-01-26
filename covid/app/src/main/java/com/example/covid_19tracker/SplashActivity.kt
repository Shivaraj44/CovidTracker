package com.example.covidtracker.NavigationFragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.covidtracker.LoginScreen.LoginActivity
import com.example.covidtracker.R

class SplashActivity : AppCompatActivity() {
   // private lateinit var auth: FirebaseAuth
    private val SPLACH_TIME: Long = 1000//1 sec
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler(mainLooper).postDelayed({

            /* Check if the user is already signed In, If yes directly show me all the participants screen
            or else navigate him to Login screen
            */
          //  if (auth.currentUser != null) {
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)

            finish()
        }, 3000)
    }
    }
