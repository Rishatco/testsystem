package com.example.sagid.testsystem;

import android.os.CountDownTimer;
import android.widget.ProgressBar;

import com.example.sagid.testsystem.model.Answer;

public class MyCountDownTimer extends CountDownTimer {
    public ProgressBar progressBar;
    public int number;
    public MyCountDownTimer(long millisInFuture, long countDownInterval,ProgressBar progressBar,int number) {
        super(millisInFuture, countDownInterval);
        this.progressBar=progressBar;
        this.number=number;
    }

    @Override
    public void onTick(long millisUntilFinished) {

        int progress = (int) (millisUntilFinished/100);
        progressBar.setProgress(progress);
    }

    @Override
    public void onFinish() {
        progressBar.setProgress(0);
        Answer.current_answer=number;
    }


}