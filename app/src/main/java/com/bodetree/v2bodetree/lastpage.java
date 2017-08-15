package com.bodetree.v2bodetree;


import android.app.Activity;
import android.app.ActivityManager;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class lastpage extends AppCompatActivity{

//    private Button stopLockButton;
//    private ComponentName mAdminComponentName;
//    private DevicePolicyManager mDevicePolicyManager;


//    public static final String LOCK_ACTIVITY_KEY = "lock_activity";
//    public static final int FROM_LOCK_ACTIVITY = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lastpage);



//        mDevicePolicyManager = (DevicePolicyManager)
//                getSystemService(Context.DEVICE_POLICY_SERVICE);
//
//        stopLockButton = (Button) findViewById(R.id.stoplockbutton);
//        stopLockButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//
//                ActivityManager am = (ActivityManager) getSystemService(
//                        Context.ACTIVITY_SERVICE);
//
//                if (am.getLockTaskModeState() ==
//                        ActivityManager.LOCK_TASK_MODE_LOCKED) {
//                    stopLockTask();
//                }
//
//                setDefaultCosuPolicies(false);
//
//                Intent intent = new Intent(
//                        getApplicationContext(), AppActivity.class);
//
//                intent.putExtra(LOCK_ACTIVITY_KEY,FROM_LOCK_ACTIVITY);
//                startActivity(intent);
//                finish();
//
//            }
//        });

    }
//    @Override
//    public void onBackPressed() {
//
//    }




}
