package com.basemnasr.unittestingexample3roomdb.data.remote.responses

data class ImageResponse(
    val hits:List<ImageResult>,
    val total:Int,
    val totalHits:Int
)
