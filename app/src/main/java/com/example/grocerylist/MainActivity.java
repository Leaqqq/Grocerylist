package com.example.grocerylist;

import android.content.Intent;
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    PagerAdapter PagerAdapter;
    TabItem tabVareliste;
    TabItem tabStandardliste;
    TabItem tabIndkøbsliste1;
    Storage storage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar4);
        toolbar.setTitle("Indkøbs App");
        setSupportActionBar(toolbar);
        IndkobSQLHelper.setApplicationContext(this);
        IndkobSQLHelper db=IndkobSQLHelper.getInstance();
        Storage storage=Storage.getInstance();

        tabLayout = findViewById(R.id.layout);
        tabVareliste = findViewById(R.id.vareliste);
        tabStandardliste = findViewById(R.id.standardindkobsliste);
        tabIndkøbsliste1 = findViewById(R.id.navngivetliste);
        viewPager = findViewById(R.id.viewPager);

        PagerAdapter = new PagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(PagerAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener()
        {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
            viewPager.setCurrentItem(tab.getPosition());
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
                Intent intent1 = new Intent(this,OpretVare.class);
                startActivity(intent1);

                return true;

            case R.id.Navngivetlistemenu:
                Intent intent2 = new Intent(this,OpretNavngivetListe.class);
                startActivity(intent2);
                return true;

            case R.id.standardlistemenu:
                Intent intent3 = new Intent(this,OpretStandardListe.class);
                startActivity(intent3);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }



}
