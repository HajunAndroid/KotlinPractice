package kr.co.hajun.kotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_day2_main.*

class Day2_MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_day2_main)

        inheritanceTestBtn.setOnClickListener(this)
        propertyTestBtn.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if(v==inheritanceTestBtn){
            var custom=Customer_1()
            custom.someFun()
        }else if(v==propertyTestBtn){
            var obj = PropertyClass()
            obj.greeting="kkang"
            resultTextView.setText("property test \n greeting: ${obj.greeting},name: ${obj.name}")
        }
    }
}