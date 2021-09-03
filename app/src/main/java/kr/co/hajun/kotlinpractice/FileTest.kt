package kr.co.hajun.kotlinpractice

val name = "kkang"

fun sum(count:Int): Int{
    var sum = 0
    for(i in 1..count){
        sum+=i
    }
    return sum
}