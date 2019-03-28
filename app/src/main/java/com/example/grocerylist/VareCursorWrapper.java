package com.example.grocerylist;

import android.database.Cursor;
import android.database.CursorWrapper;

public class VareCursorWrapper extends CursorWrapper {
    public VareCursorWrapper(Cursor cursor) {
        super(cursor);
    }

    public VareKlasse getVareKlasse() {
        /*if (!moveToFirst()) {
            return null;
        }*/
        
        long id =getLong(getColumnIndex("_id"));
        String vareNavn=getString(getColumnIndex("VARENAVN"));
        int antal=getInt(getColumnIndex("ANTAL"));
        int erStandard=getInt(getColumnIndex("ERSTANDARD"));
        String kommentar=getString(getColumnIndex("KOMMENTAR"));
        return new VareKlasse(id,vareNavn,antal,erStandard,kommentar);
    }
}
