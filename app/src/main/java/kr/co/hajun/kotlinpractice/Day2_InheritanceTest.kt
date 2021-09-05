package kr.co.hajun.kotlinpractice

import android.util.Log

fun printLog(str:String){
    Log.d("kkang",str)
}
open class User_1(name:String){
    constructor(name:String, email:String):this(name)
    open var x: Int = 10
    open fun someFun(){
        print("Suer... someFun()")
    }
}
interface MyInterface_1{
    fun bar()
    fun foo(){ }
}
open class Customer_1:User_1("kkang"), MyInterface_1{
    override var x:Int = 20
    override fun someFun(){
        super.someFun()
        print("Sub...${super.x}....$x")
    }
    override fun bar(){ }
}