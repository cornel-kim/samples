package com.modcom.studentslogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_login.email
import kotlinx.android.synthetic.main.activity_login.password
import kotlinx.android.synthetic.main.activity_register.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        tvRegister.setOnClickListener {
            val i = Intent(this, RegisterActivity::class.java)
            startActivity(i)
        }
            btnLogin.setOnClickListener {
                val email = email.text.toString()
                val password = password.text.toString()
                //Log.d picks log data and display them on the logcat
                Log.d("LoginActivity", "Attemp login with email/password:$email")
                Log.d("LoginActivity", "Attemp login with email/password:$password")
                FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener {
                        if (it.isSuccessful){
                            Toast.makeText(this, "login was successful", Toast.LENGTH_SHORT).show()

                            val i = Intent(this, MainActivity::class.java)
                            startActivity(i)
                        }
                        else{
                            Toast.makeText(this, "login Failure, wrong username or password", Toast.LENGTH_SHORT).show()
                        }
                    }
            }
        }

}