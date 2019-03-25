package com.example.grocerylist;

import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    PagerAdapter PagerAdapter;
    TabItem tabVareliste;
    TabItem tabStandardliste;
    TabItem tabIndkøbsliste1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar4);
        toolbar.setTitle("Indkøbsliste App");
        setSupportActionBar(toolbar);

        tabLayout = findViewById(R.id.layout);
        tabVareliste = findViewById(R.id.vareliste);
        tabStandardliste = findViewById(R.id.Standardindkobsliste);
        tabIndkøbsliste1 = findViewById(R.id.Navngivetliste);
        viewPager = findViewById(R.id.viewPager);

        PagerAdapter = new PagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(PagerAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
             //   viewPager.setCurrentItem(tab.getPosition());
            //    if(tab.getPosition() == 1) {
           //         toolbar.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.colorPrimaryDark));
          //          tabLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.colorPrimaryDark));
         //       } else if(tab.getPosition() == 2) {
           //         toolbar.setBackgroundColor(ContextCompat.getColor(MainActivity.this,android.R.color.darker_gray));
          //          tabLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this,android.R.color.darker_gray));
          //      } else {
         //           toolbar.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.colorPrimary));
        ////            tabLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.colorPrimary));
        //        }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }


}
