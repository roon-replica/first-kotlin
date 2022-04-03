package control_flow

// when
//   - 1. statement
//   - 2. expression

fun cases(obj: Any) {       // Any라는 class가 java의 Object처럼 모든 클래스의 superclass.
    when (obj) {    // when statement.
        // 쓰여진 순서대로 일치여부 검사하네
        1 -> println("1: Int")
        "hello" -> println("hello: String")
        2L -> println("2: Long")
        is Long -> println("is Long")
        !is String -> println("Not a String")
        else -> println("else?")
    }
}

fun main() {
    cases("hello")
    cases(1)
    cases(2L)
}
