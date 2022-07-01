package com.example.kotlinbyexamples

fun main(){

        val dog: Dog = Yorkshire() //":Dog" to specify the type of val dog is the same as the type of the tiger
        dog.sayHello()


    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()




    val lion: Lion = Asiatic("Rufo")  //Asiatic inherits the origin: India but overrides the name:name as Rufo
    lion.sayHello()
}

open class Dog() {  //bracket "()" is optional here              // "open" to make it inheritable by other classes
    open fun sayHello() { // "open" to make the methode or the function overridable in their subclasses when the same function written again.
        println("wow wow!")
    }
}

class Yorkshire : Dog() {       // 3
    override fun sayHello() {   // 4
        println("wif wif!")
    }
}

open class Tiger(val origin: String) {
    fun sayHello() {
        println("A tiger from $origin says: grrhhh!")
    }
}

class SiberianTiger : Tiger("Siberia")


open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        println("$name, the lion from $origin says: graoh!")
    }
}

class Asiatic(name: String) : Lion(name = name, origin = "India")