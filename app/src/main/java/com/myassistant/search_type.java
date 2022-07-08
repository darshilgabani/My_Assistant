package com.myassistant;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.myassistant.keyboard.key_category;

public class search_type extends AppCompatActivity {
    LinearLayout voice,keybord,phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_type);
        getSupportActionBar().hide();
        voice= findViewById(R.id.voice);
        keybord= findViewById(R.id.keybord);
        phone= findViewById(R.id.phone);

        voice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(search_type.this,select_language.class));
            }
        });

        keybord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(search_type.this, key_category.class));

            }
        });

        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(search_type.this, com.myassistant.phone.class));
            }
        });
    }
    @Override
    public void onBackPressed() {
//        super.onBackPressed();
    }
}