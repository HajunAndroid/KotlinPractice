package kr.co.hajun.kotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        testBtn.setOnClickListener(this)

        val oneMillion: Int = 1_000_000
        var a1: Int =10

        //var a2: Double = a1
        var a2: Double = a1.toDouble()

        var str:String = "Hello World"
        Log.d("kkang","str[1]:${str[1]}")

        val str2 = "Hello \n World"
        val str3 = """Hello
            Hello"""

        val i =10
        val s = "i = $i"

        var array1 = arrayOf(1,"Hello",false)
        var array2 = arrayOf<Int>(1,2,3)
        val x1: IntArray = intArrayOf(1,2,3)
        var array3 = arrayOfNulls<Int>(4)

        //val a: Int = null
        val a: Int? =null
        /******************************************/

        val a3: Int = 10
        val b3=20
        val d=30
        //d=40
        var e=10
        e=20

        val myArray = arrayListOf("Java")
        myArray.add("Python")
        myArray.add("Kotlin")

        val txt = if(a3>10)"hello" else "world"
        val max=if(a3<10){
            print("hello")
            10+20
        }else{
            print("wold...")
            20+20
        }
        val a4=if(a3>10)20
        else if(a3>20)30
        else 10

        val a5=1
        val result1 = when(a5){
            1->Log.d("test","1")
            2->Log.d("test","2")
            3,4->Log.d("test","3 of 4")
            else->{
                Log.d("test","3")
            }
        }
        when(a5){
            in 1..10->Log.d("test","ok")
            !in 1..10->Log.d("test","no")
        }

        var sum:Int = 0
        for(i in 1..10){
            sum+=1
        }

        val list = listOf("hello","world","1")
        for(str in list){
            print(str)
        }
        for(i in list.indices){
            print(list[i])
        }
        for(i in 1..100){}
        for(i in 1 until 100){}
        for(x in 2..10 step 2){}
        for(x in 10 downTo 1){}

        var x2=10
        while(x2>0){
            x2--
        }

        var x3=10
        do{
            x3--
        }while(x3!=0)
    }

    fun getLength(obj:Any) :Int{
        if(obj is String)
            return obj.length
        return 0
    }

    fun parseInt(str: String):Int?{
        return str.toIntOrNull()
    }

    override fun onClick(v: View?) {
        Toast.makeText(this,"button click..",Toast.LENGTH_SHORT).show()
        Log.d("kkang","name : $name, sum : ${sum(10)}")
    }

    fun sum(a:Int, b:Int):Int{
        return a+b
    }

    fun printSum(a:Int, b:Int):Unit{

    }

    fun printSum2(a:Int, b:Int){

    }
}