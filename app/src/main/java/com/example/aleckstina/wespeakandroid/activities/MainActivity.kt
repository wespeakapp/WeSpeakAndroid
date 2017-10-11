package com.example.aleckstina.wespeakandroid.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.view.View
import com.example.aleckstina.wespeakandroid.R
import com.example.aleckstina.wespeakandroid.adapter.MainFragmentPagerAdapter

class MainActivity : AppCompatActivity() {
    private val deselectIcons = intArrayOf(R.mipmap.ic_search_unselect, R.mipmap.ic_conversation_unselect, R.mipmap.ic_profile_unselect)
    private val selectIcons = intArrayOf(R.mipmap.ic_search, R.mipmap.ic_conversation, R.mipmap.ic_profile)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.hide()
        val viewPager = findViewById<View>(R.id.viewpager) as ViewPager
        viewPager.adapter = MainFragmentPagerAdapter(supportFragmentManager,
                this@MainActivity)
        val tabLayout = findViewById<View>(R.id.sliding_tabs) as TabLayout
        tabLayout.setupWithViewPager(viewPager)
        setupTabsIcons(tabLayout)
        changeImageOnTabsChanged(tabLayout)
    }

    private fun setupTabsIcons(tabLayout: TabLayout) {
        for (i in deselectIcons.indices) {
            tabLayout.getTabAt(i)?.setIcon(deselectIcons[i])
        }
    }

    private fun changeImageOnTabsChanged(mTabLayout: TabLayout) {
        mTabLayout.getTabAt(0)?.setIcon(selectIcons[0])
        mTabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                tab.setIcon(selectIcons[tab.position])
            }
            override fun onTabUnselected(tab: TabLayout.Tab) {
                tab.setIcon(deselectIcons[tab.position])
            }
            override fun onTabReselected(tab: TabLayout.Tab) {}
        })
    }

}
