package org.example

class Persona() {
    private var dni: String? = null
    private var nom: String = ""
    private var cognoms: String = ""
    private var edat: Int = 0
    private var estatCivil: Boolean = false

    constructor(nom: String, cognoms: String): this() {
        this.nom = nom
        this.cognoms = cognoms
    }

    constructor(nom: String, cognoms: String, dni: String, edat: Int, estatCivil: Boolean): this() {
        this.nom = nom
        this.cognoms = cognoms
        this.dni = dni
        this.edat = edat
        this.estatCivil = estatCivil
    }

    fun aniversari(): Int {
        this.edat++
        return this.edat
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
