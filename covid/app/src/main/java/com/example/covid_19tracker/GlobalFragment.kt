package com.example.covid_19tracker

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout


class GlobalFragment : Fragment() {


    private var tabLayout: TabLayout? = null
    private var viewPager: ViewPager? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_global, container, false)
        tabLayout = view.findViewById(R.id.tabs_global) as TabLayout
        viewPager = view.findViewById(R.id.viewpager_global) as ViewPager
        viewPager!!.setAdapter(MyAdapter(fragmentManager))
        tabLayout!!.post(Runnable { tabLayout!!.setupWithViewPager(viewPager) })
        return view
    }

    private inner class MyAdapter(fm: FragmentManager?) :
        FragmentPagerAdapter(fm!!, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
        private val int_items = 3;
        override fun getItem(position: Int): Fragment {
            var fragment: Fragment? = null
            when (position) {
//                0 -> fragment = GlobalFragment_total()
//                1 -> fragment = GlobalFragment_today()
//                2 -> fragment = Global0Fragment_yestreday()
////            3 -> fragment = TabFragment()
//            4 -> fragment = TabFragment()
            }
            return fragment!!
        }

        override fun getCount(): Int {
            return int_items
        }

        override fun getPageTitle(position: Int): CharSequence? {
            when (position) {
                0 -> return "Total"
                1 -> return "today"
                2 -> return "Yesterday"
//            3 -> return "TabLayout4"
//            4 -> return "TabLayout5"
            }
            return null
        }

    }
}