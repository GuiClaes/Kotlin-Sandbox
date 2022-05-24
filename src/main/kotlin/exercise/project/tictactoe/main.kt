package exercise.project.tictactoe

fun main(args: Array<String>) {
    var board = initiateBoard()
    var currentPlayer = 2
    var playerCharacter: String

    printBoard(board)
    do {
        currentPlayer = swapPlayer(currentPlayer)
        playerCharacter = getPlayerCharacter(currentPlayer)
        board = move(board, playerCharacter)
        printBoard(board)
    } while (!isEnd(board, playerCharacter))

    if (hasWon(board, playerCharacter)) {
        println("$playerCharacter has won")
    } else {
        println("It's a tie")
    }
}