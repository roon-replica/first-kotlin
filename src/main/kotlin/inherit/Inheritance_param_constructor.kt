package inherit

open class Mac(val processor: String, val memory: String) {
    fun printSpec() {
        println("mac")
    }
}

class M1 : Mac("M1", "16GB")
class Intel : Mac("Intel", "16GB")

fun main() {
    val m1Mac = M1()
    println("${m1Mac.processor}, ${m1Mac.memory}")

    val intelMac = Intel()
    println(intelMac.processor + " " + intelMac.memory)
}