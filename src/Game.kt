fun main (args: Array<String>) {
    val options: Array<String> = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)
    val userChoice  = getUserChoice(options)
    printResult(userChoice, gameChoice)
}

fun getGameChoice(optionsParams: Array<String>): String {
    return optionsParams[(Math.random() * optionsParams.size).toInt()]
}

fun getUserChoice(optionsParam: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""
    while (!isValidChoice) {
        println("Please enter one of the following:")
        for(item in optionsParam) println(" $item")
        println("=========")

        // read user input
        val userInput = readlnOrNull()

        // Validate the user input
        if (userInput != null && userInput in optionsParam) {
            isValidChoice = true
            userChoice = userInput
        }

        if (!isValidChoice) println("You must enter a valid choice from the list below.")
    }
    return userChoice
}

fun printResult(userChoice: String, gameChoice: String) {
    val result: String
    //Figure out the result
    if (userChoice == gameChoice) result = "Tie!"
    else if ((userChoice == "Rock" && gameChoice == "Scissors") ||
        (userChoice == "Paper" && gameChoice == "Rock") ||
        (userChoice == "Scissors" && gameChoice == "Paper")) result = "You win!"
    else result = "You lose!"
    //Print the result
    println("You chose $userChoice. I chose $gameChoice. $result")
}

