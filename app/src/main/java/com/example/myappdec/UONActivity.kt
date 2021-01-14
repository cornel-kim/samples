package com.example.myappdec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.text.HtmlCompat
import kotlinx.android.synthetic.main.activity_u_o_n.*

class UONActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_u_o_n)
        tvUON.text = HtmlCompat.fromHtml("\n" +
                "\n"+
                "<body>\n"+

                "\t <h3>Research and Innovation</h3>\n" +
                "<p>The University of Nairobi is a research intensive university with " +
                "a reputation for excellence and a strong and vibrant research culture." +
                " Our research work is recognised for its impact and relevance to" +
                " the region.</p>"+
                "\n"+
                "<h3>About Us<h3>"+
                "<p>The University of Nairobi, a body corporate established by an Act of Parliament Cap 210 of the Laws of Kenya is the pioneer institution of University education in Kenya and the region.\n" +
                "\n" +
                "The only institution of higher learning in Kenya for a long time, the University of Nairobi responded to the national regional and Africa's high level manpower training needs by developing and" +
                " evolving strong, diversified academic programmes and specializations in sciences, applied sciences, technology, humanities, social sciences and the arts. To date, the range of programmes offered number approximately two hundred.\n" +
                "\n" +

                "The university is proud of its distinguished record of achievements in teaching, research, development and consultancy while strategizing for a greater future as the centre of academic, research and professional excellence.</p>"+
                "</body>"

            ,HtmlCompat.FROM_HTML_MODE_LEGACY)
    }
}
//create an corona virus application, to show symptoms on one activity, prevention on another one, modes transmission, Contact page,
// open web for daily recordings