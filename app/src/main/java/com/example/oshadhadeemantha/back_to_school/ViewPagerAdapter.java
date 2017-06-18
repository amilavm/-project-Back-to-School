package com.example.oshadhadeemantha.back_to_school;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;

/**
 * Created by OshadhaDeemantha on 6/18/2017.
 */

public class ViewPagerAdapter extends PagerAdapter {

    private Context context;
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return false;
    }
}
