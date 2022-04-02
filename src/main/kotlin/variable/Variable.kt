package variable

// kotlin은 type 추론 능력이 좋다고 함
// type을 명시할수도 있지만 컴파일러가 추론하도록 함

fun main(){
    var a: String = "initial"   // 'var' can be modified. mutable
    println(a)

    // 'val' cannot be modified. immutable
    // val 쓸 수 있으면 var 대신 val을 쓰라는 가이드.
    val b: Int = 1
    // b=2  // compile error( Val cannot be reassigned)
    val c = 3

    println(b)
    println(c)

    // val x; // compile error( val must be initialized)
    // var x; // also compile error..
    var num: Int;   // 이건 컴파일 오류 안 남. 초기화는 안 해도 적어도 타입은 지정해줘야함

    // println(num) // compile error, read 되기 전엔 초기화해줘야 함



}