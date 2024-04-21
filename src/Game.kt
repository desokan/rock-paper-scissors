fun main(args: Array<String>) {
    val mShoppingList = mutableListOf("Tea", "Eggs", "Milk")
    println("The mutable shopping list is: $mShoppingList")

    val extraShopping = listOf("Cookies", "Sugar", "Eggs")
}

//class BadException : Exception()
//
//fun main (args: Array<String>) {
//    val test: String = "No"
//    try {
//        println("Start try")
//        riskyCode(test)
//        println("End try")
//    } catch (e: BadException) {
//        println("Bad Exception")
//    } finally {
//        println("Finally")
//    }
//    println("End of main")
//}
//
//fun riskyCode(test: String) {
//    println("Start risky code")
//    if (test == "Yes") {
//        throw BadException()
//    }
//    println("End risky code")
//}


//fun myFunction(test: String) {
//    print("t")
//    print("h")
//
//    try {
//        riskyCode(test)
//    } catch(e : BadException) {
//        print("a")
//    } finally{
//        print("w")
//        print("s")
//    }
//}


//class Wolf {
//    var hunger = 10
//    val food = "meat"
//
//    fun eat() {
//        println("The Wolf is eating $food")
//    }
//}
//
//class MyWolf {
//    var wolf: Wolf? = Wolf()
//
//    fun myFunction() {
//        wolf?.eat()
//    }
//}
//
//fun getAlphaWolf(): Wolf? {
//    return Wolf()
//}
//
//fun main(args: Array<String>) {
//    var w: Wolf? = Wolf()
//
//    // w?.eat()
//    if (w != null) {
//        w.eat()
//    }
//
//    var x = w?.hunger
//    println("The value of x is $x")
//
//    var y = w?.hunger ?: -1
//    println("The value of y is $y")
//
//    var myWolf = MyWolf()
//    myWolf?.wolf?.hunger = 8
//    println("The value of myWolf?.wolf?.hunger is ${myWolf?.wolf?.hunger}")
//
//    var myArray = arrayOf("Hi", "Hello", null)
//    for (item in myArray) {
//        item?.let { println(it) }
//    }
//
//    getAlphaWolf()?.let { it.eat() }
//}

//data class Recipe(
//    val title: String,
//    val mainIngredient: String,
//    val isVegetarian: Boolean = false,
//    val difficulty: String = "Easy"
//)
//
//class Mushroom(val size: Int, val isMagic: Boolean) {
//    constructor(magicParam: Boolean) : this(9, magicParam) {
//        //Code that runs when the secondary constructor is called
//    }
//}
//
//fun findRecipes(
//    title: String = "",
//    ingredient: String = "",
//    isVegetarian: Boolean = false,
//    difficulty: String = ""
//): Array<Recipe> {
//    //Code to find recipes
//    return arrayOf(Recipe(title, ingredient, isVegetarian, difficulty))
//}
//
//fun addNumbers(a: Int, b: Int) : Int {
//    return a + b
//}
//
//fun addNumbers(a: Double, b: Double) : Double {
//    return a + b
//}
//
//fun main() {
//    val r1 = Recipe("Thai Curry", "Chicken")
//    val r2 = Recipe(title = "Thai Curry", mainIngredient = "Chicken")
//    val r3 = r1.copy(title = "Chicken Bhuna")
//
//    println("r1 hash code: ${r1.hashCode()}")
//    println("r2 hash code: ${r2.hashCode()}")
//    println("r3 hash code: ${r3.hashCode()}")
//
//    println("r1 toString: $r1")
//    println("r1 == r2? ${r1 == r2}")
//    println("r1 === r2? ${r1 === r2}")
//    println("r1 == r3? ${r1 == r3}")
//
//    val (title, mainIngredient, vegetarian, difficulty) = r1
//    println("title is $title and vegetarian is $vegetarian")
//
//    val m1 = Mushroom(6, false)
//    println("m1 size is ${m1.size} and isMagic is ${m1.isMagic}")
//    val m2 = Mushroom(true)
//    println("m2 size is ${m2.size} and isMagic is ${m2.isMagic}")
//
//    println(addNumbers(2,5))
//    println(addNumbers(1.6,7.3))
//}

//interface Roamable {
//    fun roam()
//}
//
//abstract class Animal: Roamable {
//    abstract val image: String
//    abstract val food: String
//    abstract val habitat: String
//    var hunger = 10
//
//    abstract fun makeNoise()
//    abstract fun eat()
//
//    override fun roam() {
//        println("The Animal is roaming")
//    }
//
//    fun sleep() {
//        println("The Animal is sleeping")
//    }
//}
//
//class Hippo : Animal() {
//    override val image = "hippo.jpg"
//    override val food = "grass"
//    override val habitat = "water"
//
//    override fun makeNoise() {
//        println("Grunt! Grunt!")
//    }
//
//    override fun eat() {
//        println("The Hippo is eating $food.")
//    }
//}
//
//abstract class Canine : Animal() {
//    override fun roam() {
//        println("The Canine is roaming")
//    }
//}
//
//class Wolf : Canine() {
//    override val image = "wolf.jpg"
//    override val food = "meat"
//    override val habitat = "forests"
//
//    override fun makeNoise() {
//        println("Hooooowl!")
//    }
//
//    override fun eat() {
//        println("The Wolf is eating $food")
//    }
//}
//
//class Vehicle: Roamable {
//    override fun roam() {
//        println("This vehicle is roaming")
//    }
//}
//
//class Vet {
//    fun giveShot(animal: Animal) {
//        animal.makeNoise()
//    }
//}
//
//fun main (args: Array<String>) {
//    val animals = arrayOf(Hippo(), Wolf())
//    for (animal in animals) {
//        animal.roam()
//        animal.eat()
//        animal.makeNoise()
//        println()
//
//    }
//
//    val vet = Vet()
//    val wolf = Wolf()
//    val hippo = Hippo()
//    vet.giveShot(wolf)
//    vet.giveShot(hippo)
//
//    val roamables = arrayOf(Hippo(), Wolf(), Vehicle())
//    for (item in roamables) {
//        item.roam()
//        if (item is Animal) {
//            item.eat()
//        }
//    }
//
//}


//open class Animal {
//    open val image = ""
//    open val food = ""
//    open val habitat = ""
//    var hunger = 10
//
//    open fun makeNoise() {
//        println("The Animal is making a noise")
//    }
//
//    open fun eat() {
//        println("The Animal is eating")
//    }//
//    open fun roam() {
//        println("The Animal is roaming")
//    }
//
//    fun sleep() {
//        println("The Animal is sleeping")
//    }
//}
//
//class Hippo : Animal() {
//    override val image = "hippo.jpg"
//    override val food = "grass"
//    override val habitat = "water"
//
//    override fun makeNoise() {
//        println("Grunt! Grunt!")
//    }
//
//    override fun eat() {
//        println("The Hippo is eating $food.")
//    }
//}
//
//open class Canine : Animal() {
//    override fun roam() {
//
//        println("The Canine is roaming")
//    }
//}
//
//class Wolf : Canine() {
//    override val image = "wolf.jpg"
//    override val food = "meat"
//    override val habitat = "forests"
//
//    override fun makeNoise() {
//        println("Hooooowl!")
//    }
//
//    override fun eat() {
//        println("The Wolf is eating $food")
//    }
//}
//
//class Vet {
//    fun giveShot(animal: Animal) {
//        animal.makeNoise()
//    }
//}
//
//fun main (args: Array<String>) {
//    val animals = arrayOf(Hippo(), Wolf())
//    for (animal in animals) {
//        animal.makeNoise()
//    }
//
//    val vet = Vet()
//    val wolf = Wolf()
//    val hippo = Hippo()
//    vet.giveShot(wolf)
//    vet.giveShot(hippo)
//}

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

