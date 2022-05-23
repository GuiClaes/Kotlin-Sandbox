import java.lang.NumberFormatException

fun main(args: Array<String>) {
    raiseException()
    //throwRuntime()
    pratice("5")
    pratice("This is not a number")
    pratice(null)
    praticeKM("100")
    praticeKM("test")
    praticeKM(null)
    praticeKM("154.64")
    exercise("Apple", "12")
    exercise("Apple", "None")
}

fun raiseException() {
    val test = "Test"
    try {
        println(test.toInt())
    } catch (e: NumberFormatException) {
        println("An NumberFormatException has occurred \n ${e.localizedMessage}")
        //e.printStackTrace()
    } finally {
        println("This message appears even if an exception is raised.")
    }
}

fun throwRuntime() {
    val test = "Test"
    try {
        println(test.toInt())
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("Cannot parse $test into an Integer!")
    }
}

fun pratice(input: String?) {
    try {
        println(input?.toInt()?.times(5)?:"Null input")
    } catch (e: NumberFormatException) {
        println("$input cannot be converted to an Integer.")
    }
}

fun praticeKM(km: String?) {
    try {
        println(km?.toDouble()?.times(0.62)?:"No way")
    } catch (e: NumberFormatException) {
        println("$km cannot be converted to a Double.")
    }
}

fun exercise(product: String?, quantity: String?) {
    try {
        println("Total for product $product is: ${quantity?.toDouble()?.times(9.99)}.")
    } catch (e: NumberFormatException) {
        println("$quantity is not convertible in Double.")
    }
}