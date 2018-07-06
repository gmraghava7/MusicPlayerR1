package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.mp1).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inform the user the button has been clicked
                Intent music= new Intent(MainActivity.this,MusicActivity.class);
                startActivity(music);
            }
        });

        findViewById(R.id.mp2).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inform the user the button has been clicked
                Intent playMusic= new Intent(MainActivity.this,PlayActivity.class);
                startActivity(playMusic);
            }
        });

        findViewById(R.id.mp3).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inform the user the button has been clicked
                Intent onlineMusic= new Intent(MainActivity.this,OnlineMusicActivity.class);
                startActivity(onlineMusic);;
            }
        });

        findViewById(R.id.mp4).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inform the user the button has been clicked
                Intent favorites = new Intent(MainActivity.this,FavoritesActivity.class);
                startActivity(favorites);
            }
        });
        findViewById(R.id.mp5).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inform the user the button has been clicked
                Intent playlists = new Intent(MainActivity.this,PlaylistsActivity.class);
                startActivity(playlists);
            }
        });
        findViewById(R.id.mp6).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inform the user the button has been clicked
                Toast.makeText(getApplicationContext(),"No Downloads",Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.pb1).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inform the user the button has been clicked
                Intent playMusic= new Intent(MainActivity.this,PlayActivity.class);
                startActivity(playMusic);
            }
        });
        findViewById(R.id.pb3).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inform the user the button has been clicked
                Intent playMusic= new Intent(MainActivity.this,PlayActivity.class);
                startActivity(playMusic);
            }
        });
        findViewById(R.id.pb5).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inform the user the button has been clicked
                Intent playMusic= new Intent(MainActivity.this,PlayActivity.class);
                startActivity(playMusic);
            }
        });
        findViewById(R.id.pb7).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inform the user the button has been clicked
                Intent playMusic= new Intent(MainActivity.this,PlayActivity.class);
                startActivity(playMusic);
            }
        });
        findViewById(R.id.pb9).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inform the user the button has been clicked
                Intent playMusic= new Intent(MainActivity.this,PlayActivity.class);
                startActivity(playMusic);
            }
        });
        findViewById(R.id.pb2).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inform the user the button has been clicked
                Toast.makeText(getApplicationContext(),"Details",Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.pb4).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inform the user the button has been clicked
                Toast.makeText(getApplicationContext(),"Details",Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.pb6).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inform the user the button has been clicked
                Toast.makeText(getApplicationContext(),"Details",Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.pb8).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inform the user the button has been clicked
                Toast.makeText(getApplicationContext(),"Details",Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.pb10).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inform the user the button has been clicked
                Toast.makeText(getApplicationContext(),"Details",Toast.LENGTH_SHORT).show();
            }
        });

    }

}
