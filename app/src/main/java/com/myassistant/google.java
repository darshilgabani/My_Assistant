package com.myassistant;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.snackbar.Snackbar;

public class google extends AppCompatActivity {
    //    GifImageView wp;
    LottieAnimationView youtube,google,map,play,chrome,gmail;
    ImageView drive,photo;
    SharedPreferences sp;

    private static final int RECOGNIZER_RESULT = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google);
        getSupportActionBar().hide();
        youtube = findViewById(R.id.youtube);
        google = findViewById(R.id.google);
        map = findViewById(R.id.map);
        play = findViewById(R.id.play);
        chrome = findViewById(R.id.chrome);
        gmail = findViewById(R.id.gmail);
        drive = findViewById(R.id.drive);
        photo = findViewById(R.id.photo);

        sp = getSharedPreferences("MyP",MODE_PRIVATE);
//        textView.setText(sp.getString("name", null));




        google.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(com.myassistant.google.this, "android.permission.RECORD_AUDIO") == 0 || Build.VERSION.SDK_INT < 23) {
                    com.myassistant.google.this.speak_google();
                } else if (ActivityCompat.shouldShowRequestPermissionRationale(com.myassistant.google.this, "android.permission.RECORD_AUDIO")) {
                    Snackbar.make(view, "This is main activity", Snackbar.LENGTH_LONG).setAction((CharSequence) "ENABLE", (View.OnClickListener) new View.OnClickListener() {
                        public void onClick(View view) {
                            ActivityCompat.requestPermissions(com.myassistant.google.this, new String[]{"android.permission.RECORD_AUDIO"}, 1);
                        }
                    }).show();
                } else {
                    ActivityCompat.requestPermissions(com.myassistant.google.this, new String[]{"android.permission.RECORD_AUDIO"}, 1);
                }
            }
        });

        youtube.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(com.myassistant.google.this, "android.permission.RECORD_AUDIO") == 0 || Build.VERSION.SDK_INT < 23) {
                    com.myassistant.google.this.speak_youtube();
                } else if (ActivityCompat.shouldShowRequestPermissionRationale(com.myassistant.google.this, "android.permission.RECORD_AUDIO")) {
                    Snackbar.make(view, "This is main activity", Snackbar.LENGTH_LONG).setAction((CharSequence) "ENABLE", (View.OnClickListener) new View.OnClickListener() {
                        public void onClick(View view) {
                            ActivityCompat.requestPermissions(com.myassistant.google.this, new String[]{"android.permission.RECORD_AUDIO"}, 2);
                        }
                    }).show();
                } else {
                    ActivityCompat.requestPermissions(com.myassistant.google.this, new String[]{"android.permission.RECORD_AUDIO"}, 2);
                }
            }
        });

        map.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(com.myassistant.google.this, "android.permission.RECORD_AUDIO") == 0 || Build.VERSION.SDK_INT < 23) {
                    com.myassistant.google.this.speak_map();
                } else if (ActivityCompat.shouldShowRequestPermissionRationale(com.myassistant.google.this, "android.permission.RECORD_AUDIO")) {
                    Snackbar.make(view, "This is main activity", Snackbar.LENGTH_LONG).setAction((CharSequence) "ENABLE", (View.OnClickListener) new View.OnClickListener() {
                        public void onClick(View view) {
                            ActivityCompat.requestPermissions(com.myassistant.google.this, new String[]{"android.permission.RECORD_AUDIO"}, 3);
                        }
                    }).show();
                } else {
                    ActivityCompat.requestPermissions(com.myassistant.google.this, new String[]{"android.permission.RECORD_AUDIO"}, 3);
                }
            }
        });

        play.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(com.myassistant.google.this, "android.permission.RECORD_AUDIO") == 0 || Build.VERSION.SDK_INT < 23) {
                    com.myassistant.google.this.speak_play();
                } else if (ActivityCompat.shouldShowRequestPermissionRationale(com.myassistant.google.this, "android.permission.RECORD_AUDIO")) {
                    Snackbar.make(view, "This is main activity", Snackbar.LENGTH_LONG).setAction((CharSequence) "ENABLE", (View.OnClickListener) new View.OnClickListener() {
                        public void onClick(View view) {
                            ActivityCompat.requestPermissions(com.myassistant.google.this, new String[]{"android.permission.RECORD_AUDIO"}, 4);
                        }
                    }).show();
                } else {
                    ActivityCompat.requestPermissions(com.myassistant.google.this, new String[]{"android.permission.RECORD_AUDIO"}, 4);
                }
            }
        });

        chrome.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(com.myassistant.google.this, "android.permission.RECORD_AUDIO") == 0 || Build.VERSION.SDK_INT < 23) {
                    com.myassistant.google.this.speak_chrome();
                } else if (ActivityCompat.shouldShowRequestPermissionRationale(com.myassistant.google.this, "android.permission.RECORD_AUDIO")) {
                    Snackbar.make(view, "This is main activity", Snackbar.LENGTH_LONG).setAction((CharSequence) "ENABLE", (View.OnClickListener) new View.OnClickListener() {
                        public void onClick(View view) {
                            ActivityCompat.requestPermissions(com.myassistant.google.this, new String[]{"android.permission.RECORD_AUDIO"}, 5);
                        }
                    }).show();
                } else {
                    ActivityCompat.requestPermissions(com.myassistant.google.this, new String[]{"android.permission.RECORD_AUDIO"}, 5);
                }
            }
        });


        gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent email= new Intent(Intent.ACTION_SENDTO);
                email.setData(Uri.parse("mailto:your.email@gmail.com"));
                email.putExtra(Intent.EXTRA_SUBJECT, "Subject");
                email.putExtra(Intent.EXTRA_TEXT, "My Email message");
                startActivity(email);
            }
        });


        drive.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(com.myassistant.google.this, "android.permission.RECORD_AUDIO") == 0 || Build.VERSION.SDK_INT < 27) {
                    com.myassistant.google.this.speak_drive();
                } else if (ActivityCompat.shouldShowRequestPermissionRationale(com.myassistant.google.this, "android.permission.RECORD_AUDIO")) {
                    Snackbar.make(view, "This is main activity", Snackbar.LENGTH_LONG).setAction((CharSequence) "ENABLE", (View.OnClickListener) new View.OnClickListener() {
                        public void onClick(View view) {
                            ActivityCompat.requestPermissions(com.myassistant.google.this, new String[]{"android.permission.RECORD_AUDIO"}, 7);
                        }
                    }).show();
                } else {
                    ActivityCompat.requestPermissions(com.myassistant.google.this, new String[]{"android.permission.RECORD_AUDIO"}, 7);
                }
            }
        });


        photo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(com.myassistant.google.this, "android.permission.RECORD_AUDIO") == 0 || Build.VERSION.SDK_INT < 28) {
                    com.myassistant.google.this.speak_photo();
                } else if (ActivityCompat.shouldShowRequestPermissionRationale(com.myassistant.google.this, "android.permission.RECORD_AUDIO")) {
                    Snackbar.make(view, "This is main activity", Snackbar.LENGTH_LONG).setAction((CharSequence) "ENABLE", (View.OnClickListener) new View.OnClickListener() {
                        public void onClick(View view) {
                            ActivityCompat.requestPermissions(com.myassistant.google.this, new String[]{"android.permission.RECORD_AUDIO"}, 8);
                        }
                    }).show();
                } else {
                    ActivityCompat.requestPermissions(com.myassistant.google.this, new String[]{"android.permission.RECORD_AUDIO"}, 8);
                }
            }
        });




    }




    @SuppressLint("WrongConstant")
    public void speak_youtube() {
//        Log.e("dddddddddd", "name::-   " +  sp.getString("name", "") );
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        intent.putExtra("android.speech.extra.LANGUAGE",  sp.getString("name", "") );
        intent.putExtra("android.speech.extra.PROMPT", "Hi Speak something");
        try {
            startActivityForResult(intent, 2);
        } catch (Exception e) {
            Toast.makeText(this, "" + e.getMessage(), 0).show();
        }
    }

    public void search_youtube(String str) {
        try {
            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
            intent.setClassName("com.android.youtube", "com.google.android.youtube.player.SearchActivity");
            intent.putExtra("query", str);
//            intent.setFlags(268435456);
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            String trim = str.trim();
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.youtube.com/results?search_query=" + trim)));
        }
    }


    @SuppressLint("WrongConstant")
    public void speak_google() {
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        intent.putExtra("android.speech.extra.LANGUAGE", sp.getString("name", ""));
        intent.putExtra("android.speech.extra.PROMPT", "Hi Speak something");
        try {
            startActivityForResult(intent, 1);
        } catch (Exception e) {
            Toast.makeText(this, "" + e.getMessage(), 0).show();
        }
    }

    public void search_google(String str2) {
        try {
            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
            intent.setClassName("com.google.android.googlequicksearchbox", "com.google.android.googlequicksearchbox.SearchActivity");
            intent.putExtra("query", str2);
//            intent.setFlags(268435456);
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            String trim2 = str2.trim();
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.google.co.in/search?q=" + trim2)));
        }
    }


    @SuppressLint("WrongConstant")
    public void speak_map() {
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        intent.putExtra("android.speech.extra.LANGUAGE", sp.getString("name", ""));
        intent.putExtra("android.speech.extra.PROMPT", "Hi Speak something");
        try {
            startActivityForResult(intent, 3);
        } catch (Exception e) {
            Toast.makeText(this, "" + e.getMessage(), 0).show();
        }
    }

    public void search_map(String str3) {
        try {
            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
            intent.setClassName("com.google.android.apps.maps", "com.google.android.gms.maps.SearchActivity");
            intent.putExtra("query", str3);
//            intent.setFlags(268435456);
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            String trim3 = str3.trim();
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.google.com/maps/search/" + trim3)));
        }
    }

    @SuppressLint("WrongConstant")
    public void speak_play() {
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        intent.putExtra("android.speech.extra.LANGUAGE", sp.getString("name", ""));
        intent.putExtra("android.speech.extra.PROMPT", "Hi Speak something");
        try {
            startActivityForResult(intent, 4);
        } catch (Exception e) {
            Toast.makeText(this, "" + e.getMessage(), 0).show();
        }
    }

    public void search_play(String str4) {
        try {
            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
            intent.setClassName("com.google.android.apps.play", "com.google.android.play.SearchActivity");
            intent.putExtra("query", str4);
//            intent.setFlags(268435456);
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            String trim4 = str4.trim();
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/search?q=" + trim4)));
        }
    }

    @SuppressLint("WrongConstant")
    public void speak_chrome() {
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        intent.putExtra("android.speech.extra.LANGUAGE", sp.getString("name", ""));
        intent.putExtra("android.speech.extra.PROMPT", "Hi Speak something");
        try {
            startActivityForResult(intent, 5);
        } catch (Exception e) {
            Toast.makeText(this, "" + e.getMessage(), 0).show();
        }
    }

    public void search_chrome(String str5) {
        try {
            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
            intent.setClassName("com.android.chrome", "com.android.chrome.SearchActivity");
            intent.putExtra("query", str5);
//            intent.setFlags(268435456);
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            String trim5 = str5.trim();
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("googlechrome://search?q=" + trim5)));
        }

    }

    public void search_drive(String str7) {
        try {
            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
            intent.setClassName("com.google.android.apps.docs", "com.android.drive.SearchActivity");
            intent.putExtra("query", str7);
//            intent.setFlags(271777777);
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            String trim7 = str7.trim();
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://drive.google.com/drive/u/0/search?q="+trim7)));
        }

    }

    @SuppressLint("WrongConstant")
    public void speak_drive() {
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        intent.putExtra("android.speech.extra.LANGUAGE", sp.getString("name", ""));
        intent.putExtra("android.speech.extra.PROMPT", "Hi Speak something");
        try {
            startActivityForResult(intent, 7);
        } catch (Exception e) {
            Toast.makeText(this, "" + e.getMessage(), 0).show();
        }
    }


    public void search_photo(String str8) {
        try {
            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
            intent.setClassName("com.google.android.apps.photos", "com.android.photo.SearchActivity");
            intent.putExtra("query", str8);
//            intent.setFlags(281888888);
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            String trim8 = str8.trim();
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://photos.google.com/search/"+trim8)));
        }

    }

    @SuppressLint("WrongConstant")
    public void speak_photo() {
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        intent.putExtra("android.speech.extra.LANGUAGE", sp.getString("name", ""));
        intent.putExtra("android.speech.extra.PROMPT", "Hi Speak something");
        try {
            startActivityForResult(intent, 8);
        } catch (Exception e) {
            Toast.makeText(this, "" + e.getMessage(), 0).show();
        }
    }

//    @SuppressLint("WrongConstant")
//    public void speak_photo() {
//        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
//        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
//        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, "gu-IN");
//        intent.putExtra(RecognizerIntent.EXTRA_PROMPT, "Hi Speak something");
//        try {
//            startActivityForResult(intent, 8);
//        } catch (Exception e) {
//            Toast.makeText(this, "" + e.getMessage(), 0).show();
//        }
//    }





    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);

        if(requestCode==1 && resultCode == -1 && intent !=null){
            search_google(intent.getStringArrayListExtra("android.speech.extra.RESULTS").get(0));

        }
        if(requestCode==2 && resultCode == -1 && intent !=null){
            search_youtube(intent.getStringArrayListExtra("android.speech.extra.RESULTS").get(0));

        }
        if(requestCode==3 && resultCode == -1 && intent !=null){
            search_map(intent.getStringArrayListExtra("android.speech.extra.RESULTS").get(0));

        }
        if(requestCode==4 && resultCode == -1 && intent !=null){
            search_play(intent.getStringArrayListExtra("android.speech.extra.RESULTS").get(0));

        }
        if(requestCode==5 && resultCode == -1 && intent !=null){
            search_chrome(intent.getStringArrayListExtra("android.speech.extra.RESULTS").get(0));

        }
        if(requestCode==7 && resultCode == -1 && intent !=null){
            search_drive(intent.getStringArrayListExtra("android.speech.extra.RESULTS").get(0));

        }
        if(requestCode==8 && resultCode == -1 && intent !=null){
            search_photo(intent.getStringArrayListExtra("android.speech.extra.RESULTS").get(0));

        }

    }



}