package com.example.rosaryviewingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Verses extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verses);
        webView = findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true); // Enable JavaScript (optional)

        // Load a webpage
        webView.loadUrl("https://dailyverses.net/topics/kjv?fbclid=IwAR3jBNKOK-p9q6ocv4JurGav_eFTWK5E05ZmUepJpVN01n5iLlaCNZuk_eA");
    }

    public void returnToCategory(View view){
        Intent returnIntent = new Intent(this, Categories.class);
        startActivity(returnIntent);
        finish();
    }


}