package com.example.tcglister.ui.favorites

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
import com.example.tcglister.ui.main.TcgSetAdapter
import kotlinx.android.synthetic.main.fragment_favorites.*
import javax.inject.Inject
import kotlin.random.Random

class FavoritesFragment : Fragment(), FavroitesScreen, TcgSetAdapter.OnItemClickListener {

    private var tcgSetAdapter: TcgSetAdapter? = null

    @Inject
    lateinit var favoritesPresenter: FavoritesPresenter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_favorites, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        injector.inject(this)
        favoritesPresenter.attachScreen(this)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val llm = LinearLayoutManager(context)
        llm.orientation = LinearLayoutManager.VERTICAL
        recyclerViewFavorites.layoutManager = llm

        val tmpList = mutableListOf<TcgSet>()
        for (i in 1..15) {
            tmpList.add(TcgSet("TMP FAVORITE" + Random.nextInt()))
        }

        tcgSetAdapter = TcgSetAdapter(requireContext(), tmpList,this)
        recyclerViewFavorites.adapter = tcgSetAdapter

    }

    override fun onItemClick(position: Int) {
        val intent = Intent (activity, DetailsActivity::class.java)
        activity?.startActivity(intent)
    }
}