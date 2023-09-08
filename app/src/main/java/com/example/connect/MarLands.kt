package com.example.connect

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
data class MarLands(
    @Json(name = "id")
    val id: String, // 424905
    @Json(name = "img_src")
    val imgsrc: String, // http://mars.jpl.nasa.gov/msl-raw-images/msss/01000/mcam/1000MR0044631300503690E01_DXXX.jpg
    @Json(name = "price")
    val price: Int, // 450000
    @Json(name = "type")
    val type: String // buy
)