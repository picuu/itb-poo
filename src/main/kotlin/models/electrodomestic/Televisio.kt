package models.electrodomestic

import utilities.RESET
import utilities.YELLOW

class Televisio: Electrodomestic {
    private var inches: Int = 28

    constructor(basePrice: Float, color: String, consumption: Char, weight: Int, inches: Int): super(basePrice, color, consumption, weight) {
        this.inches = inches
    }

    fun getInches(): Int {
        return this.inches
    }

    override fun getFinalPrice(): Float {
        val inchesFee: Int

        when (this.inches) {
            in 0..28 -> inchesFee = 0
            in 29..32 -> inchesFee = 50
            in 33..42 -> inchesFee = 100
            in 43..50 -> inchesFee = 150
            else -> inchesFee = 200
        }

        return this.basePrice + inchesFee
    }

    override fun toString(): String {
        val header: String = "---------------$YELLOW TELEVISIÓ$RESET ---------------"
        var body: String
        body = "\t- Prue base: ${this.basePrice}€\n"
        body += "\t- Color: ${getColor()}\n"
        body += "\t- Consúm: ${this.consumption.name}\n"
        body += "\t- Pes: ${this.weight}kg\n"
        body += "\t- Mida: ${this.inches}\"\n"
        body += "\t- Preu final: ${getFinalPrice()}€"

        return header + "\n" + body
    }
}
