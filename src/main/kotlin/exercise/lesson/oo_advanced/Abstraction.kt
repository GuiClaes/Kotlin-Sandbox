package exercise.lesson.oo_advanced

fun main() {
    val o1 = Bosch()
    o1.cook()

    val o2 = Roaster()
    o2.cook()
}

abstract class Oven() {
    val cookingSpeed = 12.0
    open val temperature = 150
    abstract val action: String

    fun cook() {
        println("It $action at $temperature degrees and with a speed of $cookingSpeed")
    }
}


class Bosch: Oven() {
    override val temperature = 180
    override val action = "cooks"

}

class Roaster: Oven() {
    override val action = "roasts"
}