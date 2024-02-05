package models.electrodomestic

import utilities.*

open class Electrodomestic {
    @JvmField protected var basePrice: Float
    @JvmField protected var color: Color
    @JvmField protected var consumption: Consumption
    @JvmField protected var weight: Int

    /**
     * This is the default constructor for the Electrodomestic class.
     * @author picuu
     * @since 04/02/2024
     * @param basePrice Float of the initial price for the "Electrodomestic".
     * @param color String for the color of the "Electrodomestic".
     * @param consumption Char of the consumption level of the "Electrodomestic".
     * @param weight Int of the weight of the "Electrodomestic".
     */
    constructor(basePrice: Float, color: String, consumption: Char, weight: Int) {
        this.basePrice = basePrice
        this.color = Color.valueOf(color.uppercase())
        this.consumption = Consumption.valueOf(consumption.toString().uppercase())
        this.weight = weight
    }

    /**
     * This method is the getter for the basePrice attribute. It's used to obtain the initial price of an "Electrodomèstic".
     * @author picuu
     * @since 04/02/2024
     * @return Float of the initial price of the "Electrodomèstic".
     */
    fun getBasePrice(): Float {
        return this.basePrice
    }

    /**
     * This method is the getter for the color attribute. It's used to obtain the color of an "Electrodomèstic".
     * @author picuu
     * @since 04/02/2024
     * @return String of the "Electrodomèstic"s color.
     */
    fun getColor(): String {
        return this.color.printableName
    }

    /**
     * This method is the getter for the consumption attribute. It's used to obtain the consumption level of an "Electrodomèstic".
     * @author picuu
     * @since 04/02/2024
     * @return Char of the consumption level of the "Electrodomèstic".
     */
    fun getConsumption(): Char {
        return this.consumption.name.first()
    }

    /**
     * This method is the getter for the weight attribute. It's used to obtain the weight of an "Electrodomèstic".
     * @author picuu
     * @since 04/02/2024
     * @return Int of the weight of the "Electrodomèstic".
     */
    fun getWeight(): Int {
        return this.weight
    }

    /**
     * This method is used to calculate the final price of an "Electrodomèstic" based on its consumption and weight.
     * @author picuu
     * @since 04/02/2024
     * @return Float of the final price of the "Electrodomèstic".
     */
    open fun getFinalPrice(): Float {
        val weightFee: Int

        when (this.weight) {
            in 0..5 -> weightFee = 0
            in 6..20 -> weightFee = 20
            in 21..50 -> weightFee = 50
            in 51..80 -> weightFee = 80
            else -> weightFee = 100
        }

        return this.basePrice + this.consumption.fee + weightFee
    }

    /**
     * This protected procedure is used to call the method toString() and print the info of the "Electrodomestic".
     * @author picuu
     * @since 01/02/2024
     * @see toString
     */
    fun info() {
        println(this)
        println()
    }

    /**
     * This is an override for the method toString. This override makes the method to display some of the attributes of the "Electrodomestic".
     * @author picuu
     * @since 01/02/2024
     * @return String with the information of the "Electrodomestic".
     */
    override fun toString(): String {
        val header: String = "---------------$YELLOW ELECTRODOMÈSTIC$RESET ---------------"
        var body: String
        body = "\t- Prue base: ${this.basePrice}€\n"
        body += "\t- Color: ${this.color.printableName}\n"
        body += "\t- Consúm: ${this.consumption.name}\n"
        body += "\t- Pes: ${this.weight}kg\n"
        body += "\t- Preu final: ${getFinalPrice()}€"

        return header + "\n" + body
    }
}
