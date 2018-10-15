package com.example.macbokkpro.mvpapplication.activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

import com.example.macbokkpro.mvpapplication.R;
import com.example.macbokkpro.mvpapplication.adapters.SilderImageAdapter;
import com.matthewtamlin.sliding_intro_screen_library.indicators.DotIndicator;

/**
 * Created by macbokkpro on 2018-10-15.
 */

public class SilderImageActivity extends Activity implements ViewPager.OnPageChangeListener{
    DotIndicator indicator;
    private int[] sliderImageId = new int[]{
            R.drawable.download, R.drawable.images1, R.drawable.images12,R.drawable.item_imagee, R.drawable.images12,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_silder);

        ViewPager mViewPager = (ViewPager) findViewById(R.id.viewPage);
        mViewPager.addOnPageChangeListener(this);
        SilderImageAdapter adapterView = new SilderImageAdapter(this,sliderImageId);
        mViewPager.setAdapter(adapterView);
        indicator = findViewById(R.id.indicator);
        indicator.setNumberOfItems(sliderImageId.length);



    }



    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//        indicator.setSelectedItem(position,true);
//        System.out.println("ttttttttttttttteee");

    }

    @Override
    public void onPageSelected(int position) {
        indicator.setSelectedItem(position,true);
        //System.out.println("ttttttttttttttt");
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
