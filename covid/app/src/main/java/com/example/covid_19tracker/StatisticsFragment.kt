package com.example.covidtracker.NavigationFragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.covid_19tracker.GlobalFragment
import com.example.covid_19tracker.R
import com.google.android.material.tabs.TabLayout


class StatisticsFragment : Fragment() {


    private var tabLayout: TabLayout? = null
    private var viewPager: ViewPager? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_statistics, container, false)
        tabLayout = view.findViewById(R.id.tabLayout) as TabLayout
        viewPager = view.findViewById(R.id.viewpager) as ViewPager
        viewPager!!.setAdapter(MyAdapter(fragmentManager))
        tabLayout!!.post(Runnable { tabLayout!!.setupWithViewPager(viewPager) })
        return view

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }



    private  inner class MyAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm!!, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
        private val int_items = 2;
        override fun getItem(position: Int): Fragment {
            var fragment: Fragment? = null
            when (position) {
                1 -> fragment = GlobalFragment()
//            2 -> fragment = TabFragment()
//            3 -> fragment = TabFragment()
//            4 -> fragment = TabFragment()
            }
            return fragment!!
        }
        override fun getCount(): Int {
            return int_items
        }
        override fun getPageTitle(position: Int): CharSequence? {
            when (position) {
                0 -> return "My Country"
                1 -> return "Global"
//            2 -> return "TabLayout3"
//            3 -> return "TabLayout4"
//            4 -> return "TabLayout5"
            }
            return null
        }
    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//
//        super.onViewCreated(view, savedInstanceState)
//        var title = "KotlinApp"
////
////        tabLayout.addTab(tabLayout.newTab().setText("Football"))
////        tabLayout.addTab(tabLayout.newTab().setText("Cricket"))
////        tabLayout.addTab(tabLayout.newTab().setText("NBA"))
////        tabLayout.tabGravity = GRAVITY_FILL
////        val adapter = MyAdapter(context, supportFragmentManager, tabLayout.tabCount)
////        viewPager.adapter = adapter
//        viewPager.addOnPageChangeListener(TabLayoutOnPageChangeListener(tabLayout))
//        tabLayout.addOnTabSelectedListener(object : OnTabSelectedListener {
//            override fun onTabSelected(tab: Tab) {
//                viewPager.currentItem = tab.position
//            }
//            override fun onTabUnselected(tab: Tab) {}
//            override fun onTabReselected(tab: Tab) {}
//        })
//    }

}
