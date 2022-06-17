package com.example.kotlinbyexamples

fun main(){
val c=A() //called we are creating an instance of class A
    val d=B(19,"Twenty")
    println(d.alan) //called accessing property of the above instance val of 'B'
    println(d.falan)
    d.falan="Ten" //changing the var value of d as it is specified already a var so we can change it anytime
    println(d.falan)


}

class A //bulkul jhand class class has no meaning //default constructor created by kotlin when no parameter give
class B(val alan:Int,var falan:String) // class with constructor of 2 parameters