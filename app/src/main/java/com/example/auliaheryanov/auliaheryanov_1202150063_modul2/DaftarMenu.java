package com.example.auliaheryanov.auliaheryanov_1202150063_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class DaftarMenu extends AppCompatActivity {

    private RecyclerView recyclerView; //membuat variabel recycleview
    private MenuAdapter menuAdapter; //membuat variabel menu adapter

    public static ArrayList<MenuModel> menuList; //membuat variabel untuk array list

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);

        menuList = isiMenu(); //
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        menuAdapter = new MenuAdapter(menuList);
        recyclerView.setAdapter(menuAdapter);
//        recyclerView.addOnItemTouchListener(new RecycleView.Item);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public ArrayList<MenuModel> isiMenu(){
        ArrayList<MenuModel> data = new ArrayList<>();
        //MenuModel(String nama, int harga, int gambar, String deskripsi)
        data.add(new MenuModel("Asam Padeh Daging", 25000, R.drawable.asampadehdaging, "Daging sapi dengan kuah asam pedas"));
        data.add(new MenuModel("Asam Padeh Ikan", 19000, R.drawable.asampadehikan, "Ikan tongkol dengan kuah asam pedas"));
        data.add(new MenuModel("Ayam Bakar", 17000, R.drawable.ayambakar, "Ayam dibakar"));
        data.add(new MenuModel("Gulai Kikil", 16000, R.drawable.gulaikikil, "Kikil sapi disiram dengan kuah gulai"));
        data.add(new MenuModel("Rendang Daging", 25000, R.drawable.rendangdaging, "Daging sapi dengan segala rempah khas minang"));
        data.add(new MenuModel("Gulai Daun Singkong", 9000, R.drawable.gulaidaunsingkong, "Daung singkong direbus didalam kuah gulai"));
        return data;
    }
}

