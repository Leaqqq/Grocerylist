package com.example.grocerylist;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;


public class IndkobSQLHelper extends SQLiteOpenHelper {
    private static final String DB_NAME = "indkob"; // the name of our database
    private static final int DB_VERSION = 2; // the version of the database
    private static Context applicationContext;

    public static void setApplicationContext(Context context) {
        applicationContext = context.getApplicationContext();
    }

    private static IndkobSQLHelper indkobSQLhelper;

    private IndkobSQLHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    public static IndkobSQLHelper getInstance() {
        if (indkobSQLhelper == null) {
            indkobSQLhelper = new IndkobSQLHelper(applicationContext);
        }
        return indkobSQLhelper;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        updateMyDatabase(db,0,DB_VERSION);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    private void updateMyDatabase(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (oldVersion < 1) {
            db.execSQL("CREATE TABLE VAREKLASSE (_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + "VARENAVN TEXT)");
            db.execSQL("CREATE TABLE INDKOBSLISTEKLASSE (_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "NAVN TEXT)");

        }
        if(oldVersion<2){
        db.execSQL("ALTER TABLE VARE ADD COLUMN FAVOURITE NUMERIC");
        }
    }
}
