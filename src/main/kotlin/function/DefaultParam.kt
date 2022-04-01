package function

// parameter message is optional, and has default parameter value
// Unit means return nothing
fun printMessage(message: String = "default message"): Unit {
    println(message)
}

// return Integer
fun sum(num1: Int = 1, num2: Int = 2): Int {
    return num1 + num2
}

// single expression function. returns an Integer?
fun multiply(x: Int, y: Int) = x * y

fun main() {
    printMessage("sample message")
    printMessage()

    println(sum())
    println(sum(2)) // bad code

    println(multiply(2, 3))
}