package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class FavoritesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);
        findViewById(R.id.pb1).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inform the user the button has been clicked
                Intent playMusic= new Intent(FavoritesActivity.this,PlayActivity.class);
                startActivity(playMusic);
            }
        });
        findViewById(R.id.pb3).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inform the user the button has been clicked
                Intent playMusic= new Intent(FavoritesActivity.this,PlayActivity.class);
                startActivity(playMusic);
            }
        });
        findViewById(R.id.pb5).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inform the user the button has been clicked
                Intent playMusic= new Intent(FavoritesActivity.this,PlayActivity.class);
                startActivity(playMusic);
            }
        });
        findViewById(R.id.pb7).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inform the user the button has been clicked
                Intent playMusic= new Intent(FavoritesActivity.this,PlayActivity.class);
                startActivity(playMusic);
            }
        });
        findViewById(R.id.pb9).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inform the user the button has been clicked
                Intent playMusic= new Intent(FavoritesActivity.this,PlayActivity.class);
                startActivity(playMusic);
            }
        });
        findViewById(R.id.pb11).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inform the user the button has been clicked
                Intent playMusic= new Intent(FavoritesActivity.this,PlayActivity.class);
                startActivity(playMusic);
            }
        });
        findViewById(R.id.pb13).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inform the user the button has been clicked
                Intent playMusic= new Intent(FavoritesActivity.this,PlayActivity.class);
                startActivity(playMusic);
            }
        });
        findViewById(R.id.pb15).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inform the user the button has been clicked
                Intent playMusic= new Intent(FavoritesActivity.this,PlayActivity.class);
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
        findViewById(R.id.pb12).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inform the user the button has been clicked
                Toast.makeText(getApplicationContext(),"Details",Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.pb14).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inform the user the button has been clicked
                Toast.makeText(getApplicationContext(),"Details",Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.pb16).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inform the user the button has been clicked
                Toast.makeText(getApplicationContext(),"Details",Toast.LENGTH_SHORT).show();
            }
        });

    }

}
