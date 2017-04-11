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

public class TransitionActivity extends AppCompatActivity {
    private ImageButton t1Button;
    private ImageButton t2Button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);//设置成全屏模式
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);//强制为横屏
        setContentView(R.layout.activity_transition);
        t1Button=(ImageButton)findViewById(R.id.t1_pic);
        t2Button=(ImageButton)findViewById(R.id.t2_pic);
        t1Button.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(TransitionActivity.this, PlayerActivity.class);
                TransitionActivity.this.startActivity(intent);
            }
        });
        t2Button.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(TransitionActivity.this, ChooseRoleActivity.class);
                TransitionActivity.this.startActivity(intent);
            }
        });
    }

}
