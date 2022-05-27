package exercise.lesson.oo_advanced

fun main(args: Array<String>) {
    val son1 = Son("Brigand")
    son1.getIdentity()
}


open class Father(val ln: String) {
    open val fn = "Daniel"

    open fun getIdentity() {
        println("Father's name is $fn $ln")
    }
}

class Son(ln: String): Father(ln) {
    override val fn = "Vincent"

    override fun getIdentity() {
        println("Both name is $ln, son's first name is $fn and father's first name is ${super.fn}")
    }
}