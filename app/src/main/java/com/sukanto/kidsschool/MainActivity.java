package com.sukanto.kidsschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Intent intent;
    ImageView ammpata,atagaje,vorholo_dorkholo,aye_bristi,oi_dekhajai,noton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ammpata=findViewById(R.id.ammpata);
        atagaje=findViewById(R.id.atagaje);
        vorholo_dorkholo=findViewById(R.id.vorholo_dorkholo);
        aye_bristi=findViewById(R.id.aye_bristi_jhepe);
        oi_dekhajai=findViewById(R.id.oi_dekhajai);
        noton=findViewById(R.id.noton_paira);
        getSupportActionBar().setTitle("বাংলা ছড়া ");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    public void OnAction(View view) {

        switch (view.getId()) {
            case R.id.ammpata:

                String ammurl = "bE4NYNiuh-o";
                GotoAction(ammurl,R.drawable.amm_pata_videoview);
                break;
            case R.id.atagaje:
                String atagacgeurl = "95S00tAh25c";
                GotoAction(atagacgeurl,R.drawable.ata_gache_videoview);
                break;
            case R.id.vorholo_dorkholo:
                String vorholourl = "pkN0RRYqdco";
                GotoAction(vorholourl,R.drawable.vorholo_videoview);
                break;
            case R.id.aye_bristi_jhepe:
                String aye_bristiurl = "9yX8TEagWfU";
                GotoAction(aye_bristiurl,R.drawable.aybristivideoview);
                break;
            case R.id.oi_dekhajai:
                String oi_dekhajaiurl = "_vP-sb7kDFA";
                GotoAction(oi_dekhajaiurl,R.drawable.oidekhajai_videoview);
                break;
            case R.id.noton_paira:
                String pairaurl = "1EqC3atmmus";
                GotoAction(pairaurl,R.drawable.noton_videoview);
                break;
            case R.id.aichelera:
                String aicheleraurl = "OpxNlavCy54";
                GotoAction(aicheleraurl,R.drawable.aichelera_videoview);
                break;
            case R.id.itol_bitol:
                String itolaurl = "BZUN-wTbGl4";
                GotoAction(itolaurl,R.drawable.itol_videoview);
                break;
            case R.id.aireaitiye:
                String aireaitiyeurl = "IsTeTwXvwNw";
                GotoAction(aireaitiyeurl,R.drawable.aireaitiye_videoview);
                break;
            case R.id.katbiriyali:
                String katbiriyaliurl = "FfF2qB75cTI";
                GotoAction(katbiriyaliurl,R.drawable.katbiriyali_videoview);
                break;
            case R.id.chadmama:
                String chadmamaurl = "LDTJ3mCGXaU";
                GotoAction(chadmamaurl,R.drawable.aiaichadmama_videoview);
                break;
            case R.id.hatimatim_tim:
                String hatimatim_timurl = "fcC7PpL2tYg";
                GotoAction(hatimatim_timurl,R.drawable.hattimatim_videoview);
                break;
            case R.id.chaduthache:
                String chaduthacheurl = "SJjEmSNfmBk";
                GotoAction(chaduthacheurl,R.drawable.chand_utheche_videoview);
                break;
            case R.id.megerkol:
                String megerkolurl = "McWMgRZ0n1M";
                GotoAction(megerkolurl ,R.drawable.megerkol_videoview);
                break;
            case R.id.tatirbari:
                String tatirbariurl = "YbK0n7VapWY";
                GotoAction(tatirbariurl ,R.drawable.tatir_videoview);
                break;
            case R.id.sonanace:
                String sonanaceurl = "to8jRGYfx7E";
                GotoAction(sonanaceurl ,R.drawable.sonanace_videoview);
                break;
            case R.id.agdumbagdum:
                String agdumurl = "nXiZ9QOzuvo";
                GotoAction(agdumurl ,R.drawable.aiaichadmama_videoview);
                break;


        }


    }
    public void  GotoAction(String setUrl,int ImgName){
        intent = new Intent(MainActivity.this,youtubePlay.class);
        intent.putExtra("CodeURL", setUrl);
        intent.putExtra("ImgId", ImgName);
        startActivity(intent);
        overridePendingTransition(R.anim.side_in_right,R.anim.side_out_left);
    }



}
