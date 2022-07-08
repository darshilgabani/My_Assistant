package com.myassistant.phone_category;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.google.android.material.snackbar.Snackbar;
import com.myassistant.R;

public class p_call extends AppCompatActivity {
    EditText number;
    LinearLayout call;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pcall);
        getSupportActionBar().hide();
        call = findViewById(R.id.call);
        number = findViewById(R.id.number);

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (ContextCompat.checkSelfPermission(p_call.this, "android.permission.CALL_PHONE") == 0 || Build.VERSION.SDK_INT < 23) {

                    String phoneNumber = number.getText().toString();
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:"+phoneNumber));
                    startActivity(intent);
                    number.setText("");

                } else if (ActivityCompat.shouldShowRequestPermissionRationale(p_call.this, "android.permission.CALL_PHONE")) {
                    Snackbar.make(view, "Allow to record audio?", Snackbar.LENGTH_LONG).setAction((CharSequence) "ENABLE", (View.OnClickListener) new View.OnClickListener() {
                        public void onClick(View view) {
                            ActivityCompat.requestPermissions(p_call.this, new String[]{"android.permission.CALL_PHONE"}, 1);
                        }
                    }).show();
                } else {
                    ActivityCompat.requestPermissions(p_call.this, new String[]{"android.permission.CALL_PHONE"}, 1);
                }

            }
        });

//        call.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {
//                if (ContextCompat.checkSelfPermission(com.myassistant.phone_category.p_call.this, "android.permission.READ_CONTACTS") == 0 || Build.VERSION.SDK_INT < 23) {
//                    com.myassistant.phone_category.p_call.this.speak_call();
//                } else if (ActivityCompat.shouldShowRequestPermissionRationale(com.myassistant.phone_category.p_call.this, "android.permission.READ_CONTACTS")) {
//                    Snackbar.make(view, "This is main activity", Snackbar.LENGTH_LONG).setAction((CharSequence) "ENABLE", (View.OnClickListener) new View.OnClickListener() {
//                        public void onClick(View view) {
//                            ActivityCompat.requestPermissions(com.myassistant.phone_category.p_call.this, new String[]{"android.permission.READ_CONTACTS"}, 1);
//                        }
//                    }).show();
//                } else {
//                    ActivityCompat.requestPermissions(com.myassistant.phone_category.p_call.this, new String[]{"android.permission.READ_CONTACTS"}, 1);
//                }
//            }
//        });


    }

//    @SuppressLint("WrongConstant")
//    public void speak_call() {
////        Log.e("dddddddddd", "name::-   " +  sp.getString("name", "") );x
//        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
//        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
//        intent.putExtra("android.speech.extra.LANGUAGE", "en-US");
//        intent.putExtra("android.speech.extra.PROMPT", "Hi Speak something");
//        try {
//            startActivityForResult(intent, 1);
//        } catch (Exception e) {
//            Toast.makeText(this, "" + e.getMessage(), 0).show();
//        }
//    }
//
//    public void search_call(String str) {
//
//        Intent intent = new Intent(p_call.this, Call_MainActivity.class);
//
//        String trim = str.trim();
//        intent.putExtra("EXTRA_NAME", trim);
//
//        startActivity(intent);
//
//    }
//
//
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
//        super.onActivityResult(requestCode, resultCode, intent);
//
//        if (requestCode == 1 && resultCode == -1 && intent != null) {
//            search_call(intent.getStringArrayListExtra("android.speech.extra.RESULTS").get(0));
//
//        }
//    }


}