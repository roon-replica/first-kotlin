package control_flow

fun whenAssign(obj: Any): Any {
    return when (obj) {
        1 -> "1: Int"
        "hello" -> "hello: String"
        is Long -> "is Long?"
        else -> "not Long"
    }
}

fun main() {
    println(whenAssign(2))
    println(whenAssign(2L))
}