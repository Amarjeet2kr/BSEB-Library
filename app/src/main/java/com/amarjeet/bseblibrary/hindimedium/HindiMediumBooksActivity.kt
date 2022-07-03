package com.amarjeet.bseblibrary.hindimedium

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.amarjeet.bseblibrary.DashboardActivity
import com.amarjeet.bseblibrary.R
import com.amarjeet.bseblibrary.hindimedium.class1.HindiMediumBookClass1Activity
import com.amarjeet.bseblibrary.hindimedium.class10.HindiMediumBookClass10Activity
import com.amarjeet.bseblibrary.hindimedium.class11.HindiMediumBookClass11Activity
import com.amarjeet.bseblibrary.hindimedium.class12.HindiMediumBookClass12Activity
import com.amarjeet.bseblibrary.hindimedium.class2.HindiMediumBookClass2Activity
import com.amarjeet.bseblibrary.hindimedium.class3.HindiMediumBookClass3Activity
import com.amarjeet.bseblibrary.hindimedium.class4.HindiMediumBookClass4Activity
import com.amarjeet.bseblibrary.hindimedium.class5.HindiMediumBookClass5Activity
import com.amarjeet.bseblibrary.hindimedium.class6.HindiMediumBookClass6Activity
import com.amarjeet.bseblibrary.hindimedium.class7.HindiMediumBookClass7Activity
import com.amarjeet.bseblibrary.hindimedium.class8.HindiMediumBookClass8Activity
import com.amarjeet.bseblibrary.hindimedium.class9.HindiMediumBookClass9Activity
import com.google.android.material.appbar.MaterialToolbar

class HindiMediumBooksActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hindi_medium_books)


        //Go back to Home Page of BSEB Library
        val btnBack = findViewById<MaterialToolbar>(R.id.btnBackHindiMediumBooks)
        btnBack.setOnClickListener{
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
            finish()
        }


        //class XII
        val btnClass12 = findViewById<CardView>(R.id.btn_hindimediumbook_class12)
        btnClass12.setOnClickListener{
            val intent = Intent(this, HindiMediumBookClass12Activity::class.java)
            startActivity(intent)
        }


        //class XI
        val btnClass11 = findViewById<CardView>(R.id.btn_hindimediumbook_class11)
        btnClass11.setOnClickListener{
            val intent = Intent(this, HindiMediumBookClass11Activity::class.java)
            startActivity(intent)
        }


        //class X
        val btnClass10 = findViewById<CardView>(R.id.btn_hindimediumbook_class10)
        btnClass10.setOnClickListener{
            val intent = Intent(this, HindiMediumBookClass10Activity::class.java)
            startActivity(intent)
        }


        //class IX
        val btnClass9 = findViewById<CardView>(R.id.btn_hindimediumbook_class9)
        btnClass9.setOnClickListener{
            val intent = Intent(this, HindiMediumBookClass9Activity::class.java)
            startActivity(intent)
        }


        //class VIII
        val btnClass8 = findViewById<CardView>(R.id.btn_hindimediumbook_class8)
        btnClass8.setOnClickListener{
            val intent = Intent(this, HindiMediumBookClass8Activity::class.java)
            startActivity(intent)
        }


        //class VII
        val btnClass7 = findViewById<CardView>(R.id.btn_hindimediumbook_class7)
        btnClass7.setOnClickListener{
            val intent = Intent(this, HindiMediumBookClass7Activity::class.java)
            startActivity(intent)
        }


        //class VI
        val btnClass6 = findViewById<CardView>(R.id.btn_hindimediumbook_class6)
        btnClass6.setOnClickListener{
            val intent = Intent(this, HindiMediumBookClass6Activity::class.java)
            startActivity(intent)
        }


        //class V
        val btnClass5 = findViewById<CardView>(R.id.btn_hindimediumbook_class5)
        btnClass5.setOnClickListener{
            val intent = Intent(this, HindiMediumBookClass5Activity::class.java)
            startActivity(intent)
        }


        //class IV
        val btnClass4 = findViewById<CardView>(R.id.btn_hindimediumbook_class4)
        btnClass4.setOnClickListener{
            val intent = Intent(this, HindiMediumBookClass4Activity::class.java)
            startActivity(intent)
        }


        //class III
        val btnClass3 = findViewById<CardView>(R.id.btn_hindimediumbook_class3)
        btnClass3.setOnClickListener{
            val intent = Intent(this, HindiMediumBookClass3Activity::class.java)
            startActivity(intent)
        }

        //class II
        val btnClass2 = findViewById<CardView>(R.id.btn_hindimediumbook_class2)
        btnClass2.setOnClickListener{
            val intent = Intent(this, HindiMediumBookClass2Activity::class.java)
            startActivity(intent)
        }


        //class I
        val btnClass1 = findViewById<CardView>(R.id.btn_hindimediumbook_class1)
        btnClass1.setOnClickListener{
            val intent = Intent(this, HindiMediumBookClass1Activity::class.java)
            startActivity(intent)
        }


    }
}