package com.example.recyclerviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
    val adapter = PlaylistAdapter(loadItems())
    val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

    recyclerView.layoutManager = layoutManager
    recyclerView.adapter = adapter


}

    private fun loadItems(): List<PlaylistData> = listOf(
        PlaylistData(
            name = "música 1",
            duration = "02:25"
        ),
        PlaylistData(
            name = "música 2",
            duration = "02:23"
        ),
        PlaylistData(
            name = "música 3",
            duration = "05:29"
        ),
        PlaylistData(
            name = "música 4",
            duration = "06:23"
        ),
        PlaylistData(
            name = "música 5",
            duration = "03:25"
        ),
        PlaylistData(
            name = "música 6",
            duration = "02:25"
        ),
        PlaylistData(
            name = "música 7",
            duration = "03:25"
        ),
        PlaylistData(
            name = "música 8",
            duration = "02:45"
        ),PlaylistData(
            name = "música 9",
            duration = "02:27"
        ),
        PlaylistData(
            name = "música 10",
            duration = "02:26"
        ),PlaylistData(
            name = "música 11",
            duration = "02:13"
        ),
    )
