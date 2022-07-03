package com.amarjeet.bseblibrary.hindimedium

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.amarjeet.bseblibrary.DashboardActivity
import com.amarjeet.bseblibrary.R
import com.amarjeet.bseblibrary.hindimedium.class10.HindiMediumQuestionPaperClass10Activity
import com.amarjeet.bseblibrary.hindimedium.class12.HindiMediumQuestionPaperClass12Activity
import com.google.android.material.appbar.MaterialToolbar

class HindiMediumQuestionPaperActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hindi_medium_question_paper)

        //Go back to Home Page of BSEB Library
        val btnBack = findViewById<MaterialToolbar>(R.id.btnBackHindiMediumQuestionPaper)
        btnBack.setOnClickListener{
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
            finish()
        }


        //class XII
        val btnClass12 = findViewById<CardView>(R.id.btn_hindimedium_class12_qp)
        btnClass12.setOnClickListener{
            val intent = Intent(this, HindiMediumQuestionPaperClass12Activity::class.java)
            startActivity(intent)
        }


        //class X
        val btnClass10 = findViewById<CardView>(R.id.btn_hindimedium_class10_qp)
        btnClass10.setOnClickListener{
            val intent = Intent(this, HindiMediumQuestionPaperClass10Activity::class.java)
            startActivity(intent)
        }
    }
}