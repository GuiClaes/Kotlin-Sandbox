package exercise.project.tictactoe

fun initiateBoard(): ArrayList<ArrayList<String>> {
    val board = arrayListOf<ArrayList<String>>()
    for(i in 0..2) {
        val row = arrayListOf<String>()
        for(j in 0..2) {
            row.add("")
        }
        board.add(row)
    }

    return board
}

fun printBoard(board: ArrayList<ArrayList<String>>) {
    println("-------------------")
    for(i in 0 until board.size) {
        for(j in 0 until board[i].size) {
            print(when(board[i][j]) {
                "X" -> "|  X  "
                "O" -> "|  O  "
                else -> "|     "

            })
        }
        println("|")
        println("-------------------")
    }
}

fun getPlayerCharacter(player: Int): String {
    return when(player) {
        1 -> "X"
        else -> "O"
    }
}