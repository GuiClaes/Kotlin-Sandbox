package exercise.project.hangman

fun printMistakeState(nbMistakes: Int) {
    when(nbMistakes) {
        0 -> print0Mistake()
        1 -> print1Mistake()
        2 -> print2Mistakes()
        3 -> print3Mistakes()
        4 -> print4Mistakes()
        5 -> print5Mistakes()
        else -> print6Mistakes()
    }
}

private fun print0Mistake() {
    println("  |---------------|-")
    println("  |               | ")
    println("  |                 ")
    println("  |                 ")
    println("  |                 ")
    println("  |                 ")
    println(" /|\\               ")
    println("//|\\\\             ")
}

private fun print1Mistake() {
    println("  |---------------|-")
    println("  |               | ")
    println("  |               O ")
    println("  |                 ")
    println("  |                 ")
    println("  |                 ")
    println(" /|\\               ")
    println("//|\\\\             ")
}

private fun print2Mistakes() {
    println("  |---------------|-")
    println("  |               | ")
    println("  |               O ")
    println("  |               | ")
    println("  |                 ")
    println("  |                 ")
    println(" /|\\               ")
    println("//|\\\\             ")
}

private fun print3Mistakes() {
    println("  |---------------|-")
    println("  |               | ")
    println("  |               O ")
    println("  |              /| ")
    println("  |                 ")
    println("  |                 ")
    println(" /|\\               ")
    println("//|\\\\             ")
}

private fun print4Mistakes() {
    println("  |---------------|-")
    println("  |               | ")
    println("  |               O ")
    println("  |              /|\\")
    println("  |                 ")
    println("  |                 ")
    println(" /|\\               ")
    println("//|\\\\             ")
}

private fun print5Mistakes() {
    println("  |---------------|-")
    println("  |               | ")
    println("  |               O ")
    println("  |              /|\\")
    println("  |              /  ")
    println("  |                 ")
    println(" /|\\               ")
    println("//|\\\\             ")
}

private fun print6Mistakes() {
    println("  |---------------|-")
    println("  |               | ")
    println("  |               O ")
    println("  |              /|\\")
    println("  |              / \\ ")
    println("  |                 ")
    println(" /|\\               ")
    println("//|\\\\             ")
}