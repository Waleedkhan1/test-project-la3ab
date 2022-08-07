package com.evaluation.testproject.repositories

import com.evaluation.testproject.listeners.RepositoryListener
import com.evaluation.testproject.network.APIKeys
import com.evaluation.testproject.network.RetrofitCalling
import com.evaluation.testproject.network.RetrofitController

class CategoryDetailRepository (private val repositoryListener: RepositoryListener) :
    BaseRepository(repositoryListener) {

//    fun orderListApiCalling(id: Int) {
//        val apiService =
//            RetrofitController.apiService.getSpecificOrder(id)
//        val retrofitCalling = RetrofitCalling(this, APIKeys.specificOrderKey, apiService)
//        retrofitCalling.apiCalling()
//    }
}