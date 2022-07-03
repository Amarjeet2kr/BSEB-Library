package com.amarjeet.bseblibrary.hindimedium.class12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.cardview.widget.CardView
import com.amarjeet.bseblibrary.PdfWebViewActivity
import com.amarjeet.bseblibrary.R
import com.amarjeet.bseblibrary.hindimedium.HindiMediumBooksActivity
import com.google.android.material.appbar.MaterialToolbar

class HindiMediumBookClass12Activity : AppCompatActivity() {

    private lateinit var btnPdfView: CardView
    private lateinit var pdfUrl: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hindi_medium_book_class12)


        //Go back to Home Page of BSEB Library
        val btnBack = findViewById<MaterialToolbar>(R.id.btnBack)
        btnBack.setOnClickListener {
            val intent = Intent(this, HindiMediumBooksActivity::class.java)
            startActivity(intent)
            finish()
        }


        //गणित भाग - 1
        btnPdfView = findViewById(R.id.btn_hmclass12_maths1)
        btnPdfView.setOnClickListener() {
            pdfUrl =
                "https://drive.google.com/file/d/1FFsLw23yYZGyyaTTWFBQGb44_P7aBLJ-/view?usp=sharing"
            var intent = Intent(this, PdfWebViewActivity::class.java)
            intent.putExtra("URL", pdfUrl)
            startActivity(intent)
        }


        //गणित भाग - 2
        btnPdfView = findViewById(R.id.btn_hmclass12_maths2)
        btnPdfView.setOnClickListener() {
            pdfUrl =
                "https://drive.google.com/file/d/1IDv85y6ao8LVMo2Bv0ZzMHudEBtETeel/view?usp=sharing"
            var intent = Intent(this, PdfWebViewActivity::class.java)
            intent.putExtra("URL", pdfUrl)
            startActivity(intent)
        }


        //भौतिकी भाग - 1
        btnPdfView = findViewById(R.id.btn_hmclass12_physic1)
        btnPdfView.setOnClickListener() {
            pdfUrl =
                "https://drive.google.com/file/d/138HsOmI2_tw3S0fJf0I_HRFdWb--TxLO/view?usp=sharing"
            var intent = Intent(this, PdfWebViewActivity::class.java)
            intent.putExtra("URL", pdfUrl)
            startActivity(intent)
        }


        //भौतिकी भाग - 2
        btnPdfView = findViewById(R.id.btn_hmclass12_physic2)
        btnPdfView.setOnClickListener() {
            pdfUrl =
                "https://drive.google.com/file/d/1v12XIUvQxyBn0fUudf42_nXZXiGajPlM/view?usp=sharing"
            var intent = Intent(this, PdfWebViewActivity::class.java)
            intent.putExtra("URL", pdfUrl)
            startActivity(intent)
        }


        //रसायनशास्त्र भाग - 1
        btnPdfView = findViewById(R.id.btn_hmclass12_chemistry1)
        btnPdfView.setOnClickListener() {
            pdfUrl =
                "https://drive.google.com/file/d/1r6s4hTZivxSsW-zIz3txe7vSS1ETwnzc/view?usp=sharing"
            var intent = Intent(this, PdfWebViewActivity::class.java)
            intent.putExtra("URL", pdfUrl)
            startActivity(intent)
        }


        //रसायनशास्त्र भाग - 2
        btnPdfView = findViewById(R.id.btn_hmclass12_chemistry2)
        btnPdfView.setOnClickListener() {
            pdfUrl =
                "https://drive.google.com/file/d/10vqSlk88NyTaBcjyU2juLmp-XDD-4Bpi/view?usp=sharing"
            var intent = Intent(this, PdfWebViewActivity::class.java)
            intent.putExtra("URL", pdfUrl)
            startActivity(intent)
        }


        //जीवविज्ञान
        btnPdfView = findViewById(R.id.btn_hmclass12_biology)
        btnPdfView.setOnClickListener() {
            pdfUrl =
                "https://drive.google.com/file/d/16F-TgfRn24SgdXNsA58hR0xqWcX-JAbB/view?usp=sharing"
            var intent = Intent(this, PdfWebViewActivity::class.java)
            intent.putExtra("URL", pdfUrl)
            startActivity(intent)
        }


        //भारतीय इतिहास के कुछ विषय – भाग 1
        btnPdfView = findViewById(R.id.btn_hmclass12_history1)
        btnPdfView.setOnClickListener() {
            pdfUrl =
                "https://drive.google.com/file/d/1Hso7XShkXxvWySyNBcaHYxt63VPOdyLQ/view?usp=sharing"
            var intent = Intent(this, PdfWebViewActivity::class.java)
            intent.putExtra("URL", pdfUrl)
            startActivity(intent)
        }


        //Hindi (दिगंत) - काव्यखंड
        btnPdfView = findViewById(R.id.btn_hmclass12_hindi1)
        btnPdfView.setOnClickListener() {
            pdfUrl =
                "https://drive.google.com/file/d/116TFZYBDIpplsSytSIzWROMujS7qMEbU/view?usp=sharing"
            var intent = Intent(this, PdfWebViewActivity::class.java)
            intent.putExtra("URL", pdfUrl)
            startActivity(intent)
        }


        //Hindi (दिगंत) - गद्यखंड
        btnPdfView = findViewById(R.id.btn_hmclass12_hindi2)
        btnPdfView.setOnClickListener() {
            pdfUrl =
                "https://drive.google.com/file/d/1NdSNqFM8px4bCcuBzHMQC353enneKR8H/view?usp=sharing"
            var intent = Intent(this, PdfWebViewActivity::class.java)
            intent.putExtra("URL", pdfUrl)
            startActivity(intent)
        }


        //Hindi (दिगंत) - प्रतिपूर्ति
        btnPdfView = findViewById(R.id.btn_hmclass12_hindi3)
        btnPdfView.setOnClickListener() {
            pdfUrl =
                "https://drive.google.com/file/d/11IG2vJ_KSwoxT89TE6HLWMEIAuOtBlXo/view?usp=sharing"
            var intent = Intent(this, PdfWebViewActivity::class.java)
            intent.putExtra("URL", pdfUrl)
            startActivity(intent)
        }


//        //
//        btnPdfView = findViewById(R.id.btn_hmclass12_history1)
//        btnPdfView.setOnClickListener() {
//            pdfUrl =
//                ""
//            var intent = Intent(this, PdfWebViewActivity::class.java)
//            intent.putExtra("URL", pdfUrl)
//            startActivity(intent)
//        }
    }
}