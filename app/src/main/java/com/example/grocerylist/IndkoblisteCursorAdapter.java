package com.example.grocerylist;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.widget.SimpleCursorAdapter;

public class IndkoblisteCursorAdapter extends SimpleCursorAdapter {


    IndkoblisteCursorAdapter(Context context,int layout,Cursor c,String[] from, int[] to,int flags){
        super(context,layout,c,from,to,flags);
    }

    @Override
    public void bindView(View view,final Context context,Cursor cursor){
        super.bindView(view,context,cursor);
    }

}
