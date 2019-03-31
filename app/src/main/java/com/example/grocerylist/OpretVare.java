package com.example.grocerylist;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class OpretVare extends AppCompatActivity {
    Storage storage=Storage.getInstance();
    varelisteFragment fragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.opretvare);


    }

    public void onClickOpret(View view) {
        EditText TextVarenavn = findViewById(R.id.idVarenavn);
        EditText TextAntal = findViewById(R.id.idAntal);
        EditText TextStandardvare = findViewById(R.id.idStandardvare);
        EditText TextKommentar = findViewById(R.id.idKommentar);

        String varenavn = TextVarenavn.getText().toString();
        String antalString = TextAntal.getText().toString();
        int antal = Integer.parseInt(antalString);
        String standardString=TextStandardvare.getText().toString();
        int standardvare=Integer.parseInt(standardString);
        String kommentar=TextKommentar.getText().toString();

        storage.addVareKlasse(new VareKlasse(varenavn,antal,standardvare,kommentar));
         // fragment.refreshVareliste();


    }

}
