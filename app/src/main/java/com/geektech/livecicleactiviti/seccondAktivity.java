package com.geektech.livecicleactiviti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class seccondAktivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seccond_aktivity);
        String text = getIntent().getStringExtra("key1");
        ((TextView)findViewById(R.id.text_view)).setText( text);
        Log.d("shamal", "onCreate seccondActivity");

    }
        @Override
        protected void onStart () {
            super.onStart();
            Log.d("shamal", "onStart seccondActivity");
        }

        @Override
        protected void onResume () {
            super.onResume();
            Log.d("shamal", "onResume seccondActivity");
        }

        @Override
        protected void onPause () {
            super.onPause();
            Log.d("shamal", "onPause seccondActivity");
        }

        @Override
        protected void onStop () {
            super.onStop();
            Log.d("shamal", "onStop seccondActivity");
        }

        @Override
        protected void onRestart () {
            super.onRestart();
            Log.d("shamal", "onRestart seccondActivity");
        }

        @Override
        protected void onDestroy () {
            super.onDestroy();
            Log.d("shamal", "onDestroyseccondActivity");


        }
    }

