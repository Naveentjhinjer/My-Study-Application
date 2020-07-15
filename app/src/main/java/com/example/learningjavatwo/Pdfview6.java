package com.example.learningjavatwo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Pdfview6 extends AppCompatActivity {

    PDFView pdfView;
    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfview6);
        getSupportActionBar().setTitle("Learningjava");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        pdfView = findViewById(R.id.pdf7);
        String getItem= getIntent().getStringExtra("pdfFileName");

        if (getItem.equals("1. Error")){
            pdfView.fromAsset("7.1.pdf")
                    .load();
        }
        if (getItem.equals("2. Exception")){
            pdfView.fromAsset("7.2.pdf")
                    .load();
        }
        if (getItem.equals("3. Multiple Catch Statement")){
            pdfView.fromAsset("7.3.pdf")
                    .load();
        }
        if (getItem.equals("4. Finally")){
            pdfView.fromAsset("7.4.pdf")
                    .load();
        }
        if (getItem.equals("5. Build-in Exception")){
            pdfView.fromAsset("7.5.pdf")
                    .load();
        }
        if (getItem.equals("6. Throwing our own Exception")){
            pdfView.fromAsset("7.6.pdf")
                    .load();
        }
    }
}

