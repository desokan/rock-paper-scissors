fun main (args: Array<String>) {
    val options: Array<String> = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)
    println(getUserChoice(options))
}

fun getGameChoice(optionsParams: Array<String>): String {
    return optionsParams[(Math.random() * optionsParams.size).toInt()]
}

fun getUserChoice(optionsParam: Array<String>) {
    println("Please enter one of the following:")
    for(item in optionsParam) println(" $item")
}

