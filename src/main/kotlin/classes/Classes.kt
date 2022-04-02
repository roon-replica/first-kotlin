package classes

// kotlin class docs : https://kotlinlang.org/docs/classes.html#classes

// class 선언 : class name , header, body
// header and body are optional..
class Empty

class Contact(val id: Int, var email: String)

// constructor는 primary constructor, secondary constructor가 있다
class Customer constructor(firstName: String){

}

class Customer2(name: String){
    val prop1 =  name

    init{
        println("first initializer block. name = $name, prop1 = $prop1")
    }

    // val prop2 = name.length
    val prop2 = "2nd prop = ${name.length}".also(::println)     // .also 뭐지. 체이닝 방식으로 함수형 프로그래밍할 수 있는듯?

    init{
        println("second initializerz block name.length = ${name.length}")
    }

    val upperCaseName = name.uppercase()

    fun printUpperName(){
        println(upperCaseName)
    }
}

class Person(val pets: MutableList<Pet> = mutableListOf())

class Pet{
    val name: String
    constructor(owner: Person, name: String){   // warning 뜸 (Secondary constructor should be converted to a primary one
        owner.pets.add(this)
        this.name = name
    }
}

fun main(){
    val contact = Contact(1,"leemr@a.com")
    println(contact.email)
    contact.email = "leemr@b.com"

    val customer = Customer("leemr")
    val customer2 = Customer2("leemr-replica")
    customer2.printUpperName()

    val owner = Person()
    val dog = Pet(owner, "bomi")

    for(p in owner.pets){
        println(p.name)
    }
}


