package exercise.lesson.oo_advanced

import kotlin.random.Random

const val NB_COFFEE = 10

fun main() {
    val coffees = arrayListOf<Coffee>()

    for(i in 0..NB_COFFEE) {
        val coffee = getCoffee()
        coffee.prepare()
        coffees.add(coffee)
    }

    val total = coffees.sumOf { it.price }
    println("It will costs you a total of $total$ for $NB_COFFEE coffees.")

}

interface Coffee {
    val price: Double
    fun prepare()
}

class ArabicaCoffee: Coffee {
    override val price = 4.5

    override fun prepare() {
        println("The arabica coffee is being prepared and will cost $price.")
    }
}

class RobustaCoffee: Coffee {
    override val price = 3.8
    override fun prepare() {
        println("The robusta coffee is being prepared and will cost $price.")
    }
}

fun getCoffee(): Coffee {
    return if (Random.nextInt(2) == 0) ArabicaCoffee() else RobustaCoffee()
}