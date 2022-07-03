package com.amarjeet.bseblibrary.englishmedium

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.amarjeet.bseblibrary.DashboardActivity
import com.amarjeet.bseblibrary.R
import com.google.android.material.appbar.MaterialToolbar

class EnglishMediumQuestionPaperActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_english_medium_question_paper)

        //Go back to Home Page of BSEB Library
        val btnBack = findViewById<MaterialToolbar>(R.id.btnBackEnglishMediumQuestionPaper)
        btnBack.setOnClickListener{
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
            finish()
        }


        //class XII
        val btnClass12 = findViewById<CardView>(R.id.btn_hindimedium_class12_qp)
        btnClass12.setOnClickListener{
            Toast.makeText(this, "Updating soon | Keep Learning!", Toast.LENGTH_SHORT).show()
        }


        //class X
        val btnClass10 = findViewById<CardView>(R.id.btn_hindimedium_class10_qp)
        btnClass10.setOnClickListener{
            Toast.makeText(this, "Updating soon | Keep Learning!", Toast.LENGTH_SHORT).show()
        }

    }
}