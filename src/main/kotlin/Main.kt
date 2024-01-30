package org.example

fun main() {
    var darrerCercle:Cercle

    do {
        println("1. Crear un cercle d'un radi determinat i d'un color determinat")
        println("2. Crear un cercle d'un radi determinat")
        println("3. Mostrar l'ultim cercle creat")
        println("4. Mostrar el perímetre de l'últim cercle creat")
        println("5. Mostrar l'àrea de l'últim cercle creat")
        println("6. Sortir")

        val opcioUsuari: Int = readInt("", "Tipus dades incorrecte.",
            "Valor fora del rang esperat.",1, 6)

        when(opcioUsuari) {
            1 -> darrerCercle = crearCercleDeterminat()
        }

    } while (opcioUsuari != 6)
}

fun crearCercleDeterminat(): Cercle {
    val radi: Float = readFloat("Introdueix el radi desitgat: ", "Tipus dades incorrecte")
    val color: String = readWord("Introdueix el color desitgat: ", "Tipus dades incorrecte")

    return Cercle(radi, color)
}