package pastisseria

import org.example.utilitats.BLUE
import org.example.utilitats.RESET
import org.example.utilitats.YELLOW

class Beguda {
    private var nom: String? = null
    private var preu: Float? = null
    private var ensucrada: Boolean = false

    constructor(nom: String, preu: Float, ensucrada: Boolean) {
        this.nom = nom
        this.preu = preu
        this.ensucrada = ensucrada
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

    fun setEnsucrada(ensucrada: Boolean) {
        this.ensucrada = ensucrada
    }

    fun getEnsucrada(): Boolean {
        return this.ensucrada
    }

    override fun toString(): String {
        return """
            --------$YELLOW BEGUDA $RESET--------
            $BLUE Nom:$RESET ${this.nom}
            $BLUE Preu:$RESET ${this.preu}€
            $BLUE És ensucrada:$RESET ${this.ensucrada}
        """.trimIndent()
    }
}