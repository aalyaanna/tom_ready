package com.example.tom_ready;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EarthquakeScreen extends AppCompatActivity {

    Button backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earthquake_screen);

        backbtn = findViewById(R.id.callemergencybtn);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EarthquakeScreen.this, preparedness_plan_main_screen.class);
                startActivity(intent);
                finish();
            }
        });
    }


}