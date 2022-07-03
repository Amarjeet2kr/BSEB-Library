package com.amarjeet.bseblibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class YouTubeWebViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_you_tube_web_view)


        //get the URL of the YouTube playlist and display in web view
        val url = intent.getStringExtra("URL")

        val webView = findViewById<WebView>(R.id.wb_webView)
        webView.webViewClient = WebViewClient()

        webView.apply{
            if (url != null) {
                loadUrl(url)
                webView.settings.javaScriptEnabled = true
            }
        }
    }
}