package com.bodetree.v2bodetree;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;




public class view4 extends AppCompatActivity{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view4);

    }

    public void onClick(View view){
        Intent intent = new Intent(this, viewpdf1.class);
        startActivity(intent);

    }

    public void onClicked(View view){
        Intent intent = new Intent(this, viewpdf2.class);
        startActivity(intent);

    }

    public void onButton(View view){
        Intent intent = new Intent(this, viewpdf3.class);
        startActivity(intent);

    }

    public void onButtonClick(View view){
        Intent intent = new Intent(this, viewpdf4.class);
        startActivity(intent);

    }


    public void onButtonClicked(View view){
        Intent intent = new Intent(this, view5.class);
        startActivity(intent);

    }

    @Override
    public void onBackPressed() {

    }
}
