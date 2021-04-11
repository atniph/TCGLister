package com.example.tcglister.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.tcglister.ui.favorites.FavoritesFragment

class TabsPagerAdapter(fm: FragmentManager, lifecycle: Lifecycle, private var numberOfTabs: Int) : FragmentStateAdapter(fm, lifecycle) {

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> {
                // # Main Fragment
                val bundle = Bundle()
                bundle.putString("ALL_SETS", "Main Fragment")
                val mainFragment = MainFragment()
                mainFragment.arguments = bundle
                return mainFragment
            }
            1 -> {
                // # Favorites Fragment
                val bundle = Bundle()
                bundle.putString("FAVORITE_SETS", "Favorites Fragment")
                val favoritesFragment =
                    FavoritesFragment()
                favoritesFragment.arguments = bundle
                return favoritesFragment
            }
            else -> return MainFragment()
        }
    }

    override fun getItemCount(): Int {
        return numberOfTabs
    }
}