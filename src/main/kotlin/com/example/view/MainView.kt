package com.example.view


import com.example.Drinks
import com.example.app.Styles
import com.example.network.InterfaceCreator
import tornadofx.*


class MainView : View("Hello TornadoFX") {

    val newInterface: InterfaceCreator= InterfaceCreator
    override val root = hbox {
        label() {
            addClass(Styles.heading)
        }
        }
    }
