package com.myassistant.phone_category;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.myassistant.R;

public class p_sms extends AppCompatActivity {
    EditText number, msg;
    LinearLayout send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psms);
        getSupportActionBar().hide();
        send = findViewById(R.id.send);
        number = findViewById(R.id.number);
        msg = findViewById(R.id.msg);

//        call.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                if (ContextCompat.checkSelfPermission(p_sms.this, "android.permission.CALL_PHONE") == 0 || Build.VERSION.SDK_INT < 23) {
//
//                    String phoneNumber = number.getText().toString();
//                    Intent intent = new Intent(Intent.ACTION_CALL);
//                    intent.setData(Uri.parse("tel:"+phoneNumber));
//                    startActivity(intent);
//                    number.setText("");
//
//                } else if (ActivityCompat.shouldShowRequestPermissionRationale(p_sms.this, "android.permission.CALL_PHONE")) {
//                    Snackbar.make(view, "Allow to record audio?", Snackbar.LENGTH_LONG).setAction((CharSequence) "ENABLE", (View.OnClickListener) new View.OnClickListener() {
//                        public void onClick(View view) {
//                            ActivityCompat.requestPermissions(p_sms.this, new String[]{"android.permission.CALL_PHONE"}, 1);
//                        }
//                    }).show();
//                } else {
//                    ActivityCompat.requestPermissions(p_sms.this, new String[]{"android.permission.CALL_PHONE"}, 1);
//                }
//
//            }
//        });
        send.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {

                if (checkSelfPermission(Manifest.permission.SEND_SMS) == PackageManager.PERMISSION_GRANTED){
                    sendsms();
                }else {
                    requestPermissions(new String[]{Manifest.permission.SEND_SMS},1);
                }
                number.setText("");
                msg.setText("");
            }
        });


    }

    private void sendsms() {
        String phoneNumber = number.getText().toString();
        String sms = msg.getText().toString();
        try {
            SmsManager smsm = SmsManager.getDefault();
            smsm.sendTextMessage(phoneNumber, null, sms, null, null);
            Toast.makeText(this, "Message sent", Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, "Sending failed", Toast.LENGTH_SHORT).show();
        }

    }
}