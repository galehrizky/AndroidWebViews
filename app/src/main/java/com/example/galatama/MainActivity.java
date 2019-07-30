package com.example.galatama;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.webkit.WebSettings;
import android.webkit.WebView;
import  android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {


    WebView galatama;
    WebSettings galatamasetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        galatama = (WebView)findViewById(R.id.WebView1);
        galatama.clearCache(true);
        galatama.clearHistory();
        galatama.getSettings().setJavaScriptEnabled(true);
        galatama.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);

        galatamasetting = galatama.getSettings();

        galatama.setWebViewClient(new WebViewClient());

        galatama.loadUrl("https://viralgroup.id/login");

    }
}
