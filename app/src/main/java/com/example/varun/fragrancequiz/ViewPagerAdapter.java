package com.example.varun.fragrancequiz;

import android.app.Activity;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by varun on 17/8/15.
 */
public class ViewPagerAdapter extends PagerAdapter {

    Activity activity;
    String[] colors;

    public ViewPagerAdapter(Activity activity, String[] colors) {
        this.activity = activity;
        this.colors = colors;
    }

    @Override
    public int getCount() {
        return colors.length;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        return super.instantiateItem(container, position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return false;
    }

    @Override
    public Parcelable saveState() {
        return super.saveState();
    }
}
