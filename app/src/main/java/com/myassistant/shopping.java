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

public class shopping extends AppCompatActivity {
//    LottieAnimationView amazon;
    ImageView amazon,flipkart,myntra,meesho,tatacliq,ajio,snapdeal,jiomart;
    SharedPreferences sp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);
        amazon = findViewById(R.id.amazon);
        flipkart = findViewById(R.id.flipkart);
        myntra = findViewById(R.id.myntra);
        meesho = findViewById(R.id.meesho);
        tatacliq = findViewById(R.id.tatacliq);
        ajio = findViewById(R.id.ajio);
        snapdeal = findViewById(R.id.snapdeal);
        jiomart = findViewById(R.id.jiomart);
        getSupportActionBar().hide();

        sp = getSharedPreferences("MyP",MODE_PRIVATE);


        amazon.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(shopping.this, "android.permission.RECORD_AUDIO") == 0 || Build.VERSION.SDK_INT < 23) {
                    shopping.this.speak_amazon();
                } else if (ActivityCompat.shouldShowRequestPermissionRationale(shopping.this, "android.permission.RECORD_AUDIO")) {
                    Snackbar.make(view, "This is main activity", Snackbar.LENGTH_LONG).setAction((CharSequence) "ENABLE", (View.OnClickListener) new View.OnClickListener() {
                        public void onClick(View view) {
                            ActivityCompat.requestPermissions(shopping.this, new String[]{"android.permission.RECORD_AUDIO"}, 1);
                        }
                    }).show();
                } else {
                    ActivityCompat.requestPermissions(shopping.this, new String[]{"android.permission.RECORD_AUDIO"}, 1);
                }
            }
        });

        flipkart.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(shopping.this, "android.permission.RECORD_AUDIO") == 0 || Build.VERSION.SDK_INT < 23) {
                    shopping.this.speak_flipkart();
                } else if (ActivityCompat.shouldShowRequestPermissionRationale(shopping.this, "android.permission.RECORD_AUDIO")) {
                    Snackbar.make(view, "This is main activity", Snackbar.LENGTH_LONG).setAction((CharSequence) "ENABLE", (View.OnClickListener) new View.OnClickListener() {
                        public void onClick(View view) {
                            ActivityCompat.requestPermissions(shopping.this, new String[]{"android.permission.RECORD_AUDIO"}, 2);
                        }
                    }).show();
                } else {
                    ActivityCompat.requestPermissions(shopping.this, new String[]{"android.permission.RECORD_AUDIO"}, 2);
                }
            }
        });

        myntra.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(shopping.this, "android.permission.RECORD_AUDIO") == 0 || Build.VERSION.SDK_INT < 23) {
                    shopping.this.speak_myntra();
                } else if (ActivityCompat.shouldShowRequestPermissionRationale(shopping.this, "android.permission.RECORD_AUDIO")) {
                    Snackbar.make(view, "This is main activity", Snackbar.LENGTH_LONG).setAction((CharSequence) "ENABLE", (View.OnClickListener) new View.OnClickListener() {
                        public void onClick(View view) {
                            ActivityCompat.requestPermissions(shopping.this, new String[]{"android.permission.RECORD_AUDIO"}, 3);
                        }
                    }).show();
                } else {
                    ActivityCompat.requestPermissions(shopping.this, new String[]{"android.permission.RECORD_AUDIO"}, 3);
                }
            }
        });

        meesho.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(shopping.this, "android.permission.RECORD_AUDIO") == 0 || Build.VERSION.SDK_INT < 23) {
                    shopping.this.speak_meesho();
                } else if (ActivityCompat.shouldShowRequestPermissionRationale(shopping.this, "android.permission.RECORD_AUDIO")) {
                    Snackbar.make(view, "This is main activity", Snackbar.LENGTH_LONG).setAction((CharSequence) "ENABLE", (View.OnClickListener) new View.OnClickListener() {
                        public void onClick(View view) {
                            ActivityCompat.requestPermissions(shopping.this, new String[]{"android.permission.RECORD_AUDIO"}, 4);
                        }
                    }).show();
                } else {
                    ActivityCompat.requestPermissions(shopping.this, new String[]{"android.permission.RECORD_AUDIO"}, 4);
                }
            }
        });

        tatacliq.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(shopping.this, "android.permission.RECORD_AUDIO") == 0 || Build.VERSION.SDK_INT < 23) {
                    shopping.this.speak_tatacliq();
                } else if (ActivityCompat.shouldShowRequestPermissionRationale(shopping.this, "android.permission.RECORD_AUDIO")) {
                    Snackbar.make(view, "This is main activity", Snackbar.LENGTH_LONG).setAction((CharSequence) "ENABLE", (View.OnClickListener) new View.OnClickListener() {
                        public void onClick(View view) {
                            ActivityCompat.requestPermissions(shopping.this, new String[]{"android.permission.RECORD_AUDIO"}, 5);
                        }
                    }).show();
                } else {
                    ActivityCompat.requestPermissions(shopping.this, new String[]{"android.permission.RECORD_AUDIO"}, 5);
                }
            }
        });

        ajio.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(shopping.this, "android.permission.RECORD_AUDIO") == 0 || Build.VERSION.SDK_INT < 23) {
                    shopping.this.speak_ajio();
                } else if (ActivityCompat.shouldShowRequestPermissionRationale(shopping.this, "android.permission.RECORD_AUDIO")) {
                    Snackbar.make(view, "This is main activity", Snackbar.LENGTH_LONG).setAction((CharSequence) "ENABLE", (View.OnClickListener) new View.OnClickListener() {
                        public void onClick(View view) {
                            ActivityCompat.requestPermissions(shopping.this, new String[]{"android.permission.RECORD_AUDIO"}, 6);
                        }
                    }).show();
                } else {
                    ActivityCompat.requestPermissions(shopping.this, new String[]{"android.permission.RECORD_AUDIO"}, 6);
                }
            }
        });

        snapdeal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(shopping.this, "android.permission.RECORD_AUDIO") == 0 || Build.VERSION.SDK_INT < 23) {
                    shopping.this.speak_snapdeal();
                } else if (ActivityCompat.shouldShowRequestPermissionRationale(shopping.this, "android.permission.RECORD_AUDIO")) {
                    Snackbar.make(view, "This is main activity", Snackbar.LENGTH_LONG).setAction((CharSequence) "ENABLE", (View.OnClickListener) new View.OnClickListener() {
                        public void onClick(View view) {
                            ActivityCompat.requestPermissions(shopping.this, new String[]{"android.permission.RECORD_AUDIO"}, 7);
                        }
                    }).show();
                } else {
                    ActivityCompat.requestPermissions(shopping.this, new String[]{"android.permission.RECORD_AUDIO"}, 7);
                }
            }
        });


        jiomart.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(shopping.this, "android.permission.RECORD_AUDIO") == 0 || Build.VERSION.SDK_INT < 23) {
                    shopping.this.speak_jiomart();
                } else if (ActivityCompat.shouldShowRequestPermissionRationale(shopping.this, "android.permission.RECORD_AUDIO")) {
                    Snackbar.make(view, "This is main activity", Snackbar.LENGTH_LONG).setAction((CharSequence) "ENABLE", (View.OnClickListener) new View.OnClickListener() {
                        public void onClick(View view) {
                            ActivityCompat.requestPermissions(shopping.this, new String[]{"android.permission.RECORD_AUDIO"}, 8);
                        }
                    }).show();
                } else {
                    ActivityCompat.requestPermissions(shopping.this, new String[]{"android.permission.RECORD_AUDIO"}, 8);
                }
            }
        });



    }


    @SuppressLint("WrongConstant")
    public void speak_amazon() {
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

    public void search_amazon(String str1) {
        try {
            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
            intent.setClassName("com.android.amazon", "com.android.amazon.SearchActivity");
            intent.putExtra("query", str1);
//            intent.setFlags(261435456);
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            String trim1 = str1.trim();
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.amazon.com/s/ref=nb_sb_noss_2?url=search-alias%3Daps&field-keywords=" + trim1)));
        }

    }


    @SuppressLint("WrongConstant")
    public void speak_flipkart() {
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

    public void search_flipkart(String str2) {
        try {
            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
            intent.setClassName("com.android.flipkart", "com.android.flipkart.SearchActivity");
            intent.putExtra("query", str2);
//            intent.setFlags(261435456);
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            String trim2 = str2.trim();
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.flipkart.com/search?q="+trim2+"&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off")));
        }

    }



    @SuppressLint("WrongConstant")
    public void speak_myntra() {
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

    public void search_myntra(String str3) {
        try {
            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
            intent.setClassName("com.android.myntra", "com.android.myntra.SearchActivity");
            intent.putExtra("query", str3);
//            intent.setFlags(261435456);
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            String trim3 = str3.trim();
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.myntra.com/"+trim3)));
        }

    }


    @SuppressLint("WrongConstant")
    public void speak_meesho() {
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

    public void search_meesho(String str4) {
        try {
            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
            intent.setClassName("com.android.meesho", "com.android.meesho.SearchActivity");
            intent.putExtra("query", str4);
//            intent.setFlags(261435456);
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            String trim4 = str4.trim();
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://meesho.com/search?q="+trim4+"&searchType=manual&searchIdentifier=text_search")));
        }

    }


    @SuppressLint("WrongConstant")
    public void speak_tatacliq() {
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

    public void search_tatacliq(String str5) {
        try {
            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
            intent.setClassName("com.android.tatacliq", "com.android.tatacliq.SearchActivity");
            intent.putExtra("query", str5);
//            intent.setFlags(261535556);
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            String trim5 = str5.trim();
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.tatacliq.com/search/?searchCategory=all&text="+trim5)));
        }

    }


    @SuppressLint("WrongConstant")
    public void speak_ajio() {
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

    public void search_ajio(String str6) {
        try {
            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
            intent.setClassName("com.android.ajio", "com.android.ajio.SearchActivity");
            intent.putExtra("query", str6);
//            intent.setFlags(261636666);
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            String trim6 = str6.trim();
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://ajio.com/search?q="+trim6+"&searchType=manual&searchIdentifier=text_search")));
        }

    }



    public void search_snapdeal(String str7) {
        try {
            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
            intent.setClassName("com.android.snapdeal", "com.android.snapdeal.SearchActivity");
            intent.putExtra("query", str7);
//            intent.setFlags(271737777);
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            String trim7 = str7.trim();
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.snapdeal.com/search?keyword="+trim7+"&santizedKeyword=&catId=&categoryId=0&suggested=false&vertical=&noOfResults=20&searchState=&clickSrc=go_header&lastKeyword=&prodCatId=&changeBackToAll=false&foundInAll=false&categoryIdSearched=&cityPageUrl=&categoryUrl=&url=&utmContent=&dealDetail=&sort=rlvncy")));
        }

    }

    @SuppressLint("WrongConstant")
    public void speak_snapdeal() {
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


    public void search_jiomart(String str8) {
        try {
            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
            intent.setClassName("com.android.jiomart", "com.android.jiomart.SearchActivity");
            intent.putExtra("query", str8);
//            intent.setFlags(281838888);
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            String trim8 = str8.trim();
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.jiomart.com/catalogsearch/result?q="+trim8)));
        }

    }

    @SuppressLint("WrongConstant")
    public void speak_jiomart() {
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
            search_amazon(intent.getStringArrayListExtra("android.speech.extra.RESULTS").get(0));

        }
        if(requestCode==2 && resultCode == -1 && intent !=null){
            search_flipkart(intent.getStringArrayListExtra("android.speech.extra.RESULTS").get(0));

        }
        if(requestCode==3 && resultCode == -1 && intent !=null){
            search_myntra(intent.getStringArrayListExtra("android.speech.extra.RESULTS").get(0));

        }
        if(requestCode==4 && resultCode == -1 && intent !=null){
            search_meesho(intent.getStringArrayListExtra("android.speech.extra.RESULTS").get(0));

        }
        if(requestCode==5 && resultCode == -1 && intent !=null){
            search_tatacliq(intent.getStringArrayListExtra("android.speech.extra.RESULTS").get(0));

        }
        if(requestCode==6 && resultCode == -1 && intent !=null){
            search_ajio(intent.getStringArrayListExtra("android.speech.extra.RESULTS").get(0));

        }
        if(requestCode==7 && resultCode == -1 && intent !=null){
            search_snapdeal(intent.getStringArrayListExtra("android.speech.extra.RESULTS").get(0));

        }
        if(requestCode==8 && resultCode == -1 && intent !=null){
            search_jiomart(intent.getStringArrayListExtra("android.speech.extra.RESULTS").get(0));

        }
    }
}