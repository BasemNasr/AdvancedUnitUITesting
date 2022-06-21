package com.basemnasr.unittestingexample3roomdb.data.remote

import com.basemnasr.unittestingexample3roomdb.data.remote.responses.ImageResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface PixabayAPI {

    @GET("/api/")
    suspend fun searchForImage(
        @Query("q") searchQuery: String,
        @Query("key") apiKey: String = "28072856-06db242299877e5204b74e088"
    ): Response<ImageResponse>
}