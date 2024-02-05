package controllers

import models.electrodomestic.Electrodomestic
import models.electrodomestic.Lavadora
import models.electrodomestic.Televisio
import utilities.*

fun main() {
    val colors: Array<String> = arrayOf("blanc", "platejat", "color")

    var basePriceGeneral: Float = 0f
    var finalPriceGeneral: Float = 0f

    var basePriceWashers: Float = 0f
    var finalPriceWashers: Float = 0f

    var basePriceTV: Float = 0f
    var finalPriceTV: Float = 0f

    val electrodomestics: Array<Electrodomestic> = arrayOf(
        Electrodomestic((70..180).random().toFloat(), colors.random(), ('A'..'G').random(), (10..80).random()),
        Electrodomestic((70..180).random().toFloat(), colors.random(), ('A'..'G').random(), (10..80).random()),
        Electrodomestic((70..180).random().toFloat(), colors.random(), ('A'..'G').random(), (10..80).random()),
        Electrodomestic((70..180).random().toFloat(), colors.random(), ('A'..'G').random(), (10..80).random()),
        Electrodomestic((70..180).random().toFloat(), colors.random(), ('A'..'G').random(), (10..80).random()),
        Electrodomestic((70..180).random().toFloat(), colors.random(), ('A'..'G').random(), (10..80).random()),
        Lavadora(85f, colors.random(), ('A'..'G').random(), 20, 5),
        Lavadora(110f, colors.random(), ('A'..'G').random(), 20, 8),
        Televisio(100f, colors.random(), ('A'..'G').random(), 10, 52),
        Televisio(165f, colors.random(), ('A'..'G').random(), 10, 28)
    )

    for (i in electrodomestics.indices) {
        println("$RED******************** ELECTRODOMÈSTIC ${i+1} ********************$RESET")
        electrodomestics[i].info()

        basePriceGeneral += electrodomestics[i].getBasePrice()
        finalPriceGeneral += electrodomestics[i].getFinalPrice()

        if (electrodomestics[i] is Lavadora) {
            basePriceWashers += electrodomestics[i].getBasePrice()
            finalPriceWashers += electrodomestics[i].getFinalPrice()
        }

        if (electrodomestics[i] is Televisio) {
            basePriceTV += electrodomestics[i].getBasePrice()
            finalPriceTV += electrodomestics[i].getFinalPrice()
        }
    }

    println("$RED******************** Electrodomèstics ********************$RESET")
    println("Preu base general: $basePriceGeneral")
    println("Preu final general: $finalPriceGeneral")

    println("$RED******************** Rentadores ********************$RESET")
    println("Preu base rentadores: $basePriceWashers")
    println("Preu final rentadores: $finalPriceWashers")

    println("$RED******************** Televisors ********************$RESET")
    println("Preu base televisors: $basePriceTV")
    println("Preu final televisors: $finalPriceTV")
}
