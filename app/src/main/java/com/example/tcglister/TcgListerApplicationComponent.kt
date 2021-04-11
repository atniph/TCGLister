package com.example.tcglister

import com.example.tcglister.interactor.InteractorModule
import com.example.tcglister.network.NetworkModule
import com.example.tcglister.ui.UIModule
import com.example.tcglister.ui.details.DetailsActivity
import com.example.tcglister.ui.favorites.FavoritesFragment
import com.example.tcglister.ui.main.MainActivity
import com.example.tcglister.ui.main.MainFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [UIModule::class, NetworkModule::class, InteractorModule::class])
interface TcgListerApplicationComponent {
    fun inject(mainActivity: MainActivity)
    fun inject(detailsActivity: DetailsActivity)
    fun inject(mainFragment: MainFragment)
    fun inject(favoritesFragment: FavoritesFragment)
}