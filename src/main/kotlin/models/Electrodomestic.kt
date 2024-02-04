package models

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
        return basePrice
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
     * @see getColor
     */
    override fun toString(): String {
        val header: String = "---------------$YELLOW ELECTRODOMÈSTIC$RESET ---------------"
        val body: String = "\t- Prue base: ${this.basePrice}€\n\t- Color: ${getColor()}\n\t- Consúm: ${this.consumption.name}\n\t- Pes: ${this.weight}kg\n\t- Preu final: ${getFinalPrice()}€"

        return header + "\n" + body
    }
}

class Lavadora: Electrodomestic {
    private var load: Int = 5

    constructor(basePrice: Float, color: String, consumption: Char, weight: Int, load: Int): super(basePrice, color, consumption, weight) {
        this.load = load
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
        val body: String = "\t- Prue base: ${this.basePrice}€\n\t- Color: ${getColor()}\n\t- Consúm: ${this.consumption.name}\n\t- Pes: ${this.weight}kg\n\t- Càrrega: ${this.load}kg\n\t- Preu final: ${getFinalPrice()}€"

        return header + "\n" + body
    }
}

class Televisio: Electrodomestic {
    private var inches: Int = 28

    constructor(basePrice: Float, color: String, consumption: Char, weight: Int, inches: Int): super(basePrice, color, consumption, weight) {
        this.inches = inches
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
        val body: String = "\t- Prue base: ${this.basePrice}€\n\t- Color: ${getColor()}\n\t- Consúm: ${this.consumption.name}\n\t- Pes: ${this.weight}kg\n\t- Mida: ${this.inches}\"\n\t- Preu final: ${getFinalPrice()}€"

        return header + "\n" + body
    }
}

enum class Color {
    BLANC("Blanc"),
    PLATEJAT("Platejat"),
    COLOR("Color");

    var printableName: String

    constructor(printableName: String) {
        this.printableName = printableName
    }
}

enum class Consumption {
    A(35),
    B(30),
    C(25),
    D(20),
    E(15),
    F(10),
    G(0);

    var fee: Int

    constructor(fee: Int) {
        this.fee = fee
    }
}
