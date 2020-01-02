package com.example.bottomtab

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.ListAdapter
import com.example.bottomtab.Data.Movie
import kotlinx.android.synthetic.main.contacts.*
import androidx.recyclerview.widget.LinearLayoutManager as LinearLayoutManager1

class MainFragment : Fragment() {

    private val mNicolasCageMovies = listOf(
        Movie("Akshay Bhaiya", "7665738184"),
        Movie("Bhavit", "7597917007"),
        Movie("Daddy", "8890106220"),
        Movie("Maa", "9414619329"),
        Movie("Factory", "9414619329"),
        Movie("Alok", "9997776668"),
        Movie("Ghost Rider", "9996669996"),
        Movie("Jio", "9079970210"),
        Movie("Factory", "9414619329"),
        Movie("Daddy", "8890106220"),
        Movie("Bhavit", "7597917007"),
        Movie("Jio", "9079970210"),
        Movie("Ghost Rider", "9996669996")
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.contacts, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recycler_view.apply {
            layoutManager = LinearLayoutManager1(activity)
            adapter = com.example.bottomtab.Adapter.ListAdapter(mNicolasCageMovies)
        }
    }

    companion object {
        fun newInstance(): MainFragment = MainFragment()
    }
}