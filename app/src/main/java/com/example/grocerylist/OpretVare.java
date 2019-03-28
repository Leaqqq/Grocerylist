package com.example.grocerylist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class OpretVare extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.opretvare);

        Button button = findViewById(R.id.buttonOpretVare);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
    });

    }
}
