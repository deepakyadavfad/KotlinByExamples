package com.example.kotlinbyexamples

fun main(){
    //if we define "null" then only a var or val can be nullable(no need to pass any parameter/value #otherwise it is not nullable by default
    var kuchhBhi:String="ehan ao babua" //not nullable as type string defined
    println(kuchhBhi.length) //13
    kuchhBhi="hello" //this can be done
    println(kuchhBhi.length) //5h
//    kuchhBhi=null //this can't be done
    var yeBhi="hat teri bahin ke" //not nullable because by default is not nullable or the the computer by itself judged/inferred as string type in quotes
//yeBhi=null //this can't be done

    //calling StringHaiKiNhi function
    println(StringHaiKiNhi("my name is deepak")) //idk why but return is not returning anything so i have include a println aslo to print
    println(StringHaiKiNhi(null))



}


//no let's make a function for checking if anything is string or not
fun StringHaiKiNhi(anything:String?):String{ //nullable //return type string mentioned to make it easy to return text response without using print code & not more role in nullSafety
if(anything!=null && anything.length>0){return "anything has type : String & it's length is ${anything.length}"}
    else{return "it is not string or the lenght is 0"}

}