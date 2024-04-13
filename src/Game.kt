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

//class Dog(val name: String, weightParam: Int, breedParam: String) {
//
//    init{
//        print("Dog $name has been created. ")
//    }
//
//    var activities = arrayOf("Walks")
//    val breed = breedParam.uppercase()
//
//    init{
//        println("The breed is $breed.")
//    }
//
//    var weight = weightParam
//        // get() = field * 2
//        set(value) {
//            if(value > 0) field = value
//        }
//
//    val weightInKgs: Double
//        get() = weight / 2.2
//
//    fun bark() {
//        println(if(weight < 20) "Yip!" else "Woof!")
//    }
//}

//fun main(args: Array<String>) {
//    val myDog = Dog("Fido", 70, "Mixed")
//    myDog.bark()
//    myDog.weight = 75
//    println("Weight in Kgs is ${myDog.weightInKgs}")
//    println("This is the real breed =============> ${myDog.breed}")
//
//    myDog.weight = -2
//    println("Weight is ${myDog.weight}")
//
//    myDog.activities = arrayOf("Walks", "Fetching balls", "Frisbee")
//    for(item in myDog.activities) {
//        println("My dog enjoys $item")
//    }
//
//    val dogs = arrayOf(Dog("Kelpie", 20, "Westie"),
//        Dog("Ripper", 10, "Poodle"))
//
//    dogs[1].bark()
//    dogs[1].weight = 15
//    println("Weight for ${dogs[1].name} is ${dogs[1].weight}")
//}

open class Animal {
    open val image = ""
    open val food = ""
    open val habitat = ""
    var hunger = 10


}