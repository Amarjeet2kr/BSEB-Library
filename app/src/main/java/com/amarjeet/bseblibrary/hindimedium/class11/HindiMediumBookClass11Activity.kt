package com.amarjeet.bseblibrary.hindimedium.class11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.amarjeet.bseblibrary.PdfWebViewActivity
import com.amarjeet.bseblibrary.R
import com.amarjeet.bseblibrary.hindimedium.HindiMediumBooksActivity
import com.google.android.material.appbar.MaterialToolbar

class HindiMediumBookClass11Activity : AppCompatActivity() {

    private lateinit var btnPdfView: CardView
    private lateinit var pdfUrl: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hindi_medium_book_class11)


        //Go back to Home Page of BSEB Library
        val btnBack = findViewById<MaterialToolbar>(R.id.btnBack)
        btnBack.setOnClickListener{
            val intent = Intent(this, HindiMediumBooksActivity::class.java)
            startActivity(intent)
            finish()
        }



        //EVS (भारत :भौतिक परिवर्तन)
        btnPdfView = findViewById(R.id.btn_hmclass11_evs)
        btnPdfView.setOnClickListener() {
            pdfUrl =
                "https://drive.google.com/file/d/1cDh9fY0avVScupGAQCS9V2SgIMRrKURm/view?usp=sharing"
            var intent = Intent(this, PdfWebViewActivity::class.java)
            intent.putExtra("URL", pdfUrl)
            startActivity(intent)
        }


        //Economics (भारतीय अर्थव्यवस्था का विकास)
        btnPdfView = findViewById(R.id.btn_hmclass11_economics)
        btnPdfView.setOnClickListener() {
            pdfUrl =
                "https://drive.google.com/file/d/1Ig9W2d6CAKbTmjG3wOFnpSKf2oHVN769/view?usp=sharing"
            var intent = Intent(this, PdfWebViewActivity::class.java)
            intent.putExtra("URL", pdfUrl)
            startActivity(intent)
        }


        //Business Studies (व्यवसाय अध्ययन)
        btnPdfView = findViewById(R.id.btn_hmclass11_business_studies)
        btnPdfView.setOnClickListener() {
            pdfUrl =
                "https://drive.google.com/file/d/13ofFZO5aN8gSphSoVzaS-pDs-rwfS-MI/view?usp=sharing"
            var intent = Intent(this, PdfWebViewActivity::class.java)
            intent.putExtra("URL", pdfUrl)
            startActivity(intent)
        }


        //Political Science/Civics (भारत का संविधान : सिध्दान्त और व्यवहार)
        btnPdfView = findViewById(R.id.btn_hmclass11_political)
        btnPdfView.setOnClickListener() {
            pdfUrl =
                "https://drive.google.com/file/d/1xEmHK1S_brsPv3F9dCTdEs5xR-9pxhHZ/view?usp=sharing"
            var intent = Intent(this, PdfWebViewActivity::class.java)
            intent.putExtra("URL", pdfUrl)
            startActivity(intent)
        }


        //Chemistry (रसायनशास्त्र भाग 1)
        btnPdfView = findViewById(R.id.btn_hmclass11_chemistry1)
        btnPdfView.setOnClickListener() {
            pdfUrl =
                "https://drive.google.com/file/d/1WrQvdxs_gs9TAZIcUy0VE1IL5ngnciyJ/view?usp=sharing"
            var intent = Intent(this, PdfWebViewActivity::class.java)
            intent.putExtra("URL", pdfUrl)
            startActivity(intent)
        }


        //Chemistry (रसायनशास्त्र भाग 2)
        btnPdfView = findViewById(R.id.btn_hmclass11_chemistry2)
        btnPdfView.setOnClickListener() {
            pdfUrl =
                "https://drive.google.com/file/d/16FeeiwOf9z0UJUwJb0RMOh5cnclZskXT/view?usp=sharing"
            var intent = Intent(this, PdfWebViewActivity::class.java)
            intent.putExtra("URL", pdfUrl)
            startActivity(intent)
        }


        //Physics (भौतिकी भाग 1)
        btnPdfView = findViewById(R.id.btn_hmclass11_physics1)
        btnPdfView.setOnClickListener() {
            pdfUrl =
                "https://drive.google.com/file/d/1lJzEQ1FyPxVgmnVs0IWiVKYj1nQQ4hdt/view?usp=sharing"
            var intent = Intent(this, PdfWebViewActivity::class.java)
            intent.putExtra("URL", pdfUrl)
            startActivity(intent)
        }


        //Physics (भौतिकी भाग 2)
        btnPdfView = findViewById(R.id.btn_hmclass11_physics2)
        btnPdfView.setOnClickListener() {
            pdfUrl =
                "https://drive.google.com/file/d/1p4FTz_0m9pbf0Z4ZMyNaCAV6QwRP47__/view?usp=sharing"
            var intent = Intent(this, PdfWebViewActivity::class.java)
            intent.putExtra("URL", pdfUrl)
            startActivity(intent)
        }


        //Biology (जीवविज्ञान भाग 1)
        btnPdfView = findViewById(R.id.btn_hmclass11_biology1)
        btnPdfView.setOnClickListener() {
            pdfUrl =
                "https://drive.google.com/file/d/1D52b-U0HIgDdDMphdkVsg-V4AA0cp7kZ/view?usp=sharing"
            var intent = Intent(this, PdfWebViewActivity::class.java)
            intent.putExtra("URL", pdfUrl)
            startActivity(intent)
        }


        //Biology (जीवविज्ञान भाग 2)
        btnPdfView = findViewById(R.id.btn_hmclass11_biology2)
        btnPdfView.setOnClickListener() {
            pdfUrl =
                "https://drive.google.com/file/d/17BJJBHeGulmC35lQ-lYTKz2X8s3muazb/view?usp=sharing"
            var intent = Intent(this, PdfWebViewActivity::class.java)
            intent.putExtra("URL", pdfUrl)
            startActivity(intent)
        }


        //Maths (गणित भाग 1)
        btnPdfView = findViewById(R.id.btn_hmclass11_math1)
        btnPdfView.setOnClickListener() {
            pdfUrl =
                "https://drive.google.com/file/d/1EyuaGFjMZEkGncF8UTiDHC8tWISrwBoC/view?usp=sharing"
            var intent = Intent(this, PdfWebViewActivity::class.java)
            intent.putExtra("URL", pdfUrl)
            startActivity(intent)
        }


        //Maths (गणित भाग 2)
        btnPdfView = findViewById(R.id.btn_hmclass11_math2)
        btnPdfView.setOnClickListener() {
            pdfUrl =
                "https://drive.google.com/file/d/1WtqnwwT--mXdygadONX96HRAaVM64DE1/view?usp=sharing"
            var intent = Intent(this, PdfWebViewActivity::class.java)
            intent.putExtra("URL", pdfUrl)
            startActivity(intent)
        }
    }
}