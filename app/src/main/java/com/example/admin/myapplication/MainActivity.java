package com.example.admin.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button btnsend;
    private EditText hoten;
    private EditText sodienthoai;
    public static final String HoTen = "Hoten";
    public static final String SoDienThoai = "Sodienthoai";
    public static final String BUNDLE = "bundel";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnsend = (Button) findViewById(R.id.sendata);
        hoten = (EditText) findViewById(R.id.hoten);
        sodienthoai = (EditText) findViewById(R.id.sodienthoai);
        btnsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                byExtras();
                // byBundle();
            }
        });
    }

    public void byExtras() {
        Intent intent = new Intent(MainActivity.this, ActivityB.class);
        intent.putExtra(HoTen, hoten.getText().toString());
        intent.putExtra(SoDienThoai, sodienthoai.getText().toString());
        startActivity(intent);
    }

}


