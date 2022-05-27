package exercise.lesson.base

/**
 * @see forEach
 * @see map
 * @see filter
 * @see sortedBy
 * @see maxByOrNull
 * @see minByOrNull
 */
fun main(args: Array<String>) {
    sayHello(listOf("Guillaume", "Stephane", "Sylvain"))
        {name: String -> println("Hello $name")}

    println(apply(arrayListOf(50, 60, 70, 80))
        {nb: Int -> nb / 10})

    println(check(listOf("Jean", "Patrick"))
        {name -> "Check $name"})

    doubleOddHalfEven(arrayListOf(11, 22, 33, 44, 55, 66, 77, 88))
}

fun sayHello(names: List<String>, greetingFunction: (String) -> Unit) {
    names.forEach(greetingFunction)
}

fun apply(numbers: ArrayList<Int>, mathematicalFunction: (Int) -> Int): List<Int> {
    return numbers.map(mathematicalFunction)
}

fun check(clients: List<String>, checkFunction: (String) -> String): List<String> {
    return clients.map(checkFunction)
}

fun doubleOddHalfEven(numbers: ArrayList<Int>) {
    val partition = numbers.partition { it % 2 == 1 }
    val doubled = partition.first.map { it * 2 }
    val halved = partition.second.map { it / 2 }
    println(listOf(doubled, halved).flatten().filter { it >= 25 }.sorted())
}