package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PlaylistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);
        findViewById(R.id.pl1).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inform the user the button has been clicked
                Intent pl1 = new Intent(PlaylistsActivity.this,PlaylistoneActivity.class);
                startActivity(pl1);
            }
        });
        findViewById(R.id.pl2).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inform the user the button has been clicked
                Toast.makeText(getApplicationContext(),"No songs",Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.pl3).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inform the user the button has been clicked
                Toast.makeText(getApplicationContext(),"No songs",Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.pl4).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inform the user the button has been clicked
                Toast.makeText(getApplicationContext(),"No songs",Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.pl5).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inform the user the button has been clicked
                Toast.makeText(getApplicationContext(),"No songs",Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.pl6).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inform the user the button has been clicked
                Toast.makeText(getApplicationContext(),"No songs",Toast.LENGTH_SHORT).show();
            }
        });

    }
    }
