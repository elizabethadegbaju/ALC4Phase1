package com.example.alc4phase1;

import android.net.http.SslError;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Handler;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        WebView webView = findViewById(R.id.alc_webview);
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public void onReceivedSslError(WebView View, SslErrorHandler handler, SslError error){
                handler.proceed();
            }
        });
<<<<<<< HEAD
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
=======
        webView.getSettings().setJavaScriptEnabled(true);
>>>>>>> 0a96505e8180a531fd80575e80af2fa832d869ef
        webView.loadUrl("https://andela.com/alc");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
