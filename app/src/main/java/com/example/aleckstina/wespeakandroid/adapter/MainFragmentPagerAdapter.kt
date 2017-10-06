package com.example.aleckstina.wespeakandroid.adapter

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.example.aleckstina.wespeakandroid.fragment.FindFragment
import com.example.aleckstina.wespeakandroid.fragment.ProfileFragment


/**
 * Created by aleckstina on 10/6/17.
 */
class MainFragmentPagerAdapter(fm: FragmentManager, private val context: Context) : FragmentPagerAdapter(fm) {
    internal val PAGE_COUNT = 3
    private val tabTitles = arrayOf("Tab1", "Tab2", "Tab3")

    override fun getCount(): Int {
        return PAGE_COUNT
    }

    override fun getItem(position: Int): Fragment {
        System.out.println(position);
        when(position) {
            0 -> return ProfileFragment.newInstance(position)
            1 -> return FindFragment.newInstance(position)
            else -> {
                return ProfileFragment.newInstance(position)
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence {
        return null.toString()
    }
}