package com.example.tcglister.ui.details

import com.example.tcglister.interactor.tcgSets.TcgSetsInteractor
import com.example.tcglister.ui.Presenter
import javax.inject.Inject

class DetailsPresenter  @Inject constructor(val tcgSetsInteractor: TcgSetsInteractor) : Presenter<DetailsScreen>(){
}