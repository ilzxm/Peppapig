package com.example.ilzxm.peppapig;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

/**
 * Created by ilzxm on 2017/3/10.
 */

public class LevelActivity extends AppCompatActivity {
    private ImageButton button1;
    private ImageButton button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);//设置成全屏模式
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);//强制为横屏
        setContentView(R.layout.activity_level);
        button1=(ImageButton)findViewById(R.id.level1);
        button2=(ImageButton)findViewById(R.id.level2);
        button1.setOnClickListener(new OnClickListener(){
        @Override
            public void onClick(View v){
            Intent intent = new Intent();
            intent.setClass(LevelActivity.this, TransitionActivity.class);
            LevelActivity.this.startActivity(intent);
        }
        });
        button2.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(LevelActivity.this, TransitionActivity.class);
                LevelActivity.this.startActivity(intent);
            }
        });
    }

}