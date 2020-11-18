package com.modcom.mypledgesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.FirebaseApp
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.activity_pledges.*

class Pledges : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pledges)

        // Write a message to the database
        FirebaseApp.initializeApp(this)
        val rootref: DatabaseReference = FirebaseDatabase.getInstance().reference//your db
        val myRef: DatabaseReference = rootref.child("members")

        //fetching pledges
        val listener = object:ValueEventListener{
            //display errors on collection of data
            override fun onCancelled(error: DatabaseError) {
                textviewPledges.text = "Database error"
            }
            //collect data from the database
            override fun onDataChange(snapshot: DataSnapshot) {
              //create a snapshot with data
                textviewPledges.text = ""
                if (snapshot.exists()){
                    //display the information in columns
                    for (singleSnapshot in snapshot.children){
                        textviewPledges.append("confirmed: ${singleSnapshot.child("username").getValue(
                            String::class.java)} has pledged.")
                        textviewPledges.append("KSH: ${singleSnapshot.child("Amount").getValue(
                            String::class.java)} has pledged.")
                        textviewPledges.append("\n\n")
                    }
                }
                else{
                    textviewPledges.text = "Error, No data"
                }
            }
        }
        myRef.addValueEventListener(listener)//end
    }
}