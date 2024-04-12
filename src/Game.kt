fun main (args: Array<String>) {
    val options: Array<String> = arrayOf("Rock", "Paper", "Scissors")
    val num1 = 5
    val num2 = 22
    val total = numSum(num1, num2)
    println("The total is: $total")
}

fun numSum (num1: Int, num2: Int): Int {
    val sumOfTwoNumbers = num1 + num2
    return sumOfTwoNumbers
}