package exercise.project.tictactoe

import java.lang.NumberFormatException

fun move(board: ArrayList<ArrayList<String>>, playerChar: String):  ArrayList<ArrayList<String>> {
    val userInput = getUserInput(board, playerChar)
    return updateBoard(userInput, board, playerChar)
}

private fun getUserInput(board: ArrayList<ArrayList<String>>, playerChar: String): String {
    var readLine = ""
    do {
        print("Player $playerChar - Enter a position (from 1;1 to 3;3): ")
        readLine = readLine()?:""
    } while (readLine.isEmpty() || !isConsistentPosition(readLine, board))

    return readLine
}

private fun isConsistentPosition(input: String, board: ArrayList<ArrayList<String>>): Boolean {
    try {
        val pos = input.split(";")
            .map { it.trim().toInt() }
            .map { it - 1 }

        val inBound = pos.none { it > 2 || it < 0 }
        val empty = board[pos[0]][pos[1]].isEmpty()
        if(!inBound) {
            println("Please enter a position in bounds.")
        } else if(!empty) {
            println("Please enter an empty position.")
        }
        return inBound && empty
    } catch (e: NumberFormatException) {
        println("Please enter a valid format position.")
        return false
    }
}

private fun updateBoard(input: String, board: ArrayList<ArrayList<String>>, playerChar: String): ArrayList<ArrayList<String>> {
    val pos = input.split(";").map { it.toInt() }.map { it - 1 }
    board[pos[0]][pos[1]] = playerChar
    return board
}