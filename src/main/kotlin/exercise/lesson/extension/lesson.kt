package exercise.lesson.extension

fun main() {
    val name = "Michael"
    println(name.slim())
    println(name.funnyProperty)

    Book.showInfo()
}

fun String.slim() = this.substring(1, length-1)

val String.funnyProperty: String
    get() = "That's funny"

fun Book.Companion.showInfo() {
    println("This is a book")
}

class Book {
    companion object{}
}