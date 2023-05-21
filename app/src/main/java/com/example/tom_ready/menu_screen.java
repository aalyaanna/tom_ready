package com.example.tom_ready;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class menu_screen extends AppCompatActivity {
    private Button compassButton;
    private Button hotlineButton;
    private Button planButton;
    private Button updatesButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_screen);

        //compass tool button
        compassButton = (Button) findViewById(R.id.btn_compass);
        compassButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu_screen.this, CompassTool.class);
                startActivity(intent);
            }
        });

        //emergency hotline button
        hotlineButton = (Button) findViewById(R.id.button4_hotline);
        hotlineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu_screen.this, CompassTool.class);
                startActivity(intent);
            }
        });

        //preparedness plan button
        planButton = (Button) findViewById(R.id.button_plan);
        planButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu_screen.this, CompassTool.class);
                startActivity(intent);
            }
        });

        //monitoring updates button
        updatesButton = (Button) findViewById(R.id.button2_updates);
        updatesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu_screen.this, CompassTool.class);
                startActivity(intent);
            }
        });

    }
}
