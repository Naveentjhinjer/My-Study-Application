package com.example.learningjavatwo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Pdfviewer extends AppCompatActivity {

    PDFView pdfView;
    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfviewer);
        getSupportActionBar().setTitle("Learningjava");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        pdfView = findViewById(R.id.pdf2);
        String getItem= getIntent().getStringExtra("pdfFileName");

        if (getItem.equals("1. Object & Class")){
            pdfView.fromAsset("2.1.pdf")
                    .load();
        }
        if (getItem.equals("2. Access Modifiers")){
            pdfView.fromAsset("2.2.pdf")
                    .load();
        }
        if (getItem.equals("3. Declaring Member Variables")){
            pdfView.fromAsset("2.3.pdf")
                    .load();
        }
        if (getItem.equals("4. Methods")){
            pdfView.fromAsset("2.4.pdf")
                    .load();
        }
        if (getItem.equals("5. Method Overloading")){
            pdfView.fromAsset("2.5.pdf")
                    .load();
        }
        if (getItem.equals("6. Constructor")){
            pdfView.fromAsset("2.6.pdf")
                    .load();
        }
        if (getItem.equals("7. Garbage Collection")){
            pdfView.fromAsset("2.7.pdf")
                    .load();
        }
        if (getItem.equals("8. This keyword")){
            pdfView.fromAsset("2.8.pdf")
                    .load();
        }
        if (getItem.equals("9. Static Members")){
            pdfView.fromAsset("2.9.pdf")
                    .load();
        }
        if (getItem.equals("10. Nested Classes")){
            pdfView.fromAsset("2.10.pdf")
                    .load();
        }
        if (getItem.equals("11. Java comment line argument")){
            pdfView.fromAsset("2.11.pdf")
                    .load();
        }
    }
}

