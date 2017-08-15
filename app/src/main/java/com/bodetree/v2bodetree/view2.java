package com.bodetree.v2bodetree;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by walkermcbain on 8/10/17.
 */

public class view2 extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view2);


    }

    public void onButtonClicked(View view){
        Intent intent = new Intent(this, view3.class);
        startActivity(intent);

    }

    @Override
    public void onBackPressed() {

    }

}
