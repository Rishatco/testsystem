package com.example.sagid.testsystem;



import android.content.DialogInterface;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final AlertDialog.Builder alertgialog=new AlertDialog.Builder(this);
        alertgialog.setTitle("Внимание");
        alertgialog.setMessage("Добро пожадовать в систему тестировани\n Введите ip адресс\n и нажмите кнопку старт");
        alertgialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        alertgialog.create();
        }
    }

