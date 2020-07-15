package com.example.learningjavatwo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Pdfview7 extends AppCompatActivity {

    PDFView pdfView;
    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfview7);
        getSupportActionBar().setTitle("Learningjava");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        pdfView = findViewById(R.id.pdf8);
        String getItem= getIntent().getStringExtra("pdfFileName");

        if (getItem.equals("1. Introduction")){
            pdfView.fromAsset("9.1.pdf")
                    .load();
        }
        if (getItem.equals("2. Concept of Stream")){
            pdfView.fromAsset("9.2.pdf")
                    .load();
        }
        if (getItem.equals("3. Stream of Classes")){
            pdfView.fromAsset("9.3.pdf")
                    .load();
        }
        if (getItem.equals("4. Byte Stream Classes")){
            pdfView.fromAsset("9.4.pdf")
                    .load();
        }
        if (getItem.equals("5. Character Stream Classes")){
            pdfView.fromAsset("9.5.pdf")
                    .load();
        }
        if (getItem.equals("6. File Class")){
            pdfView.fromAsset("9.6.pdf")
                    .load();
        }
        if (getItem.equals("7. Creation of File")){
            pdfView.fromAsset("9.7.pdf")
                    .load();
        }
        if (getItem.equals("8. Reading or Writing Character & Bytes")){
            pdfView.fromAsset("9.8.pdf")
                    .load();
        }
    }
}

