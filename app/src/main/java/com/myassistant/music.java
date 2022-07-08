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

import com.google.android.material.snackbar.Snackbar;

public class music extends AppCompatActivity {
    ImageView spotify,gaana,ytmusic,applemusic,amazonmusic,jiosavan,hungama,wynk;
    SharedPreferences sp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        getSupportActionBar().hide();
        spotify = findViewById(R.id.spotify);
        gaana = findViewById(R.id.gaana);
        ytmusic = findViewById(R.id.ytmusic);
        applemusic = findViewById(R.id.applemusic);
        amazonmusic = findViewById(R.id.amazonmusic);
        jiosavan = findViewById(R.id.jiosavan);
        hungama = findViewById(R.id.hungama);
        wynk = findViewById(R.id.wynk);

        sp = getSharedPreferences("MyP",MODE_PRIVATE);


        spotify.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(music.this, "android.permission.RECORD_AUDIO") == 0 || Build.VERSION.SDK_INT < 23) {
                    music.this.speak_spotify();
                } else if (ActivityCompat.shouldShowRequestPermissionRationale(music.this, "android.permission.RECORD_AUDIO")) {
                    Snackbar.make(view, "This is main activity", Snackbar.LENGTH_LONG).setAction((CharSequence) "ENABLE", (View.OnClickListener) new View.OnClickListener() {
                        public void onClick(View view) {
                            ActivityCompat.requestPermissions(music.this, new String[]{"android.permission.RECORD_AUDIO"}, 1);
                        }
                    }).show();
                } else {
                    ActivityCompat.requestPermissions(music.this, new String[]{"android.permission.RECORD_AUDIO"}, 1);
                }
            }
        });

        gaana.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(music.this, "android.permission.RECORD_AUDIO") == 0 || Build.VERSION.SDK_INT < 23) {
                    music.this.speak_gaana();
                } else if (ActivityCompat.shouldShowRequestPermissionRationale(music.this, "android.permission.RECORD_AUDIO")) {
                    Snackbar.make(view, "This is main activity", Snackbar.LENGTH_LONG).setAction((CharSequence) "ENABLE", (View.OnClickListener) new View.OnClickListener() {
                        public void onClick(View view) {
                            ActivityCompat.requestPermissions(music.this, new String[]{"android.permission.RECORD_AUDIO"}, 2);
                        }
                    }).show();
                } else {
                    ActivityCompat.requestPermissions(music.this, new String[]{"android.permission.RECORD_AUDIO"}, 2);
                }
            }
        });

        ytmusic.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(music.this, "android.permission.RECORD_AUDIO") == 0 || Build.VERSION.SDK_INT < 23) {
                    music.this.speak_ytmusic();
                } else if (ActivityCompat.shouldShowRequestPermissionRationale(music.this, "android.permission.RECORD_AUDIO")) {
                    Snackbar.make(view, "This is main activity", Snackbar.LENGTH_LONG).setAction((CharSequence) "ENABLE", (View.OnClickListener) new View.OnClickListener() {
                        public void onClick(View view) {
                            ActivityCompat.requestPermissions(music.this, new String[]{"android.permission.RECORD_AUDIO"}, 3);
                        }
                    }).show();
                } else {
                    ActivityCompat.requestPermissions(music.this, new String[]{"android.permission.RECORD_AUDIO"}, 3);
                }
            }
        });

        applemusic.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(music.this, "android.permission.RECORD_AUDIO") == 0 || Build.VERSION.SDK_INT < 23) {
                    music.this.speak_applemusic();
                } else if (ActivityCompat.shouldShowRequestPermissionRationale(music.this, "android.permission.RECORD_AUDIO")) {
                    Snackbar.make(view, "This is main activity", Snackbar.LENGTH_LONG).setAction((CharSequence) "ENABLE", (View.OnClickListener) new View.OnClickListener() {
                        public void onClick(View view) {
                            ActivityCompat.requestPermissions(music.this, new String[]{"android.permission.RECORD_AUDIO"}, 4);
                        }
                    }).show();
                } else {
                    ActivityCompat.requestPermissions(music.this, new String[]{"android.permission.RECORD_AUDIO"}, 4);
                }
            }
        });

        jiosavan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(music.this, "android.permission.RECORD_AUDIO") == 0 || Build.VERSION.SDK_INT < 23) {
                    music.this.speak_jiosavan();
                } else if (ActivityCompat.shouldShowRequestPermissionRationale(music.this, "android.permission.RECORD_AUDIO")) {
                    Snackbar.make(view, "This is main activity", Snackbar.LENGTH_LONG).setAction((CharSequence) "ENABLE", (View.OnClickListener) new View.OnClickListener() {
                        public void onClick(View view) {
                            ActivityCompat.requestPermissions(music.this, new String[]{"android.permission.RECORD_AUDIO"}, 5);
                        }
                    }).show();
                } else {
                    ActivityCompat.requestPermissions(music.this, new String[]{"android.permission.RECORD_AUDIO"}, 5);
                }
            }
        });

        hungama.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(music.this, "android.permission.RECORD_AUDIO") == 0 || Build.VERSION.SDK_INT < 23) {
                    music.this.speak_hungama();
                } else if (ActivityCompat.shouldShowRequestPermissionRationale(music.this, "android.permission.RECORD_AUDIO")) {
                    Snackbar.make(view, "This is main activity", Snackbar.LENGTH_LONG).setAction((CharSequence) "ENABLE", (View.OnClickListener) new View.OnClickListener() {
                        public void onClick(View view) {
                            ActivityCompat.requestPermissions(music.this, new String[]{"android.permission.RECORD_AUDIO"}, 6);
                        }
                    }).show();
                } else {
                    ActivityCompat.requestPermissions(music.this, new String[]{"android.permission.RECORD_AUDIO"}, 6);
                }
            }
        });

        amazonmusic.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(music.this, "android.permission.RECORD_AUDIO") == 0 || Build.VERSION.SDK_INT < 23) {
                    music.this.speak_amazonmusic();
                } else if (ActivityCompat.shouldShowRequestPermissionRationale(music.this, "android.permission.RECORD_AUDIO")) {
                    Snackbar.make(view, "This is main activity", Snackbar.LENGTH_LONG).setAction((CharSequence) "ENABLE", (View.OnClickListener) new View.OnClickListener() {
                        public void onClick(View view) {
                            ActivityCompat.requestPermissions(music.this, new String[]{"android.permission.RECORD_AUDIO"}, 7);
                        }
                    }).show();
                } else {
                    ActivityCompat.requestPermissions(music.this, new String[]{"android.permission.RECORD_AUDIO"}, 7);
                }
            }
        });


        wynk.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(music.this, "android.permission.RECORD_AUDIO") == 0 || Build.VERSION.SDK_INT < 23) {
                    music.this.speak_wynk();
                } else if (ActivityCompat.shouldShowRequestPermissionRationale(music.this, "android.permission.RECORD_AUDIO")) {
                    Snackbar.make(view, "This is main activity", Snackbar.LENGTH_LONG).setAction((CharSequence) "ENABLE", (View.OnClickListener) new View.OnClickListener() {
                        public void onClick(View view) {
                            ActivityCompat.requestPermissions(music.this, new String[]{"android.permission.RECORD_AUDIO"}, 8);
                        }
                    }).show();
                } else {
                    ActivityCompat.requestPermissions(music.this, new String[]{"android.permission.RECORD_AUDIO"}, 8);
                }
            }
        });
        
        

    }

    @SuppressLint("WrongConstant")
    public void speak_spotify() {
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
//        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_WEB_SEARCH);
        intent.putExtra("android.speech.extra.LANGUAGE", sp.getString("name", ""));
        intent.putExtra("android.speech.extra.PROMPT", "Hi Speak something");
        try {
            startActivityForResult(intent, 1);
        } catch (Exception e) {
            Toast.makeText(this, "" + e.getMessage(), 0).show();
        }
    }

    public void search_spotify(String str1) {
        try {
            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
            intent.setClassName("com.android.spotify", "com.android.spotify.SearchActivity");
            intent.putExtra("query", str1);
//            intent.setFlags(261435456);
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            String trim1 = str1.trim();
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://open.spotify.com/search/results/" + trim1)));
        }

    }


    @SuppressLint("WrongConstant")
    public void speak_gaana() {
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        intent.putExtra("android.speech.extra.LANGUAGE", sp.getString("name", ""));
        intent.putExtra("android.speech.extra.PROMPT", "Hi Speak something");
        try {
            startActivityForResult(intent, 2);
        } catch (Exception e) {
            Toast.makeText(this, "" + e.getMessage(), 0).show();
        }
    }

    public void search_gaana(String str2) {
        try {
            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
            intent.setClassName("com.android.gaana", "com.android.gaana.SearchActivity");
            intent.putExtra("query", str2);
//            intent.setFlags(261435456);
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            String trim2 = str2.trim();
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://gaana.com/search/"+trim2)));
        }

    }



    @SuppressLint("WrongConstant")
    public void speak_ytmusic() {
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

    public void search_ytmusic(String str3) {
        try {
            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
            intent.setClassName("com.android.ytmusic", "com.android.ytmusic.SearchActivity");
            intent.putExtra("query", str3);
//            intent.setFlags(261435456);
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            String trim3 = str3.trim();
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://music.youtube.com/search?q="+trim3)));
        }

    }


    @SuppressLint("WrongConstant")
    public void speak_applemusic() {
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

    public void search_applemusic(String str4) {
        try {
            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
            intent.setClassName("com.android.applemusic", "com.android.applemusic.SearchActivity");
            intent.putExtra("query", str4);
//            intent.setFlags(261435456);
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            String trim4 = str4.trim();
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://music.apple.com/us/search?term="+trim4)));
        }

    }


    @SuppressLint("WrongConstant")
    public void speak_jiosavan() {
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

    public void search_jiosavan(String str5) {
        try {
            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
            intent.setClassName("com.android.jiosavan", "com.android.jiosavan.SearchActivity");
            intent.putExtra("query", str5);
//            intent.setFlags(261535556);
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            String trim5 = str5.trim();
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.jiosaavn.com/search/"+trim5)));
        }

    }


    @SuppressLint("WrongConstant")
    public void speak_hungama() {
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        intent.putExtra("android.speech.extra.LANGUAGE", sp.getString("name", ""));
        intent.putExtra("android.speech.extra.PROMPT", "Hi Speak something");
        try {
            startActivityForResult(intent, 6);
        } catch (Exception e) {
            Toast.makeText(this, "" + e.getMessage(), 0).show();
        }
    }

    public void search_hungama(String str6) {
        try {
            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
            intent.setClassName("com.android.hungama", "com.android.hungama.SearchActivity");
            intent.putExtra("query", str6);
//            intent.setFlags(261636666);
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            String trim6 = str6.trim();
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://hungama.com/search?q="+trim6)));
        }

    }



    public void search_amazonmusic(String str7) {
        try {
            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
            intent.setClassName("com.android.amazonmusic", "com.android.amazonmusic.SearchActivity");
            intent.putExtra("query", str7);
//            intent.setFlags(271737777);
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            String trim7 = str7.trim();
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://music.amazon.com/search/"+trim7+"?filter=IsLibrary%7Cfalse&sc=none")));
        }

    }

    @SuppressLint("WrongConstant")
    public void speak_amazonmusic() {
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


    public void search_wynk(String str8) {
        try {
            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
            intent.setClassName("com.android.wynk", "com.android.wynk.SearchActivity");
            intent.putExtra("query", str8);
//            intent.setFlags(281838888);
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            String trim8 = str8.trim();
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://wynk.in/music/search/"+trim8)));
        }

    }

    @SuppressLint("WrongConstant")
    public void speak_wynk() {
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



    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        if(requestCode==1 && resultCode == -1 && intent !=null){
            search_spotify(intent.getStringArrayListExtra("android.speech.extra.RESULTS").get(0));

        }
        if(requestCode==2 && resultCode == -1 && intent !=null){
            search_gaana(intent.getStringArrayListExtra("android.speech.extra.RESULTS").get(0));

        }
        if(requestCode==3 && resultCode == -1 && intent !=null){
            search_ytmusic(intent.getStringArrayListExtra("android.speech.extra.RESULTS").get(0));

        }
        if(requestCode==4 && resultCode == -1 && intent !=null){
            search_applemusic(intent.getStringArrayListExtra("android.speech.extra.RESULTS").get(0));

        }
        if(requestCode==5 && resultCode == -1 && intent !=null){
            search_jiosavan(intent.getStringArrayListExtra("android.speech.extra.RESULTS").get(0));

        }
        if(requestCode==6 && resultCode == -1 && intent !=null){
            search_hungama(intent.getStringArrayListExtra("android.speech.extra.RESULTS").get(0));

        }
        if(requestCode==7 && resultCode == -1 && intent !=null){
            search_amazonmusic(intent.getStringArrayListExtra("android.speech.extra.RESULTS").get(0));

        }
        if(requestCode==8 && resultCode == -1 && intent !=null){
            search_wynk(intent.getStringArrayListExtra("android.speech.extra.RESULTS").get(0));

        }
    }
}