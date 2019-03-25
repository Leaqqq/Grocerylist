package com.example.grocerylist;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    int numberOfTabs;

    public PagerAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.numberOfTabs = numberOfTabs;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {

            case 0:
                return new varelisteFragment();
            case 1:
                return new standardlisteFragment();
            case 2:
                return new indkobslisteFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
