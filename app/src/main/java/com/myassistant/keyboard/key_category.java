package com.myassistant.keyboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.myassistant.R;

public class key_category extends AppCompatActivity {
    LinearLayout shopping, googlesapp, music, socialmedia;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_key_category);
        getSupportActionBar().hide();
        shopping = findViewById(R.id.shopping);
        googlesapp = findViewById(R.id.googlesapp);
        music = findViewById(R.id.music);
        socialmedia = findViewById(R.id.socialmedia);


        shopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(key_category.this, key_shopping.class));
            }
        });
        googlesapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(key_category.this, key_google.class));
            }
        });
        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(key_category.this, key_music.class));

            }
        });
        socialmedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(key_category.this, key_socialmedia.class));
            }
        });
    }
}