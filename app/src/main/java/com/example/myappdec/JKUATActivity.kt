package com.example.myappdec

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_j_k_u_a_t.*

class JKUATActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_j_k_u_a_t)
        btnCall.setOnClickListener {
            val i = Intent(Intent.ACTION_DIAL, Uri.parse("tel:072345678"))
            startActivity(i)
        }
        btnFindUs.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("geo:-1.1017058,37.0054426z=15"))
            startActivity(i)
        }
        btnWEB.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.jkuat.ac.ke/"))
            startActivity(i)

        }
        btnVisitYourContacts.setOnClickListener {
            val x = Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people"))
            startActivity(x)
        }
        btnShare.setOnClickListener {
            val i = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "Find us on google play")
                type="text/plain"
            }
            val shareIntent =  Intent.createChooser(i, null)
            startActivity(shareIntent)
        }
    }
}