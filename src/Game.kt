fun main (args: Array<String>) {
    val options: Array<String> = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)
    println(gameChoice)
}

fun getGameChoice(optionsParams: Array<String>) = optionsParams[(Math.random() * optionsParams.size).toInt()]


