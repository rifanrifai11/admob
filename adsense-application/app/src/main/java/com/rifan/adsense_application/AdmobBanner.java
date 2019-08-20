package com.rifan.adsense_application;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.mediation.admob.AdMobExtras;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.provider.Settings;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class AdmobBanner extends AppCompatActivity {
    // Remove the below line after defining your own ad unit ID.

    AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admob);

        MobileAds.initialize(this,
                "ca-app-pub-9336656000959615~7058255454");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice("#########")
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
