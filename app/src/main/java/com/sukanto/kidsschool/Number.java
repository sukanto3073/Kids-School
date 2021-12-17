package com.sukanto.kidsschool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class Number extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        getSupportActionBar().setTitle("বাংলা সংখ্যা/ইংরেজি সংখ্যা");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment,new BanglaFragment()).commit();
    }

    public void BanglaNumber(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment,new BanglaFragment()).commit();

    }

    public void EnglishNumber(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment,new EnglishFragment()).commit();
    }
}