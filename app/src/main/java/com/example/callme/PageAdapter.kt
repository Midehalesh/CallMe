package com.example.callme

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class PageAdapter(fm: FragmentManager, lf: Lifecycle) : FragmentStateAdapter(fm, lf){
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> RecentsFragment()
            1 -> ContactsFragment()

            else -> RecentsFragment()
        }

    }
}