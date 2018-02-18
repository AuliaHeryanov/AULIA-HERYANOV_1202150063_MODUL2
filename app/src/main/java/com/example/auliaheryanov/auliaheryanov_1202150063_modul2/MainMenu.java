package com.example.auliaheryanov.auliaheryanov_1202150063_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainMenu extends AppCompatActivity {

    private RadioGroup radioMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        radioMain = (RadioGroup)findViewById(R.id.radiobutton);
        Toast.makeText(this,"Aulia Heryanov_1202150063",Toast.LENGTH_SHORT).show();
    }

    public void next(View view) {
        int radio = radioMain.getCheckedRadioButtonId();
        switch (radio){
            case R.id.radioDinein:
                Toast.makeText(this,"Dine In",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this,DineIn.class)); break;
            case R.id.radioTakeaway:
                Toast.makeText(this,"Take Away",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this,TakeAway.class)); break;
            default:break;}
    }
}
