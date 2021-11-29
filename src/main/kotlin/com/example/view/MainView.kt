package com.example.view

import com.example.Drink
import com.example.Drinks
import com.example.app.Styles
import com.example.network.ApiInterface
import retrofit2.Call
import retrofit2.Response
import tornadofx.*
import javax.security.auth.callback.Callback

class MainView : View("Hello TornadoFX") {
    override val root = hbox {
        label(title) {
            addClass(Styles.heading)
        }
        }
    }
