package exercise.lesson.base

fun main() {
    val car = getCar()
    if(car !is BMW) {
        println("This is not my favorite brand.")
    }

    val bmwCar = car as? BMW
    bmwCar?.drive()


    val animals = listOf(Dog(), Cat(), Dog(), Cat())
    animals.forEach { animal ->
        (animal as? Dog)?.bark()
        (animal as? Cat)?.purr()
    }
}

open class Car
class BMW: Car() {
    fun drive() {
        println("VROOM")
    }
}

fun getCar(): Car = BMW()


abstract class Animal {}

class Cat: Animal() {
    fun purr() {
        println("Miaow!")
    }
}

class Dog: Animal() {
    fun bark() {
        println("Woof!")
    }
}