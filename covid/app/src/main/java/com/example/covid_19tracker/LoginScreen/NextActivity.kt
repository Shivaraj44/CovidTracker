package com.example.covidtracker.LoginScreen

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.covid_19tracker.R
import kotlinx.android.synthetic.main.activity_next.*

class NextActivity : AppCompatActivity() {
    lateinit var preferences: SharedPreferences

    private val PREF_INT_KEY = "PREF_INT_KEY"
    private val PREF_STRING_KEY = "PREF_STRING_KEY"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)
//        preferences = getSharedPreferences("Shared", Context.MODE_PRIVATE)
//
//        val name: String? = preferences.getString("NAME", "")
//        new_name.text = name
//        val password = preferences.getString("PASSWORD", "")
//        //  val password=password
//        new_password.text = password
//
//        new_reg.setOnClickListener(View.OnClickListener {
//            val editor: SharedPreferences.Editor = preferences.edit()
//            editor.clear()
//            editor.apply()
//            val intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)
//        })
new_reg.setOnClickListener(View.OnClickListener {

    val preferenceHelper=PreferenceHelper()
    preferenceHelper.writeStringtopreference(this,PREF_STRING_KEY,new_name.text.toString())
    preferenceHelper.writeStringtopreference(this,PREF_INT_KEY,new_password.text.toString())
    val intent=Intent(this,LoginActivity::class.java)
    startActivity(intent)

})
    }
}