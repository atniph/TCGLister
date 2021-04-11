package com.example.tcglister.ui.main

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tcglister.R
import com.example.tcglister.model.TcgSet
import kotlinx.android.synthetic.main.tcg_list_item.view.*

class TcgSetAdapter constructor(
    private val context: Context,
    private val tcgSets: List<TcgSet>,
    private val listener: OnItemClickListener
    ) : RecyclerView.Adapter<TcgSetAdapter.ViewHolder>(){

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.tcg_list_item, viewGroup, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val tcgSet = tcgSets[position]
        holder.setName.text = tcgSet.name
    }

    override fun getItemCount() = tcgSets.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
        View.OnClickListener {
        val setName: TextView = itemView.set_name
        init {
            itemView.setOnClickListener(this)
        }
        override fun onClick(v: View?) {
            val position = adapterPosition
            if (position != RecyclerView.NO_POSITION) {
                listener.onItemClick(position)
            }
        }
    }
    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }
}