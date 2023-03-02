package com.example.quinbuy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class WebProduct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_product);

        ((WebView)findViewById(R.id.product_web)).loadUrl(getIntent().getStringExtra("url"));
    }
}