package org.example

fun main() {
    val p1: Persona = Persona()
    println(p1.toString())
    p1.casament()
    p1.aniversari()
    println(p1.toString())

    val p2: Persona = Persona("Carlos", "Capó")
    println(p2.toString())

    val p3: Persona = Persona("Raimon", "Izard", "41752530D", 32, true)
    println(p3.toString())
    p3.aniversari()
    p3.aniversari()
    p3.aniversari()
    p3.divorci()
    println(p3.toString())
}