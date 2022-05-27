package exercise.lesson.base

import kotlin.random.Random

fun main(args: Array<String>) {
    doNullableString()
    doNullableArithmetic()
    //showNoNullAssertion()
    doExercise()
}

fun doNullableString() {
    val text: String?

    if(Random.nextInt(2) == 0) {
        text = "Something"
    } else {
        text = null
    }

    println(text?:"Nothing")
    println(text?.length)
}

fun doNullableArithmetic() {
    val nb: Int?
    if(Random.nextInt(2) == 0) {
        nb = 3
    } else {
        nb = null
    }

    println(nb)
    println(nb?.plus(1))
    println(nb?.minus(1))
    println(nb?.times(2))
    println(nb?.div(2))
    println(nb?.rem(2))
}

fun doExercise() {
    doExerciseWithString("1erExercise")
    doExerciseWithString(null)
    doExerciseWithDouble(6.66)
    doExerciseWithDouble(null)
    //doExerciseWithInput()
    //doMathematicalExercise()
    doExerciseElvisAndAssertions()
}

fun doExerciseWithString(s: String?) {
    println(s?.substring(3, 6)?:"The parameter was null")
}

fun doExerciseWithDouble(nb: Double?) {
    println(nb?.times(6)?.toFloat())
}

fun doExerciseWithInput() {
    print("Enter your name: ")
    val username = readLine()
    println(username?.length)
}

fun doMathematicalExercise() {
    print("Enter a number: ")
    val nb = readLine()?.toDouble()?.times(7)
    val nbString = nb?.toString()
    println("Number is $nbString and the length is ${nbString?.length}")
}

fun doExerciseElvisAndAssertions() {
    val price = 29.99
    val nbProducts: Int?
    if(Random.nextInt(2) == 0) {
        nbProducts = Random.nextInt(50)
    } else {
        nbProducts = 1
    }
    println("Quantity: $nbProducts")
    println("Unit price: $price")
    println("Total: ${price*nbProducts}")
}

/**
 * This function send exception because !! is an operator which assert that the variable cannot be null.
 * It's developer responsibility. It's not recommended to be used.
 */
fun showNoNullAssertion() {
    val catName: String? = null
    println(catName!!.length)
}