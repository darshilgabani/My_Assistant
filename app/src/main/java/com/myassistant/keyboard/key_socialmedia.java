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

import com.airbnb.lottie.LottieAnimationView;
import com.myassistant.R;

public class key_socialmedia extends AppCompatActivity {
    LottieAnimationView wp,twitter,fb,insta,linkedin,snap,pinterest,discord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_key_socialmedia);
        getSupportActionBar().hide();
        wp = findViewById(R.id.wp);
        twitter = findViewById(R.id.twitter);
        fb = findViewById(R.id.fb);
        insta = findViewById(R.id.insta);
        linkedin = findViewById(R.id.linkedin);
        snap = findViewById(R.id.snap);
        pinterest = findViewById(R.id.pinterest);
        discord = findViewById(R.id.discord);

        wp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(key_socialmedia.this);
                View inflate = getLayoutInflater().inflate(R.layout.custom_dialog, (ViewGroup) null);
                builder.setView(inflate);
                TextView txt = inflate.findViewById(R.id.txt);
                ImageView img = inflate.findViewById(R.id.img);
                img.setImageResource(R.drawable.wp);
                txt.setText("WhatsApp");
                builder.setPositiveButton("Search", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        EditText editText = inflate.findViewById(R.id.editText);
                        String trim1 = editText.getText().toString();

                        Intent intent = new Intent();
                        intent.setAction(Intent.ACTION_SEND);
                        intent.putExtra(Intent.EXTRA_TEXT, trim1);
                        intent.setType("text/plain");
                        intent.setPackage("com.whatsapp");
                        startActivity(intent);
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

        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(key_socialmedia.this);
                View inflate = getLayoutInflater().inflate(R.layout.custom_dialog, (ViewGroup) null);
                builder.setView(inflate);
                TextView txt = inflate.findViewById(R.id.txt);
                ImageView img = inflate.findViewById(R.id.img);
                img.setImageResource(R.drawable.twitter);
                txt.setText("Twitter");
                builder.setPositiveButton("Search", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        EditText editText = inflate.findViewById(R.id.editText);
                        String trim1 = editText.getText().toString();

                        try {
                            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
                            intent.setClassName("com.twitter.android", "com.android.twitter.SearchActivity");
//                            intent.putExtra("query", str12);
//            intent.setFlags(21184354511);
                            startActivity(intent);
                        } catch (ActivityNotFoundException unused) {
//                            String trim12 = str12.trim();
                            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://twitter.com/search?q=" +trim1+"&src=typed_query")));
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

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(key_socialmedia.this);
                View inflate = getLayoutInflater().inflate(R.layout.custom_dialog, (ViewGroup) null);
                builder.setView(inflate);
                TextView txt = inflate.findViewById(R.id.txt);
                ImageView img = inflate.findViewById(R.id.img);
                img.setImageResource(R.drawable.fb);
                txt.setText("Facebook");
                builder.setPositiveButton("Search", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        EditText editText = inflate.findViewById(R.id.editText);
                        String trim1 = editText.getText().toString();

                        try {
                            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
                            intent.setClassName("com.facebook.android", "com.android.facebook.SearchActivity");
//                            intent.putExtra("query", str1);
//            intent.setFlags(21184354511);
                            startActivity(intent);
                        } catch (ActivityNotFoundException unused) {
//                            String trim1 = str1.trim();
                            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("fb://facewebmodal/?=" + trim1)));
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

        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(key_socialmedia.this);
                View inflate = getLayoutInflater().inflate(R.layout.custom_dialog, (ViewGroup) null);
                builder.setView(inflate);
                TextView txt = inflate.findViewById(R.id.txt);
                ImageView img = inflate.findViewById(R.id.img);
                img.setImageResource(R.drawable.insta);
                txt.setText("Instagram");
                builder.setPositiveButton("Search", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        EditText editText = inflate.findViewById(R.id.editText);
                        String trim1 = editText.getText().toString();

                        try {
                            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
                            intent.setClassName("com.instagram.android", "com.android.instagram.SearchActivity");
//                            intent.putExtra("query", str2);
//            intent.setFlags(21184354511);
                            startActivity(intent);
                        } catch (ActivityNotFoundException unused) {
//                            String trim2 = str2.trim();
                            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("instagram://user?username=" + trim1)));
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

        linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(key_socialmedia.this);
                View inflate = getLayoutInflater().inflate(R.layout.custom_dialog, (ViewGroup) null);
                builder.setView(inflate);
                TextView txt = inflate.findViewById(R.id.txt);
                ImageView img = inflate.findViewById(R.id.img);
                img.setImageResource(R.drawable.linkedin);
                txt.setText("LinkedIn");
                builder.setPositiveButton("Search", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        EditText editText = inflate.findViewById(R.id.editText);
                        String trim1 = editText.getText().toString();

                        try {
                            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
                            intent.setClassName("com.android.linkedin", "com.android.linkedin.SearchActivity");
//                            intent.putExtra("query", str3);
//            intent.setFlags(231333333);
                            startActivity(intent);
                        } catch (ActivityNotFoundException unused) {
//                            String trim3 = str3.trim();
                            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.linkedin.com/search/results/all/?keywords="+trim1+"&origin=GLOBAL_SEARCH_HEADER&sid=_zO")));
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

        snap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(key_socialmedia.this);
                View inflate = getLayoutInflater().inflate(R.layout.custom_dialog, (ViewGroup) null);
                builder.setView(inflate);
                TextView txt = inflate.findViewById(R.id.txt);
                ImageView img = inflate.findViewById(R.id.img);
                img.setImageResource(R.drawable.snap);
                txt.setText("Snapchat");
                builder.setPositiveButton("Search", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        EditText editText = inflate.findViewById(R.id.editText);
                        String trim1 = editText.getText().toString();

                        try {
                            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
                            intent.setClassName("com.android.snap", "com.android.snap.SearchActivity");
//                            intent.putExtra("query", str4);
//            intent.setFlags(241444444);
                            startActivity(intent);
                        } catch (ActivityNotFoundException unused) {
//                            String trim4 = str4.trim();
                            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://snapchat.com/add/"+trim1)));
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

        pinterest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(key_socialmedia.this);
                View inflate = getLayoutInflater().inflate(R.layout.custom_dialog, (ViewGroup) null);
                builder.setView(inflate);
                TextView txt = inflate.findViewById(R.id.txt);
                ImageView img = inflate.findViewById(R.id.img);
                img.setImageResource(R.drawable.pinterest);
                txt.setText("Pinterest");
                builder.setPositiveButton("Search", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        EditText editText = inflate.findViewById(R.id.editText);
                        String trim1 = editText.getText().toString();

                        try {
                            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
                            intent.setClassName("com.android.pinterest", "com.android.pinterest.SearchActivity");
//                            intent.putExtra("query", str5);
//            intent.setFlags(251555555);
                            startActivity(intent);
                        } catch (ActivityNotFoundException unused) {
//                            String trim5 = str5.trim();
                            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://in.pinterest.com/search/pins/?q="+trim1+"&rs=typed&term_meta[]="+trim1+"%7Ctyped")));
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

        discord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(key_socialmedia.this);
                View inflate = getLayoutInflater().inflate(R.layout.custom_dialog, (ViewGroup) null);
                builder.setView(inflate);
                TextView txt = inflate.findViewById(R.id.txt);
                ImageView img = inflate.findViewById(R.id.img);
                img.setImageResource(R.drawable.discord);
                txt.setText("Discord");
                builder.setPositiveButton("Search", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        EditText editText = inflate.findViewById(R.id.editText);
                        String trim1 = editText.getText().toString();

                        try {
                            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
                            intent.setClassName("com.android.discord", "com.android.discord.SearchActivity");
//                            intent.putExtra("query", str6);
//            intent.setFlags(261666666);
                            startActivity(intent);
                        } catch (ActivityNotFoundException unused) {
//                            String trim6 = str6.trim();
                            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://discord.gg/"+trim1)));
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