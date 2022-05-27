package exercise.self_exercise

fun main() {
    val rec1 = Rectangle(5.0, 6.0)
    println("Area: ${rec1.area}")
    println("Parimeter: ${rec1.perimeter}")
    println("Length: ${rec1.length}")
    println("Width: ${rec1.width}")
    println("---------------------")

    val rec2 = Rectangle(6.0, 5.0)
    println("Area: ${rec2.area}")
    println("Parimeter: ${rec2.perimeter}")
    println("Length: ${rec2.length}")
    println("Width: ${rec2.width}")
    println("---------------------")

    val rec3 = Rectangle(5.0, 5.0)
    println("Area: ${rec3.area}")
    println("Parimeter: ${rec3.perimeter}")
    println("Length: ${rec3.length}")
    println("Width: ${rec3.width}")
    println("---------------------")


}

class Rectangle (private val dim1: Double,
                 private val dim2: Double){

    val length: Double
    get() = if(dim1 > dim2) dim1 else dim2

    val width: Double
    get() = if(length == dim1) dim2 else dim1

    val perimeter: Double
    get() = (dim1 + dim2) * 2

    val area: Double
    get() = dim1 * dim2
}