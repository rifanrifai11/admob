package com.rifan.adsense_application;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class AdmobBanner extends AppCompatActivity {
    // Remove the below line after defining your own ad unit ID.

    AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.banner_admob);

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
//                Menambahkan Device Test ID dengan cara yg telah ada pada modul
                .addTestDevice("82F617467912677B7C6DDD13094C2CE3")
                .build();
        mAdView.loadAd(adRequest);
        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdFailedToLoad(int errorCode) {
                Toast.makeText(getApplicationContext(),"Ad Failed to load",Toast.LENGTH_SHORT).show();
                // Code to be executed when an ad request fails.
            }
        });
    }
}
