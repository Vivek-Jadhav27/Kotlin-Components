package com.example.tablayout

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(framentmanager : FragmentManager , lifecycle: Lifecycle) : FragmentStateAdapter(
    framentmanager , lifecycle
) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return if (position ==0)
            ChatFragment()
        else
            StatusFragment()
    }
}