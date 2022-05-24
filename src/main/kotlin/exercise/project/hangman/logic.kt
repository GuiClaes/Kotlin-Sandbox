package exercise.project.hangman

fun initiateGuessedWord(word: String): String {
    var guessedWord = ""
    for (i in word.indices) {
        guessedWord += "_"
    }
    return guessedWord
}

fun getInputLetter(): Char {
    var input: String?
    do {
        print("Enter a letter: ")
        input = readLine()
    } while (input.isNullOrEmpty())

    return input.toString()[0].lowercaseChar()
}

fun verifyLetter(letter: Char, word: String): Boolean {
    return word.contains(letter)
}

fun getGuessedWord(word: String, letter: Char, guessedWord: String): String {
    var newWord = ""
    for(i in word.indices) {
        if (word[i] == letter) {
            newWord += letter
        } else {
            newWord += guessedWord[i]
        }
    }
   return newWord
}