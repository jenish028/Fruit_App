package com.example.fruit_app;

import androidx.appcompat.app.AppCompatActivity;

import android.app.MediaRouteButton;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class Swiggy extends AppCompatActivity {

    private WebView web1_view;
    private ProgressBar progress_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swiggy);

        blindin();


        String swiggy = getIntent().getStringExtra("n1");
        web1_view.loadUrl(swiggy);
        String zomato = getIntent().getStringExtra("n2");
        web1_view.loadUrl(zomato);
        String pizzahub = getIntent().getStringExtra("n3");
        web1_view.loadUrl(pizzahub);
        String dominos = getIntent().getStringExtra("n4");
        web1_view.loadUrl(dominos);
        String mcdonal = getIntent().getStringExtra("n5");
        web1_view.loadUrl(mcdonal);
        String uber = getIntent().getStringExtra("n6");
        web1_view.loadUrl(uber);
        String fresh = getIntent().getStringExtra("n7");
        web1_view.loadUrl(fresh);
        String kfc = getIntent().getStringExtra("n8");
        web1_view.loadUrl(kfc);
        String burgerking = getIntent().getStringExtra("n9");
        web1_view.loadUrl(burgerking);


        web1_view.setWebViewClient(new WebViewClient());

        web1_view.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                super.onProgressChanged(view, newProgress);
                if (newProgress == 100) {
                    progress_btn.setVisibility(View.GONE);
                }
            }
        });
        web1_view.getSettings().setJavaScriptEnabled(true);

    }

    void blindin() {

        web1_view = findViewById(R.id.web1_view);
        progress_btn = findViewById(R.id.progress_btn);

    }

    @Override
    public void onBackPressed() {
        if (web1_view.canGoBack()) {
            web1_view.goBack();
        } else {
            super.onBackPressed();
        }
    }
}