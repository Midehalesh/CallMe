package com.example.callme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var tabLayout: TabLayout
    private lateinit var viewpager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//Thi s is responsible for the layout
        tabLayout = findViewById(R.id.tab)

        viewpager = findViewById(R.id.viewpager)
        viewpager.adapter = PageAdapter(supportFragmentManager, lifecycle)

        TabLayoutMediator(tabLayout, viewpager,){ tab, position ->
            when (position) {
                0 -> tab.text = "Recents"
                1 -> tab.text = "Contacts"
            }
        }.attach()

    }
}