package com.evaluation.testproject.network

import com.evaluation.testproject.models.category.GamesResponse
import retrofit2.Call
import retrofit2.http.*


interface ApiService {

    //Images
    @GET(APILinks.GAMES_API)
    fun getGames(  @Query("page_size") page_size: Int,
                   @Query("page") page: Int,
                   @Query("key") key: String): Call<GamesResponse>

}
