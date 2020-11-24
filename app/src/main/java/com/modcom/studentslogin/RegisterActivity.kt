package com.modcom.studentslogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        btnRegister.setOnClickListener {
            val email = email.text.toString()
            val password = password.text.toString()
            //Log.d picks log data and display them on the logcat
            Log.d("RegisterActivity", "email is:$email")
            Log.d("RegisterActivity", "password is:$password")

            //connect firebase Authentication
            FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener {
                    if(!it.isSuccessful)
                        Log.d(
                            "RegisterActivity", "successfully created a new user with user id:${it.result?.user?.uid}"
                        )
                    Toast.makeText(this, "successfully created a new user with user id:${it.result?.user?.uid}",
                        Toast.LENGTH_SHORT).show()
                    return@addOnCompleteListener
                }
                .addOnFailureListener {
                    Log.d("RegisterActivity", "Registration failed:${it.message}")
                    Toast.makeText(this, "Registration failed:${it.message}", Toast.LENGTH_SHORT).show()
                    return@addOnFailureListener
                }
        }
        //incase you have an existing account already
        tvLogin.setOnClickListener {
            Toast.makeText(this, "Already registered", Toast.LENGTH_SHORT).show()
            val i = Intent(this, LoginActivity::class.java)
            startActivity(i)
        }
    }
}