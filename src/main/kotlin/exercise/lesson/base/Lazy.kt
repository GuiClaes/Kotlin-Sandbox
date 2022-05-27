package exercise.lesson.base

import kotlin.random.Random

fun main() {
    val largeVariable: String by lazy { "Large value" }
    val rand = Random.nextInt(2)
    if(rand % 2 == 0) {
        println(largeVariable)
    }

    val bannedUsername: List<String> by lazy {
        listOf("guillaume", "test", "admin")
    }

    print("Enter a username: ")
    val username = readLine() ?: "null"
    if (bannedUsername.contains(username.lowercase())) {
        println("This username is banned")
    } else {
        NewUser(username).showWelcome()
    }
}

class NewUser(private val username: String) {
    fun showWelcome() {
        println("Welcome $username")
    }
}