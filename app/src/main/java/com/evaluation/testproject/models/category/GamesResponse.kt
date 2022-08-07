package com.evaluation.testproject.models.category

import com.evaluation.testproject.models.BaseResponse1
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class GamesResponse : BaseResponse1<GamesResponse.Results>(){

    class Results(
        var id: Int,
        var slug: String,
        var name: String,
        var released: String,
        var background_image: String,
        var rating: Float,
        var rating_top: Int,
        @SerializedName("ratings")
        val ratings: ArrayList<Ratings>,
        var updated: String,
        @SerializedName("platforms")
        val platforms: ArrayList<PlatForms>,
        @SerializedName("genres")
        val genres: ArrayList<Genres>,
        @SerializedName("stores")
        val stores: ArrayList<Stores>
    ) : Serializable

    class Ratings(
        var id: Int,
        var title: String,
        var count: Int,
        var percent: Float
    )

    class PlatForms(
        @SerializedName("platform")
        var platform: PlatForm,
        var released_at: String
    )

    class PlatForm(
        var id: Int,
        var name: String,
        var slug: String,
        var image_background: String
    )

    class Genres(
        var id: Int,
        var name: String,
        var slug: String,
        var image_background: String
    )

    class Stores(
        var id: Int,
        @SerializedName("store")
        var store: Store
    )

    class Store(
        var id: Int,
        var name: String,
        var slug: String,
        var domain: String,
        var image_background: String
    )
}