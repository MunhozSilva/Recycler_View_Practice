package com.example.recyclerviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.activity.viewModels

class PlaylistActivity : AppCompatActivity() {

    // First step: create PlaylistViewModel class that extends from ViewModel
    private val viewModel: PlaylistViewModel by viewModels()

    //private val viewModel = ViewModelProvider(this).get(PlaylistViewModel::class.java)
    private val adapter = PlaylistAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupObservables()
        setupRecyclerView()
    }

    override fun onStart() {
        super.onStart()
        viewModel.loadPlaylist()
    }

    private fun setupRecyclerView() {
        val recyclerView: RecyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter
    }

    private fun setupObservables() {
        // Fourth step: observe the items list and update adapter
        viewModel.playlistInfo.observe(this) { musicList ->
            adapter.updateList(musicList)
        }
    }
}
