package controllers

import models.Lamp
import utilities.RED_BRIGHT
import utilities.RESET

fun main() {
    // -------------------- LAMP 1 (living-room) --------------------
    println("$RED_BRIGHT\n----------------------------------- LAMP 1 -----------------------------------\n$RESET")
    val lamp1: Lamp = Lamp("living-room", arrayOf("red", "green", "blue", "white"), 5)

    lamp1.turnOn()
    for (i in 1..3) lamp1.toggleColor()
    for (i in 1..4) lamp1.toggleIntensity()

    // -------------------- LAMP 2 (bedroom) --------------------
    println("$RED_BRIGHT\n----------------------------------- LAMP 2 -----------------------------------\n$RESET")

    val lamp2: Lamp = Lamp("bedroom", arrayOf("white", "yellow", "purple", "green", "red", "blue"), 8)

    lamp2.turnOn()
    for (i in 1..2) lamp2.toggleColor()
    for (i in 1..4) lamp2.toggleIntensity()
    lamp2.turnOff()
    lamp2.toggleColor()
    lamp2.toggleStatus()
    lamp2.toggleColor()

    // "Li modifiqui la intensitat (fins que estigui al 5)"
    // L'estat de la intensitat es guarda tot i que la lampada s'apagui.
    // Per això, la intensitat ja està al 5 perquè ja hem augmentat el seu valor anteriorment.
}
