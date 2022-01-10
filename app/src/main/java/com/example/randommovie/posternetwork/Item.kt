package com.example.randommovie.posternetwork

import com.squareup.moshi.Json

data class Item(

    @Json(name = "id")
    val id: String,
    @Json(name = "img_src")
    val image: String,
    @Json(name = "title")
    val title: String,
    @Json(name = "year")
    val year: String
)