package com.mastercoding.unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //declaring views
        val converted_txt: TextView = findViewById(R.id.result_txt)
        val convert_edt: EditText = findViewById(R.id.kilo_edt)
        val convert_btn: Button = findViewById(R.id.to_pound_btn)

        //adding functionalities
        convert_btn.setOnClickListener() {
            var kilos : Double = convert_edt.text.toString().toDouble()

            converted_txt.setText(""+convertToPound(kilos)+" \n pounds")


        }

    }

    //function to convert kilos to pounds
    fun convertToPound(kilos : Double) : Double {
        var pounds =  kilos * 2.20462
        var result = (pounds * 10000.00).roundToInt() / 10000.00

        return result
    }
}