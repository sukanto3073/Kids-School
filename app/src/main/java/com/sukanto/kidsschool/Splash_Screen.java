package com.sukanto.kidsschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.github.ybq.android.spinkit.sprite.Sprite;
import com.github.ybq.android.spinkit.style.WanderingCubes;

public class Splash_Screen extends AppCompatActivity {

    ImageView imageView;
    ProgressBar progressBar;
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();


        Thread thread= new Thread(){


            public void run() {
                try {
                    sleep(4000);

                }catch (Exception exception){
                    exception.printStackTrace();
                }

                finally{
                    Intent intent= new Intent(Splash_Screen.this,MainActivity2.class);
                    startActivity(intent);
                    finish();
                }
            }
        };thread.start();
    }


    }
