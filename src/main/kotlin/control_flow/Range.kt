package control_flow

fun main() {
    val from = 0
    val to = 5

    for (i in from..to) { // [from,to]
        print("$i ")
    }
    println()

    for (i in from until to) {    // [from,to) : 'to' exclusive
        print("$i ")
    }
    println()

    for (i in from..to step 2) {
        print("$i ")
    }
    println()

    for (i in to downTo from) {
        print("$i ")
    }
    println()

    for (ch in 'a'..'c') {
        print(ch + " ")
    }
    println()

    val x = 5
    if (x in from..to) {
        println("x is in range $from ~ $to")
    }
    println()

    if (x !in from..to) {
        println("x is not in range $from~ $to")
    }

}