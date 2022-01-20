package com.androiddevs.mvvmnewsapp.ui.repository

import com.androiddevs.mvvmnewsapp.ui.db.ArticleDatabase


//repository determines when to fetch data and from which source
class NewsRepository(articleDatabase: ArticleDatabase) {
    val db: ArticleDatabase
}