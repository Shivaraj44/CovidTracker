package com.example.covidtracker.LoginScreen

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.covid_19tracker.MainActivity
import com.example.covid_19tracker.R

import kotlinx.android.synthetic.main.activity_login.*


class LoginActivity : AppCompatActivity() {
    private val PREF_STRING_KEY = "PREF_STRING_KEY"
    private val PREF_INT_KEY = "PREF_INT_KEY"

    //    lateinit var sharedPreferences: SharedPreferences
//    var isRemembered = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        regester_main.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, NextActivity::class.java)
            startActivity(intent)
        })
        login_main.setOnClickListener(View.OnClickListener {
            val ename: String = user_name.text.toString()
            val epasswor: String = user_password.text.toString()
            val preferenceHelper = PreferenceHelper()
            val stringFromPref: String? =
                preferenceHelper.getStringFromPreference(this, PREF_STRING_KEY)
            val sharepassword: String? =
                preferenceHelper.getStringFromPreference(this, PREF_INT_KEY)

            if (ename == stringFromPref && epasswor == sharepassword) {
                // val intent=Intent(this,)
                Toast.makeText(this, "Matched", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        })

    }
}

//        sharedPreferences = getSharedPreferences("Shared", Context.MODE_PRIVATE)
//
//        isRemembered = sharedPreferences.getBoolean("checkbox", false)
//        if (isRemembered) {
//            val inte = Intent(this, NextActivity::class.java)
//            startActivity(inte)
//            finish()
//        }
//        regester123.setOnClickListener(View.OnClickListener {
//            val name: String = user_name.text.toString()
//            val password: String = user_password.text.toString()
//            val checked: Boolean = chekbox.isChecked
//
//            val editor: SharedPreferences.Editor = sharedPreferences.edit()
//            editor.putString("NAME", name)
//            editor.putString("PASSWORD", password)
//            editor.putBoolean("CHECK", checked)
//            Toast.makeText(this, "Info Saved", Toast.LENGTH_SHORT).show()
//            val inte = Intent(this, NextActivity::class.java)
//            startActivity(inte)
//            finish()
//        })
//    }
