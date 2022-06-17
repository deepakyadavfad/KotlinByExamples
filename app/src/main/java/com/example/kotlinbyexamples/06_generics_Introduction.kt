package com.example.kotlinbyexamples

fun main() {
    val stack = MutableStackHaiYe(0.62, 3.14, 2.7) //data type is float
    val newStack=MutableStackHaiYe("anil","deepak","pawan") //now data type is string & no error coming using with the same class/m
    println(newStack.peek())
    stack.push(9.87)
    println(stack)

    println("peek(): ${stack.peek()}")
    println(stack)
    for (i in 1..stack.size()) {
        println("pop(): ${stack.pop()}")
        println(stack)
    }

    println("deepak ese hi")
    println(stack)



val stack2= mutableStackOf(4,5,56)   /*this returns [Ljava.lang.Integer;@614c5515 for 4
    [Ljava.lang.Integer;@614c5515 for 5
            [Ljava.lang.Integer;@614c5515 for 56*/
    println(stack2) //idkw but it is not printing just showing some computer coded texts //this line returns kotlin.Unit
}

class MutableStackHaiYe<E>(vararg items: E) {              //Generics are the powerful features that allow us to define classes, methods and properties which are accessible using different data types while keeping a check of the compile-time type safety.
//E can also be given as the parameter as above
    private val elements = items.toMutableList()

    fun push(element : E) = elements.add(element)

    fun peek() : E = elements.last()                 //return type E(i.e. same as parameter given)

    fun pop() : E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    //    override fun toString() = "MutableStack(${elements.joinToString() }})" //whenever something changes in MutableStack, it will print "MutableStack(${elements.joinToString()})" #joinToString return karega MutableStack(element:as string) if sirf MutableStack(${elements}) will return MutableStack([element]:as list) toString mtlb complete MutableStack(element) is a string(or we can use print statement but it will not run again & again after every change
    override fun toString() = "empty or not : ${elements.isEmpty()}" //will return a boolean
}
//similar to above it will give the status of empty or not

//creating generic function
fun <E> mutableStackOf(vararg itemKaList: E){
    for(anything in itemKaList ) println(itemKaList).toString()

}
