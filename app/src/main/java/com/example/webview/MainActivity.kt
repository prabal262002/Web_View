package com.example.webview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webiew = findViewById<WebView>(R.id.webview)
        webiew.webViewClient = WebViewClient()
        webiew.apply {
            settings.javaScriptEnabled = true
            loadUrl("https://www.youtube.com")
        }
    }
}