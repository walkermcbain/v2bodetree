package com.bodetree.v2bodetree;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;



public class view3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view3);
    }


    public void onButtonClicked(View view){
        setContentView(R.layout.view3);
        Intent intent = new Intent(this, view3.class);
        startActivity(intent);

    }

}