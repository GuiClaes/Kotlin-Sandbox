package exercise.project.hangman

import java.util.*
import kotlin.random.Random


val words = listOf("Salut", "Comment", "Test", "Deux")

fun main(args:Array<String>) {
    val wordToGuess = setupGame()
    val maxNbMistakes = 6
    var currentNbMistakes = 0
    var guessedWord = initiateGuessedWord(wordToGuess)

    printMistakeState(currentNbMistakes)
    do {
        val inputLetter = getInputLetter()
        if(verifyLetter(inputLetter, wordToGuess)) {
            guessedWord = getGuessedWord(wordToGuess, inputLetter, guessedWord)
            println(guessedWord)
        } else {
            currentNbMistakes += 1
            printMistakeState(currentNbMistakes)
        }
    } while (guessedWord != wordToGuess && currentNbMistakes < maxNbMistakes)
}

fun setupGame(): String {
    val indexWord = Random.nextInt(words.size)
    return words[indexWord].lowercase(Locale.getDefault())
}