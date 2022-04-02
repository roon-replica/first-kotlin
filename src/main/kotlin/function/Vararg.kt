package function

fun printAll(vararg messages: String) {
    for (m in messages) {
        println(m)
    }
}

// vararg modifier turns parameter into a vararg
fun printAllWithPrefix(vararg messages: String, prefix: String) {    // wow.. 문법들 조합하니까 신가하다
    for (m in messages) {
//        println("$prefix $m")
        println(prefix + m)
    }
}

fun log(vararg entries: String) {
    // runtime에 vararg는 array가 된다고 함
    // * 연산자를 붙이면 vararg of String이 된다고 함.... 왜 그런지는 잘 모르겠음
    printAll(*entries)
}


fun main() {
    printAll("first", "second", "third")    // allow any number of arguments

    printAllWithPrefix("first", "second", "third", prefix = "prefix ") // named parameter

    log("first", "second", "third")
}