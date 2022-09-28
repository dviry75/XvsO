package com.example.xvso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tvwin,tvo,tvX;
    boolean x,y;
    Button b1 ,b2 ,b3,b4,b5,b6,b7,b8,b9,bsO,bsX;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 =(Button) findViewById(R.id.bt1);
        b2 =(Button) findViewById(R.id.bt2);
        b3 =(Button) findViewById(R.id.bt3);
        b4 =(Button) findViewById(R.id.bt4);
        b5 =(Button) findViewById(R.id.bt5);
        b6 =(Button) findViewById(R.id.bt6);
        b7 =(Button) findViewById(R.id.bt7);
        b8 =(Button) findViewById(R.id.bt8);
        b9 =(Button) findViewById(R.id.bt9);
        bsO =(Button) findViewById(R.id.stO);
        bsX =(Button) findViewById(R.id.stX);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b5.setOnClickListener(this);
        b4.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        bsX.setOnClickListener(this);
        bsO.setOnClickListener(this);
        tvwin = (TextView) findViewById(R.id.tvwin);
        tvo = (TextView) findViewById(R.id.tvwin);
        tvX = (TextView) findViewById(R.id.tvwin);
    }
    public void onClick(View v) {
        if(v == bsX)
        {

        }
    }
}