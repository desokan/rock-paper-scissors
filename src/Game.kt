//fun main () {
//    val options: Array<String> = arrayOf("Rock", "Paper", "Scissors")
//    val gameChoice = getGameChoice(options)
//    val userChoice  = getUserChoice(options)
//    printResult(userChoice, gameChoice)
//}
//
//fun getGameChoice(optionsParams: Array<String>): String {
//    return optionsParams[(Math.random() * optionsParams.size).toInt()]
//}
//
//fun getUserChoice(optionsParam: Array<String>): String {
//    var isValidChoice = false
//    var userChoice = ""
//    while (!isValidChoice) {
//        println("Please enter one of the following:")
//        for(item in optionsParam) println(" $item")
//        println("=========")
//
//        // read user input
//        val userInput = readlnOrNull()
//
//        // Validate the user input
//        if (userInput != null && userInput in optionsParam) {
//            isValidChoice = true
//            userChoice = userInput
//        }
//
//        if (!isValidChoice) println("You must enter a valid choice from the list below.")
//    }
//    return userChoice
//}
//
//fun printResult(userChoice: String, gameChoice: String) {
//    //Figure out the result
//    val result: String = if (userChoice == gameChoice) "Tie!"
//    else if ((userChoice == "Rock" && gameChoice == "Scissors") ||
//        (userChoice == "Paper" && gameChoice == "Rock") ||
//        (userChoice == "Scissors" && gameChoice == "Paper")) "You win!"
//    else "You lose!"
//    //Print the result
//    println("You chose $userChoice. I chose $gameChoice. $result")
//}


//class Song(val title: String, val artist: String) {
//    fun play() {
//        println("Playing the song $title by $artist")
//        println()
//    }
//    fun stop() {
//        println("Stopped playing $title")
//        println()
//    }
//}
//
//fun main(args: Array<String>) {
//    val songOne = Song("The Mesopotamians", "They Might Be Giants")
//    val songTwo = Song("Going Underground", "The Jam")
//    val songThree = Song("Make Me Smile", "Steve Harley")
//    songTwo.play()
//    songTwo.stop()
//    songThree.play()
//}


/* From the "Head First Kotlin" book.
 * This program is meant to illustrate the use of classes and objects, setters,
 * getters and arrays of objects.
 */

class Dog(val name: String, weight_param: Int, breed_param: String) {

    init{
        print("Dog $name has been created. ")
    }

    var activities = arrayOf("Walks")
    val breed = breed_param.toUpperCase()

    init{
        println("The breed is $breed.")
    }

    var weight = weight_param
        set(value) {
            if(value > 0) field = value
        }

    val weightInKgs: Double
        get() = weight / 2.2

    fun bark() {
        println(if(weight < 20) "Yip!" else "Woof!")
    }
}