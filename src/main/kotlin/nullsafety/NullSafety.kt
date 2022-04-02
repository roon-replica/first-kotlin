package nullsafety

// NPE를 없애기 위해 코틀린에서 변수에 null 할당 막음.
// null 값을 가질 수 있는 변수를 선언하려면 선언할 때 타입 뒤에 '?'를 붙여야 함
fun main() {
    var neverNull: String = "non-null"
    // neverNull = null // compile error: Null can not be a value of a non-null type String

    var nullable: String? = "nullable"
    nullable = null
    println(nullable)

}

fun printStr(nullableString: String?): String {  // 네이밍이 nullableString 보다 maybeString이 더 낫네. if문 통과하면 null이 아닌데 계속 nullableString이란 네이밍을 쓰는건 별로인듯
    return if (nullableString != null && nullableString.isNotEmpty()) {      // 이런 문법도 있네. lifting return out of 'if' block
        nullableString
    } else {
        "null"
    }
}