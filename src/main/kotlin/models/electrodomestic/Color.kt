package models.electrodomestic

enum class Color {
    BLANC("Blanc"),
    PLATEJAT("Platejat"),
    COLOR("Color");

    var printableName: String

    constructor(printableName: String) {
        this.printableName = printableName
    }
}
