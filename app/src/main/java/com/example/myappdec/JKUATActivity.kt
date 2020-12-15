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
    }
}