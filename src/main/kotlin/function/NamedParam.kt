package function

fun printMessage(suffix: String, prefix: String): String {
    return "$prefix $suffix"
}

fun main() {
    println(printMessage("prefix", "suffix"))

    // named parameter
    println(printMessage(prefix = "prefix", suffix = "suffix"))
}