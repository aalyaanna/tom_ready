package com.example.tom_ready;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class preparedness_plan_main_screen extends AppCompatActivity {

    private Button buttonfire;
    private Button buttonflood;
    private Button buttonearthquake;
    private Button buttonlandslide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preparedness_plan_main_screen);
        buttonearthquake = ( Button) findViewById(R.id.earthquakebtn);
        buttonearthquake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(preparedness_plan_main_screen.this,EarthquakeScreen.class);
                startActivity(intent);
            }
        });

        buttonflood = ( Button) findViewById(R.id.floodbtn);
        buttonflood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(preparedness_plan_main_screen.this,FloodScreen.class);
                startActivity(intent);
            }
        });


        buttonlandslide = ( Button) findViewById(R.id.landslidebtn);
        buttonlandslide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(preparedness_plan_main_screen.this,LandslideScreen.class);
                startActivity(intent);
            }
        });

        buttonfire = ( Button) findViewById(R.id.firebtn);
        buttonfire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(preparedness_plan_main_screen.this,FireScreen.class);
                startActivity(intent);

            }

        });
    }
}