package com.myassistant;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.myassistant.phone_category.p_sms;
import com.myassistant.phone_language.lang_VtoT;
import com.myassistant.phone_language.lang_translate;

public class phone extends AppCompatActivity {
    LinearLayout call, sms, vtot, translate;
//     SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);
        getSupportActionBar().hide();
        call = findViewById(R.id.call);
        sms = findViewById(R.id.sms);
        vtot = findViewById(R.id.vtot);
        translate = findViewById(R.id.translate);

//        sp = getSharedPreferences("MyP",MODE_PRIVATE);


        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(phone.this, com.myassistant.phone_category.p_call.class));
            }
        });
        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(phone.this, p_sms.class));
            }
        });
        vtot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(phone.this, lang_VtoT.class));
            }
        });
        translate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(phone.this, lang_translate.class));
            }
        });



    }


}