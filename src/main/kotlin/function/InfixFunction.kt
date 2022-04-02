package function

//  bracket 없이 함수를 호출하는 모양
// 그래서 자연어와 더 비슷하게 보임. 코드가 아닌 글을 쓰는 듯한..!

fun main() {

    // 'infix' prefix -> define infix extension function
    // extension 이라는 키워드는 무슨 의미인지?
    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "hello ")

    infix fun Int.times(num: Int) = this * num
    println(2 times 3)

    // infix function 'to' : create pair
    val pair = "key" to "val"
    println(pair)

    // 'to'와 동일한 기능을 직접 구현한 것
    infix fun String.customTo(other: String) = Pair(this, other)
    val samplePair = "lee" customTo "mr"
    println(samplePair)

    val leemr = Person("leemr")
    val friend1 = Person("f1")
    val friend2 = Person("f2")

    leemr.connect(friend1)
    leemr connect friend2       // wow 진짜 자연어같다!!

    for (f in leemr.friends) {
        print(f.name + " ")
    }

}

class Person(val name: String) {
    val friends = mutableListOf<Person>()
    infix fun connect(other: Person) {
        friends.add(other)
    }
}