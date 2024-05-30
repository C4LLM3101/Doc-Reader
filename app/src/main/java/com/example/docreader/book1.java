package com.example.docreader;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class book1 extends AppCompatActivity {

    PDFView pdfbook1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book1);

        pdfbook1=(PDFView) findViewById(R.id.pdbook1);

        pdfbook1.fromAsset("PSE.pdf").load();
    }
}