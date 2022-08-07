package com.evaluation.testproject.repositories

import com.evaluation.testproject.listeners.RepositoryListener
import com.evaluation.testproject.network.APIKeys
import com.evaluation.testproject.network.RetrofitCalling
import com.evaluation.testproject.network.RetrofitController

class HomeRepository(private val repositoryListener: RepositoryListener) :
    BaseRepository(repositoryListener) {

    fun getGamesApi(page_size: Int,page: Int,key: String) {
        val uniqueKey = APIKeys.gamesKey
        val apiService = RetrofitController.apiService.getGames(page_size,page,key)
        val retrofitCalling = RetrofitCalling(this, uniqueKey, apiService)
        retrofitCalling.apiCalling()
    }

}