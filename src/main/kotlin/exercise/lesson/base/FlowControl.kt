package exercise.lesson.base

fun main(args: Array<String>) {
    assert(exerciseIf(true, false) == 60)
    assert(exerciseIf(false, true) == 0)
    assert(exerciseIf(true, true) == 100)
    assert(exerciseIf(false, false) == 0)
    isEven(5)
    isEven(2)
    exerciseIfElse(95)
    exerciseIfElse(85)
    exerciseIfElse(75)
    exerciseIfElse(65)
    exerciseIfElse(55)
    exerciseIfElse(45)
    exerciseExpression(2)
    exerciseExpression(15)
    exerciseExpression(20)
    exerciseWhen("Arthur")
    exerciseWhen("Damien")
    exerciseWhen("Jean")
    exerciseFor(2021)
    exerciseFor(2020)
    exerciseExtendedForLoop(3)
    exerciseExtendedForLoop(10)
    exerciseWhile(15)
    //exerciseDoWhile()
    exerciseBreakAndContinue()
}

fun exerciseIf(hasEggs: Boolean, hasBacon: Boolean): Int {
    var totalPrice = 0

    if (hasEggs) {
        totalPrice += 5 * 12

        if (hasBacon) {
            totalPrice += 2 * 20
        }
    }
    println(totalPrice)
    return totalPrice
}

fun exerciseIfElse(note: Int) {
    if(note >= 90) {
        println("A")
    } else if (note >= 80) {
        println("B")
    } else if (note >= 70) {
        println("C")
    } else if (note >= 60) {
        println("D")
    } else if (note >= 50) {
        println("E")
    } else {
        println("F")
    }
}

fun isEven(nb: Int) {
    val isEven = if(nb % 2 == 0) "It's even" else "It's odd"
    println(isEven)
}

fun exerciseExpression(age: Int) {
    if(age in 0..12) {
        println("Child")
    } else if(age in 13..17) {
        println("Teen")
    } else {
        println("Adult")
    }
}

fun exerciseWhen(name: String) {
    println(
        when(name[0]) {
            in "A..C" -> "FIRST"
            in "D..F" -> "SECOND"
            else -> "LAST"
        }
    )
}

fun exerciseFor(year: Int) {
    val largestDayNumber = 31
    val minesDayNumber = 30
    val unLeapedFebruaryDayNumber = 28
    val leapedFebruaryDayNumber = 29


    for(i in 1..12) {
        println(when(i) {
            1, 3, 5, 7, 8, 10, 12 -> "$i: $largestDayNumber"
            2 -> "$i: ${if(year % 4 == 0) leapedFebruaryDayNumber else unLeapedFebruaryDayNumber}"
            else -> "$i: $minesDayNumber"
        })
    }
}

fun exerciseExtendedForLoop(nb: Int) {
    for(i in 1..nb) {
        print("|")
        for(j in 1..nb) {
            print(when(i * j % 3) {
                0 -> ":D"
                1 -> ":/"
                else -> ":o"
            })
        }
        print("|\n")
    }
}

fun exerciseWhile(nb: Int) {
    var i = 0
    while (i < nb) {
        if (i % 7 == 0) {
            println(i)
        }
        i++
    }
}

fun exerciseDoWhile() {
    val usernames = hashSetOf("john", "bob", "alice")

    do {
        print("Enter a name: ")
        val input = readLine()?:""
    } while (!usernames.add(input))
    println(usernames)
}

fun exerciseBreakAndContinue() {
    do {
        print("Enter your age: ")
        val input = readLine()?: "0"
        if(input == "stop") {
            break
        }
        val age = input.toInt()
        println(if(age > 18) "Welcome !" else "You are not allowed")
    } while (true) //vomiting
}