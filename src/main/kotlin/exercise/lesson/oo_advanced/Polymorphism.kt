package exercise.lesson.oo_advanced

fun main() {
    val tv1 = TV()
    tv1.provide("Nikelodeon")
    tv1.provide("Nikelodeon", "French")
    tv1.provide("Nikelodeon", 12)
}

class TV() {

    fun provide(channel: String) {
        println("The TV shows $channel.")
    }

    fun provide(channel: String, subtitleInfo: String) {
        println("The TV shows $channel with this info: \"$subtitleInfo\".")
    }

    fun provide(channel: String, hour: Int) {
        println("The TV shows $channel that was shown at $hour o'clock.")
    }
}