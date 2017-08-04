package com.bodetree.v2bodetree;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by walkermcbain on 8/4/17.
 */

public class mainactivity extends AppCompatActivity {

    @Override
     protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(new CustomPagerAdapter(this));
    }



    public enum CustomPagerEnum {

        Main(R.string.main, R.layout.activity_app),
        VIDEO(R.string.video, R.layout.view2),
        PICS(R.string.pics, R.layout.view3),
        PDF(R.string.pdf, R.layout.view4),
        PIN(R.string.pin, R.layout.view5);

        private int mTitleResId;
        private int mLayoutResId;

        CustomPagerEnum(int titleResId, int layoutResId) {

            mLayoutResId = layoutResId;
            mTitleResId = titleResId;
        }

        public int getTitleResId() {
            return mTitleResId;
        }

        public int getLayoutResId() {
            return mLayoutResId;
        }

    }

}
