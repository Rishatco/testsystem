package com.example.sagid.testsystem.model;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.CountDownTimer;
import android.os.Parcelable;
import android.widget.ProgressBar;


public class MyCountDownStaticTimer extends CountDownTimer {
    public ProgressBar progressBar;
    public Context this_activity, next_activity;
    public Answer answer;

    public MyCountDownStaticTimer(long millisInFuture, long countDownInterval, ProgressBar progressBar,Context this_activity,Context next_activity,Answer answer) {
        super(millisInFuture, countDownInterval);
        this.progressBar=progressBar;
        this.this_activity=this_activity;
        this.next_activity=next_activity;
        this.answer=answer;
    }
    @Override
    public void onTick(long millisUntilFinished) {
        int progress = (int) (millisUntilFinished/100);
        progressBar.setProgress(progress);

    }

    @Override
    public void onFinish() {
        Intent intent = new Intent(this_activity.getApplicationContext(),next_activity.getClass());
        answer.answer.add(String.valueOf(Answer.current_answer));
        Answer.current_answer=0;
       intent.putExtra("answer", answer);
    }
}
