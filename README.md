# 📌 ITB Project: Object-oriented programming (OOP)

<p align="center">
  <a href=https://github.com/Picuu/itb-poo target="_blank">
    <img src='https://github.com/Picuu/itb-poo/assets/93738423/d8aad265-ce9d-491c-ae29-70f6fcf8785b' width="100%" alt="Banner" />
  </a>
</p>

<p align="center">
<img src="https://img.shields.io/github/languages/code-size/Picuu/itb-poo?style=for-the-badge" alt="GitHub code size in bytes" />
<img src="https://img.shields.io/github/last-commit/Picuu/itb-poo?style=for-the-badge" alt="GitHub last commit" />
<a href="https://wakatime.com/@Picu">
  <img src="https://wakatime.com/badge/user/018d3241-0f81-4d3f-b74f-e65b6da873ea/project/018d657f-678a-4619-a9ec-d3f536bff6b6.svg?style=for-the-badge" alt="wakatime">
</a>
</p>

## 💻 Activities

- [Activity 6 - Bakery](#activity-6---bakery)
- [Activity 7 - Lamp](#activity-7---Lamp)
- [Activity 8 - Electrodomestic](#activity-8---electrodomestic)

### Activity 6 - Bakery

#### Files of this activity:

- [**MainPastisseria.kt**](/src/main/kotlin/controllers/MainPastisseria.kt)
- [**Pasta.kt**](/src/main/kotlin/models/Pasta.kt)
- [**Beguda.kt**](/src/main/kotlin/models/Beguda.kt)

#### UML diagram

![UML-Pastisseria](https://github.com/Picuu/itb-poo/assets/93738423/f1c85b92-ac62-4ebb-81b4-820ff869d6ba)

### Activity 7 - Lamp

#### Files of this activity:

- [**Lamp.kt**](src/main/kotlin/models/Lamp.kt)
- [**MainLamp.kt**](src/main/kotlin/controllers/MainLamp.kt)

#### UML diagram

![lamp-uml](https://github.com/Picuu/itb-poo/assets/93738423/0979b934-9cb5-4566-8fd3-08ed8a8aace2)

Create your own UML diagrams at [plantuml.com](https://www.plantuml.com/)
This is the UML code for the showed diagram: 

```uml
@startuml
class lamp {
-- attributes --
- id: String
- isOn: Boolean
- colors: Array<String>
- currentColor: String
- maxIntensity: Int
- currentIntensity: Int

-- methods --
+ constructor(String, Array<String>, Int)

+ getId(): String

+ turnOn()
+ turnOff()
+ toggleStatus()
+ getStatus(): Boolean
+ setStatus(Boolean)

+ getColors(): Array<String>
+ getCurrentColor(): String
+ setColor(String)
+ toggleColor(): String

+ getMaxIntensity(): Int
+ getCurrentIntensity(): Int
+ setIntensity(Int)
+ toggleIntensity(): Int

- error(String)
- info()

+ override toString(): String
}
@enduml
```

### Activity 8 - Electrodomestic

#### Files of this activity:

- [**Electrodomestic.kt**](src/main/kotlin/models/Electrodomestic.kt)
- [**MainElectrodomestic.kt**](src/main/kotlin/controllers/MainElectrodomestic.kt)

#### UML diagram

![Electrodomestic UML](https://www.plantuml.com/plantuml/png/rP31IiGm48RlUOeSkzY-G4-BueBWGL3md4t6TY3DB9D9FOZlRZDhHQM2UFFIaczc_l-VsMTnB6MAnaUNixsEu8Kfq0HPqDiNqtNMYJ0UYq2sNMSwUtGPxXWzzFOGoSc2F4NYtbxLdpvJBjD9aD82HrVPC-0mIczlafYgEe6C55JoGWU4YnVYHZNRirQhqsqTsfcbRm2vNDsRtUglNFihknV6DApm8qWjQHGjF6gQoZIFiWCc5xz9By4nFL6ZxZG3CmQmGcUJJtQlvls4jsvsWTXjtowI2t-_WNuMprnEy6FJrwZRU_rwcmU8C6D6sbu7anyX_uk5zf12cU8R)

Create your own UML diagrams at [plantuml.com](https://www.plantuml.com/)
This is the UML code for the showed diagram:

```uml
@startuml
class Electrodomestic {
-- attributes --
- basePrice: Float
- color: Color
- consumption: Consumption
- weight: Int

-- methods --
+ constructor(Float, String, Char, Int)

+ getBasePrice(): Float
+ getColor(): String
+ getConsumption(): Char
+ getWeight(): Int

+ getFinalPrice(): Float

+ info()

+ override toString(): String
}

class Lavadora {
-- attributes --
- load: Int

-- methods --
+ constructor(Float, String, Char, Int, Int): super(Float, String, Char, Int)

+ override getFinalPrice(): Float

+ override toString(): String
}

class Televisio {
-- attributes --
- inches: Int

-- methods --
+ constructor(Float, String, Char, Int, Int): super(Float, String, Char, Int)

+ override getFinalPrice(): Float

+ override toString(): String
}

enum Color {
    BLANC("Blanc"),
    PLATEJAT("Platejat"),
    COLOR("Color");

    + printableName: String

    constructor(String)
}

enum Consumption {
    A(35),
    B(30),
    C(25),
    D(20),
    E(15),
    F(10),
    G(0);

    + fee: Int

    constructor(Int)
}

Electrodomestic <|-- Lavadora
Electrodomestic <|-- Televisio

Electrodomestic --> Color
Electrodomestic --> Consumption
@enduml
@enduml
```
