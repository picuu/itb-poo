package pastisseria

fun main() {
    val croissant: Pasta = Pasta("croissant", 1.5f, 165, 210)
    val ensaimada: Pasta = Pasta("ensaimada", 8.25f, 600, 480)
    val donut: Pasta = Pasta("donut", 2f, 180, 320)

    println(croissant)
    println(ensaimada)
    println(donut)

    println()

    val aigua: Beguda = Beguda("aigua", 1f, false)
    val cafeTallat: Beguda = Beguda("Café tallat", 1.35f, false)
    val teVermell: Beguda = Beguda("Té vermell", 1.5f, false)
    val cola: Beguda = Beguda("CocaCola", 1.65f, true)

    println(aigua)
    println(cafeTallat)
    println(teVermell)
    println(cola)
}