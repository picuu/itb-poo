package models.electrodomestic

import utilities.RESET
import utilities.YELLOW

class Lavadora: Electrodomestic {
    private var load: Int = 5

    constructor(basePrice: Float, color: String, consumption: Char, weight: Int, load: Int): super(basePrice, color, consumption, weight) {
        this.load = load
    }

    fun getLoad(): Int {
        return this.load
    }

    override fun getFinalPrice(): Float {
        val loadFee: Int

        when (this.load) {
            in 6..7 -> loadFee = 55
            8 -> loadFee = 70
            9 -> loadFee = 85
            10 -> loadFee = 100
            else -> loadFee = 0
        }

        return this.basePrice + loadFee
    }

    override fun toString(): String {
        val header: String = "---------------$YELLOW LAVADORA$RESET ---------------"
        var body: String
        body = "\t- Prue base: ${this.basePrice}€\n"
        body += "\t- Color: ${getColor()}\n"
        body += "\t- Consúm: ${this.consumption.name}\n"
        body += "\t- Pes: ${this.weight}kg\n"
        body += "\t- Càrrega: ${this.load}kg\n"
        body += "\t- Preu final: ${getFinalPrice()}€"

        return header + "\n" + body
    }
}
