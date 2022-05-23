const val AUTHOR = "GuiClaes"

fun main(args: Array<String>) {
    println("Author : $AUTHOR")
    printRabbit()
    printTotalPrice("Mary", 3, 30)



}

fun printRabbit(){
    val ears: String = "(\\(\\"
    val face: String = "(-.-)"
    val body: String = "o_(\")(\")"

    println(ears);
    println(face);
    println(body);
}

fun printTotalPrice(client:String, nbProducts:Int, price:Int) {
    println("$client want to buy $nbProducts which cost $price per unit. This will cost her ${price*nbProducts} bucks.")
}