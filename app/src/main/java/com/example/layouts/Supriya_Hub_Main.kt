package com.example.layouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class Supriya_Hub_Main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_supriya_hub_main)

        val cardBlock1= findViewById<CardView>(R.id.cardBlock)
        val cardWeb1= findViewById<CardView>(R.id.cardWeb)
        val cardMern1= findViewById<CardView>(R.id.cardMearn)
        val cardAndroid1= findViewById<CardView>(R.id.cardAndroid)
        val cardMl1= findViewById<CardView>(R.id.cardMl)
        val cardIos1= findViewById<CardView>(R.id.cardIos)

        cardWeb1.setOnClickListener()
        {
            val intent= Intent(this,cardWeb::class.java)
            startActivity(intent)
        }
        cardBlock1.setOnClickListener()
        {
            val intent= Intent(this,cardBlock::class.java)
            startActivity(intent)
        }
        cardMern1.setOnClickListener()
        {
            val intent= Intent(this,cardMern::class.java)
            startActivity(intent)
        }
        cardIos1.setOnClickListener()
        {
            val intent= Intent(this,cardIos::class.java)
            startActivity(intent)
        }
        cardMl1.setOnClickListener()
        {
            val intent= Intent(this,cardMl::class.java)
            startActivity(intent)
        }
        cardAndroid1.setOnClickListener()
        {
            val intent= Intent(this,cardAndroid::class.java)
            startActivity(intent)
        }


    }
}