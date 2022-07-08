package com.myassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class category extends AppCompatActivity {
    LinearLayout shopping, googlesapp, music, socialmedia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_category);
        shopping = findViewById(R.id.shopping);
        googlesapp = findViewById(R.id.googlesapp);
        music = findViewById(R.id.music);
        socialmedia = findViewById(R.id.socialmedia);

        shopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(category.this, shopping.class));
            }
        });
        googlesapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(category.this, google.class));
            }
        });
        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(category.this, music.class));

            }
        });
        socialmedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(category.this, socialmedia.class));
            }
        });
    }

}