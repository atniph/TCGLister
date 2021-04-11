package com.example.tcglister.ui.main

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tcglister.R
import com.example.tcglister.injector
import com.example.tcglister.model.TcgSet
import com.example.tcglister.ui.details.DetailsActivity
import kotlinx.android.synthetic.main.fragment_main.*
import javax.inject.Inject
import kotlin.random.Random

class MainFragment : Fragment(), MainScreen, TcgSetAdapter.OnItemClickListener {

    private var tcgSetAdapter: TcgSetAdapter? = null

    @Inject
    lateinit var mainPresenter: MainPresenter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        injector.inject(this)
        mainPresenter.attachScreen(this)
    }

    override fun onDetach() {
        mainPresenter.detachScreen()
        super.onDetach()
    }

    override fun onResume() {
        super.onResume()
        mainPresenter.attachScreen(this)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val llm = LinearLayoutManager(context)
        llm.orientation = LinearLayoutManager.VERTICAL
        recyclerViewMain.layoutManager = llm

        val tmpList = mutableListOf<TcgSet>()
        for (i in 1..15) {
            tmpList.add(TcgSet("TMP VALUE" + Random.nextInt()))
        }

        tcgSetAdapter = TcgSetAdapter(requireContext(), tmpList,this)
        recyclerViewMain.adapter = tcgSetAdapter

    }

    override fun onItemClick(position: Int) {
        val intent = Intent (activity, DetailsActivity::class.java)
        activity?.startActivity(intent)
    }
}