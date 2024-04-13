fun main (args: Array<String>) {
    val options: Array<String> = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)
    val userChoice  = getUserChoice(options)


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

        if (!isValidChoice) println("You must enter a valid choice.")
    }
    return userChoice
}

