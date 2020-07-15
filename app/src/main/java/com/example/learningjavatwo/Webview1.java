package com.example.learningjavatwo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;

import com.github.barteksc.pdfviewer.PDFView;

public class Webview1 extends AppCompatActivity {
       PDFView pdfView;
    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview1);
        getSupportActionBar().setTitle("Learningjava");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        pdfView = findViewById(R.id.pdfv);
       String getItem= getIntent().getStringExtra("pdfFileName");

       if (getItem.equals("1. Introduction to Java")){
           pdfView.fromAsset("ONE.pdf")
                   .load();
       }
        if (getItem.equals("2. Setup for Java")){
            pdfView.fromAsset("1.2.pdf")
                    .load();
        }
        if (getItem.equals("3. Java Components")){
            pdfView.fromAsset("1.3.pdf")
                    .load();
        }
        if (getItem.equals("4. Variables and Data Type")){
            pdfView.fromAsset("1.4.pdf")
                    .load();
        }
        if (getItem.equals("5. Basic Operators")){
            pdfView.fromAsset("1.5.pdf")
                    .load();
        }
        if (getItem.equals("6. Flow Control")){
            pdfView.fromAsset("1.6.pdf")
                    .load();
        }
    }
}
