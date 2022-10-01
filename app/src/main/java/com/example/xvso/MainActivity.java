package com.example.xvso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tvwin,tvo,tvX;
    boolean x,y;
    Button b[][] = new Button[2][2];
    int Ixo [] = new int [2];
    int Jxo [] = new int [2];
    Button bsO ,bsX,restart;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b[0][0] =(Button) findViewById(R.id.bt1);
        b[0][1] =(Button) findViewById(R.id.bt2);
        b[0][2] =(Button) findViewById(R.id.bt3);
        b[1][0] =(Button) findViewById(R.id.bt4);
        b[1][1] =(Button) findViewById(R.id.bt5);
        b[1][2] =(Button) findViewById(R.id.bt6);
        b[2][0] =(Button) findViewById(R.id.bt7);
        b[2][1] =(Button) findViewById(R.id.bt8);
        b[2][2] =(Button) findViewById(R.id.bt9);
        restart = (Button) findViewById(R.id.newS);
        bsO =(Button) findViewById(R.id.stO);
        bsX =(Button) findViewById(R.id.stX);
        bsX.setOnClickListener(this);
        bsO.setOnClickListener(this);
        restart.setOnClickListener(this);
        for(int i=0;i<=b.length;i++){
            for(int j =0;j<=b[i].length;j++){
                b[i][j].setOnClickListener(this);
            }
        }
        tvwin = (TextView) findViewById(R.id.tvwin);
        tvo = (TextView) findViewById(R.id.tvwinO);
        tvX = (TextView) findViewById(R.id.tvwinX);
        for(int i=0;i<=Ixo.length;i++){
            Ixo[i]=0;
        }
        for(int i=0;i<=Jxo.length;i++){
            Jxo[i]=0;
        }
    }
    public void onClick(View v) {
        if(v == bsX)
        {
            for(int i=0;i<=b.length;i++){
                for(int j =0;j<=b[i].length;j++){
                    if (b[i][j] == v){
                        int g =0,t=0;
                        for(int m=0;m<=b.length;m++){
                            for(int n =0;n<=b[m].length;n++){
                                if(b[m][n].getText().toString()  == "x"){
                                    g++;
                                }
                                else if(b[m][n].getText().toString()  == "o"){
                                    t++;
                                }
                            }
                            if(g == t){
                                b[i][j].setText("x");
                                Ixo[i]++;
                                Jxo[j]++;
                                if(Ixo[i] ==3 || Jxo[i]==3){
                                    tvwin.setText("שחקן הX ניצח");
                                }

                            }
                            else if(g <= t){
                                b[i][j].setText("o");
                                Ixo[i]--;
                                Jxo[j]--;
                                if(Ixo[i] ==-3 || Jxo[i]==-3){
                                    tvwin.setText("שחקן הo ניצח");
                                }

                            }
                        }
                    }
                }
            }

        }
        else  if(v == bsO)
        {
            for(int i=0;i<=b.length;i++){
                for(int j =0;j<=b[i].length;j++){
                    if (b[i][j] == v){
                        int g =0,t=0;
                        for(int m=0;m<=b.length;m++){
                            for(int n =0;n<=b[m].length;n++){
                                if(b[m][n].getText().toString()  == "x"){
                                    g++;
                                }
                                else if(b[m][n].getText().toString()  == "o"){
                                    t++;
                                }
                            }
                            if(g <= t){
                                b[i][j].setText("x");
                                Ixo[i]++;
                                Jxo[j]++;
                            }
                            else if(g == t){
                                b[i][j].setText("o");
                                Ixo[i]--;
                                Jxo[j]--;
                            }
                        }
                    }
                }
            }

        }
        else if(v == restart){
            for(int i=0;i<=b.length;i++) {
                for (int j = 0; j <= b[i].length; j++) {
                    b[i][j].setText(" ");

                }
            }
        }
    }
}