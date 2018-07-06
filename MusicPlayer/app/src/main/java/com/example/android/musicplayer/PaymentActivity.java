package com.example.android.musicplayer;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        findViewById(R.id.cm1).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inform the user the button has been clicked
                Toast.makeText(getApplicationContext(),"Your app need to update",Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.cm2).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inform the user the button has been clicked
                Toast.makeText(getApplicationContext(),"Your app need to update",Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.cm3).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inform the user the button has been clicked
                Toast.makeText(getApplicationContext(),"Your app need to update",Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.cm4).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inform the user the button has been clicked
                Toast.makeText(getApplicationContext(),"Your app need to update",Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.cm5).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inform the user the button has been clicked
                Intent myms = new Intent(PaymentActivity.this,MusicActivity.class);
                startActivity(myms);
            }
        });
        findViewById(R.id.cm6).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inform the user the button has been clicked
                Intent myms = new Intent(PaymentActivity.this,MainActivity.class);
                startActivity(myms);
            }
        });
    }

}
