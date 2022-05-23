/**
 * List is Immutable
 * @see listOf
 *
 * ArrayList is Mutable
 * @see arrayListOf
 * @see addAll
 * @see remove
 *
 * Set is Immutable
 * @see setOf
 *
 * HashSet is Mutable
 * @see hashSetOf
 *
 * Map is Immutable
 *
 * HashMap is Mutable
 */
fun main (args: Array<String>) {
    practiceList()
    practiceArrayList()
    exerciseList()
    exerciseListFunction()
    exerciseSet()
    exerciseSetFunction()
    exerciseMapFunction()
}

fun practiceList () {
    val favoriteAnimals = listOf("Dogs", "Cats", "Wolves")
    println(favoriteAnimals.size)
    println(favoriteAnimals[1])
}

fun practiceArrayList () {
    val customers: ArrayList<String> = arrayListOf()
    customers.add("David")
    customers.add("Chris")
    println(customers)
    customers.removeAt(1)
    println(customers)
    customers.remove("David")
    println(customers)
}

fun exerciseList () {
    val items = arrayListOf("laptop", "mouse", "pen", "paper", "mug", "phone")
    val removedItems = listOf("pen", "paper", "mug", "phone")

    items.removeAll(removedItems)
    println(items)
}

fun exerciseListFunction () {
    val animals = arrayListOf("lion", "zebra", "chimp", "elephant")
    animals.add("panda")
    println(animals)
    animals.remove("lion")
    println(animals)
    println(animals.containsAll(listOf("elephant", "giraffe")))
}

fun exerciseSet () {
    val customers = hashSetOf("David", "Chris")
    customers.add("Francois")
    println(customers)
    customers.remove("Chris")
    println(customers)
}

fun exerciseSetFunction () {
    val acceptedColors = hashSetOf("white", "black", "grey")
    var myColors = hashSetOf("blue", "red", "black", "green")
    myColors.retainAll(acceptedColors)
    println(myColors)

    myColors = hashSetOf("blue", "red", "black", "green")
    acceptedColors.add("red")
    myColors.retainAll(acceptedColors)
    println(myColors)
}

fun exerciseMapFunction () {
    val attendance = hashMapOf(Pair("23 Sept", 2837), Pair("24 Sept", 3726), Pair("25 Sept", 6253))
    attendance["26 Sept"] = 6000
    val peopleOn25 = attendance["25 Sept"]?:0
    val peopleOn26 = attendance["26 Sept"]?:0
    println(peopleOn25 + peopleOn26)
    println(attendance.containsKey("22 Sept"))
}

