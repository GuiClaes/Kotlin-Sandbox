package exercise.lesson.classtypes

import kotlin.random.Random

fun main() {
    val networkArticle = getArticle()
    val blogArticle = networkArticle.copy(title = "${networkArticle.title} on my blog article")

    println(networkArticle)
    println(blogArticle)

    println(Medal.getMedal(1))
    println(Medal.getMedal(2))
    println(Medal.getMedal(3))
    println(Medal.getMedal(4))
    println(Medal.getPosition(Medal.GOLD))
    println(Medal.getPosition(Medal.SILVER))
    println(Medal.getPosition(Medal.BRONZE))
    showPrize(getPrize())

    val car = BMW()
    car.run()

    val airplane = Airplane().apply { turnOn() }
}

data class Article(
    val title: String,
    val content: String,
    val nbReaders: Int
)

fun getArticle(): Article {
    return Article("Title1", "Here is the content", 0)
}

enum class Medal(val position: Int) {
    GOLD(1),
    SILVER(2),
    BRONZE(3);

    companion object {
        fun getMedal(position: Int): String {
            return Medal.values().firstOrNull() { it.position == position }?.name?:"None"
        }

        fun getPosition(medal: Medal): Int {
            return Medal.valueOf(medal.name).position
        }
    }
}

fun showPrize(prizes: Prizes) {
    when(prizes) {
        is Car -> println("What a beautiful car $prizes")
        is Vacation -> println("What a beautiful vacation $prizes")
        is Gift -> println("What a beautiful gift $prizes")
    }
}

fun getPrize(): Prizes {
    return when(Random.nextInt(3)) {
        0 -> BMW()
        1 -> ToBamako()
        else -> Chocolate()
    }
}

abstract class Prizes

sealed class Car: Prizes() {
    private val engine = Engine()

    fun run() {
        engine.showNoise()
    }

    private inner class Engine {
        val rpm = 1000

        fun showNoise() {
            println("VROOM")
            println("The $rpm rpm make so much noise!")
        }
    }
}
sealed class Vacation: Prizes()
sealed class Gift: Prizes()

class BMW: Car()
class ToBamako: Vacation()
class Chocolate: Gift()

class Airplane {
    private val engine1 = Engine(1)
    private val engine2 = Engine(2)

    fun turnOn() {
        engine1.turnOn()
        engine2.turnOn()
        println("The plane is now running.")
    }

    private inner class Engine(val nb: Int) {
        fun turnOn() {
            println("The engine $nb is now running.")
        }
    }
}