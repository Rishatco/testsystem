package com.example.sagid.testsystem.model;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.example.sagid.testsystem.MyCountDownTimer;


public class Button2 extends AppCompatActivity implements View.OnClickListener {
    private Button button1, button2;
    private ProgressBar answerBar2;
    //private  MyCountDownStaticTimer staticTimer=new MyCountDownStaticTimer()
    private  MyCountDownTimer timer=new MyCountDownTimer(10*1000,10,answerBar2,0);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button2);
        button1=(Button)findViewById(R.id.button21);
        button2=(Button)findViewById(R.id.button22);
        answerBar2=(ProgressBar)findViewById(R.id.answerBar2);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button21:{ timer.number=1;
            timer.start();}

            case R.id.button22: {timer.number=2;
            timer.start();}
        }
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        timer.onFinish();
    }
}
