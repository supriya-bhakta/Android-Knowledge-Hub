package com.example.layouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Supriya_Hub : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_supriya_hub)

        val btnGo= findViewById<Button>(R.id.btnGo)
        btnGo.setOnClickListener()
        {
            val intent= Intent(this,Supriya_Hub_Main::class.java)
            startActivity(intent)
        }
    }
}