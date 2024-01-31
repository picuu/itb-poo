package org.example

fun main() {
    val p2: Persona = Persona("Carlos", "Capó")
    println(p2.toString())
    p2.aniversari()
    println(p2.toString())

    println()

    val p3: Persona = Persona("Raimon", "Izard", "41752530D", 32, true)
    println(p3.toString())
    p3.aniversari()
    p3.aniversari()
    p3.aniversari()
    p3.divorci()
    println(p3.toString())
}