package models.electrodomestic

enum class Consumption {
    A(35),
    B(30),
    C(25),
    D(20),
    E(15),
    F(10),
    G(0);

    var fee: Int

    constructor(fee: Int) {
        this.fee = fee
    }
}
