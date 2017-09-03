package com.bodetree.v2bodetree;




import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class lastpage extends AppCompatActivity {



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lastpage);

    }

    public void onButtonClick(View view){

        ActivityManager am = (ActivityManager) getSystemService(
                Context.ACTIVITY_SERVICE);

        if (am.getLockTaskModeState() ==
                ActivityManager.LOCK_TASK_MODE_LOCKED) {
            stopLockTask();
        }


        Intent intent = new Intent(this, AppActivity.class);
        startActivity(intent);
        finish();

    }


}





