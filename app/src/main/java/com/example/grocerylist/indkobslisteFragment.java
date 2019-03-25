package com.example.grocerylist;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link indkobslisteFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link indkobslisteFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class indkobslisteFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        setHasOptionsMenu(true);
        return inflater.inflate(R.layout.indkobsliste_fragment, container, false);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.navngivetliste_menu,menu);
    }

    //   @Override
  //  public boolean onOptionsItemSelected(MenuItem item) {
   //     if(item.getItemId() == R.id.)
   // }
}
