package com.example.tcglister.interactor.tcgSets

import com.example.tcglister.network.TcgSetsApi
import com.example.tcglister.network.TokenApi
import javax.inject.Inject

class TcgSetsInteractor @Inject constructor(private val tcgSetsApi: TcgSetsApi, private val tokenApi: TokenApi) {
}