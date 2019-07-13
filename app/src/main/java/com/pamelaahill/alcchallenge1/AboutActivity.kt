package com.pamelaahill.alcchallenge1

import android.os.Bundle
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val webView = findViewById<WebView>(R.id.webview_about_alc)
        webView.loadUrl(URL)
    }

    companion object {
        const val URL = "https://andela.com/alc/"
    }
}
