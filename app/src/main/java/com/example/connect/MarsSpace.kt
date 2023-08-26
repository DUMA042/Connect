package com.example.connect

data class MarsSpace( val id: String, // 424905
                      val img_src: String, // http://mars.jpl.nasa.gov/msl-raw-images/msss/01000/mcam/1000MR0044631300503690E01_DXXX.jpg
                      val price: Int, // 450000
                      val type: String // buy
                      )

fun MarLands.toMarsSpace() = MarsSpace(id, img_src, price, type)
