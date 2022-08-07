package com.evaluation.testproject.viewModels

import android.os.Bundle
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.evaluation.testproject.R
import com.evaluation.testproject.helpers.ResourceProvider
import com.evaluation.testproject.helpers.Utils
import com.evaluation.testproject.listeners.RepositoryListener
import com.evaluation.testproject.models.category.GamesResponse
import com.evaluation.testproject.network.APIKeys
import com.evaluation.testproject.repositories.HomeRepository
import com.evaluation.testproject.viewModels.base.BaseFragmentVM
import com.evaluation.testproject.views.fragments.CategoriesDetailFragment
import com.evaluation.testproject.vmCallbacks.FragmentVMCallback
import com.evaluation.testproject.vmCallbacks.category.MainCallBack

class MainVM : BaseFragmentVM(), RepositoryListener {
    private val TAG = MainVM::class.java.simpleName

    private val homeRepository = HomeRepository(this)
    var loadingPagination: Boolean = false
    var pageNumber: Int = 1

    private val callback: MutableLiveData<MainCallBack> by lazy {
        MutableLiveData<MainCallBack>()
    }

    val gamesResponse: MutableLiveData<GamesResponse> by lazy {
        MutableLiveData<GamesResponse>()
    }


    fun getGamesAPi(page : Int) {
        if (Utils.isNetworkAvailable()) {
            vmFragmentCB.value = FragmentVMCallback.showProgressBar(true)
            homeRepository.getGamesApi(20,page,ResourceProvider.getString(R.string.API_KEY))
        }
    }

    fun onImageClicked(position: Int,data : GamesResponse.Results) {
        val bundle = Bundle()
        bundle.putInt("position", position)
        bundle.putSerializable("data", data)
        val fragment = CategoriesDetailFragment()
        fragment.arguments = bundle
        vmFragmentCB.value = FragmentVMCallback.onFragmentChanged(fragment)
    }

    fun paginationValidation(){
        if (gamesResponse.value?.results?.size!! > 0 &&
            !loadingPagination &&
            (gamesResponse.value?.results?.size ?:0) > 0
        ){
            pageNumber = ++pageNumber
            getGamesAPi(pageNumber)
            loadingPagination = true
        }
    }

    fun getCallback(): LiveData<MainCallBack> {
        return callback
    }

    override fun <T : Any> onSuccessResponse(key: String, result: T) {
        super.onSuccessResponse(key, result)
        when (key) {
            APIKeys.gamesKey -> {
                getImagesesponse(result as GamesResponse)
            }
        }
    }

    private fun getImagesesponse(gamesResponse: GamesResponse) {

        if (loadingPagination){
            this.gamesResponse.value!!.results?.addAll(gamesResponse.results!!)
            callback.value = MainCallBack.PopulateData
        }else{
            if (gamesResponse.count != 0) {
                this.gamesResponse.value = gamesResponse
                callback.value = MainCallBack.PopulateData
            }
        }

    }

    fun remove() {
        callback.value = null
    }
}