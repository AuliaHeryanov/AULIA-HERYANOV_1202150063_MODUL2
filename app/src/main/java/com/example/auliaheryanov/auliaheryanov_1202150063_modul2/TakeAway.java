package com.example.auliaheryanov.auliaheryanov_1202150063_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TakeAway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);
    }
    public void buttonTakeAway(View view){
        startActivity(new Intent(this, DaftarMenu.class));
    }

}
