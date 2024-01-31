package org.example.CerclePersona

fun main() {
    val p2: Persona = Persona("Carlos", "Capó")
    println(p2)
    p2.aniversari()
    println(p2)

    println()

    val p3: Persona = Persona("Raimon", "Izard", "41573502D", 32, true)
    println(p3)
    p3.aniversari()
    p3.aniversari()
    p3.aniversari()
    p3.divorci()
    println(p3)
}