package com.androiddevs.mvvmnewsapp.ui.api

import com.androiddevs.mvvmnewsapp.ui.NewsResponse
import com.androiddevs.mvvmnewsapp.ui.util.Constants.Companion.API_KEY
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.Response

interface NewsAPI {

    @GET("V2/top-headlines")
    suspend fun getBreakingNes(
    @Query("country")
    countryCode: String = "us",
    @Query("page")
    pageNumber: Int = 1,
    @Query("apiKey")
    apiKey: String = API_KEY
    ): Response<NewsResponse>


    @GET("V2/everything")
    suspend fun searchForNews(
        @Query("country")
        searchQuery: String ,
        @Query("page")
        pageNumber: Int = 1,
        @Query("apiKey")
        apiKey: String = API_KEY
    ): Response<NewsResponse>
}