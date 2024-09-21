package com.example.stocktickernews.data.remote

import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Query


interface StockApi {

    @GET("query?function=LISTING_STATUS")
    suspend fun getListings(
        @Query("apikey") apiKey: String
    ): ResponseBody /*allows access to the byte stream*/

    companion object{
        const val API_KEY = "EKJY32MZBD1PFS1A"
        const val BASE_URL = "https://alphavantage.co"
    }
}