package com.example.tcglister.ui.favorites

import com.example.tcglister.interactor.tcgSets.TcgSetsInteractor
import com.example.tcglister.ui.Presenter
import org.greenrobot.eventbus.EventBus
import javax.inject.Inject

class FavoritesPresenter  @Inject constructor(val tcgSetsInteractor: TcgSetsInteractor) :
    Presenter<FavroitesScreen>() {
}