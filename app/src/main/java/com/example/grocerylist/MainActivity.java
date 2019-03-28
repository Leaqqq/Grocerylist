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
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    PagerAdapter PagerAdapter;
    TabItem tabVareliste;
    TabItem tabStandardliste;
    TabItem tabIndkøbsliste1;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar4);
        toolbar.setTitle("Indkøbs App");
        setSupportActionBar(toolbar);
        IndkobSQLHelper.setApplicationContext(this);
        IndkobSQLHelper db=IndkobSQLHelper.getInstance();
        final Storage storage = Storage.getInstance();

        tabLayout = findViewById(R.id.layout);
        tabVareliste = findViewById(R.id.vareliste);
        tabStandardliste = findViewById(R.id.standardindkobsliste);
        tabIndkøbsliste1 = findViewById(R.id.navngivetliste);
        viewPager = findViewById(R.id.viewPager);
        button = findViewById(R.id.buttonOpretVare);

        PagerAdapter = new PagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(PagerAdapter);

        Button button = findViewById(R.id.buttonOpretVare);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText vareNavn = v.findViewById(R.id.editText);
                EditText antal = v.findViewById(R.id.editText2);
                String vare = antal.getText().toString() + " " + vareNavn.getText().toString();
                storage.addVareKlasse(new VareKlasse(vare));
                varelisteFragment.loadData();
            }
        });

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
    AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        Log.d("Button click", "addAction:  button Clicked");
    LayoutInflater inflater = MainActivity.this.getLayoutInflater();
    final View dialogView = inflater.inflate(R.layout.dialog_add, null);
        dialog.setView(R.layout.dialog_add);
        dialog.setPositiveButton("Confirm", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            Dialog d1 = (Dialog)dialog;
            TextView inputName = d1.findViewById(R.id.dialog_name);

            if(position == 0){
                Log.d("ShoppingList Name", "onClick: " + inputName.toString());
                String name = inputName.getText().toString();
                dialog.dismiss();
                Log.d("Dialog dismissed", "onClick: " + name);
                storage.insertShoppingList(new ShoppingList(name));
                ShoppinglistFragment.loadData();

            }
            if(position == 1){
                Log.d("Product Name", "onClick: " + inputName.getText());
                String name = inputName.getText().toString();
                dialog.dismiss();
                storage.insertProduct(new Product(name));
                ProductListFragment.loadData();
//
            }

        }
    });
        if(position == 0){
        dialog.setTitle("Add ShoppingList");
    }
        if(position == 1){
        dialog.setTitle("Add Product");
    }
        dialog.setNegativeButton("cancel", null);
        dialog.show();
}
}

