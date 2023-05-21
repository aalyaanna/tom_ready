package com.example.tom_ready;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class main_menu extends AppCompatActivity {

    private Button compassButton;
    private Button hotlineButton;
    private Button planButton;
    private Button updatesButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        //compass tool button
        compassButton = (Button) findViewById(R.id.btn_compass);
        compassButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(main_menu.this, compasstool.class);
                startActivity(intent);
            }
        });

        //emergency hotline button
        hotlineButton = (Button) findViewById(R.id.button4_hotline);
        hotlineButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(main_menu.this, compasstool.class);
                startActivity(intent);
            }
        });

        //preparedness plan button
        planButton = (Button) findViewById(R.id.button_plan);
        planButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(main_menu.this, preparedness_plan_main_screen.class);
                startActivity(intent);
            }
        });

        //monitoring updates button
        updatesButton = (Button) findViewById(R.id.button2_updates);
        updatesButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(main_menu.this, compasstool.class);
                startActivity(intent);
            }
        });
    }
}