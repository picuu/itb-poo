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



## 🔍 Table of Contents

- [📝 Project Summary](#project-summary)
- [💻 Activities](#activities)

## 📝 Project Summary

- [**.idea**](.idea): Contains configuration files for the IntelliJ IDEA IDE.
- [**gradle**](gradle): Holds the Gradle build system configuration files.
- [**gradle/wrapper**](gradle/wrapper): Contains the Gradle wrapper files used for building and managing the project's dependencies.
- [**src**](src): The root source directory that holds all the project's source code.
- [**src/main/kotlin/controllers**](src/main/kotlin/controllers): Contains the controllers to instance and execute the classes and their methods.
- [**src/main/kotlin/models**](src/main/kotlin/models): Holds the data models and classes used in the project.
- [**src/main/kotlin/utilities**](src/main/kotlin/utilities): Provides utility classes or functions that can be reused across the project.

## 💻 Activities

- [Activity 6 - Bakery](#activity-6-bakery)
- [Activity 7 - Lamp](#activity-7-Lamp)

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
