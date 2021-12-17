package com.sukanto.kidsschool;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;


import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;


public class youtubePlay extends AppCompatActivity {
    String videoId;
    ImageView imageView;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube_play);
        getSupportActionBar().hide();
        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        getLifecycle().addObserver(youTubePlayerView);
        imageView=findViewById(R.id.imageView2);
        getSupportActionBar().setTitle("Bangla chora");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {

            @Override
            public void onReady(YouTubePlayer youTubePlayer) {

                //Intent intent = getIntent();
               // GetUrl = intent.getStringExtra("CodeURL");

                Bundle bundle = getIntent().getExtras();
                if (bundle != null) {
                    videoId=bundle.getString("CodeURL");
                    if (videoId!=null){
                        youTubePlayer.loadVideo(videoId, 0);
                        youTubePlayer.play();
                        youTubePlayer.cueVideo(videoId,0);

                    }
                    int resId = bundle.getInt("ImgId");
                    imageView.setImageResource(resId);
                }



            }
        });


        }




    }
