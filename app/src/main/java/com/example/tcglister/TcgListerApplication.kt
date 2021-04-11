package com.example.tcglister

import android.app.Application
import com.example.tcglister.ui.UIModule

class TcgListerApplication : Application() {
    lateinit var injector: TcgListerApplicationComponent

    override fun onCreate() {
        super.onCreate()
        injector = DaggerTcgListerApplicationComponent.builder().uIModule(UIModule(this)).build()
    }
}