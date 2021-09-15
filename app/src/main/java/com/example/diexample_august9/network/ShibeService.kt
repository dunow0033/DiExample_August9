package com.example.diexample_august9.network

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ShibeService {

    @GET("/api/shibes")
    suspend fun getShibes(
        @Query("count") count: Int,
        @Query("httpUrls") isTrue: Boolean
    ): Response<List<String>>

}