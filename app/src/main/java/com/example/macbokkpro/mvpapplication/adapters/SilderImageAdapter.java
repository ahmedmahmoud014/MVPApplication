package com.example.macbokkpro.mvpapplication.adapters;


import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.macbokkpro.mvpapplication.R;

/**
 * Created by macbokkpro on 2018-10-15.
 */

public class SilderImageAdapter extends PagerAdapter{
    Context mContext;
    int[] sliderImageId;
    public SilderImageAdapter(Context context, int[] sliderImageId ) {
        this.mContext = context;
        this.sliderImageId =  sliderImageId;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((ImageView) object);
    }



    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView = new ImageView(mContext);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(sliderImageId[position]);
        ((ViewPager) container).addView(imageView, 0);
        return imageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager) container).removeView((ImageView) object);
    }

    @Override
    public int getCount() {
        return sliderImageId.length;
    }
}