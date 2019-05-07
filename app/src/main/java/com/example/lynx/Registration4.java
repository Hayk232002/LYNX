package com.example.lynx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Registration4 extends AppCompatActivity {

    String first;
    String last;
    String day;
    String month;
    String year;
    String sex;

    Button btn_next_reg4;
    EditText et_phone_reg4;
    EditText et_email_reg4;
    EditText et_password_reg4;
    EditText et_reappass_reg4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration4);

        Intent intent=getIntent();
        first = intent.getStringExtra("first");
        last = intent.getStringExtra("last");
        day = intent.getStringExtra("day");
        month = intent.getStringExtra("month");
        year = intent.getStringExtra("year");
        sex = intent.getStringExtra("sex");

        btn_next_reg4 = (Button) findViewById(R.id.btn_next_reg4);
        et_phone_reg4 = (EditText) findViewById(R.id.et_phone_reg4);
        et_email_reg4 = (EditText) findViewById(R.id.et_email_reg4);
        et_password_reg4 = (EditText) findViewById(R.id.et_password_reg4);
        et_reappass_reg4 = (EditText) findViewById(R.id.et_reappass_reg4);

        btn_next_reg4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Registration4.this,Registration5.class);
                intent.putExtra("first",first);
                intent.putExtra("last",last);
                intent.putExtra("day",day);
                intent.putExtra("month",month);
                intent.putExtra("year",year);
                intent.putExtra("sex",sex);
                intent.putExtra("phone",et_phone_reg4.getText().toString());
                intent.putExtra("email",et_email_reg4.getText().toString());
                intent.putExtra("password",et_reappass_reg4.getText().toString());
                startActivity(intent);
            }
        });
    }
}
