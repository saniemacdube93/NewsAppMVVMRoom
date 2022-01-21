package com.androiddevs.mvvmnewsapp.ui.repository

import com.androiddevs.mvvmnewsapp.ui.api.RetrofitInstance
import com.androiddevs.mvvmnewsapp.ui.db.ArticleDatabase


//repository determines when to fetch data and from which source
class NewsRepository(
    val db: ArticleDatabase
    ) {
    suspend fun getBreakingNews(countryCode: String , pageNumber: Int) =
        RetrofitInstance.api.getBreakingNes(countryCode,pageNumber)
}