package kr.co.hajun.kotlinpractice

class PropertyClass{
    var greeting: String="Hello"
        set(value){
            field = field + value
        }
        get() = field.toUpperCase()
    val name:String = "Kim"
        get() = field.toUpperCase()
}