package models

import org.example.utilitats.*

class Pasta {
    private var nom: String? = null
    private var preu: Float? = null
    private var pes: Int? = null
    private var calories: Int? = null

    constructor(nom: String, preu: Float, pes: Int, calories: Int) {
        this.nom = nom
        this.preu = preu
        this.pes = pes
        this.calories = calories
    }

    fun setNom(nom: String) {
        this.nom = nom
    }

    fun getNom(): String {
        return this.nom!!
    }

    fun setPreu(preu: Float) {
        this.preu = preu
    }

    fun getPreu(): Float {
        return this.preu!!
    }

    fun setPes(pes: Int) {
        this.pes = pes
    }

    fun getPes(): Int {
        return this.pes!!
    }

    fun setCalories(calories: Int) {
        this.calories = calories
    }

    fun getCalories(): Int {
        return this.calories!!
    }

    override fun toString(): String {
        return """
            --------$YELLOW PASTA $RESET--------
            $BLUE Nom:$RESET ${this.nom}
            $BLUE Preu:$RESET ${this.preu}€
            $BLUE Pes:$RESET ${this.pes}g
            $BLUE Calories:$RESET ${this.calories}kcal
        """.trimIndent()
    }
}