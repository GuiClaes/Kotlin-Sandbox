fun main (args: Array<String>) {
    val nameAndAge = getNameAndAge()
    println(nameAndAge)
    println(estimateLifeSpan("cats"))
    println(estimateLifeSpan("dogs"))
    println(estimateLifeSpan("rabbits"))
    println(estimateLifeSpan("horses"))
    cost("Cheese", 5.52)
    cost(mapOf(Pair("Cheese", 5.52), Pair("Bacon", 9.63)))
    varagHello(2, "Jean", "Patrick")
    helloUser()
}

fun getNameAndAge(): String {
    val name = "Guillaume"
    val age = "23"

    return "Username: $name is aged $age"
}

fun estimateLifeSpan(animal: String): Int {
    return when(animal) {
        "cats" -> 15
        "dogs" -> 10
        "rabbits" -> 12
        else -> 20
    }
}

fun cost(productName: String, price: Double) {
    println("$productName costs ${price * 1.20}\$ with taxes.")
}

fun cost(priceByProduct: Map<String, Double>) {
    for(priceProduct in priceByProduct) {
        println("${priceProduct.key} costs ${priceProduct.value * 1.20}\$ with taxes.")
    }
}

fun varagHello(count: Int, vararg clients: String) {
    for(client in clients) {
        for (i in 1..count) {
            println("Hello $client")
        }
    }
}

fun helloUser() {
    fun getUserName():String {
        println("Enter your name: ")
        return readLine()?:""
    }

    fun sayHello(name: String) {
        println("Hello $name!!")
    }

    while (true) {
        val input = getUserName()
        if(input.isEmpty()) {
            break
        }
        sayHello(input)
    }
}