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
                "Through module II (continuing education) programmes, invaluable opportunity has been opened to hundreds of Kenyans and non-Kenyans, on a paying basis, who meet university admission requirements, but who have not been able to access university education due to restricted intake into the regular programmes that is determined by limited resource allocation by Government.\n" +
                "\n" +
                "In this effort, the location of the seven campuses of the University in the capital city and its environs and facilitating easy access, has been an asset that has seen the university increasingly become the busy hub and citadel of academic activity at all times.\n" +
                "\n" +
                "In addition to the regular and evening and weekend programmes, classes are conducted at the University's Extra Mural Centres located at the country's provincial headquarters.\n" +
                "\n" +
                "The university is proud of its distinguished record of achievements in teaching, research, development and consultancy while strategizing for a greater future as the centre of academic, research and professional excellence.</p>"+
                "</body>"

            ,HtmlCompat.FROM_HTML_MODE_LEGACY)
    }
}