package com.example.network

import com.example.Drinks
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class InterfaceCreator {
    companion object {
        private const val PRIVATE_ID = 9973533
        private lateinit var allDrinks : Drinks

        fun getAllDrinks() : Drinks {
            val apiInterface = ApiInterface.create().getDrinks(Private_ID = PRIVATE_ID, Type = "Alcoholic")
            apiInterface.enqueue(object : Callback<Drinks> {
                override fun onFailure(call: Call<Drinks>, t: Throwable) {
                    print("Nem mukodik \n$t")
                }

                override fun onResponse(call: Call<Drinks>, response: Response<Drinks>) {
                    if (response.body() != null) {
                        println("Mukodik")
                        allDrinks = response.body()!!
                    }
                }
            })

            allDrinks.printDrinks()
            return allDrinks
    }


    }
}