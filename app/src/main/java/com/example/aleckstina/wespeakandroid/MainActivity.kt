package com.example.aleckstina.wespeakandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.facebook.AccessToken
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.view.View
import com.example.aleckstina.wespeakandroid.adapter.MainFragmentPagerAdapter




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewPager = findViewById<View>(R.id.viewpager) as ViewPager
        viewPager.adapter = MainFragmentPagerAdapter(supportFragmentManager,
                this@MainActivity)
        val tabLayout = findViewById<View>(R.id.sliding_tabs) as TabLayout
        tabLayout.setupWithViewPager(viewPager)
    }

    fun setupIconsForTabs(tabLayout: TabLayout) {
        val imageResId = intArrayOf(R.drawable.ic_one, R.drawable.ic_two, R.drawable.ic_three)
        for (i in imageResId.indices) {
            tabLayout.getTabAt(i)?.setIcon(imageResId[i])
        }
    }
}
