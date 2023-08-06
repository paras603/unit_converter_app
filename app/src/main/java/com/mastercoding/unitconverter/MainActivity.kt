package com.mastercoding.unitconverter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //declaring view
        var mass_btn : Button = findViewById(R.id.mass_btn)
        var length_btn : Button = findViewById(R.id.length_btn)

        //function of mass button
        mass_btn.setOnClickListener(){

            //explict intents
            var i = Intent(this, MassActivity::class.java)
            startActivity(i)
        }

        // function of length button
        length_btn.setOnClickListener(){
            Toast.makeText(this,
                            "comming soon..",
                            Toast.LENGTH_LONG).show()
        }

    }

}