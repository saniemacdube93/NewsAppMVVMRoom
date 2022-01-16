package com.androiddevs.mvvmnewsapp.ui.api

import retrofit2.http.GET

interface MewsAPI {

    @GET("V2/top-headlines")
    suspend fun getBreakingNes(

    )

}