package com.example

data class Drinks(
    val drinks: List<Drink>
){

    fun printDrinks(){
        for (i in drinks.indices)
        {
            print(drinks[i].idDrink +"\n"+ drinks[i].strDrink + "\n" +drinks[i].strDrinkThumb + "\n\n")
        }
    }
}