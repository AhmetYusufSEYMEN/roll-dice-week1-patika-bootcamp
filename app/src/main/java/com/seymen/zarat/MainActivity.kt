package com.seymen.zarat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    //Variables defined
    private lateinit var btnDice : Button
    private lateinit var imgViewDice : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Defined variables are initialized
        btnDice = findViewById(R.id.btn_dice)
        imgViewDice = findViewById(R.id.imageView)

        //Actions to be taken when clicking the button
        btnDice.setOnClickListener {
           rollDice()
        }
    }
    //Image change method
    private fun rollDice() {
        //Selecting the image for the corresponding dice by generating a random number
        val drawableResource = when(Random.nextInt(6)+1){
            1->R.drawable.ic_diceone
            2->R.drawable.ic_dicetwo
            3->R.drawable.ic_dicethree
            4->R.drawable.ic_dicefour
            5->R.drawable.ic_dicefive
            else ->R.drawable.ic_dicesix
        }
        //Print the selected dice image
        imgViewDice.setImageResource(drawableResource)
    }
}