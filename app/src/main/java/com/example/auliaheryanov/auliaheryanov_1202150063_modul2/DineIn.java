package com.example.auliaheryanov.auliaheryanov_1202150063_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class DineIn extends AppCompatActivity {

    private Spinner noMeja;
    private TextView nama;
    private String lblNoMeja;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);

        nama = (TextView)findViewById(R.id.name);
        noMeja = (Spinner)findViewById(R.id.spinnerMeja);
        ArrayList<String> list = dataMeja();
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        noMeja.setAdapter(dataAdapter);
    }

    public ArrayList<String> dataMeja(){
        int maks = 20;
        ArrayList<String> data = new ArrayList<>();
        for(int i=1; i<=maks;i++){data.add("Meja "+i);}
        return data;
    }

    public void buttonDine(View view) {
        String nomejax, namax;
        nomejax = String.valueOf(noMeja.getSelectedItem());
        namax = nama.getText().toString();
        Toast.makeText(this, nomejax+" atas Nama "+namax+" Dipilih", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, DaftarMenu.class));

    }
}
