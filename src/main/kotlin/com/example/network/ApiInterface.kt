package com.example.network

import com.example.Drink
import com.example.Drinks
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiInterface {
    companion object {
        private const val BASE_URL = "https://www.thecocktaildb.com/"

        fun create(): ApiInterface {
            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()
            return retrofit.create(ApiInterface::class.java)
        }
    }

    @GET("api/json/v2/{id}/filter.php")
    fun getDrinks(@Path("id") Private_ID:Int, @Query("a") Type:String): Call<Drinks>
}