package com.bodetree.v2bodetree;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.SurfaceView;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;



public class view2 extends AppCompatActivity{

    VideoView videoView;
    DisplayMetrics dm;
    SurfaceView sur_View;
    MediaController media_Controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view2);
    }

    public void getInit(){
        videoView = (VideoView) findViewById(R.id.videoView);
        media_Controller = new MediaController(this);
        dm = new DisplayMetrics();
        this.getWindowManager().getDefaultDisplay().getMetrics(dm);
        int height = dm.heightPixels;
        int width = dm.widthPixels;
        videoView.setMinimumWidth(width);
        videoView.setMinimumHeight(height);
        videoView.setMediaController(media_Controller);
        videoView.setVideoPath("/res/raw/jeffoddo.mp4");
        videoView.start();
    }

    public void onButtonClicked(View view){
        Intent intent = new Intent(this, view3.class);
        startActivity(intent);

    }

    @Override
    public void onBackPressed() {

    }

}
