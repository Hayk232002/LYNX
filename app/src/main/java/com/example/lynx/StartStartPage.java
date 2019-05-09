package com.example.lynx;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class StartStartPage extends AppCompatActivity {

    TextView tv;
    TextView tv_forgot;
    Button btn;
    Button btn_tel;
    Button btn_signIn_login;
    EditText et_email_login;

    ObjectAnimator objectAnimator_tv_forgot;
    ObjectAnimator objectAnimator_btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.avtivity_loginl);

        tv = (TextView) findViewById(R.id.tv);
        tv_forgot = (TextView) findViewById(R.id.tv_forgot);
        btn = (Button) findViewById(R.id.btn);
        btn_signIn_login = (Button) findViewById(R.id.btn_signIn_login);
        btn_tel = (Button) findViewById(R.id.btn_tel);
        et_email_login = (EditText) findViewById(R.id.et_email_login);

        objectAnimator_tv_forgot=ObjectAnimator.ofFloat(tv_forgot,"y",1200);
        objectAnimator_btn_login=ObjectAnimator.ofFloat(btn_signIn_login,"y",990);

        et_email_login.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                objectAnimator_btn_login.setDuration(300);
                objectAnimator_tv_forgot.setDuration(300);
                objectAnimator_tv_forgot.start();
                objectAnimator_btn_login.start();
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                objectAnimator_btn_login.setDuration(300);
                objectAnimator_tv_forgot.setDuration(300);
                objectAnimator_tv_forgot.start();
                objectAnimator_btn_login.start();
            }
        });
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int x = (int) event.getX();
        int y = (int) event.getY();

        tv.setText("Touch coordinates : " +
                String.valueOf(event.getX()) + "x" + String.valueOf(event.getY()));



        return true;
    }
}
