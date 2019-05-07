package com.example.lynx;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.widget.ImageView;

public class StartPage extends AppCompatActivity {
    private ImageView img_start_animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);
        img_start_animation = (ImageView)  findViewById(R.id.img_start_animation);

        img_start_animation.post(new Runnable() {
            @Override
            public void run() {
                ((AnimationDrawable) img_start_animation.getBackground()).start();

                }

        });
    }
}
