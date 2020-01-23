package com.example.sagid.testsystem.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.List;

/**
 * Created by sagid on 15.03.2018.
 */

public class Answer implements Serializable {
    public   List<String> answer;



    public int getCursor() {
        return cursor;
    }

    public void setCursor(int cursor) {
        this.cursor = cursor;
    }

    private  int cursor;
    public static int current_answer;

    public void setAnswer(List<String>answer){
        this.answer=answer;
    }
    public List<String> getAnswer(){
        return answer;
    }
}
