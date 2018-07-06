package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        findViewById(R.id.pa1).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inform the user the button has been clicked
                Toast.makeText(getApplicationContext(),"Previous song",Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.pa2).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inform the user the button has been clicked
                Toast.makeText(getApplicationContext(),"play/pause",Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.pa3).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inform the user the button has been clicked
                Toast.makeText(getApplicationContext(),"Next song",Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.cm5).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inform the user the button has been clicked
                Intent myms = new Intent(PlayActivity.this,MusicActivity.class);
                startActivity(myms);
            }
        });
        findViewById(R.id.cm6).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inform the user the button has been clicked
                Intent myms = new Intent(PlayActivity.this,MainActivity.class);
                startActivity(myms);
            }
        });

    }

}
