package control_flow

// for, while 등 지원

fun main() {
    val pcs = listOf("mac-mini", "macbook", "lg-gram")

    for (pc in pcs) {
        print("$pc ")
    }
    println()

    val iter = pcs.iterator()
    while (iter.hasNext()) {
        print(iter.next()+" ")
    }
}