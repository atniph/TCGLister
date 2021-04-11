package com.example.tcglister.interactor

import com.example.tcglister.interactor.tcgSets.TcgSetsInteractor
import com.example.tcglister.network.TcgSetsApi
import com.example.tcglister.network.TokenApi
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class InteractorModule {
    @Provides
    @Singleton
    fun provideArtistsInteractor(tcgSetsApi: TcgSetsApi, tokenApi: TokenApi) = TcgSetsInteractor(tcgSetsApi, tokenApi)
}