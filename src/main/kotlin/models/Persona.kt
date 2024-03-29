package models

class Persona {
    private var dni: String? = null
    private var nom: String? = null
    private var cognoms: String? = null
    private var edat: Int? = null
    private var estatCivil: Boolean = false

    constructor(nom: String, cognoms: String){
        this.nom = nom
        this.cognoms = cognoms
        this.dni = calcDNI()
    }

    constructor(nom: String, cognoms: String, dni: String, edat: Int, estatCivil: Boolean): this(nom, cognoms) {
        this.dni = dni
        this.edat = edat
        this.estatCivil = estatCivil
    }

    private fun calcDNI(): String {
        var dni:String = ""
        for (i in 1..8) dni += ('0'..'9').random()
        dni += ('A'..'Z').random()
        return dni
    }

    fun aniversari(): Int {
        if (this.edat == null) this.edat = 1
        else this.edat = this.edat!! + 1
        return this.edat!!
    }

    fun casament() {
        this.estatCivil = true
    }

    fun divorci() {
        this.estatCivil = false
    }

    override fun toString(): String {
        return """
            ---------- PERSONA ----------
            DNI: ${this.dni}
            NOM: ${this.nom}
            COGNOMS: ${this.cognoms}
            EDAT: ${this.edat}
            ESTAT CIVIL: ${this.estatCivil}
        """.trimIndent()
    }
}
