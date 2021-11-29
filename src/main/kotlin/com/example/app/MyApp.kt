package com.example.app

import com.example.Drink
import com.example.network.ApiInterface
import com.example.view.MainView
import javafx.stage.Stage
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import tornadofx.App

class MyApp: App(MainView::class, Styles::class)
{
    override fun start(stage: Stage) {
        stage.width = 800.0
        stage.height = 600.0
        super.start(stage)

        val apiInterface = ApiInterface.create().getDrinks()
        apiInterface.enqueue(object : Callback<List<Drink>?> {
            override fun onFailure(call: Call<List<Drink>?>, t: Throwable) {
                    print("Nem működik")
            }

            override fun onResponse(call: Call<List<Drink>?>, response: Response<List<Drink>?>) {
                if(response.body() != null)
                    println("Működik")
            }
        })
    }
}
