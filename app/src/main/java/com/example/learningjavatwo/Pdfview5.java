package com.example.learningjavatwo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Pdfview5 extends AppCompatActivity {

    PDFView pdfView;
    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfview5);
        getSupportActionBar().setTitle("Learningjava");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        pdfView = findViewById(R.id.pdf6);
        String getItem= getIntent().getStringExtra("pdfFileName");

        if (getItem.equals("1. Creating Thread")){
            pdfView.fromAsset("6.1.pdf")
                    .load();
        }
        if (getItem.equals("2. Life Cycle of Thread")){
            pdfView.fromAsset("6.2.pdf")
                    .load();
        }
        if (getItem.equals("3. Thread Method")){
            pdfView.fromAsset("6.3.pdf")
                    .load();
        }
        if (getItem.equals("4. Thread Priorities")){
            pdfView.fromAsset("6.4.pdf")
                    .load();
        }
        if (getItem.equals("5. Major Concept of Multithreaded Programming")){
            pdfView.fromAsset("6.5.pdf")
                    .load();
        }
    }
}
