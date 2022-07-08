package com.myassistant.keyboard;

import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.myassistant.R;

public class key_music extends AppCompatActivity {
    ImageView spotify,gaana,ytmusic,applemusic,amazonmusic,jiosavan,hungama,wynk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_key_music);
        getSupportActionBar().hide();
        spotify = findViewById(R.id.spotify);
        gaana = findViewById(R.id.gaana);
        ytmusic = findViewById(R.id.ytmusic);
        applemusic = findViewById(R.id.applemusic);
        amazonmusic = findViewById(R.id.amazonmusic);
        jiosavan = findViewById(R.id.jiosavan);
        hungama = findViewById(R.id.hungama);
        wynk = findViewById(R.id.wynk);

        spotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(key_music.this);
                View inflate = getLayoutInflater().inflate(R.layout.custom_dialog, (ViewGroup) null);
                builder.setView(inflate);
                TextView txt = inflate.findViewById(R.id.txt);
                ImageView img = inflate.findViewById(R.id.img);
                img.setImageResource(R.drawable.spotify);
                txt.setText("Spotify");
                builder.setPositiveButton("Search", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        EditText editText = inflate.findViewById(R.id.editText);
                        String trim1 = editText.getText().toString();

                        try {
                            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
                            intent.setClassName("com.android.spotify", "com.android.spotify.SearchActivity");
//                            intent.putExtra("query", str1);
//            intent.setFlags(261435456);
                            startActivity(intent);
                        } catch (ActivityNotFoundException unused) {
//                            String trim1 = str1.trim();
                            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://open.spotify.com/search/results/" + trim1)));
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

        gaana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(key_music.this);
                View inflate = getLayoutInflater().inflate(R.layout.custom_dialog, (ViewGroup) null);
                builder.setView(inflate);
                TextView txt = inflate.findViewById(R.id.txt);
                ImageView img = inflate.findViewById(R.id.img);
                img.setImageResource(R.drawable.gaana);
                txt.setText("Gaana");
                builder.setPositiveButton("Search", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        EditText editText = inflate.findViewById(R.id.editText);
                        String trim1 = editText.getText().toString();

                        try {
                            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
                            intent.setClassName("com.android.gaana", "com.android.gaana.SearchActivity");
//                            intent.putExtra("query", str2);
//            intent.setFlags(261435456);
                            startActivity(intent);
                        } catch (ActivityNotFoundException unused) {
//                            String trim2 = str2.trim();
                            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://gaana.com/search/"+trim1)));
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

        ytmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(key_music.this);
                View inflate = getLayoutInflater().inflate(R.layout.custom_dialog, (ViewGroup) null);
                builder.setView(inflate);
                TextView txt = inflate.findViewById(R.id.txt);
                ImageView img = inflate.findViewById(R.id.img);
                img.setImageResource(R.drawable.ytmusic);
                txt.setText("YouTube Music");
                builder.setPositiveButton("Search", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        EditText editText = inflate.findViewById(R.id.editText);
                        String trim1 = editText.getText().toString();

                        try {
                            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
                            intent.setClassName("com.android.ytmusic", "com.android.ytmusic.SearchActivity");
//                            intent.putExtra("query", str3);
//            intent.setFlags(261435456);
                            startActivity(intent);
                        } catch (ActivityNotFoundException unused) {
//                            String trim3 = str3.trim();
                            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://music.youtube.com/search?q="+trim1)));
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

        applemusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(key_music.this);
                View inflate = getLayoutInflater().inflate(R.layout.custom_dialog, (ViewGroup) null);
                builder.setView(inflate);
                TextView txt = inflate.findViewById(R.id.txt);
                ImageView img = inflate.findViewById(R.id.img);
                img.setImageResource(R.drawable.applemusic);
                txt.setText("Apple Music");
                builder.setPositiveButton("Search", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        EditText editText = inflate.findViewById(R.id.editText);
                        String trim1 = editText.getText().toString();

                        try {
                            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
                            intent.setClassName("com.android.applemusic", "com.android.applemusic.SearchActivity");
//                            intent.putExtra("query", str4);
//            intent.setFlags(261435456);
                            startActivity(intent);
                        } catch (ActivityNotFoundException unused) {
//                            String trim4 = str4.trim();
                            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://music.apple.com/us/search?term="+trim1)));
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

        amazonmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(key_music.this);
                View inflate = getLayoutInflater().inflate(R.layout.custom_dialog, (ViewGroup) null);
                builder.setView(inflate);
                TextView txt = inflate.findViewById(R.id.txt);
                ImageView img = inflate.findViewById(R.id.img);
                img.setImageResource(R.drawable.amazonmusic);
                txt.setText("Amazon Music");
                builder.setPositiveButton("Search", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        EditText editText = inflate.findViewById(R.id.editText);
                        String trim1 = editText.getText().toString();

                        try {
                            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
                            intent.setClassName("com.android.amazonmusic", "com.android.amazonmusic.SearchActivity");
//                            intent.putExtra("query", str7);
//            intent.setFlags(271737777);
                            startActivity(intent);
                        } catch (ActivityNotFoundException unused) {
//                            String trim7 = str7.trim();
                            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://music.amazon.com/search/"+trim1+"?filter=IsLibrary%7Cfalse&sc=none")));
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

        jiosavan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(key_music.this);
                View inflate = getLayoutInflater().inflate(R.layout.custom_dialog, (ViewGroup) null);
                builder.setView(inflate);
                TextView txt = inflate.findViewById(R.id.txt);
                ImageView img = inflate.findViewById(R.id.img);
                img.setImageResource(R.drawable.jiosavan);
                txt.setText("JioSaavn");
                builder.setPositiveButton("Search", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        EditText editText = inflate.findViewById(R.id.editText);
                        String trim1 = editText.getText().toString();

                        try {
                            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
                            intent.setClassName("com.android.jiosavan", "com.android.jiosavan.SearchActivity");
//                            intent.putExtra("query", str5);
//            intent.setFlags(261535556);
                            startActivity(intent);
                        } catch (ActivityNotFoundException unused) {
//                            String trim5 = str5.trim();
                            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.jiosaavn.com/search/"+trim1)));
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

        hungama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(key_music.this);
                View inflate = getLayoutInflater().inflate(R.layout.custom_dialog, (ViewGroup) null);
                builder.setView(inflate);
                TextView txt = inflate.findViewById(R.id.txt);
                ImageView img = inflate.findViewById(R.id.img);
                img.setImageResource(R.drawable.hungama);
                txt.setText("Hungama");
                builder.setPositiveButton("Search", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        EditText editText = inflate.findViewById(R.id.editText);
                        String trim1 = editText.getText().toString();

                        try {
                            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
                            intent.setClassName("com.android.hungama", "com.android.hungama.SearchActivity");
//                            intent.putExtra("query", str6);
//            intent.setFlags(261636666);
                            startActivity(intent);
                        } catch (ActivityNotFoundException unused) {
//                            String trim6 = str6.trim();
                            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://hungama.com/search?q="+trim1)));
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

        wynk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(key_music.this);
                View inflate = getLayoutInflater().inflate(R.layout.custom_dialog, (ViewGroup) null);
                builder.setView(inflate);
                TextView txt = inflate.findViewById(R.id.txt);
                ImageView img = inflate.findViewById(R.id.img);
                img.setImageResource(R.drawable.wynk);
                txt.setText("Wynk Music");
                builder.setPositiveButton("Search", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        EditText editText = inflate.findViewById(R.id.editText);
                        String trim1 = editText.getText().toString();

                        try {
                            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
                            intent.setClassName("com.android.wynk", "com.android.wynk.SearchActivity");
//                            intent.putExtra("query", str8);
//            intent.setFlags(281838888);
                            startActivity(intent);
                        } catch (ActivityNotFoundException unused) {
//                            String trim8 = str8.trim();
                            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://wynk.in/music/search/"+trim1)));
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