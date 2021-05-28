package com.example.cipher;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static boolean a = true;
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.previewdialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setCancelable(false);
        TextView btnclose = (TextView) dialog.findViewById(R.id.btnclose);
        btnclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        if (a) {
            dialog.show();
            a = false;
        }
        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.show();
            }
        });
        getSupportActionBar().hide();
        Intent intent = getIntent();
    }

    public void sendMessage1(View view) {
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }

        });
        Intent intent1 = new Intent(this, goCipher.class);
        intent1.putExtra("cipher", 1);
        startActivity(intent1);
        finish();
    }

    public void sendMessage2(View view) {
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        Intent intent1 = new Intent(this, goCipher.class);
        intent1.putExtra("cipher", 2);
        startActivity(intent1);
        finish();
    }

    public void sendMessage3(View view) {
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }

        });
        Intent intent1 = new Intent(this, goCipher.class);
        intent1.putExtra("cipher", 3);
        startActivity(intent1);
        finish();
    }

    public void sendMessage4(View view) {
        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        Intent intent1 = new Intent(this, goCipher.class);
        intent1.putExtra("cipher", 4);
        startActivity(intent1);
        finish();
    }
    //Сист кнопка назад
    @Override
    public void onBackPressed() {
        finishAffinity();
    }
}