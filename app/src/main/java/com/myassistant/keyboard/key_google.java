package com.myassistant.keyboard;

import static com.airbnb.lottie.L.TAG;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;
import com.myassistant.R;

public class key_google extends AppCompatActivity {
    LottieAnimationView youtube,google,map,play,chrome,gmail;
    ImageView drive,photo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_key_google);
        getSupportActionBar().hide();
        youtube = findViewById(R.id.youtube);
        google = findViewById(R.id.google);
        map = findViewById(R.id.map);
        play = findViewById(R.id.play);
        chrome = findViewById(R.id.chrome);
        gmail = findViewById(R.id.gmail);
        drive = findViewById(R.id.drive);
        photo = findViewById(R.id.photo);

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(key_google.this);
                View inflate = getLayoutInflater().inflate(R.layout.custom_dialog, (ViewGroup) null);
                builder.setView(inflate);
                TextView txt = inflate.findViewById(R.id.txt);
                ImageView img = inflate.findViewById(R.id.img);
                img.setImageResource(R.drawable.map);
                txt.setText("Google Maps");
                builder.setPositiveButton("Search", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        EditText editText = inflate.findViewById(R.id.editText);
                        String trim1 = editText.getText().toString();

                        try {
                            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
                            intent.setClassName("com.google.android.apps.maps", "com.google.android.gms.maps.SearchActivity");
                            startActivity(intent);
                        } catch (ActivityNotFoundException unused) {
                            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.google.com/maps/search/" + trim1)));
                        }
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                builder.show();
            }
        });

        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(key_google.this);
                View inflate = getLayoutInflater().inflate(R.layout.custom_dialog, (ViewGroup) null);
                builder.setView(inflate);
                TextView txt = inflate.findViewById(R.id.txt);
                ImageView img = inflate.findViewById(R.id.img);
                img.setImageResource(R.drawable.google);
                txt.setText("Google");
                builder.setPositiveButton("Search", new DialogInterface.OnClickListener() {
                    @SuppressLint("RestrictedApi")
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        EditText editText = inflate.findViewById(R.id.editText);
                        String trim1 = editText.getText().toString();

                        try {
                            Log.e(TAG, "trygoogle");
                            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
                            intent.setClassName("com.google.android.googlequicksearchbox", "com.google.android.googlequicksearchbox.SearchActivity");
                            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.google.co.in/search?q=" + trim1)));

//                            intent.putExtra("query", str2);
//            intent.setFlags(268435456);
                            startActivity(intent);
                        } catch (ActivityNotFoundException unused) {
                            Log.e(TAG, "catchgoogle");
//                            String trim2 = str2.trim();
                            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.google.co.in/search?q=" + trim1)));
                        }
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                builder.show();
            }
        });

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(key_google.this);
                View inflate = getLayoutInflater().inflate(R.layout.custom_dialog, (ViewGroup) null);
                builder.setView(inflate);
                TextView txt = inflate.findViewById(R.id.txt);
                ImageView img = inflate.findViewById(R.id.img);
                img.setImageResource(R.drawable.play);
                txt.setText("Play Store");
                builder.setPositiveButton("Search", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        EditText editText = inflate.findViewById(R.id.editText);
                        String trim1 = editText.getText().toString();

                        try {
                            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
                            intent.setClassName("com.google.android.apps.play", "com.google.android.play.SearchActivity");
//                            intent.putExtra("query", str4);
//            intent.setFlags(268435456);
                            startActivity(intent);
                        } catch (ActivityNotFoundException unused) {
//                            String trim4 = str4.trim();
                            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/search?q=" + trim1)));
                        }
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                builder.show();
            }
        });

        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(key_google.this);
                View inflate = getLayoutInflater().inflate(R.layout.custom_dialog, (ViewGroup) null);
                builder.setView(inflate);
                TextView txt = inflate.findViewById(R.id.txt);
                ImageView img = inflate.findViewById(R.id.img);
                img.setImageResource(R.drawable.youtube);
                txt.setText("Youtube");
                builder.setPositiveButton("Search", new DialogInterface.OnClickListener() {
                    @SuppressLint("RestrictedApi")
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        EditText editText = inflate.findViewById(R.id.editText);
                        String trim1 = editText.getText().toString();

                        try {
                            Log.e(TAG, "tryyou");
                            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
                            intent.setClassName("com.android.youtube", "com.google.android.youtube.player.SearchActivity");
//                            intent.putExtra("query", str);
//            intent.setFlags(268435456);
                            startActivity(intent);
                        } catch (ActivityNotFoundException unused) {
                            Log.e(TAG, "catchyou");
//                            String trim = str.trim();
                            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.youtube.com/results?search_query=" + trim1)));
                        }
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                builder.show();
            }
        });

        chrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(key_google.this);
                View inflate = getLayoutInflater().inflate(R.layout.custom_dialog, (ViewGroup) null);
                builder.setView(inflate);
                TextView txt = inflate.findViewById(R.id.txt);
                ImageView img = inflate.findViewById(R.id.img);
                img.setImageResource(R.drawable.chrome);
                txt.setText("Chrome");
                builder.setPositiveButton("Search", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        EditText editText = inflate.findViewById(R.id.editText);
                        String trim1 = editText.getText().toString();

                        try {
                            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
                            intent.setClassName("com.android.chrome", "com.android.chrome.SearchActivity");
//                            intent.putExtra("query", str5);
//            intent.setFlags(268435456);
                            startActivity(intent);
                        } catch (ActivityNotFoundException unused) {
//                            String trim5 = str5.trim();
                            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("googlechrome://search?q=" + trim1)));
                        }
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                builder.show();
            }
        });

        gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(key_google.this);
                View inflate = getLayoutInflater().inflate(R.layout.custom_dialog, (ViewGroup) null);
                builder.setView(inflate);
                TextView txt = inflate.findViewById(R.id.txt);
                ImageView img = inflate.findViewById(R.id.img);
                img.setImageResource(R.drawable.gmail);
                txt.setText("Gmail");
                builder.setPositiveButton("Send Email", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        EditText editText = inflate.findViewById(R.id.editText);
                        String trim1 = editText.getText().toString();

                        Intent email= new Intent(Intent.ACTION_SENDTO);
                        email.setData(Uri.parse("mailto:"+trim1));
//                        email.putExtra(Intent.EXTRA_SUBJECT, "Subject");
//                        email.putExtra(Intent.EXTRA_TEXT, "My Email message");
                        startActivity(email);



                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                builder.show();
            }
        });

        drive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(key_google.this);
                View inflate = getLayoutInflater().inflate(R.layout.custom_dialog, (ViewGroup) null);
                builder.setView(inflate);
                TextView txt = inflate.findViewById(R.id.txt);
                ImageView img = inflate.findViewById(R.id.img);
                img.setImageResource(R.drawable.drive);
                txt.setText("Google Drive");
                builder.setPositiveButton("Search", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        EditText editText = inflate.findViewById(R.id.editText);
                        String trim1 = editText.getText().toString();

                        try {
                            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
                            intent.setClassName("com.google.android.apps.docs", "com.android.drive.SearchActivity");
//                            intent.putExtra("query", str7);
//            intent.setFlags(271777777);
                            startActivity(intent);
                        } catch (ActivityNotFoundException unused) {
//                            String trim7 = str7.trim();
                            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://drive.google.com/drive/u/0/search?q="+trim1)));
                        }
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                builder.show();
            }
        });

        photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(key_google.this);
                View inflate = getLayoutInflater().inflate(R.layout.custom_dialog, (ViewGroup) null);
                builder.setView(inflate);
                TextView txt = inflate.findViewById(R.id.txt);
                ImageView img = inflate.findViewById(R.id.img);
                img.setImageResource(R.drawable.photo);
                txt.setText("Google Photos");
                builder.setPositiveButton("Search", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        EditText editText = inflate.findViewById(R.id.editText);
                        String trim1 = editText.getText().toString();

                        try {
                            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
                            intent.setClassName("com.google.android.apps.photos", "com.android.photo.SearchActivity");
//                            intent.putExtra("query", str8);
//            intent.setFlags(281888888);
                            startActivity(intent);
                        } catch (ActivityNotFoundException unused) {
//                            String trim8 = str8.trim();
                            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://photos.google.com/search/"+trim1)));
                        }
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                builder.show();
            }
        });








    }
}