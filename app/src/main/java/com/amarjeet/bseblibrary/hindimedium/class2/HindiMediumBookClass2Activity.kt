package com.amarjeet.bseblibrary.hindimedium.class2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.amarjeet.bseblibrary.R
import com.amarjeet.bseblibrary.hindimedium.HindiMediumBooksActivity
import com.google.android.material.appbar.MaterialToolbar

class HindiMediumBookClass2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hindi_medium_book_class2)


        //Go back to Home Page of BSEB Library
        val btnBack = findViewById<MaterialToolbar>(R.id.btnBack)
        btnBack.setOnClickListener{
            val intent = Intent(this, HindiMediumBooksActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}