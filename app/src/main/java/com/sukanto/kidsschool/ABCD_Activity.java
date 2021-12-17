package com.sukanto.kidsschool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.tomer.fadingtextview.FadingTextView;

public class ABCD_Activity extends AppCompatActivity {

    FadingTextView fadingTextView;
    String[] text
            = { "A", "B",
            "C", "D", "E",
            "F", "G","H", "I",
            "J", "K", "L",
            "M", "N", "O", "P",
            "Q", "R", "S",
            "T", "U","V", "W",
            "X", "Y", "Z"
               };
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abcd);
        getSupportActionBar().setTitle("ABCD");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        fadingTextView
                = findViewById(R.id.fadingTextView);
        fadingTextView.setTexts(text);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
}