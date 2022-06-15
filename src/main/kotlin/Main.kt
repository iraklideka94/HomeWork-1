

fun main(args: Array<String>) {
    sum()
    question()
}

private fun sum() {
    println("Add the value of X: ")

    val x = readLine() ?: ""

    println("Add the value of Y: ")
    val y = readLine() ?: ""

    val z = x.toInt() + y.toInt()

    println("The sum of X and Y is: $z")

}


private fun question() {
    println("Do you want to restart the program YES or NO?")
    val ANSWER = readLine().toString()
    if (ANSWER.contains("YES")) {
        sum()
    } else {
        println("You have successfully completed the program")
    }
}

