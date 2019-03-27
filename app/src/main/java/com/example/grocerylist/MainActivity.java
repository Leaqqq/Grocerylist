package com.example.grocerylist;

import android.content.Intent;
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;
import android.view.MenuItem;


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
        toolbar.setTitle("Indkøbs App");
        setSupportActionBar(toolbar);

        tabLayout = findViewById(R.id.layout);
        tabVareliste = findViewById(R.id.vareliste);
        tabStandardliste = findViewById(R.id.Standardindkobsliste);
        tabIndkøbsliste1 = findViewById(R.id.Navngivetliste);
        viewPager = findViewById(R.id.viewPager);

        PagerAdapter = new PagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(PagerAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener()
        {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

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
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.varelistemenu:
                Intent intent=new Intent(this,OpretVare.class);
                startActivity(intent);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }
<<<<<<< HEAD


    public void navngivetlisteButtonClick(MenuItem item) {

    }

    public void standardlisteButtonClick(MenuItem item) {

    }
    public void varelisteButtonClick(MenuItem item) {

    }
=======
>>>>>>> 8695d0d3c125f487fb0f09206e0d722a03a636cc


}
