package com.example.lynx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Registration5 extends AppCompatActivity {

    String first;
    String last;
    String day;
    String month;
    String year;
    String sex;
    String phone;
    String email;
    String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration5);
        Intent intent=getIntent();
        first = intent.getStringExtra("first");
        last = intent.getStringExtra("last");
        day = intent.getStringExtra("day");
        month = intent.getStringExtra("month");
        year = intent.getStringExtra("year");
        sex = intent.getStringExtra("sex");
        phone = intent.getStringExtra("phone");
        email = intent.getStringExtra("email");
        password = intent.getStringExtra("password");

        Log.wtf("info", "first:"+first+"  last:"+last+"   day"+day+"   month"+month+"   year"+year+"    sex"+sex+"    phone"+phone+"    email"+email+"    password"+password);
    }
}
