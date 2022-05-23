import java.time.LocalDate

const val AUTHOR = "GuiClaes"

fun main(args: Array<String>) {
    println("Author : $AUTHOR")
    printRabbit()
    printTotalPrice("Mary", 3, 30)
    //handleInput()
}

fun printRabbit(){
    val ears = "(\\(\\"
    val face = "(-.-)"
    val body = "o_(\")(\")"

    println(ears);
    println(face);
    println(body);
}

fun printTotalPrice(client: String, nbProducts: Int, price: Int) {
    println("$client want to buy $nbProducts which cost $price per unit. This will cost her ${price*nbProducts} bucks.")
}

fun handleInput() {
    print("Enter your name: ")
    val username = readLine()?:""
    println("Hello $username!")

    print("Number = ")
    val result = readLine()?:""
    println("5 * $result = ${result.toInt()*5}")

    print("Enter your birth year: ")
    val birthYear = readLine()?:""
    println("You age is about ${LocalDate.now().year - birthYear.toInt()} years old")
}