package kr.co.hajun.kotlinpractice

class Day2 constructor(firstName: String) {
    var User2 = User2("kkang","com")
}

class Ex1 (firstName: String){
    init {
        println("primary$firstName")
    }
}

class Person(val firstName: String){
    init {
        println("primary$firstName")
    }
    val upperName = firstName.toUpperCase()
    fun someFun(){
        println("someFun()...$firstName")
    }
}

class Customer public constructor(name:String){ }

class User2{
    init {
        print("init bloack")
    }
    constructor(name:String, email:String){
        print("$name, $email")
    }
    constructor(name:String, email: String, age:Int){

    }
}

class User3 constructor(name:String){
    init {
        print("init block")
    }
    constructor(name:String,email: String):this(name){

    }
    constructor(name:String,email: String,age: Int):this(name,email){

    }
}

open class User

class Customer2: User()


open class User4{
    constructor(name:String, email: String)
}

class Customer3:User4("kkang","com")


open class User5(name:String){
    constructor(name:String,email:String):this(name)
}

class Customer4:User5{
    constructor(name:String,email: String):super(name){ }
}


open class User6(name:String){
    constructor(name:String, email:String):this(name)

    open fun someFun(){}
}

open class Customer5:User6("kkang"){
    override fun someFun() {}
}

class CustomerSub: Customer5(){
    override fun someFun(){}
}


open class User7(name: String){
    constructor(name:String,email: String):this(name)
    open var x:Int = 10
    open fun someFun(){
        print("Super...")
    }
}

open class Customer7:User7("kkang"){
    override var x:Int =20
    override fun someFun() {
        super.someFun()
        print("Sub+ ${super.x}....$x")
    }
}


interface MyInterface {
    fun bar()
    fun foo(){ }
}

interface SomeInterface{
    fun some()
}

class MyChild:MyInterface, SomeInterface{
    override fun bar(){ }
    override fun some(){ }
}

class MyChild2:MyInterface,User(),SomeInterface{
    override fun bar(){ }
    override fun some(){ }
}


class User8{
    var greeting:String="Hello"
        set(value){
            field = field+value
        }
        get() = field.toUpperCase()

    val name:String="Kim"
        get() = field.toUpperCase()
}

open class Outer{
    private val a=1
    protected open val b=2
    internal val c=3
    val d=4
    protected class Nested{
        public val e:Int=5
    }
}

class C private constructor(a:Int){ }