package com.example.view


import com.example.Drinks
import com.example.app.Styles
import com.example.network.InterfaceCreator
import tornadofx.*


class MainView : View("Hello TornadoFX") {

    private val allDrinks: Drinks = InterfaceCreator.getAllDrinks()
    override val root = hbox {
        label(allDrinks.drinks[5].strDrink) {
            addClass(Styles.heading)
        }
        }
    }
