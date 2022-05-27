package exercise.lesson.oo

open class Job(
    val name: String,
    var revenue: Double,
    var salary: Double) {

    fun work() {
        revenue += salary
    }

    fun study() {
        salary += 100
    }
}

class Doctor(revenue: Double, salary: Double) : Job("Doctor", revenue, salary) {

}
class Engineer(revenue: Double, salary: Double) : Job("Engineer", revenue, salary) {

}