package com.example.learningjavatwo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Pdfview4 extends AppCompatActivity {

    PDFView pdfView;
    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfview4);
        getSupportActionBar().setTitle("Learningjava");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        pdfView = findViewById(R.id.pdf5);
        String getItem= getIntent().getStringExtra("pdfFileName");

        if (getItem.equals("1. Defining Packages")){
            pdfView.fromAsset("5.1.pdf")
                    .load();
        }
        if (getItem.equals("2. Creating Packages")){
            pdfView.fromAsset("5.2.pdf")
                    .load();
        }
        if (getItem.equals("3. Import Statement")){
            pdfView.fromAsset("5.3.pdf")
                    .load();
        }
        if (getItem.equals("4. Java API Packages")){
            pdfView.fromAsset("5.4.pdf")
                    .load();
        }
        if (getItem.equals("5. Access Protection")){
            pdfView.fromAsset("5.5.pdf")
                    .load();
        }
    }
}

