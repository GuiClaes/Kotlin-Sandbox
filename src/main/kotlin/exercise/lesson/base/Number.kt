package exercise.lesson.base

const val pi = 3.14159

fun main(args: Array<String>) {
    showPIInfo()
    showNumberType("15")
    //doMath()
}

fun showPIInfo() {
    println(pi::class.java)
    println(pi.toFloat())
    println(pi.toInt())
    println(pi.toString())
}

fun showNumberType(value :String) {
    val intValue = value.toInt()
    println(intValue::class.java)

    val byteValue = value.toByte()
    println(byteValue::class.java)

    val shortValue = value.toShort()
    println(shortValue::class.java)

    val longValue = value.toLong()
    println(longValue::class.java)

    val floatValue = value.toFloat()
    println(floatValue::class.java)

    val doubleValue = value.toDouble()
    println(doubleValue::class.java)
}

fun doMath() {
    print("Enter a double: ")
    val doubleValue = readLine() ?: "0.0"
    val result = doubleValue.toDouble() * pi;
    println(result::class.java)
    println(result)
}