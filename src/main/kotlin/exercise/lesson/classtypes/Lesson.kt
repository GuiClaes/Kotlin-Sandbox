package exercise.lesson.classtypes

import kotlin.random.Random

fun main() {
    val user1 = User("Jean", "12345Test")
    val user2 = user1.copy()
    println(user1)
    println(user2)
    println(user1 == user2)

    val user3 = user1.copy(username = "Peter")
    println(user3)
    println(user1 == user3)

    decide(Color.GREEN)
    decide(Color.RED)
    decide(Color.BLUE)
    decide(Color.YELLOW)

    when(getPlant()) {
        is Fruit -> println("Sweet fruit")
        is Vegetable -> println("Tasty vegetable")
    }
}

fun decide(color: Color) {
    when(color) {
        Color.BLUE -> println("Blue")
        Color.GREEN -> println("Green")
        Color.RED -> println("Red")
        else -> println("None")
    }
}


/**
 * Equals (or ==) compare data
 * ToString print variable names and data
 */
data class User(
    val username: String,
    val password: String
)

enum class Color{
    RED,
    BLUE,
    GREEN,
    YELLOW
}

abstract class Plant

sealed class Fruit: Plant()

sealed class Vegetable: Plant()

class Apple: Fruit()

class Potato: Vegetable()

fun getPlant(): Plant {
    return if(Random.nextInt(2) == 0) Apple() else Potato()
}