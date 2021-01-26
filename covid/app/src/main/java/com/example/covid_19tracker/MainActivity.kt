package com.example.covid_19tracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.covidtracker.NavigationFragment.BookFragment
import com.example.covidtracker.NavigationFragment.HomeFragment
import com.example.covidtracker.NavigationFragment.InfoFragment
import com.example.covidtracker.NavigationFragment.StatisticsFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment = HomeFragment()
        supportFragmentManager.beginTransaction().replace(R.id.frame1, fragment, fragment.javaClass.getSimpleName())
            .commit()
        // setSupportActionBar(toolbar)
        // bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.action_home -> {
                    val fragment = HomeFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.frame1, fragment, fragment.javaClass.getSimpleName())
                        .commit()
                    return@OnNavigationItemSelectedListener true
                }
                R.id.action_static -> {
                    val fragment = StatisticsFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.frame1, fragment, fragment.javaClass.getSimpleName())
                        .commit()
                    return@OnNavigationItemSelectedListener true
                }
                R.id.action_book -> {
                    val fragment = BookFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.frame1, fragment, fragment.javaClass.getSimpleName())
                        .commit()
                    return@OnNavigationItemSelectedListener true
                }
                R.id.action_info -> {
                    val fragment = InfoFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.frame1, fragment, fragment.javaClass.getSimpleName())
                        .commit()
                    return@OnNavigationItemSelectedListener true
                }
            }
            false
        }
        btm_navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)




    }


}