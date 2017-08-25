package com.bodetree.v2bodetree;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.github.barteksc.pdfviewer.PDFView;


/**
 * Created by walkermcbain on 8/25/17.
 */

public class viewpdf2 extends AppCompatActivity{

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewpdf2);

        pdfView = (PDFView)findViewById(R.id.pdfView);
        pdfView.fromAsset("citywide_education-process.pdf").load();


    }
}
