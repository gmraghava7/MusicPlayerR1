package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PlaylistoneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlistone);

        findViewById(R.id.cm5).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inform the user the button has been clicked
                Intent myms = new Intent(PlaylistoneActivity.this,MusicActivity.class);
                startActivity(myms);
            }
        });
        findViewById(R.id.cm6).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inform the user the button has been clicked
                Intent myms = new Intent(PlaylistoneActivity.this,MainActivity.class);
                startActivity(myms);
            }
        });
    }
}
