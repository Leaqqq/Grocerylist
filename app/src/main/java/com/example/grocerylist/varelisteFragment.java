package com.example.grocerylist;

import android.content.Intent;
import android.database.Cursor;
import android.database.CursorWrapper;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import java.util.ArrayList;


public class varelisteFragment extends ListFragment {

    private ArrayList<VareKlasse> theList;
    public VareCursorWrapper cursor = Storage.getInstance().getVarer();
    public ArrayAdapter<VareKlasse> adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        theList = new ArrayList<>();





       while(cursor.moveToNext()){
           theList.add(cursor.getVareKlasse());
           Log.d("LOG KIG HER","VARER: "+cursor.getVareKlasse().vareNavn);
           Log.d("LOG KIG HER","VARER: "+cursor.getVareKlasse().antal);
       }
       cursor.close();


        adapter=new ArrayAdapter<>(inflater.getContext(),android.R.layout.simple_list_item_1,theList);
        setListAdapter(adapter);




        setHasOptionsMenu(true);
        return super.onCreateView(inflater,container,savedInstanceState);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.vareliste_menu, menu);
    }

    public void refreshVareliste(){
       if(adapter!=null){
           adapter.notifyDataSetChanged();
       }
    }
}

