package exercise.lesson.oo_advanced

import java.time.LocalDate

fun main() {
    val myBox = Box<String>()
    myBox.display("Salut")

    val duoBox = DuoBox<String, Int>()
    duoBox.display("Salut", 2)

    val intConverter = ConverterToString<Int>()
    println(intConverter.convert(12))
    val dateConverter = ConverterToString<LocalDate>()
    println(dateConverter.convert(LocalDate.now()))

    val geo = Geometry<Shape>()
    geo.showArea(Square(5.00))
    geo.showArea(Circle(5.00))

}

class Box<T> {
    fun display(item: T) {
        println(item)
    }
}

class DuoBox<T, U> {
    fun display(item: T, item2: U) {
        println("$item, $item2")
    }
}

class ConverterToString<T> {
    fun convert(item: T): String {
        return item.toString()
    }
}

abstract class Shape (val size: Double) {
    abstract val area: Double
}

class Square(size: Double): Shape(size) {
    override val area: Double
        get() = size * size
}

class Circle(size: Double): Shape(size) {
    override val area: Double
        get() = size * size * 3.1415
}

class Geometry<T: Shape> {
    fun showArea(item: T) {
        println(item.area)
    }
}