package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.diceroller.R.id.luckyNumber

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.btnRoll)
        rollButton.setOnClickListener {
            //val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
            //toast.show()

            rollDice()
        }

    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultTextView: TextView = findViewById(R.id.Number)

        resultTextView.text = diceRoll.toString()

        val sortRoll = dice.roll()
        val sortTextView: TextView = findViewById(R.id.luckyNumber)

        sortTextView.text = sortRoll.toString();

        if( diceRoll == sortRoll){
            val toast = Toast.makeText(this, "You Win!", Toast.LENGTH_SHORT)
            toast.show()
        }
    }
}