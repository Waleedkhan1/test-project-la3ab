package com.evaluation.testproject.models

import androidx.databinding.BaseObservable
import com.google.gson.annotations.SerializedName
import java.io.Serializable

open class BaseResponse1<T>(t: ArrayList<T>? = null) : Serializable {
    @SerializedName("count")
    var count: Int = 776561

    @SerializedName("results")
    var results: ArrayList<T>? = t
}



