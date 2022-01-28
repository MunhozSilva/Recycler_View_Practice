package com.example.recyclerviewpractice

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PlaylistAdapter {
    class PlaylistAdapter(private val list: List<PlaylistData>) : RecyclerView.Adapter<PlaylistViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaylistViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.playlist_structure, parent, false)
            return PlaylistViewHolder(view)
        }

        override fun onBindViewHolder(holder: PlaylistViewHolder, position: Int) {
            val music = list[position]
            holder.bind(music)
        }

        override fun getItemCount(): Int = list.size
    }
}

class PlaylistViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

    fun bind(music: PlaylistData) {
        view.apply {
            findViewById<TextView>(R.id.nome_da_musica).text = music.name
            findViewById<TextView>(R.id.duracao).text = music.duration
        }
    }
}