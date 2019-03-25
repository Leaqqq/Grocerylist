package com.example.grocerylist;

import android.database.sqlite.SQLiteDatabase;

public class Storage {
    private Storage() {
    }

    private static Storage storage;

    public static Storage getInstance() {
        if (storage == null) {
            storage = new Storage();
        }
        return storage;
    }
    private IndkobSQLHelper indkobsqlhelper=IndkobSQLHelper.getInstance();

    public VareKlasse getVare(long id){
        SQLiteDatabase db=indkobsqlhelper.getReadableDatabase(); // Byg videre efter CursorWrapper
    return null;
    }


}
