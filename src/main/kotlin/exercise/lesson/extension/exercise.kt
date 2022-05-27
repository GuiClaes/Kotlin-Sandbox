package exercise.lesson.extension

fun main() {
    println(arrayListOf(1,2,3,4,5).length())
    Double.printClassName()
}

fun ArrayList<Int>.length(): Int {
    return this.size
}

fun Double.Companion.printClassName() {
    println("DOUBLE")
}