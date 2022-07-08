package com.myassistant.phone_category;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.google.android.material.snackbar.Snackbar;
import com.myassistant.R;

public class p_translate extends AppCompatActivity {
    LinearLayout translate;
    SharedPreferences sp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ptranslate);
        translate = findViewById(R.id. translate);
        getSupportActionBar().hide();

        sp = getSharedPreferences("MyP2",MODE_PRIVATE);


        translate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(com.myassistant.phone_category.p_translate.this, "android.permission.RECORD_AUDIO") == 0 || Build.VERSION.SDK_INT < 23) {
                    com.myassistant.phone_category.p_translate.this.speak_translate();
                } else if (ActivityCompat.shouldShowRequestPermissionRationale(com.myassistant.phone_category.p_translate.this, "android.permission.RECORD_AUDIO")) {
                    Snackbar.make(view, "Allow to record audio?", Snackbar.LENGTH_LONG).setAction((CharSequence) "ENABLE", (View.OnClickListener) new View.OnClickListener() {
                        public void onClick(View view) {
                            ActivityCompat.requestPermissions(com.myassistant.phone_category.p_translate.this, new String[]{"android.permission.RECORD_AUDIO"}, 1);
                        }
                    }).show();
                } else {
                    ActivityCompat.requestPermissions(com.myassistant.phone_category.p_translate.this, new String[]{"android.permission.RECORD_AUDIO"}, 1);
                }
            }
        });
    }


    @SuppressLint("WrongConstant")
    public void speak_translate() {
//        Log.e("dddddddddd", "name::-   " +  sp.getString("name", "") );x
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        intent.putExtra("android.speech.extra.LANGUAGE",  sp.getString("name", "") );
        intent.putExtra("android.speech.extra.PROMPT", "Hi Speak something");
        try {
            startActivityForResult(intent, 1);
        } catch (Exception e) {
            Toast.makeText(this, "" + e.getMessage(), 0).show();
        }
    }

    public void search_translate(String str) {
        try {
            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
            intent.setClassName("com.google.android.apps.translate", "com.google.android.apps.translate.SearchActivity");
            intent.putExtra("query", str);
//            intent.setFlags(268435456);
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            String trim = str.trim();
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://translate.google.co.in/?lfhs=2&sl=auto&tl=es&text="+trim+"%0A&op=translate")));
        }
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);

        if (requestCode == 1 && resultCode == -1 && intent != null) {
            search_translate(intent.getStringArrayListExtra("android.speech.extra.RESULTS").get(0));

        }
    }
    
    
}