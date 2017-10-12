package com.example.aleckstina.wespeakandroid.adapter

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.example.aleckstina.wespeakandroid.fragment.ConversationFragment
import com.example.aleckstina.wespeakandroid.fragment.FindFragment
import com.example.aleckstina.wespeakandroid.fragment.ProfileFragment


/**
 * Created by aleckstina on 10/6/17.
 */
class MainFragmentPagerAdapter(fm: FragmentManager, private val context: Context) : FragmentPagerAdapter(fm) {
    private val PAGE_COUNT = 3

    override fun getCount(): Int = PAGE_COUNT

    override fun getItem(position: Int): Fragment = when(position) {
        0 -> FindFragment.newInstance(position)
        1 -> ConversationFragment.newInstance(position)
        2 -> ProfileFragment.newInstance(position)
        else -> {
            ProfileFragment.newInstance(position)
        }
    }


    override fun getPageTitle(position: Int): CharSequence = ""
}