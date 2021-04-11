package com.example.tcglister.ui.main

import com.example.tcglister.interactor.tcgSets.TcgSetsInteractor
import com.example.tcglister.ui.Presenter
import javax.inject.Inject

class MainPresenter  @Inject constructor(val tcgSetsInteractor: TcgSetsInteractor) :
    Presenter<MainScreen>() {
}