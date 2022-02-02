package com.example.recyclerviewpractice

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PlaylistViewModel : ViewModel() {

    // Second step: create attributes for the view components
    private val _playlistInfo = MutableLiveData<List<Music>>()
    val playlistInfo: LiveData<List<Music>> = _playlistInfo

    // Third step: create a method to update the playlist list
    fun loadPlaylist() {
        _playlistInfo.value = PlaylistDatabase().loadItems()
    }
}
