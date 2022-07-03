package com.amarjeet.bseblibrary.hindimedium

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.amarjeet.bseblibrary.DashboardActivity
import com.amarjeet.bseblibrary.R
import com.amarjeet.bseblibrary.hindimedium.class12.HindiMediumBookClass12Activity
import com.amarjeet.bseblibrary.hindimedium.class12.HindiMediumVideoClass12Activity
import com.google.android.material.appbar.MaterialToolbar

class HindiMediumVideoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hindi_medium_video)


        //Go back to Home Page of BSEB Library
        val btnBack = findViewById<MaterialToolbar>(R.id.btnBackHindiMediumVideo)
        btnBack.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
            finish()
        }



        //class XII
        val btnClass12 = findViewById<CardView>(R.id.btn_hindimediumbook_class12)
        btnClass12.setOnClickListener {
            val intent = Intent(this, HindiMediumVideoClass12Activity::class.java)
            startActivity(intent)
        }


        //class XI
        val btnClass11 = findViewById<CardView>(R.id.btn_hindimediumbook_class11)
        btnClass11.setOnClickListener {
            Toast.makeText(this, "Updating soon | Keep Learning", Toast.LENGTH_SHORT).show()
        }


        //class X
        val btnClass10 = findViewById<CardView>(R.id.btn_hindimediumbook_class10)
        btnClass10.setOnClickListener {
            Toast.makeText(this, "Updating soon | Keep Learning", Toast.LENGTH_SHORT).show()
        }


        //class IX
        val btnClass9 = findViewById<CardView>(R.id.btn_hindimediumbook_class9)
        btnClass9.setOnClickListener {
            Toast.makeText(this, "Updating soon | Keep Learning", Toast.LENGTH_SHORT).show()
        }


        //class VIII
        val btnClass8 = findViewById<CardView>(R.id.btn_hindimediumbook_class8)
        btnClass8.setOnClickListener {
            Toast.makeText(this, "Updating soon | Keep Learning", Toast.LENGTH_SHORT).show()
        }


        //class VII
        val btnClass7 = findViewById<CardView>(R.id.btn_hindimediumbook_class7)
        btnClass7.setOnClickListener {
            Toast.makeText(this, "Updating soon | Keep Learning", Toast.LENGTH_SHORT).show()
        }


        //class VI
        val btnClass6 = findViewById<CardView>(R.id.btn_hindimediumbook_class6)
        btnClass6.setOnClickListener {
            Toast.makeText(this, "Updating soon | Keep Learning", Toast.LENGTH_SHORT).show()
        }

        //class V
        val btnClass5 = findViewById<CardView>(R.id.btn_hindimediumbook_class5)
        btnClass5.setOnClickListener {
            Toast.makeText(this, "Updating soon | Keep Learning", Toast.LENGTH_SHORT).show()
        }


        //class IV
        val btnClass4 = findViewById<CardView>(R.id.btn_hindimediumbook_class4)
        btnClass4.setOnClickListener {
            Toast.makeText(this, "Updating soon | Keep Learning", Toast.LENGTH_SHORT).show()
        }


        //class III
        val btnClass3 = findViewById<CardView>(R.id.btn_hindimediumbook_class3)
        btnClass3.setOnClickListener {
            Toast.makeText(this, "Updating soon | Keep Learning", Toast.LENGTH_SHORT).show()
        }


        //class II
        val btnClass2 = findViewById<CardView>(R.id.btn_hindimediumbook_class2)
        btnClass2.setOnClickListener {
            Toast.makeText(this, "Updating soon | Keep Learning", Toast.LENGTH_SHORT).show()
        }


        //class I
        val btnClass1 = findViewById<CardView>(R.id.btn_hindimediumbook_class1)
        btnClass1.setOnClickListener {
            Toast.makeText(this, "Updating soon | Keep Learning", Toast.LENGTH_SHORT).show()
        }

    }
}