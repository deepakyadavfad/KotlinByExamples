package com.example.kotlinbyexamples

fun main() {
    //Arguments
    printMessage(prefix = "phone no.")      //changing the order of passing argument, so named it
    println(sum(4,5))


    //Infix Functions
    //infix fun Int.times(stringkoibhi:String)=stringkoibhi.repeat(this) //this mtlb repeat 2 times //extension functions are functions.functions like here Int.times(both r functions //called infix funcions annotated with infix word used for short code & readability //"this" is the first Int(integer)
//    println(2 times "Bye ") //arguments are 1-Integer for function Int, 2-times function, 3-Bye as string // will return 2 times string that is Bye


    val pair= "Deepak" to "loves Komal" //to is also an infix function from the standard library
    println(pair)



    infix fun String.joda(other: String) = Pair(this, other)   // pair is library function //this is the first string
    val myPair = "McLaren" joda   "Lucas" //Mclaren is the first string & Lucas is the other string
    println(myPair)

//print a cake
    println("   ,,,,,   ")
    println("   |||||   ")
    println(" =========")
    println("@@@@@@@@@@@")
    println("{~@~@~@~@~}")
    println("@@@@@@@@@@@")

    operator fun Int.times(dhaga:String)=dhaga.repeat(this) //operators has signs like * for times so it can help us in making less codes
    println(2*"deepak")

    operator fun String.get(rangeBata:IntRange)=substring(rangeBata)
    val dhaga="I alway s loved you Komal."
    println(dhaga[3..10]) //count from 3 to 10 including the spaces(count starts from 0 then 1,2,3... //".." is the symbol for to or range for  operator "get" say [2..4] ka mtlb hoga range 2 to 4


    chhapai("bc","mc","chootiya")

}

fun printMessage(message:String="hello",prefix:String){//setting the default argument //return type of the function is unit or nothing(it returns nothing
    println("[$prefix] $message")
} //the functions defined outside main are called extension functions functions

fun chhapai(vararg bakchodi:String,prefix:String="nihayati "){ //vararg is modifier used to get multiple argument system with one argument
    for(anything in bakchodi)                  println(prefix+anything)
}

fun sum(x:Int,y:Int):Int=x+y //return type is Integer of the function //single line function without {} called inferred function
