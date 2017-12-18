package com.example.trungnguyen.demojavascript;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    private WebView webView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addListener();
    }
    private void addControls() {
        webView1 = findViewById(R.id.webview1);
    }
    private void addListener() {
        webView1.getSettings().setJavaScriptEnabled(true);
        webView1.setWebChromeClient(new WebChromeClient());
        webView1.loadUrl("file:///android_asset/www/index.html");
    }


}
