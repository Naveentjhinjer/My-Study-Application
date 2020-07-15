    package com.example.learningjavatwo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Pdfviewer2 extends AppCompatActivity {

    PDFView pdfView;
    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfviewer2);
        getSupportActionBar().setTitle("Learningjava");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        pdfView = findViewById(R.id.pdf3);
        String getItem= getIntent().getStringExtra("pdfFileName");

        if (getItem.equals("1. Inheritance")){
            pdfView.fromAsset("3.1.pdf")
                    .load();
        }
        if (getItem.equals("2. Super Class")){
            pdfView.fromAsset("3.2.pdf")
                    .load();
        }
        if (getItem.equals("3. Method Overriding")){
            pdfView.fromAsset("3.3.pdf")
                    .load();
        }
        if (getItem.equals("4. Keyword")){
            pdfView.fromAsset("3.4.pdf")
                    .load();
        }
        if (getItem.equals("5. Abstract Class & Method")){
            pdfView.fromAsset("3.5.pdf")
                    .load();
        }
        if (getItem.equals("6. Array")){
            pdfView.fromAsset("3.6.pdf")
                    .load();
        }
        if (getItem.equals("7. String")){
            pdfView.fromAsset("3.7.pdf")
                    .load();
        }
        if (getItem.equals("8. Wrapper Class")){
            pdfView.fromAsset("3.8.pdf")
                    .load();
        }
    }
}

