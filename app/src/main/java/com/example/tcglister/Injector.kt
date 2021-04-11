package com.example.tcglister

import android.app.Activity
import androidx.fragment.app.Fragment

val Activity.injector: TcgListerApplicationComponent
    get() {
        return (this.applicationContext as TcgListerApplication).injector
    }

val Fragment.injector: TcgListerApplicationComponent
    get() {
        return (this.context?.applicationContext as TcgListerApplication).injector
    }