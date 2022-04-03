package generics// generic increase encapsulating common logic. (java에서  Collection 인터페이스들처럼)
// 로직을 공통화하니까 재사용성도 증가.
// List<T>는 T에 의해 결정된다

//generic class
class MutableStack<E>(vararg items: E) { // E called generic type parameter.
    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)

    fun pop() = elements.removeLast()

    fun peek() = elements.last()

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = elements.joinToString()   // java의 stream().collect(Collectors.joining(" ")) 이랑 같은듯
}

// can also generify functions
// 컴파일러가 파라미터를 보고 타입을 추론한다고 함.
fun <E> createStack(vararg elements: E) = MutableStack(*elements)

fun main() {
    val stack = MutableStack("1", "2", "3", "4")

    println(stack.size())
    println(stack.toString())

    val stack2 = createStack("1", "2", "3", "4")
    println(stack.toString())

    println(stack == stack2)
}