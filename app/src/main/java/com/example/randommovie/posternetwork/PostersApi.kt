package com.example.randommovie.posternetwork

import retrofit2.http.GET

interface PostersApi {

    @GET("MovieDetails")
    suspend fun getItems(): List<Item>



}