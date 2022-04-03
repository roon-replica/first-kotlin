package control_flow

fun main() {
    val x = 1

    if (x == 1) println("x == 1")
    else println("x != 1")

    val str = "sample"
    if (str == "sample") println("same")
    if (str.equals("sample")) println("same")

    val list = mutableListOf<String>()
    list.add("a")
    list.add("b")

    if (list == listOf("a", "b")) {
        println("same == a b")
    }

    if (list == listOf("b", "a")) {
        println("true, == b a")
    } else {
        println("false, == b a")
    }

    if (setOf("a", "b") == setOf("b", "a")) {
        println("same set")
    }
}