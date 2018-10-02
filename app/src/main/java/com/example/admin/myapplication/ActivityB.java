package com.example.admin.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class ActivityB extends AppCompatActivity {
    private ListView lv;
    private TextView hoten;
    private TextView sodienthoai;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        lv =(ListView) findViewById(R.id.lv);
        ArrayList<Contact> contacts =new ArrayList<>();
        hoten = (TextView) findViewById(R.id.hotenb);
        sodienthoai = (TextView) findViewById(R.id.sodienthoaib);
        Intent intent = getIntent();
        hoten.setText(intent.getStringExtra(MainActivity.HoTen));
        sodienthoai.setText(intent.getStringExtra(MainActivity.SoDienThoai));
        String hotend = hoten.getText()+"";
        String sodienthoaid = sodienthoai.getText()+"";

        contacts.add(new Contact(hotend , sodienthoaid));
        ConTactAddapter cta = new ConTactAddapter(this,R.layout.list_contact,contacts);

        lv.setAdapter(cta);

    }
}


