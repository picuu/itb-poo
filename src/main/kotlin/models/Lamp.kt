package models

import utilities.*

class Lamp {
    private var id: String? = null
    private var isOn: Boolean = false
    private var colors: Array<String>? = null
    private var currentColor: String? = colors?.get(0)
    private var maxIntensity: Int? = null
    private var currentIntensity: Int = 1

    /**
     * This is the default constructor for the Lamp class.
     * @author picuu
     * @since 01/02/2024
     * @param id String for the lamp ID.
     * @param colors Array to define the disponible colors of the lamp.
     * @param maxIntensity Integer that represents the max intensity the lamp has.
     */
    constructor(id: String, colors: Array<String>, maxIntensity: Int) {
        this.id = id
        this.colors = colors
        this.currentColor = this.colors!![0]
        this.maxIntensity = maxIntensity
    }

    /**
     * This method is used to obtain the lamp ID.
     * @author picuu
     * @since 01/02/2024
     * @return The ID of the lamp, as a String.
     */
    fun getId(): String {
        return this.id!!
    }

    /**
     * This procedure is used to change the value of the attribute isOn to true only if before it's false.
     * @author picuu
     * @since 01/02/2024
     * @see error
     * @see info
     */
    fun turnOn() {
        if (this.isOn) error("The lamp was already on!")
        else this.isOn = true

        info()
    }

    /**
     * This procedure is used to change the value of the attribute isOn to false only if before it's true.
     * @author picuu
     * @since 01/02/2024
     * @see error
     * @see info
     */
    fun turnOff() {
        if (!this.isOn) error("The lamp was already off!")
        else this.isOn = false

        info()
    }

    /**
     * This method is used to toggle the value of the attribute isOn to false if it's true or also to true if it's false.
     * @author picuu
     * @since 01/02/2024
     * @return The final status of the lamp, true if its on and false if it's off.
     * @see info
     */
    fun toggleStatus(): Boolean {
        this.isOn = !this.isOn

        info()
        return this.isOn
    }

    /**
     * This method is used to obtain the current status of the lamp.
     * @author picuu
     * @since 01/02/2024
     * @return Boolean of the status of the lamp, true if it's on or false if it's off.
     */
    fun getStatus(): Boolean {
        return this.isOn
    }

    /**
     * This method is the setter for the isOn attribute of the lamp.
     * @author picuu
     * @since 01/02/2024
     * @param status The Boolean to set to the isOn attribute.
     * @see info
     */
    fun setStatus(status: Boolean) {
        this.isOn = status

        info()
    }

    /**
     * This method is the getter for the colors attribute of the lamp. It's used to obtain the disponible colors the lamp has.
     * @author picuu
     * @since 01/02/2024
     * @return Array of the colors the lamp has.
     */
    fun getColors(): Array<String> {
        return this.colors!!
    }

    /**
     * This method is the getter for the currentColor attribute. It's used to obtain the current color the lamp is in
     * @author picuu
     * @since 01/02/2024
     * @return String of the current color the lamp is in.
     * @see error
     */
    fun getCurrentColor(): String? {
        if (!this.isOn) error("The lamp is off! There isn't any color now.")
        else {
            return this.currentColor!!
        }
        return null
    }

    /**
     * This procedure is the setter for the currentColor attribute. It's used to change the current color of the lamp if the given one is disponible in the lamp.
     * @author picuu
     * @since 01/02/2024
     * @param color String of the color to be configured.
     * @see error
     * @see info
     */
    fun setColor(color: String) {
        if (!this.isOn) error("You can't change the color of the lamp, it's off!")
        else {
            if (this.colors?.contains(color) == true) this.currentColor = color
            else error("Sorry, this color is unavailable.")

            info()
        }
    }

    /**
     * This method is used to change the lamp color to the next available in the disponible colors.
     * @author picuu
     * @since 01/02/2024
     * @return String of the current color of the lamp.
     * @see error
     * @see info
     */
    fun toggleColor(): String? {
        if (!this.isOn) error("You can't change the color of the lamp, it's off!")
        else {
            val currentColorIndex: Int? = this.colors?.indexOf(this.currentColor)
            if (currentColorIndex == this.colors?.size?.minus(1)) this.currentColor = this.colors?.get(0)
            else if (currentColorIndex != null) this.currentColor = this.colors?.get(currentColorIndex + 1)

            info()
            return this.currentColor!!
        }
        return null
    }

    /**
     * This method is the getter of the maxIntensity attribute. It's used to obtain the max intensity of the lamp.
     * @author picuu
     * @since 01/02/2024
     * @return Int of the max intensity of the lamp.
     */
    fun getMaxIntensity(): Int {
        return this.maxIntensity!!
    }

    /**
     * This method is the getter of the currentIntensity attribute. It's used to obtain the current intensity the lamp has.
     * @author picuu
     * @since 01/02/2024
     * @return Int of the intensity the lamp currently has.
     * @see error
     */
    fun getCurrentIntensity(): Int? {
        if (!this.isOn) error("The lamp is off! The intensity is 0.")
        else {
            return this.currentIntensity
        }
        return null
    }

    /**
     * This method is the setter of the currentIntensity attribute. It's used to change the current intensity of the lamp if the given one is less than the max intensity.
     * @author picuu
     * @since 01/02/2024
     * @param intensity Int of the intensity to be configured.
     * @see error
     * @see info
     */
    fun setIntensity(intensity: Int) {
        if (!this.isOn) error("You can't change the intensity of the lamp, it's off!")
        else {
            if (intensity > this.maxIntensity!!) error("Sorry, this intensity is unavailable.")
            else if (intensity <= 0) error("You cannot set an intensity equal to or less than 0!")
            else this.currentIntensity = intensity

            info()
        }
    }

    /**
     * This method is used to change the lamp intensity to the next available value between 1 (min intensity) and the max intensity of the lamp.
     * @author picuu
     * @since 01/02/2024
     * @return Int of the current intensity of the lamp after the change.
     * @see error
     * @see info
     */
    fun toggleIntensity(): Int? {
        if (!this.isOn) error("You can't change the intensity of the lamp, it's off!")
        else {
            if (this.currentIntensity == this.maxIntensity) this.currentIntensity = 1
            else this.currentIntensity++

            info()
        }
        return null
    }

    /**
     * This private procedure is used to print a given message with a specific colors.
     * @author picuu
     * @since 01/02/2024
     */
    private fun error(msg: String) {
        println(YELLOW_BOLD_BRIGHT + msg + RESET + "\n")
    }

    /**
     * This private procedure is used to call the method toString() and print the info of the current state of the lamp.
     * @author picuu
     * @since 01/02/2024
     * @see toString
     */
    private fun info() {
        println(this)
        println()
    }

    /**
     * This is an override for the method toString. This override makes the method to display some of the attributes of the lamp.
     * @author picuu
     * @since 01/02/2024
     * @return String with the information of the current status of the lamp.
     */
    override fun toString(): String {
        val heading: String = "----------------------$YELLOW LAMP $RESET----------------------"
        val id: String = "${PURPLE}Lamp ID: $BLUE${this.id}$RESET"
        val status: String = if (this.isOn) PURPLE + "The lamp is currently ${GREEN_BRIGHT}on$PURPLE.$RESET" else PURPLE + "The lamp is ${RED_BRIGHT}off$PURPLE.$RESET"

        val color: String = PURPLE + "Its color is $GREEN_BRIGHT${this.currentColor}$PURPLE.$RESET"
        val intensity: String = PURPLE + "And it is at the intensity $GREEN_BRIGHT${this.currentIntensity}$RESET, with a max of $GREEN${this.maxIntensity}$PURPLE.$RESET"

        var body: String = ""
        if (this.isOn) body = "\n" + color + "\n" + intensity

        return "$heading\n$id\n$status$body"
    }
}
