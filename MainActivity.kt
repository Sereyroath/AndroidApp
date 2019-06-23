package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        calc.setOnClickListener{
            var dob = year.text.toString()
            var arr = dob.split("/")
            var d = arr[0].toInt()
            var m = arr[1].toInt()
            var y = arr[2].toInt()
            var days = Calendar.getInstance().get(Calendar.DAY_OF_MONTH)
            var months = Calendar.getInstance().get(Calendar.MONTH)
            months += 1
            var years = Calendar.getInstance().get(Calendar.YEAR)
            var day:Int
            var month:Int
            var year : Int
            if (days < d ){
                day = days + 30 - d
                months -= 1
            }
            else{
            day = days - d
            }
            if (months < m){
                month = months +12 -m
                years --
            }
            else{
            month = months - m}
            year = years - y
            age.text = "You age is $day days $month months $year years."
        }
    }
}
