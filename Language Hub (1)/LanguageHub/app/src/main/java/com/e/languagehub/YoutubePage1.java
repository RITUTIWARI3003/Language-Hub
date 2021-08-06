package com.e.languagehub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class YoutubePage1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube_page1);
        WebView webView = (WebView)
                findViewById(R.id.webview);
        Intent intent =getIntent();
        String webSite = intent.getStringExtra("Links");
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(webSite);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);

    }
}
