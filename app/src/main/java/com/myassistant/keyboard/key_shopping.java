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

public class key_shopping extends AppCompatActivity {
    ImageView amazon,flipkart,myntra,meesho,tatacliq,ajio,snapdeal,jiomart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_key_shopping);
        getSupportActionBar().hide();
        amazon = findViewById(R.id.amazon);
        flipkart = findViewById(R.id.flipkart);
        myntra = findViewById(R.id.myntra);
        meesho = findViewById(R.id.meesho);
        tatacliq = findViewById(R.id.tatacliq);
        ajio = findViewById(R.id.ajio);
        snapdeal = findViewById(R.id.snapdeal);
        jiomart = findViewById(R.id.jiomart);

        amazon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(key_shopping.this);
                View inflate = getLayoutInflater().inflate(R.layout.custom_dialog, (ViewGroup) null);
                builder.setView(inflate);
                TextView txt = inflate.findViewById(R.id.txt);
                ImageView img = inflate.findViewById(R.id.img);
                img.setImageResource(R.drawable.amazon);
                txt.setText("Amazon");
                builder.setPositiveButton("Search", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        EditText editText = inflate.findViewById(R.id.editText);
                        String trim1 = editText.getText().toString();

                        try {
                            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
                            intent.setClassName("com.android.amazon", "com.android.amazon.SearchActivity");
//                            intent.putExtra("query", str1);
//            intent.setFlags(261435456);
                            startActivity(intent);
                        } catch (ActivityNotFoundException unused) {
//                            String trim1 = str1.trim();
                            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.amazon.com/s/ref=nb_sb_noss_2?url=search-alias%3Daps&field-keywords=" + trim1)));
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

        flipkart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(key_shopping.this);
                View inflate = getLayoutInflater().inflate(R.layout.custom_dialog, (ViewGroup) null);
                builder.setView(inflate);
                TextView txt = inflate.findViewById(R.id.txt);
                ImageView img = inflate.findViewById(R.id.img);
                img.setImageResource(R.drawable.flipkart);
                txt.setText("Flipkart");
                builder.setPositiveButton("Search", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        EditText editText = inflate.findViewById(R.id.editText);
                        String trim1 = editText.getText().toString();

                        try {
                            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
                            intent.setClassName("com.android.flipkart", "com.android.flipkart.SearchActivity");
//                            intent.putExtra("query", str2);
//            intent.setFlags(261435456);
                            startActivity(intent);
                        } catch (ActivityNotFoundException unused) {
//                            String trim2 = str2.trim();
                            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.flipkart.com/search?q="+trim1+"&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off")));
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

        myntra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(key_shopping.this);
                View inflate = getLayoutInflater().inflate(R.layout.custom_dialog, (ViewGroup) null);
                builder.setView(inflate);
                TextView txt = inflate.findViewById(R.id.txt);
                ImageView img = inflate.findViewById(R.id.img);
                img.setImageResource(R.drawable.myntra);
                txt.setText("Myntra");
                builder.setPositiveButton("Search", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        EditText editText = inflate.findViewById(R.id.editText);
                        String trim1 = editText.getText().toString();

                        try {
                            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
                            intent.setClassName("com.android.myntra", "com.android.myntra.SearchActivity");
//                            intent.putExtra("query", str3);
//            intent.setFlags(261435456);
                            startActivity(intent);
                        } catch (ActivityNotFoundException unused) {
//                            String trim3 = str3.trim();
                            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.myntra.com/"+trim1)));
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

        meesho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(key_shopping.this);
                View inflate = getLayoutInflater().inflate(R.layout.custom_dialog, (ViewGroup) null);
                builder.setView(inflate);
                TextView txt = inflate.findViewById(R.id.txt);
                ImageView img = inflate.findViewById(R.id.img);
                img.setImageResource(R.drawable.meesho);
                txt.setText("Meesho");
                builder.setPositiveButton("Search", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        EditText editText = inflate.findViewById(R.id.editText);
                        String trim1 = editText.getText().toString();

                        try {
                            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
                            intent.setClassName("com.android.meesho", "com.android.meesho.SearchActivity");
//                            intent.putExtra("query", str4);
//            intent.setFlags(261435456);
                            startActivity(intent);
                        } catch (ActivityNotFoundException unused) {
//                            String trim4 = str4.trim();
                            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://meesho.com/search?q="+trim1+"&searchType=manual&searchIdentifier=text_search")));
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

        tatacliq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(key_shopping.this);
                View inflate = getLayoutInflater().inflate(R.layout.custom_dialog, (ViewGroup) null);
                builder.setView(inflate);
                TextView txt = inflate.findViewById(R.id.txt);
                ImageView img = inflate.findViewById(R.id.img);
                img.setImageResource(R.drawable.tatacliq);
                txt.setText("Tata Cliq");
                builder.setPositiveButton("Search", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        EditText editText = inflate.findViewById(R.id.editText);
                        String trim1 = editText.getText().toString();

                        try {
                            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
                            intent.setClassName("com.android.tatacliq", "com.android.tatacliq.SearchActivity");
//                            intent.putExtra("query", str5);
//            intent.setFlags(261535556);
                            startActivity(intent);
                        } catch (ActivityNotFoundException unused) {
//                            String trim5 = str5.trim();
                            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.tatacliq.com/search/?searchCategory=all&text="+trim1)));
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

        ajio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(key_shopping.this);
                View inflate = getLayoutInflater().inflate(R.layout.custom_dialog, (ViewGroup) null);
                builder.setView(inflate);
                TextView txt = inflate.findViewById(R.id.txt);
                ImageView img = inflate.findViewById(R.id.img);
                img.setImageResource(R.drawable.ajio);
                txt.setText("Ajio");
                builder.setPositiveButton("Search", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        EditText editText = inflate.findViewById(R.id.editText);
                        String trim1 = editText.getText().toString();

                        try {
                            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
                            intent.setClassName("com.android.ajio", "com.android.ajio.SearchActivity");
//                            intent.putExtra("query", str6);
//            intent.setFlags(261636666);
                            startActivity(intent);
                        } catch (ActivityNotFoundException unused) {
//                            String trim6 = str6.trim();
                            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://ajio.com/search?q="+trim1+"&searchType=manual&searchIdentifier=text_search")));
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

        snapdeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(key_shopping.this);
                View inflate = getLayoutInflater().inflate(R.layout.custom_dialog, (ViewGroup) null);
                builder.setView(inflate);
                TextView txt = inflate.findViewById(R.id.txt);
                ImageView img = inflate.findViewById(R.id.img);
                img.setImageResource(R.drawable.snapdeal);
                txt.setText("snapdeal");
                builder.setPositiveButton("Search", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        EditText editText = inflate.findViewById(R.id.editText);
                        String trim1 = editText.getText().toString();

                        try {
                            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
                            intent.setClassName("com.android.snapdeal", "com.android.snapdeal.SearchActivity");
//                            intent.putExtra("query", str7);
//            intent.setFlags(271737777);
                            startActivity(intent);
                        } catch (ActivityNotFoundException unused) {
//                            String trim7 = str7.trim();
                            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.snapdeal.com/search?keyword="+trim1+"&santizedKeyword=&catId=&categoryId=0&suggested=false&vertical=&noOfResults=20&searchState=&clickSrc=go_header&lastKeyword=&prodCatId=&changeBackToAll=false&foundInAll=false&categoryIdSearched=&cityPageUrl=&categoryUrl=&url=&utmContent=&dealDetail=&sort=rlvncy")));
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

        jiomart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(key_shopping.this);
                View inflate = getLayoutInflater().inflate(R.layout.custom_dialog, (ViewGroup) null);
                builder.setView(inflate);
                TextView txt = inflate.findViewById(R.id.txt);
                ImageView img = inflate.findViewById(R.id.img);
                img.setImageResource(R.drawable.jiomart);
                txt.setText("Jio Mart");
                builder.setPositiveButton("Search", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        EditText editText = inflate.findViewById(R.id.editText);
                        String trim1 = editText.getText().toString();

                        try {
                            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
                            intent.setClassName("com.android.jiomart", "com.android.jiomart.SearchActivity");
//                            intent.putExtra("query", str8);
//            intent.setFlags(281838888);
                            startActivity(intent);
                        } catch (ActivityNotFoundException unused) {
//                            String trim8 = str8.trim();
                            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.jiomart.com/catalogsearch/result?q="+trim1)));
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