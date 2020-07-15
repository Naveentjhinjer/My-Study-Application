package com.example.learningjavatwo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Pdfview3 extends AppCompatActivity {

    PDFView pdfView;
    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfview3);
        getSupportActionBar().setTitle("Learningjava");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        pdfView = findViewById(R.id.pdf4);
        String getItem= getIntent().getStringExtra("pdfFileName");

        if (getItem.equals("1. Defining Interface")){
            pdfView.fromAsset("4.1.pdf")
                    .load();
        }
        if (getItem.equals("2. Extending Interface")){
            pdfView.fromAsset("4.2.pdf")
                    .load();
        }
        if (getItem.equals("3. Implementing Interface")){
            pdfView.fromAsset("4.3.pdf")
                    .load();
        }
        if (getItem.equals("4. Extending Multiple Interface")){
            pdfView.fromAsset("4.4.pdf")
                    .load();
        }
        if (getItem.equals("5. Nested Interface")){
            pdfView.fromAsset("4.5.pdf")
                    .load();
        }
    }
}

