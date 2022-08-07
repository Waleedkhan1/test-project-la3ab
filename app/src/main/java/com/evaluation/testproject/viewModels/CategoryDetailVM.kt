package com.evaluation.testproject.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.evaluation.testproject.listeners.RepositoryListener
import com.evaluation.testproject.network.APIKeys
import com.evaluation.testproject.repositories.CategoryDetailRepository
import com.evaluation.testproject.viewModels.base.BaseFragmentVM
import com.evaluation.testproject.vmCallbacks.category.MainCallBack

class CategoryDetailVM : BaseFragmentVM(), RepositoryListener {
    private val TAG = CategoryDetailVM::class.java.simpleName

    private val categoryDetailRepository = CategoryDetailRepository(this)

    private val callback: MutableLiveData<MainCallBack> by lazy {
        MutableLiveData<MainCallBack>()
    }


    fun getCallback(): LiveData<MainCallBack> {
        return callback
    }

    override fun <T : Any> onSuccessResponse(key: String, result: T) {
        super.onSuccessResponse(key, result)
        when (key) {

        }
    }
}