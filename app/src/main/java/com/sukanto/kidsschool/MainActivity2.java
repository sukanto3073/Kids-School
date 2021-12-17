package com.sukanto.kidsschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class MainActivity2 extends AppCompatActivity {
Intent intent;
private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }

    public void Chora(View view) {
        intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.side_in_right,R.anim.side_out_left);

    }

    public void ABCD(View view) {
        intent = new Intent(this,ABCD_Activity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.side_in_right,R.anim.side_out_left);
    }

    public void Number(View view) {
        intent = new Intent(this,Number.class);
        startActivity(intent);
        overridePendingTransition(R.anim.side_in_right,R.anim.side_out_left);
    }

    public void Bangla(View view) {
        intent = new Intent(this,Bangla.class);
        startActivity(intent);
        overridePendingTransition(R.anim.side_in_right,R.anim.side_out_left);
    }
}