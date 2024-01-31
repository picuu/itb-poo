package org.example

fun main() {
    var darrerCercle:Cercle = Cercle()

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
            2 -> darrerCercle = crearCercle()
            3 -> println(darrerCercle)
            4 -> println(PURPLE + "Perímetre de l'últim cercle creat: $YELLOW${roundToFloat(calcularPermimetre(darrerCercle.getRadi()), 2)}\n" + RESET)
            5 -> println(PURPLE + "Perímetre de l'últim cercle creat: $YELLOW${roundToFloat(calcularArea(darrerCercle.getRadi()), 2)}\n" + RESET)
            6 -> println("Fins aviat!")
        }

    } while (opcioUsuari != 6)
}

fun crearCercleDeterminat(): Cercle {
    val radi: Float = readFloat("Introdueix el radi desitgat: ", "Tipus dades incorrecte")
    val color: String = readWord("Introdueix el color desitgat: ", "Tipus dades incorrecte")

    println(BLUE + "S'ha creat un cercle $color amb radi $radi\n" + RESET)
    return Cercle(radi, color)
}

fun crearCercle(): Cercle {
    val radi: Float = readFloat("Introdueix el radi desitgat: ", "Tipus dades incorrecte")

    println(BLUE + "S'ha creat un cercle amb radi $radi\n" + RESET)
    return Cercle(radi)
}

fun calcularPermimetre(radi: Float): Double {
    return radi * (Math.PI * 2)
}

fun calcularArea(radi: Float): Double {
    return Math.PI * (radi * radi)
}