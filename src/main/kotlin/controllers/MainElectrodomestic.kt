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

    for (i in 1..10) {
        println("$RED******************** ELECTRODOMÈSTIC $i ********************$RESET")
        val e: Electrodomestic = Electrodomestic(i*12f, colors.random(), ('A'..'G').random(), i*4)
        e.info()

        basePriceGeneral += e.getBasePrice()
        finalPriceGeneral += e.getFinalPrice()
    }

    val l1: Lavadora = Lavadora(85f, colors.random(), ('A'..'G').random(), 20, 5)
    val l2: Lavadora = Lavadora(110f, colors.random(), ('A'..'G').random(), 20, 8)
    basePriceGeneral += l1.getBasePrice() + l2.getBasePrice()
    finalPriceGeneral += l1.getFinalPrice() + l2.getFinalPrice()
    basePriceWashers += l1.getBasePrice() + l2.getBasePrice()
    finalPriceWashers += l1.getFinalPrice() + l2.getFinalPrice()


    val tv1: Televisio = Televisio(100f, colors.random(), ('A'..'G').random(), 10, 52)
    val tv2: Televisio = Televisio(165f, colors.random(), ('A'..'G').random(), 10, 28)
    basePriceGeneral += tv1.getBasePrice() + tv2.getBasePrice()
    finalPriceGeneral += tv1.getFinalPrice() + tv2.getFinalPrice()
    basePriceTV += tv1.getBasePrice() + tv2.getBasePrice()
    finalPriceTV += tv1.getFinalPrice() + tv2.getFinalPrice()

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
