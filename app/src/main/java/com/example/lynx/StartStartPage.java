package com.example.lynx;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class StartStartPage extends AppCompatActivity {

    TextView tv;
    TextView tv_forgot;
    Button btn;
    Button btn_signIn_login;
    EditText et_email_login;

    ObjectAnimator objectAnimator_tv_forgot_gnal;
    ObjectAnimator objectAnimator_btn_login_gnal;

    ObjectAnimator objectAnimator_tv_forgot_gal;
    ObjectAnimator objectAnimator_btn_login_gal;

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.avtivity_loginl);

        tv = (TextView) findViewById(R.id.tv);
        tv_forgot = (TextView) findViewById(R.id.tv_forgot);
        btn = (Button) findViewById(R.id.btn);
        btn_signIn_login = (Button) findViewById(R.id.btn_signIn_login);
        et_email_login = (EditText) findViewById(R.id.et_email_login);

        objectAnimator_tv_forgot_gnal=ObjectAnimator.ofFloat(tv_forgot,"y",1200);
        objectAnimator_btn_login_gnal=ObjectAnimator.ofFloat(btn_signIn_login,"y",990);

        objectAnimator_tv_forgot_gal=ObjectAnimator.ofFloat(tv_forgot,"y",990);
        objectAnimator_btn_login_gal=ObjectAnimator.ofFloat(btn_signIn_login,"y",860);

        et_email_login.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(charSequence.toString().trim().length()!=0 && count==0){
                    Log.wtf("gnal:",charSequence.toString());

                    objectAnimator_btn_login_gnal.setDuration(300);
                    objectAnimator_tv_forgot_gnal.setDuration(300);
                    objectAnimator_tv_forgot_gnal.start();
                    objectAnimator_btn_login_gnal.start();

                    count=1;
                }

                else if (charSequence.toString().trim().length()==0 && count==1){
                    Log.wtf("gal:",charSequence.toString());

                    objectAnimator_btn_login_gal.setDuration(300);
                    objectAnimator_tv_forgot_gal.setDuration(300);
                    objectAnimator_tv_forgot_gal.start();
                    objectAnimator_btn_login_gal.start();

                    count=0;
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

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
