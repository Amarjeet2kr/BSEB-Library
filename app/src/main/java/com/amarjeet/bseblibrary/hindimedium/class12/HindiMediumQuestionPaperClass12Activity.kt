package com.amarjeet.bseblibrary.hindimedium.class12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.amarjeet.bseblibrary.PdfWebViewActivity
import com.amarjeet.bseblibrary.R
import com.amarjeet.bseblibrary.hindimedium.HindiMediumBooksActivity
import com.amarjeet.bseblibrary.hindimedium.HindiMediumQuestionPaperActivity
import com.google.android.material.appbar.MaterialToolbar

class HindiMediumQuestionPaperClass12Activity : AppCompatActivity() {

    private lateinit var btnPdfView: CardView
    private lateinit var pdfUrl: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hindi_medium_question_paper_class12)


        //Go back to Home Page of BSEB Library
        val btnBack = findViewById<MaterialToolbar>(R.id.btnBack)
        btnBack.setOnClickListener {
            val intent = Intent(this, HindiMediumQuestionPaperActivity::class.java)
            startActivity(intent)
            finish()
        }


        //Biology
        btnPdfView = findViewById(R.id.btn_hmclass12_qp_biology)
        btnPdfView.setOnClickListener() {
            pdfUrl =
                "https://drive.google.com/file/d/1629-J16r2jdOMIdKD4YhQqBu_iU4pIFP/view?usp=sharing"
            var intent = Intent(this, PdfWebViewActivity::class.java)
            intent.putExtra("URL", pdfUrl)
            startActivity(intent)
        }


        //Chemistry
        btnPdfView = findViewById(R.id.btn_hmclass12_qp_chemistry)
        btnPdfView.setOnClickListener() {
            pdfUrl =
                "https://drive.google.com/file/d/1osfFgd_U2zixcF07SOj5QesbGFHQ16jx/view?usp=sharing"
            var intent = Intent(this, PdfWebViewActivity::class.java)
            intent.putExtra("URL", pdfUrl)
            startActivity(intent)
        }


        //Physics
        btnPdfView = findViewById(R.id.btn_hmclass12_qp_physics)
        btnPdfView.setOnClickListener() {
            pdfUrl =
                "https://drive.google.com/file/d/1LToWZw-lg6ThFkqBEoEF5Br_illhzX3O/view?usp=sharing"
            var intent = Intent(this, PdfWebViewActivity::class.java)
            intent.putExtra("URL", pdfUrl)
            startActivity(intent)
        }


        //Mathematics
        btnPdfView = findViewById(R.id.btn_hmclass12_qp_math)
        btnPdfView.setOnClickListener() {
            pdfUrl =
                "https://drive.google.com/file/d/1qFsmyLSSutdci759vJWYdOTM8i3pGiZW/view?usp=sharing"
            var intent = Intent(this, PdfWebViewActivity::class.java)
            intent.putExtra("URL", pdfUrl)
            startActivity(intent)
        }

    }
}