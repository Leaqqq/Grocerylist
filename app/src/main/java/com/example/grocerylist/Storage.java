package com.example.grocerylist;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class Storage {
    private Storage() {
    }

    private static Storage storage;

    public static Storage getInstance() {
        if (storage == null) {
            storage = new Storage();
            storage.initStorage();
        }
        return storage;
    }

    private IndkobSQLHelper indkobsqlhelper = IndkobSQLHelper.getInstance();

    public VareKlasse getVare(long id) {
        SQLiteDatabase db = indkobsqlhelper.getReadableDatabase();
        Cursor cursor = db.query("VAREKLASSE",
                new String[]{"_id", "VARENAVN", "ANTAL", "ERSTANDARD", "KOMMENTAR"}, "_id=?", new String[]{"" + id}, null, null, null);
        VareKlasse vareKlasse = new VareCursorWrapper(cursor).getVareKlasse();
        cursor.close();
        return vareKlasse;
    }

    public VareCursorWrapper getVarer() {
        SQLiteDatabase db = indkobsqlhelper.getReadableDatabase();
        Cursor cursor = db.query("VAREKLASSE",
                new String[]{"_id", "VARENAVN", "ANTAL", "ERSTANDARD", "KOMMENTAR"}, null, null, null, null, null);
        return new VareCursorWrapper(cursor);
    }

    public long addVareKlasse(VareKlasse vareKlasse) {
        SQLiteDatabase db = indkobsqlhelper.getWritableDatabase();
        ContentValues vareValues = new ContentValues();
        vareValues.put("VARENAVN", vareKlasse.getName());
        vareValues.put("ANTAL", vareKlasse.getAntal());
        vareValues.put("ERSTANDARD", vareKlasse.getErStandardVare());
        vareValues.put("KOMMENTAR", vareKlasse.getKommentar());
        return db.insert("VAREKLASSE", null, vareValues);

    }

    private void initStorage() {
        if (getVarer().getCount() == 0) {
            addVareKlasse(new VareKlasse("Agurk", 1, 3, "Frugt"));
            addVareKlasse(new VareKlasse("Løg", 1, 2, "Grøntsag"));
            addVareKlasse(new VareKlasse("Agurk2",1,4,"Frugt"));
        }
    }
    /*private void initStorage() {
        if (getDrinks().getCount() == 0) {
            addDrink(new Drink("Latte", "Espresso and steamed milk", R.drawable.latte));
            addDrink(new Drink("Cappuccino", "Espresso, hot milk and steamed-milk foam",
                    R.drawable.cappuccino));
            addDrink(new Drink("Filter", "Our best drip coffee", R.drawable.filter));
        }
    }*/
}
