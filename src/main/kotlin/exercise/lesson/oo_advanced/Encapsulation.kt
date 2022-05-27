package exercise.lesson.oo_advanced

fun main() {
    val restaurant = Franchise()
    restaurant.getBurger()
}

open class Restaurant {
    /**
     * This method is invisible from the exterior of the class
     */
    protected fun applyFormula(): String {
        return "This is the secret formula of the burger"
    }
}

class Franchise: Restaurant() {

    fun getBurger() {
        println("Here is a burger which have been done with the secret formula.")
        println(applyFormula())
    }
}