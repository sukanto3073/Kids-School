package com.sukanto.kidsschool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.tomer.fadingtextview.FadingTextView;

public class ABCD_Activity extends AppCompatActivity {

    private AdView mAdView;
    TextView Alphabet,Alphabet_detail;
    ImageView imageView;
    FloatingActionButton next,previous;
    int i=0;
    private int [] image_array={R.drawable.apple,R.drawable.ball,R.drawable.cat,R.drawable.dog,R.drawable.elephant,R.drawable.fish,R.drawable.giraffe,R.drawable.hen,R.drawable.ice_cream,R.drawable.jar,R.drawable.kettle,R.drawable.leaf};
    private String [] alphabet_Key={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abcd);
        getSupportActionBar().setTitle("ABCD");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        google_adds();
        init();
        imageView.setImageResource(image_array[i]);
        previous.setVisibility(View.INVISIBLE);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    ++i;
                    imageView.setImageResource(image_array[i]);
                    Alphabet.setText(alphabet_Key[i]);
                    previous.setVisibility(View.VISIBLE);
                } catch(Exception e){

                }

            }
        });

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    --i;
                    imageView.setImageResource(image_array[i]);
                    Alphabet.setText(alphabet_Key[i]);
                    if (i == 0) {
                        previous.setVisibility(View.INVISIBLE);
                    }

                } catch(Exception e){

                }

            }
        });

    }

    private void google_adds() {
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    public void init(){
        next=findViewById(R.id.next_arrow);
        previous=findViewById(R.id.previous_arrow);
        imageView=findViewById(R.id.image_view);
        Alphabet=findViewById(R.id.alphabet);
        Alphabet_detail=findViewById(R.id.alphabet_detail);
    }
}