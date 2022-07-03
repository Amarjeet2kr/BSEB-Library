package com.amarjeet.bseblibrary.hindimedium.class12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.amarjeet.bseblibrary.PdfWebViewActivity
import com.amarjeet.bseblibrary.R
import com.amarjeet.bseblibrary.YouTubeWebViewActivity
import com.amarjeet.bseblibrary.hindimedium.HindiMediumBooksActivity
import com.google.android.material.appbar.MaterialToolbar

class HindiMediumVideoClass12Activity : AppCompatActivity() {

    private lateinit var btnVideoView: CardView
    private lateinit var url: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hindi_medium_video_class12)


        //Go back to Home Page of BSEB Library
        val btnBack = findViewById<MaterialToolbar>(R.id.btnBack)
        btnBack.setOnClickListener {
            val intent = Intent(this, HindiMediumBooksActivity::class.java)
            startActivity(intent)
            finish()
        }


        //भारतीय इतिहास के कुछ विषय – भाग 1
        btnVideoView = findViewById(R.id.btn_hmclass12_history1)
        btnVideoView.setOnClickListener() {
            url =
                "https://www.youtube.com/playlist?list=PL8ZmMAAg0_eGixxa9kC3NyWbXTQG7yg6M"
            var intent = Intent(this, YouTubeWebViewActivity::class.java)
            intent.putExtra("URL", url)
            startActivity(intent)
        }


        //गणित भाग - 1
        btnVideoView = findViewById(R.id.btn_hmclass12_maths1)
        btnVideoView.setOnClickListener() {
            url =
                "https://youtube.com/playlist?list=PLxxCx4y_OiZoT5Im7TMXnb0_UeeM911Lg"
            var intent = Intent(this, YouTubeWebViewActivity::class.java)
            intent.putExtra("URL", url)
            startActivity(intent)
        }
    }
}