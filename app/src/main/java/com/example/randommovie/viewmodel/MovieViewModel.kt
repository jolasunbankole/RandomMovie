package com.example.randommovie.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.randommovie.posternetwork.Item
import com.example.randommovie.posternetwork.PosterNetwork
import kotlinx.coroutines.launch

class MovieViewModel : ViewModel() {

    val movieResponseList: MutableLiveData<List<Item>> = MutableLiveData()

    fun getItem(){
        viewModelScope.launch {
            movieResponseList.value = PosterNetwork.retrofit.getItems()
        }
    }

}