package models

import org.example.utilitats.roundToFloat

class Cercle {
    private var radi: Float = 0f
    private var color: String = "blanc"
    private var perimetre: Double? = null
    private var area: Double? = null

    constructor(radi: Float) {
        this.radi = radi
        this.perimetre = calcularPermimetre(radi)
        this.area = calcularArea(radi)
    }

    constructor(radi: Float, color: String) {
        this.radi = radi
        this.color = color
        this.perimetre = calcularPermimetre(radi)
        this.area = calcularArea(radi)
    }

    private fun calcularPermimetre(radi: Float): Double {
        return radi * (Math.PI * 2)
    }

    private fun calcularArea(radi: Float): Double {
        return Math.PI * (radi * radi)
    }

    fun getPermietre(): Float {
        return roundToFloat(this.perimetre!!, 2)
    }

    fun getArea(): Float {
        return roundToFloat(this.area!!, 2)
    }

    fun setRadi(radi: Float) {
        this.radi = radi
    }

    fun getRadi(): Float {
        return this.radi
    }

    fun setColor(color: String) {
        this.color = color
    }

    fun getColor(): String {
        return this.color
    }

    override fun toString(): String {
        return """
            ----- CERCLE -----
            Radi: ${this.radi}
            Color: ${this.color}
            
        """.trimIndent()
    }
}