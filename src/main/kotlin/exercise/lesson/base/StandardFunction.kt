package exercise.lesson.base

import kotlin.random.Random

fun main() {

    letFunction()
    withFunction()
    withFunction2()
    withAndRunFunction()
    applyAndAlsoFunction()
    takeIfAndTakeUnlessFunction()
    takeIfAndTakeUnlessExercise()
}

fun takeIfAndTakeUnlessExercise() {
    val nbs = arrayListOf<Int>()
    for(i in 0..10) {
        Random.nextInt(100)
            .takeIf { it % 2 != 0 }
            .takeUnless { it == 3 || it == 13 }
            ?.let { nbs.add(it) }
    }
    println(nbs)
}

fun takeIfAndTakeUnlessFunction() {
    //Nullable
    val even = Random.nextInt(100)
        .takeIf { it % 2 == 0 }

    //Nullable
    val odd = Random.nextInt(100)
        .takeUnless { it % 2 == 0 }

    println(even)
    println(odd)

}

fun applyAndAlsoFunction() {
    val laptop = Laptop().apply {
        price = 1500
    }.also {
        println("The laptop price = ${it.price}")
    }.also { l ->
        println("The laptop price = ${l.price}")
    }
}

fun withAndRunFunction() {
    //laptop1 is type LAPTOP
    val laptop1 = Laptop().run {
        turnOn()
        turnOff()
        price = 500
        this
    }
    println(laptop1.price)

    val l = Laptop()
    l.run {
        turnOn()
        turnOff()
        price = 500
        this
    }
    println(l.price)

    //laptop2 is type UNIT
    val laptop2 = with(Laptop()) {
        turnOn()
        turnOff()
        price = 500
    }

    //laptop3 is type LAPTOP
    val laptop3 = Laptop()
    with(laptop3) {
        turnOn()
        turnOff()
        price = 500
    }
    println(laptop3.price)
}

fun withFunction() {
    val person = Person("Tom", 15, "Russia")
    with(person) {
        job = "Student"
        this.describe()
    }
    person.describe()
}

fun withFunction2() {
    with(Store()) {
        showInventory()
        nbShoes = 12
        nbShirts = 18
        nbJackets = 10
        showInventory()
    }
}

fun letFunction() {
    val person = Person("Alice", 20, "Spain")
    person.let {
        it.describe()
        it.age = 21
        it.country = "France"
        it.describe()
    }
    person.describe()
    person.let(Person::describe)
}


class Person(val name: String, var age: Int, var country: String) {
    var job = "None"
    fun describe() {
        println("This person is $name, which is $age yo and live in $country. Its job is $job.")
    }
}

class Store() {
    var nbShoes = 0
    var nbShirts = 0
    var nbJackets = 0

    fun showInventory() {
        println("Inventory: $nbShoes shoes, $nbShirts shorts and $nbJackets jackets.")
    }
}

class Laptop() {
    var price: Int? = null

    fun turnOn() {
        println("It's on!")
    }

    fun turnOff() {
        println("It's off!")
    }
}


