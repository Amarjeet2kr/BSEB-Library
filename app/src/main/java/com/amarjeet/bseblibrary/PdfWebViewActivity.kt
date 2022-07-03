package com.amarjeet.bseblibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.webkit.WebView
import android.webkit.WebViewClient

class PdfWebViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdf_web_view)

//        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)


        //get the URL of the book and display in web view
        val pdfUrl = intent.getStringExtra("URL")

        val webView = findViewById<WebView>(R.id.wb_webView)
        webView.webViewClient = WebViewClient()

        webView.apply{
            if (pdfUrl != null) {
                loadUrl(pdfUrl)
                webView.settings.javaScriptEnabled = true
            }
        }
    }
}