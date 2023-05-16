package com.example.app_gymcoc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    lateinit var CARD_one: ImageView
    lateinit var CARD_two:ImageView
    lateinit var CARD_three:ImageView
    lateinit var CARD_four:ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CARD_one = findViewById(R.id.card_one)
        CARD_two = findViewById(R.id.card_two)
        CARD_three = findViewById(R.id.card_three)
        CARD_four = findViewById(R.id.card_four)

        CARD_one.setOnClickListener{
            var gotocardio = Intent(this,CardioActivity::class.java)
            startActivity(gotocardio)

        }

        CARD_two.setOnClickListener{
            var gotofull = Intent(this,fullbodyactivity::class.java)
            startActivity(gotofull)

        }

        CARD_three.setOnClickListener{
            var gotostretch = Intent(this,stretchesactivity::class.java)
            startActivity(gotostretch)

        }

        CARD_four.setOnClickListener{
            var gotostrength = Intent(this,stretchesactivity::class.java)
            startActivity(gotostrength)

        }
    }
}