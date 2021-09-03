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
    }

    override fun onClick(v: View?) {
        Toast.makeText(this,"button click..",Toast.LENGTH_SHORT).show()
        Log.d("kkang","name : $name, sum : ${sum(10)}")
    }
}