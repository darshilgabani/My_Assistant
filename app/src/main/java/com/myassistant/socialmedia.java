package com.myassistant;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.snackbar.Snackbar;

public class socialmedia extends AppCompatActivity {
    LottieAnimationView wp,twitter,fb,insta,linkedin,snap,pinterest,discord;
    SharedPreferences sp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_socialmedia);
        getSupportActionBar().hide();
        wp = findViewById(R.id.wp);
        twitter = findViewById(R.id.twitter);
        fb = findViewById(R.id.fb);
        insta = findViewById(R.id.insta);
        linkedin = findViewById(R.id.linkedin);
        snap = findViewById(R.id.snap);
        pinterest = findViewById(R.id.pinterest);
        discord = findViewById(R.id.discord);

        sp = getSharedPreferences("MyP",MODE_PRIVATE);


        wp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(socialmedia.this, "android.permission.RECORD_AUDIO") == 0 || Build.VERSION.SDK_INT < 23) {
                    socialmedia.this.speak_wp();
                } else if (ActivityCompat.shouldShowRequestPermissionRationale(socialmedia.this, "android.permission.RECORD_AUDIO")) {
                    Snackbar.make(view, "This is main activity", Snackbar.LENGTH_LONG).setAction((CharSequence) "ENABLE", (View.OnClickListener) new View.OnClickListener() {
                        public void onClick(View view) {
                            ActivityCompat.requestPermissions(socialmedia.this, new String[]{"android.permission.RECORD_AUDIO"}, 11);
                        }
                    }).show();
                } else {
                    ActivityCompat.requestPermissions(socialmedia.this, new String[]{"android.permission.RECORD_AUDIO"}, 11);
                }
            }
        });

        twitter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(socialmedia.this, "android.permission.RECORD_AUDIO") == 0 || Build.VERSION.SDK_INT < 23) {
                    socialmedia.this.speak_twitter();
                } else if (ActivityCompat.shouldShowRequestPermissionRationale(socialmedia.this, "android.permission.RECORD_AUDIO")) {
                    Snackbar.make(view, "This is main activity", Snackbar.LENGTH_LONG).setAction((CharSequence) "ENABLE", (View.OnClickListener) new View.OnClickListener() {
                        public void onClick(View view) {
                            ActivityCompat.requestPermissions(socialmedia.this, new String[]{"android.permission.RECORD_AUDIO"}, 12);
                        }
                    }).show();
                } else {
                    ActivityCompat.requestPermissions(socialmedia.this, new String[]{"android.permission.RECORD_AUDIO"}, 12);
                }
            }
        });

        fb.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(socialmedia.this, "android.permission.RECORD_AUDIO") == 0 || Build.VERSION.SDK_INT < 23) {
                    socialmedia.this.speak_fb();
                } else if (ActivityCompat.shouldShowRequestPermissionRationale(socialmedia.this, "android.permission.RECORD_AUDIO")) {
                    Snackbar.make(view, "This is main activity", Snackbar.LENGTH_LONG).setAction((CharSequence) "ENABLE", (View.OnClickListener) new View.OnClickListener() {
                        public void onClick(View view) {
                            ActivityCompat.requestPermissions(socialmedia.this, new String[]{"android.permission.RECORD_AUDIO"}, 1);
                        }
                    }).show();
                } else {
                    ActivityCompat.requestPermissions(socialmedia.this, new String[]{"android.permission.RECORD_AUDIO"}, 1);
                }
            }
        });

        insta.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(socialmedia.this, "android.permission.RECORD_AUDIO") == 0 || Build.VERSION.SDK_INT < 23) {
                    socialmedia.this.speak_insta();
                } else if (ActivityCompat.shouldShowRequestPermissionRationale(socialmedia.this, "android.permission.RECORD_AUDIO")) {
                    Snackbar.make(view, "This is main activity", Snackbar.LENGTH_LONG).setAction((CharSequence) "ENABLE", (View.OnClickListener) new View.OnClickListener() {
                        public void onClick(View view) {
                            ActivityCompat.requestPermissions(socialmedia.this, new String[]{"android.permission.RECORD_AUDIO"}, 1);
                        }
                    }).show();
                } else {
                    ActivityCompat.requestPermissions(socialmedia.this, new String[]{"android.permission.RECORD_AUDIO"}, 1);
                }
            }
        });

        linkedin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(socialmedia.this, "android.permission.RECORD_AUDIO") == 0 || Build.VERSION.SDK_INT < 23) {
                    socialmedia.this.speak_linkedin();
                } else if (ActivityCompat.shouldShowRequestPermissionRationale(socialmedia.this, "android.permission.RECORD_AUDIO")) {
                    Snackbar.make(view, "This is main activity", Snackbar.LENGTH_LONG).setAction((CharSequence) "ENABLE", (View.OnClickListener) new View.OnClickListener() {
                        public void onClick(View view) {
                            ActivityCompat.requestPermissions(socialmedia.this, new String[]{"android.permission.RECORD_AUDIO"}, 3);
                        }
                    }).show();
                } else {
                    ActivityCompat.requestPermissions(socialmedia.this, new String[]{"android.permission.RECORD_AUDIO"}, 3);
                }
            }
        });

        snap.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(socialmedia.this, "android.permission.RECORD_AUDIO") == 0 || Build.VERSION.SDK_INT < 24) {
                    socialmedia.this.speak_snap();
                } else if (ActivityCompat.shouldShowRequestPermissionRationale(socialmedia.this, "android.permission.RECORD_AUDIO")) {
                    Snackbar.make(view, "This is main activity", Snackbar.LENGTH_LONG).setAction((CharSequence) "ENABLE", (View.OnClickListener) new View.OnClickListener() {
                        public void onClick(View view) {
                            ActivityCompat.requestPermissions(socialmedia.this, new String[]{"android.permission.RECORD_AUDIO"}, 4);
                        }
                    }).show();
                } else {
                    ActivityCompat.requestPermissions(socialmedia.this, new String[]{"android.permission.RECORD_AUDIO"}, 4);
                }
            }
        });

        pinterest.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(socialmedia.this, "android.permission.RECORD_AUDIO") == 0 || Build.VERSION.SDK_INT < 25) {
                    socialmedia.this.speak_pinterest();
                } else if (ActivityCompat.shouldShowRequestPermissionRationale(socialmedia.this, "android.permission.RECORD_AUDIO")) {
                    Snackbar.make(view, "This is main activity", Snackbar.LENGTH_LONG).setAction((CharSequence) "ENABLE", (View.OnClickListener) new View.OnClickListener() {
                        public void onClick(View view) {
                            ActivityCompat.requestPermissions(socialmedia.this, new String[]{"android.permission.RECORD_AUDIO"}, 5);
                        }
                    }).show();
                } else {
                    ActivityCompat.requestPermissions(socialmedia.this, new String[]{"android.permission.RECORD_AUDIO"}, 5);
                }
            }
        });

        discord.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(socialmedia.this, "android.permission.RECORD_AUDIO") == 0 || Build.VERSION.SDK_INT < 26) {
                    socialmedia.this.speak_discord();
                } else if (ActivityCompat.shouldShowRequestPermissionRationale(socialmedia.this, "android.permission.RECORD_AUDIO")) {
                    Snackbar.make(view, "This is main activity", Snackbar.LENGTH_LONG).setAction((CharSequence) "ENABLE", (View.OnClickListener) new View.OnClickListener() {
                        public void onClick(View view) {
                            ActivityCompat.requestPermissions(socialmedia.this, new String[]{"android.permission.RECORD_AUDIO"}, 6);
                        }
                    }).show();
                } else {
                    ActivityCompat.requestPermissions(socialmedia.this, new String[]{"android.permission.RECORD_AUDIO"}, 6);
                }
            }
        });



    }

    @SuppressLint("WrongConstant")
    public void speak_wp() {
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        intent.putExtra("android.speech.extra.LANGUAGE", sp.getString("name", ""));
        intent.putExtra("android.speech.extra.PROMPT", "Hi Speak something");
        try {
            startActivityForResult(intent, 11);
        } catch (Exception e) {
            Toast.makeText(this, "" + e.getMessage(), 0).show();
        }
    }

    public void search_wp(String str11) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_TEXT, str11);
        intent.setType("text/plain");
        intent.setPackage("com.whatsapp");
        startActivity(intent);
    }


    @SuppressLint("WrongConstant")
    public void speak_twitter() {
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        intent.putExtra("android.speech.extra.LANGUAGE", sp.getString("name", ""));
        intent.putExtra("android.speech.extra.PROMPT", "Hi Speak something");
        try {
            startActivityForResult(intent, 12);
        } catch (Exception e) {
            Toast.makeText(this, "" + e.getMessage(), 0).show();
        }
    }

    public void search_twitter(String str12) {
        try {
            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
            intent.setClassName("com.twitter.android", "com.android.twitter.SearchActivity");
            intent.putExtra("query", str12);
//            intent.setFlags(21184354511);
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            String trim12 = str12.trim();
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://twitter.com/USERID_OR_PROFILENAME" + trim12)));
        }

    }

    @SuppressLint("WrongConstant")
    public void speak_fb() {
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

    public void search_fb(String str1) {
        try {
            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
            intent.setClassName("com.facebook.android", "com.android.facebook.SearchActivity");
            intent.putExtra("query", str1);
//            intent.setFlags(21184354511);
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            String trim1 = str1.trim();
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("fb://facewebmodal/?=" + trim1)));
        }

    }

    @SuppressLint("WrongConstant")
    public void speak_insta() {
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

    public void search_insta(String str2) {
        try {
            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
            intent.setClassName("com.instagram.android", "com.android.instagram.SearchActivity");
            intent.putExtra("query", str2);
//            intent.setFlags(21184354511);
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            String trim2 = str2.trim();
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("instagram://user?username=" + trim2)));
        }

    }



    public void search_linkedin(String str3) {
        try {
            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
            intent.setClassName("com.android.linkedin", "com.android.linkedin.SearchActivity");
            intent.putExtra("query", str3);
//            intent.setFlags(231333333);
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            String trim3 = str3.trim();
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.linkedin.com/search/results/all/?keywords="+trim3+"&origin=GLOBAL_SEARCH_HEADER&sid=_zO")));
        }

    }

    @SuppressLint("WrongConstant")
    public void speak_linkedin() {
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


    public void search_snap(String str4) {
        try {
            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
            intent.setClassName("com.android.snap", "com.android.snap.SearchActivity");
            intent.putExtra("query", str4);
//            intent.setFlags(241444444);
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            String trim4 = str4.trim();
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://snapchat.com/add/"+trim4)));
        }

    }

    @SuppressLint("WrongConstant")
    public void speak_snap() {
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


    public void search_pinterest(String str5) {
        try {
            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
            intent.setClassName("com.android.pinterest", "com.android.pinterest.SearchActivity");
            intent.putExtra("query", str5);
//            intent.setFlags(251555555);
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            String trim5 = str5.trim();
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://in.pinterest.com/search/pins/?q="+trim5+"&rs=typed&term_meta[]="+trim5+"%7Ctyped")));
        }

    }

    @SuppressLint("WrongConstant")
    public void speak_pinterest() {
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


    public void search_discord(String str6) {
        try {
            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
            intent.setClassName("com.android.discord", "com.android.discord.SearchActivity");
            intent.putExtra("query", str6);
//            intent.setFlags(261666666);
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            String trim6 = str6.trim();
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://discord.gg/"+trim6)));
        }

    }

    @SuppressLint("WrongConstant")
    public void speak_discord() {
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



    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        if(requestCode==11 && resultCode == -1 && intent !=null){
            search_wp(intent.getStringArrayListExtra("android.speech.extra.RESULTS").get(0));
        }
        if(requestCode==12 && resultCode == -1 && intent !=null){
            search_twitter(intent.getStringArrayListExtra("android.speech.extra.RESULTS").get(0));

        }
        if(requestCode==1 && resultCode == -1 && intent !=null){
            search_fb(intent.getStringArrayListExtra("android.speech.extra.RESULTS").get(0));

        }
        if(requestCode==2 && resultCode == -1 && intent !=null){
            search_insta(intent.getStringArrayListExtra("android.speech.extra.RESULTS").get(0));

        }
        if(requestCode==3 && resultCode == -1 && intent !=null){
            search_linkedin(intent.getStringArrayListExtra("android.speech.extra.RESULTS").get(0));

        }
        if(requestCode==4 && resultCode == -1 && intent !=null){
            search_snap(intent.getStringArrayListExtra("android.speech.extra.RESULTS").get(0));

        }
        if(requestCode==5 && resultCode == -1 && intent !=null){
            search_pinterest(intent.getStringArrayListExtra("android.speech.extra.RESULTS").get(0));

        }
        if(requestCode==6 && resultCode == -1 && intent !=null){
            search_discord(intent.getStringArrayListExtra("android.speech.extra.RESULTS").get(0));

        }
    }
}