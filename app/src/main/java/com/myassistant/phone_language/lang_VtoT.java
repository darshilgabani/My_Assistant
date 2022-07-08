package com.myassistant.phone_language;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.myassistant.R;
import com.myassistant.Utils;
import com.myassistant.phone_category.p_VtoT;

public class lang_VtoT extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    ImageView button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lang_vtot);
        button = findViewById(R.id.button);
        getSupportActionBar().hide();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(lang_VtoT.this, p_VtoT.class));
            }
        });

        Spinner sec_spinner = findViewById(R.id.sec_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(lang_VtoT.this, R.array.spinner_item, R.layout.color_spinner_layout);
        adapter.setDropDownViewResource(R.layout.spinner_dropdown_layout);
        sec_spinner.setAdapter(adapter);
        sec_spinner.setOnItemSelectedListener(lang_VtoT.this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long id) {
//        Toast.makeText(this, adapterView.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
        String s = adapterView.getSelectedItem().toString();

        if (s.equals("Amharic")) {
//            Toast.makeText(this, "Your Select Language Amharic", Toast.LENGTH_SHORT).show();
            Utils.Language = "am";
        } else if (s.equals("Arabic")) {
//            Toast.makeText(this, "Your Select Language Arabic", Toast.LENGTH_SHORT).show();
            Utils.Language = "ar";
        } else if (s.equals("Basque")) {
//            Toast.makeText(this, "Your Select Language Basque", Toast.LENGTH_SHORT).show();
            Utils.Language = "eu";
        } else if (s.equals("Bengali")) {
//            Toast.makeText(this, "Your Select Language Bengali", Toast.LENGTH_SHORT).show();
            Utils.Language = "bn";
        } else if (s.equals("English (UK)")) {
//            Toast.makeText(this, "Your Select Language English (UK)", Toast.LENGTH_SHORT).show();
            Utils.Language = "en-GB";
        } else if (s.equals("Portuguese (Brazil)")) {
//            Toast.makeText(this, "Your Select Language Portuguese (Brazil)", Toast.LENGTH_SHORT).show();
            Utils.Language = "pt-BR";
        } else if (s.equals("Bulgarian")) {
//            Toast.makeText(this, "Your Select Language Bulgarian", Toast.LENGTH_SHORT).show();
            Utils.Language = "bg";
        } else if (s.equals("Catalan")) {
//            Toast.makeText(this, "Your Select Language Catalan", Toast.LENGTH_SHORT).show();
            Utils.Language = "ca";
        } else if (s.equals("Cherokee")) {
//            Toast.makeText(this, "Your Select Language Cherokee", Toast.LENGTH_SHORT).show();
            Utils.Language = "chr";
        } else if (s.equals("Croatian")) {
//            Toast.makeText(this, "Your Select Language Croatian", Toast.LENGTH_SHORT).show();
            Utils.Language = "hr";
        } else if (s.equals("Czech")) {
//            Toast.makeText(this, "Your Select Language Czech", Toast.LENGTH_SHORT).show();
            Utils.Language = "cs";
        } else if (s.equals("Danish")) {
//            Toast.makeText(this, "Your Select Language Danish", Toast.LENGTH_SHORT).show();
            Utils.Language = "da";
        } else if (s.equals("Dutch")) {
//            Toast.makeText(this, "Your Select Language Dutch", Toast.LENGTH_SHORT).show();
            Utils.Language = "nl";
        } else if (s.equals("English (US)")) {
//            Toast.makeText(this, "Your Select Language English (US)", Toast.LENGTH_SHORT).show();
            Utils.Language = "en";
        } else if (s.equals("Estonian")) {
//            Toast.makeText(this, "Your Select Language Estonian", Toast.LENGTH_SHORT).show();
            Utils.Language = "et";
        } else if (s.equals("Filipino")) {
//            Toast.makeText(this, "Your Select Language Filipino", Toast.LENGTH_SHORT).show();
            Utils.Language = "fil";
        } else if (s.equals("Finnish")) {
//            Toast.makeText(this, "Your Select Language Finnish", Toast.LENGTH_SHORT).show();
            Utils.Language = "fi";
        } else if (s.equals("French")) {
//            Toast.makeText(this, "Your Select Language French", Toast.LENGTH_SHORT).show();
            Utils.Language = "fr";
        } else if (s.equals("German")) {
//            Toast.makeText(this, "Your Select Language German", Toast.LENGTH_SHORT).show();
            Utils.Language = "de";
        } else if (s.equals("Greek")) {
//            Toast.makeText(this, "Your Select Language Greek", Toast.LENGTH_SHORT).show();
            Utils.Language = "el";
        } else if (s.equals("Gujarati")) {
//            Toast.makeText(this, "Your Select Language Gujarati", Toast.LENGTH_SHORT).show();
            Utils.Language = "gu-IN";
        } else if (s.equals("Hebrew")) {
//            Toast.makeText(this, "Your Select Language Hebrew", Toast.LENGTH_SHORT).show();
            Utils.Language = "iw";
        } else if (s.equals("Hindi")) {
//            Toast.makeText(this, "Your Select Language hindi", Toast.LENGTH_SHORT).show();
            Utils.Language = "hi";
        } else if (s.equals("Hungarian")) {
//            Toast.makeText(this, "Your Select Language Hungarian", Toast.LENGTH_SHORT).show();
            Utils.Language = "hu";
        } else if (s.equals("Icelandic")) {
//            Toast.makeText(this, "Your Select Language Icelandic", Toast.LENGTH_SHORT).show();
            Utils.Language = "is";
        } else if (s.equals("Indonesian")) {
//            Toast.makeText(this, "Your Select Language Indonesian", Toast.LENGTH_SHORT).show();
            Utils.Language = "id";
        } else if (s.equals("Italian")) {
//            Toast.makeText(this, "Your Select Language Italian", Toast.LENGTH_SHORT).show();
            Utils.Language = "it";
        } else if (s.equals("Japanese")) {
//            Toast.makeText(this, "Your Select Language Japanese", Toast.LENGTH_SHORT).show();
            Utils.Language = "ja";
        } else if (s.equals("Kannada")) {
//            Toast.makeText(this, "Your Select Language Kannada", Toast.LENGTH_SHORT).show();
            Utils.Language = "kn";
        } else if (s.equals("Korean")) {
//            Toast.makeText(this, "Your Select Language Korean", Toast.LENGTH_SHORT).show();
            Utils.Language = "ko";
        } else if (s.equals("Latvian")) {
//            Toast.makeText(this, "Your Select Language Latvian", Toast.LENGTH_SHORT).show();
            Utils.Language = "lv";
        } else if (s.equals("Lithuanian")) {
//            Toast.makeText(this, "Your Select Language Lithuanian", Toast.LENGTH_SHORT).show();
            Utils.Language = "lt";
        } else if (s.equals("Malay")) {
//            Toast.makeText(this, "Your Select Language Malay", Toast.LENGTH_SHORT).show();
            Utils.Language = "ms";
        } else if (s.equals("Malayalam")) {
//            Toast.makeText(this, "Your Select Language Malayalam", Toast.LENGTH_SHORT).show();
            Utils.Language = "ms";
        } else if (s.equals("Marathi")) {
//            Toast.makeText(this, "Your Select Language Marathi", Toast.LENGTH_SHORT).show();
            Utils.Language = "mr";
        } else if (s.equals("Norwegian")) {
//            Toast.makeText(this, "Your Select Language Norwegian", Toast.LENGTH_SHORT).show();
            Utils.Language = "no";
        } else if (s.equals("Polish")) {
//            Toast.makeText(this, "Your Select Language Polish", Toast.LENGTH_SHORT).show();
            Utils.Language = "pl";
        } else if (s.equals("Portuguese (Portugal)")) {
//            Toast.makeText(this, "Your Select Language Portuguese (Portugal)", Toast.LENGTH_SHORT).show();
            Utils.Language = "pt-PT";
        } else if (s.equals("Romanian")) {
//            Toast.makeText(this, "Your Select Language Romanian", Toast.LENGTH_SHORT).show();
            Utils.Language = "ro";
        } else if (s.equals("Russian")) {
//            Toast.makeText(this, "Your Select Language Russian", Toast.LENGTH_SHORT).show();
            Utils.Language = "ru";
        } else if (s.equals("Serbian")) {
//            Toast.makeText(this, "Your Select Language Serbian", Toast.LENGTH_SHORT).show();
            Utils.Language = "sr";
        } else if (s.equals("Chinese (PRC)")) {
//            Toast.makeText(this, "Your Select Language Chinese (PRC)", Toast.LENGTH_SHORT).show();
            Utils.Language = "zh-CN";
        } else if (s.equals("Slovak")) {
//            Toast.makeText(this, "Your Select Language Slovak", Toast.LENGTH_SHORT).show();
            Utils.Language = "sk";
        } else if (s.equals("Slovenian")) {
//            Toast.makeText(this, "Your Select Language Slovenian", Toast.LENGTH_SHORT).show();
            Utils.Language = "sl";
        } else if (s.equals("Spanish")) {
//            Toast.makeText(this, "Your Select Language Spanish", Toast.LENGTH_SHORT).show();
            Utils.Language = "es";
        } else if (s.equals("Swahili")) {
//            Toast.makeText(this, "Your Select Language Swahili", Toast.LENGTH_SHORT).show();
            Utils.Language = "sw";
        } else if (s.equals("Swedish")) {
//            Toast.makeText(this, "Your Select Language Swedish", Toast.LENGTH_SHORT).show();
            Utils.Language = "sv";
        } else if (s.equals("Tamil")) {
//            Toast.makeText(this, "Your Select Language Tamil", Toast.LENGTH_SHORT).show();
            Utils.Language = "ta";
        } else if (s.equals("Telugu")) {
//            Toast.makeText(this, "Your Select Language Telugu", Toast.LENGTH_SHORT).show();
            Utils.Language = "te";
        } else if (s.equals("Thai")) {
//            Toast.makeText(this, "Your Select Language Thai", Toast.LENGTH_SHORT).show();
            Utils.Language = "th";
        } else if (s.equals("Chinese (Taiwan)")) {
//            Toast.makeText(this, "Your Select Language Chinese (Taiwan)", Toast.LENGTH_SHORT).show();
            Utils.Language = "zh-TW";
        } else if (s.equals("Turkish")) {
//            Toast.makeText(this, "Your Select Language Turkish", Toast.LENGTH_SHORT).show();
            Utils.Language = "tr";
        } else if (s.equals("Urdu")) {
//            Toast.makeText(this, "Your Select Language Urdu", Toast.LENGTH_SHORT).show();
            Utils.Language = "ur-IN";
        } else if (s.equals("Ukrainian")) {
//            Toast.makeText(this, "Your Select Language Ukrainian", Toast.LENGTH_SHORT).show();
            Utils.Language = "uk";
        } else if (s.equals("Vietnamese")) {
//            Toast.makeText(this, "Your Select Language Vietnamese", Toast.LENGTH_SHORT).show();
            Utils.Language = "vi";
        } else if (s.equals("Welsh")) {
//            Toast.makeText(this, "Your Select Language Welsh", Toast.LENGTH_SHORT).show();
            Utils.Language = "cy";
        } else {
//            Toast.makeText(this, "English", Toast.LENGTH_SHORT).show();
        }


        getSharedPreferences("MyP3", MODE_PRIVATE).edit().putString("name", String.valueOf(Utils.Language)).apply();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
    }

}