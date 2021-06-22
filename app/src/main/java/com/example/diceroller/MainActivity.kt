package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRoll : Button = findViewById(R.id.roll_button)

        btnRoll.setOnClickListener(){
            rollDice()
            //Toast.makeText(this,"Button is Click",Toast.LENGTH_LONG).show()
        }
    }

    private fun rollDice(){
        val randomInt : Int = (1..6).random()
        val resultText : TextView = findViewById(R.id.result_txt)
        resultText.text = randomInt.toString()
    }
}