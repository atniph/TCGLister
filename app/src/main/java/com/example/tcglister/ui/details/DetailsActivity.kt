package com.example.tcglister.ui.details

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tcglister.R
import com.example.tcglister.injector
import javax.inject.Inject

class DetailsActivity : AppCompatActivity(), DetailsScreen {

    @Inject
    lateinit var presenter: DetailsPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        injector.inject(this)
    }
}