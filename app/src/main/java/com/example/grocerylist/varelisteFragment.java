package com.example.grocerylist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;


public class varelisteFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        setHasOptionsMenu(true);
        return inflater.inflate(R.layout.vareliste_fragment, container, false);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.vareliste_menu, menu);
    }

<<<<<<< HEAD
<<<<<<< HEAD
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.varelistemenu) {

            //Skab activity med intent
            return true;

        } else {
            return false;
        }
    }
=======

>>>>>>> 8695d0d3c125f487fb0f09206e0d722a03a636cc
=======

>>>>>>> 8695d0d3c125f487fb0f09206e0d722a03a636cc
}
