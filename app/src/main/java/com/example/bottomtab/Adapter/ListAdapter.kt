package com.example.bottomtab.Adapter

import android.graphics.Movie
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bottomtab.Data.MovieViewHolder

class ListAdapter(private val list: List<com.example.bottomtab.Data.Movie>)
    : RecyclerView.Adapter<MovieViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return MovieViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie: com.example.bottomtab.Data.Movie = list[position]
        holder.bind(movie,position)
    }

    override fun getItemCount(): Int = list.size

}