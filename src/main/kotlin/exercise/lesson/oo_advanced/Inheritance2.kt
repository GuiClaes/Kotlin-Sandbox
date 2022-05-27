package exercise.lesson.oo_advanced

fun main(args: Array<String>) {
    val filette = Daughter("Francais")
    println(filette.hairColor)
    filette.say("Oui")

}

open class Mom(val nativeTongue: String) {
    open val hairColor = "Brown"
    val eyeColor = "Blue"

    open fun say(message: String) {
        println("Mom says: $message")
    }
}

class Daughter(nativeTongue: String): Mom(nativeTongue) {
    override val hairColor = "Blond"

    override fun say(message: String) {
        println("Daughter says: $message in $nativeTongue")
    }
}