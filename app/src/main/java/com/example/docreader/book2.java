package com.example.docreader;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class book2 extends AppCompatActivity {

    PDFView pdfbook2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book2);

        pdfbook2=(PDFView) findViewById(R.id.pdbook2);

        pdfbook2.fromAsset("PSE.pdf").load();
    }
}