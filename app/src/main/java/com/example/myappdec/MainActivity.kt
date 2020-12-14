package com.example.myappdec

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //intents, implicit and explicit intents- implicit intents starts activities on application
        //while explicit intents start various activity in tha application
        btnUON.setOnClickListener {
            val i = Intent(this, UONActivity::class.java)
            startActivity(i)
        }
        btnJKUAT.setOnClickListener {
            val i = Intent(this, JKUATActivity::class.java)
            startActivity(i)
        }
    }
}