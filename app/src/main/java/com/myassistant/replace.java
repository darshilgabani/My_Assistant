package com.myassistant;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.util.Locale;

public class replace extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_replace);
    }
}

//     photo.setOnClickListener(new View.OnClickListener() {
//        public void onClick(View view) {
//            if (ContextCompat.checkSelfPermission(socialmedia.this, "android.permission.RECORD_AUDIO") == 0 || Build.VERSION.SDK_INT < 28) {
//                socialmedia.this.speak_photo();
//            } else if (ActivityCompat.shouldShowRequestPermissionRationale(socialmedia.this, "android.permission.RECORD_AUDIO")) {
//                Snackbar.make(view, "This is main activity", Snackbar.LENGTH_LONG).setAction((CharSequence) "ENABLE", (View.OnClickListener) new View.OnClickListener() {
//                    public void onClick(View view) {
//                        ActivityCompat.requestPermissions(socialmedia.this, new String[]{"android.permission.RECORD_AUDIO"}, 8);
//                    }
//                }).show();
//            } else {
//                ActivityCompat.requestPermissions(socialmedia.this, new String[]{"android.permission.RECORD_AUDIO"}, 8);
//            }
//        }
//    });
//
//
//    public void search_photo(String str8) {
//        try {
//            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
//            intent.setClassName("com.android.photo", "com.android.photo.SearchActivity");
//            intent.putExtra("query", str8);
////            intent.setFlags(281888888);
//            startActivity(intent);
//        } catch (ActivityNotFoundException unused) {
//            String trim8 = str8.trim();
//            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://photo.com/search?q="+trim8+"&searchType=manual&searchIdentifier=text_search")));
//        }
//
//    }
//
//    @SuppressLint("WrongConstant")
//    public void speak_photo() {
//        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
//        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
//        intent.putExtra("android.speech.extra.LANGUAGE", Locale.getDefault());
//        intent.putExtra("android.speech.extra.PROMPT", "Hi Speak something");
//        try {
//            startActivityForResult(intent, 8);
//        } catch (Exception e) {
//            Toast.makeText(this, "" + e.getMessage(), 0).show();
//        }
//    }
//
//
//
//    if(requestCode==8 && resultCode == -1 && intent !=null){
//            search_photo(intent.getStringArrayListExtra("android.speech.extra.RESULTS").get(0));
//
//            }