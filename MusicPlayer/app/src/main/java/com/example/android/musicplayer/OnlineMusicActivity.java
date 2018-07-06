package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OnlineMusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_music);
        findViewById(R.id.cm).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inform the user the button has been clicked
                Intent playMusic= new Intent(OnlineMusicActivity.this,PaymentActivity.class);
                startActivity(playMusic);
            }
        });
        findViewById(R.id.cm5).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inform the user the button has been clicked
                Intent myms = new Intent(OnlineMusicActivity.this,MusicActivity.class);
                startActivity(myms);
            }
        });
        findViewById(R.id.cm6).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inform the user the button has been clicked
                Intent myms = new Intent(OnlineMusicActivity.this,MainActivity.class);
                startActivity(myms);
            }
        });

    }
}
