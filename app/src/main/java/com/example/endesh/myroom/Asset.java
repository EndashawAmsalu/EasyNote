package com.example.endesh.myroom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.github.barteksc.pdfviewer.PDFView;

public class Asset extends AppCompatActivity {
    PDFView mPDFView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asset);
        mPDFView = findViewById(R.id.pdfView);
        mPDFView.fromAsset("basic_nurse.pdf").load();
    }


}
