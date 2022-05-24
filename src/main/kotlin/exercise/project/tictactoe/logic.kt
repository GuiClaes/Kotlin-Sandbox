package exercise.project.tictactoe

fun swapPlayer(player: Int): Int {
    return when(player) {
        1 -> 2
        else -> 1
    }
}

fun isEnd(board: ArrayList<ArrayList<String>>, playerCharacter: String): Boolean {
    return isFull(board) || hasWon(board, playerCharacter)
}

fun hasWon(board: ArrayList<ArrayList<String>>, playerCharacter: String): Boolean {
    return hasWonByRow(board, playerCharacter) || hasWonByColumn(board, playerCharacter) || hasWonByDiagonal(board, playerCharacter)
}

fun hasWonByRow(board: ArrayList<ArrayList<String>>, playerCharacter: String): Boolean {
    val row = arrayListOf<String>()
    for(i in 0 until board.size) {
        row.clear()
        for(j in 0 until board.size) {
            row.add(board[j][i])
        }
        if (row.all { it == playerCharacter }) {
            break
        }
    }
    return row.isNotEmpty() && row.all { it == playerCharacter }
}

fun hasWonByColumn(board: ArrayList<ArrayList<String>>, playerCharacter: String): Boolean {
    val column = arrayListOf<String>()
    for(i in 0 until board.size) {
        column.clear()
        for(j in 0 until board.size) {
            column.add(board[i][j])
        }
        if (column.all { it == playerCharacter }) {
            break
        }
    }
    return column.isNotEmpty() && column.all { it == playerCharacter }
}

fun hasWonByDiagonal(board: ArrayList<ArrayList<String>>, playerCharacter: String): Boolean {
    val leftDiagonal = listOf(board[0][0], board[1][1], board[2][2]).all { it == playerCharacter }
    val rightDiagonal = listOf(board[0][2], board[1][1], board[2][0]).all { it == playerCharacter }

    return leftDiagonal || rightDiagonal
}

fun isFull(board: ArrayList<ArrayList<String>>): Boolean {
    return board.all { it.all { it != "" } }
}