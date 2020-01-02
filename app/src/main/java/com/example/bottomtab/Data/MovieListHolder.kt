package com.example.bottomtab.Data

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.bottomtab.R

class MovieViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.contact_recycler, parent, false)) {
    private var contact_name: TextView? = null
    private var contact_number: TextView? = null


    init {
        contact_name = itemView.findViewById(R.id.list_title)
        contact_number = itemView.findViewById(R.id.list_description)
    }

    fun bind(movie: com.example.bottomtab.Data.Movie,i:Int) {
        contact_name?.text = movie.name
        contact_number?.text = movie.number.toString()
        contact_number?.setOnClickListener {
            when(i){
                    0 ->{

                    }
                    1 ->{

                    }
                    2->{

                    }
            }
        }
    }

}