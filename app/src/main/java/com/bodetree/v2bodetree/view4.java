package com.bodetree.v2bodetree;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.github.barteksc.pdfviewer.PDFView;


public class view4 extends AppCompatActivity{

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view4);

        pdfView = (PDFView)findViewById(R.id.pdfView);
        pdfView.fromAsset("City Wide 2017 MULTI STATE Unit FDD v2.pdf").load();


    }

    public void onButtonClicked(View view){
        Intent intent = new Intent(this, view5.class);
        startActivity(intent);

    }

    @Override
    public void onBackPressed() {

    }
}
