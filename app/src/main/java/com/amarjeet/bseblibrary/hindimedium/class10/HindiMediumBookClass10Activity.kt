package com.amarjeet.bseblibrary.hindimedium.class10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.amarjeet.bseblibrary.PdfWebViewActivity
import com.amarjeet.bseblibrary.R
import com.amarjeet.bseblibrary.hindimedium.HindiMediumBooksActivity
import com.google.android.material.appbar.MaterialToolbar

class HindiMediumBookClass10Activity : AppCompatActivity() {

    private lateinit var btnPdfView: CardView
    private lateinit var pdfUrl: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hindi_medium_book_class10)


        //Go back to Home Page of BSEB Library
        val btnBack = findViewById<MaterialToolbar>(R.id.btnBack)
        btnBack.setOnClickListener{
            val intent = Intent(this, HindiMediumBooksActivity::class.java)
            startActivity(intent)
            finish()
        }



        //Sanskrit (पीयूषम्)
        btnPdfView = findViewById(R.id.btn_hmclass10_sanskrit)
        btnPdfView.setOnClickListener() {
            pdfUrl =
                "https://drive.google.com/file/d/1JeoFF5irOtQXSC8RzTmTqXY5-yQueJNH/view?usp=sharing"
            var intent = Intent(this, PdfWebViewActivity::class.java)
            intent.putExtra("URL", pdfUrl)
            startActivity(intent)
        }


        //Political Science/civics (लोकतांत्रिक राजनीति)
        btnPdfView = findViewById(R.id.btn_hmclass10_political)
        btnPdfView.setOnClickListener() {
            pdfUrl =
                "https://drive.google.com/file/d/1doLeHpdxErrBXDexkDhd_Z837PZG-zcW/view?usp=sharing"
            var intent = Intent(this, PdfWebViewActivity::class.java)
            intent.putExtra("URL", pdfUrl)
            startActivity(intent)
        }


        //Maths (गणित)
        btnPdfView = findViewById(R.id.btn_hmclass10_math)
        btnPdfView.setOnClickListener() {
            pdfUrl =
                "https://drive.google.com/file/d/16dRyc5sCLbN4Pp0ADKRgZoa-mJTq9qMt/view?usp=sharing"
            var intent = Intent(this, PdfWebViewActivity::class.java)
            intent.putExtra("URL", pdfUrl)
            startActivity(intent)
        }


        //Science (विज्ञान)
        btnPdfView = findViewById(R.id.btn_hmclass10_science)
        btnPdfView.setOnClickListener() {
            pdfUrl =
                "https://drive.google.com/file/d/1D-tD2F_1p9To8M_07gfVPvKAs5-7Jo5O/view?usp=sharing"
            var intent = Intent(this, PdfWebViewActivity::class.java)
            intent.putExtra("URL", pdfUrl)
            startActivity(intent)
        }


        //English Reader (Panorma)
        btnPdfView = findViewById(R.id.btn_hmclass10_english_reader)
        btnPdfView.setOnClickListener() {
            pdfUrl =
                "https://drive.google.com/file/d/11C4THkz3E9Slm6q0_ns-pFo_0QsE7Afu/view?usp=sharing"
            var intent = Intent(this, PdfWebViewActivity::class.java)
            intent.putExtra("URL", pdfUrl)
            startActivity(intent)
        }


        //English (Prose)
        btnPdfView = findViewById(R.id.btn_hmclass10_english_prose)
        btnPdfView.setOnClickListener() {
            pdfUrl =
                "https://drive.google.com/file/d/1mdwpK4L0M6HTRE7iVIhBXyDUt_MlWd3M/view?usp=sharing"
            var intent = Intent(this, PdfWebViewActivity::class.java)
            intent.putExtra("URL", pdfUrl)
            startActivity(intent)
        }


        //English (Poetry)
        btnPdfView = findViewById(R.id.btn_hmclass10_english_poetry)
        btnPdfView.setOnClickListener() {
            pdfUrl =
                "https://drive.google.com/file/d/1ziIsegJ8OEpD2HsHpU-QSuOSoBX84o7D/view?usp=sharing"
            var intent = Intent(this, PdfWebViewActivity::class.java)
            intent.putExtra("URL", pdfUrl)
            startActivity(intent)
        }


        //Hindi (गोधूलि) - कव्यखंड
        btnPdfView = findViewById(R.id.btn_hmclass10_hindi1)
        btnPdfView.setOnClickListener() {
            pdfUrl =
                "https://drive.google.com/file/d/17icTNyD9ELy78tOyH_0kl35kRZaJ5IXO/view?usp=sharing"
            var intent = Intent(this, PdfWebViewActivity::class.java)
            intent.putExtra("URL", pdfUrl)
            startActivity(intent)
        }


        //Hindi (गोधूलि) - गद्यखंड
        btnPdfView = findViewById(R.id.btn_hmclass10_hindi2)
        btnPdfView.setOnClickListener() {
            pdfUrl =
                "https://drive.google.com/file/d/1K1TaP_lZlqiTERqBkSxslIG20tV_i5ri/view?usp=sharing"
            var intent = Intent(this, PdfWebViewActivity::class.java)
            intent.putExtra("URL", pdfUrl)
            startActivity(intent)
        }


        //Economics (अर्थसास्त्र)
        btnPdfView = findViewById(R.id.btn_hmclass10_economics)
        btnPdfView.setOnClickListener() {
            pdfUrl =
                "https://drive.google.com/file/d/1TVkY9lSZmW2stxttN4W_KREPRvUGyK2I/view?usp=sharing"
            var intent = Intent(this, PdfWebViewActivity::class.java)
            intent.putExtra("URL", pdfUrl)
            startActivity(intent)
        }

    }
}