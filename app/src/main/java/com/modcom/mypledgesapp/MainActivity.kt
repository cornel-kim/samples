package com.modcom.mypledgesapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.FirebaseApp
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Write a message to the database

        // Write a message to the database
        FirebaseApp.initializeApp(this)
        val rootref:DatabaseReference = FirebaseDatabase.getInstance().reference//your db
        val myRef:DatabaseReference = rootref.child("members")

      btnPledge.setOnClickListener {
          //take the edittexts and put them in hashmap
          val userData: MutableMap<String, String> = HashMap();
          userData["username"] = username.text.toString()
          userData["userid"] = userid.text.toString()
          userData["Amount"] = Amount.text.toString()

          //trigger this on button click
          myRef.child(userid.text.toString()).setValue(userData)//child create the unique field
      }

        btnMaps.setOnClickListener {
            val i = Intent(this, OurLocation::class.java)
            startActivity(i)
        }
    }
}