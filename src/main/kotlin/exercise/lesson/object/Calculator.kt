package exercise.lesson.`object`

class Calculator {
    var total: Double = 0.0

    fun add(nb: Double) {
        total += nb
    }

    fun sub(nb: Double) {
        total -= nb
    }

    fun time(nb: Double) {
        total *= nb
    }

    fun div(nb: Double) {
        total /= nb
    }

    fun reset() {
        total = 0.0
    }
}