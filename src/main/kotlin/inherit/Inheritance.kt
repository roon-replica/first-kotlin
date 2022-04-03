package inherit


// kotlin class is final by default.
// 확장 가능하게 하려면 open 키워드 붙여야 함
open class Dog {
    // 메서드도 default로 final.
    // 확장 가능하게 하려면 open 키워드 붙여야 함
    open fun greeting() {
        println("greeting")
    }

    fun notExtendableMethod() {
        println("cannot override this method")
    }

    open val name: String = "default name"

}

class Chiwawa : Dog() {   // :슈퍼클래스명() 하면 상속함
    override fun greeting() {
        println(" wal wal")
    }

    override val name: String = "bomi"  // attribute도 override 가능
}

fun main() {
    val dog: Dog = Chiwawa()
    dog.greeting()
    dog.notExtendableMethod()

    println(dog.name)
}