package com.amarjeet.bseblibrary.hindimedium.class10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.amarjeet.bseblibrary.R
import com.amarjeet.bseblibrary.hindimedium.HindiMediumQuestionPaperActivity
import com.google.android.material.appbar.MaterialToolbar

class HindiMediumQuestionPaperClass10Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hindi_medium_question_paper_class10)


        //Go back to Home Page of BSEB Library
        val btnBack = findViewById<MaterialToolbar>(R.id.btnBack)
        btnBack.setOnClickListener {
            val intent = Intent(this, HindiMediumQuestionPaperActivity::class.java)
            startActivity(intent)
            finish()
        }


    }
}