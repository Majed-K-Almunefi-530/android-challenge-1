package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Boolean Xturn = true ;
    int[] Xarray = new int[9];
    int[] oarray = new int[9];
    TextView P1t ;
    TextView P2t ;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button b1 = findViewById(R.id.button1);
        final Button b2 = findViewById(R.id.button2);
        final Button b3 = findViewById(R.id.button3);
        final Button b4 = findViewById(R.id.button4);
        final Button b5 = findViewById(R.id.button5);
        final Button b6 = findViewById(R.id.button6);
        final Button b7 = findViewById(R.id.button7);
        final Button b8 = findViewById(R.id.button8);
        final Button b9 = findViewById(R.id.button9);

        P1t = findViewById(R.id.textView2);
        P2t = findViewById(R.id.textView4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Xturn){
                    Xarray[0] = 1;
                    checkXwin();
                    b1.setText("X");
                }
                else {
                    oarray[0]=1;
                    checkowin();
                    b1.setText("O");

                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Xturn){
                    Xarray[1] = 1;
                    checkXwin();
                    b2.setText("X");
                }
                else {
                    oarray[1]=1;
                    checkowin();
                    b2.setText("O");

                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Xturn){
                    Xarray[2] = 1;
                    checkXwin();
                    b3.setText("X");
                }
                else {
                    oarray[2]=1;
                    checkowin();
                    b3.setText("O");

                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Xturn){
                    Xarray[3] = 1;
                    checkXwin();
                    b4.setText("X");
                }
                else {
                    oarray[3]=1;
                    checkowin();
                    b4.setText("O");

                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Xturn){
                    Xarray[4] = 1;
                    checkXwin();
                    b5.setText("X");
                }
                else {
                    oarray[4]=1;
                    checkowin();
                    b5.setText("O");

                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Xturn){
                    Xarray[5] = 1;
                    checkXwin();
                    b6.setText("X");
                }
                else {
                    oarray[5]=1;
                    checkowin();
                    b6.setText("O");

                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Xturn){
                    Xarray[6] = 1;
                    checkXwin();
                    b7.setText("X");
                }
                else {
                    oarray[6]=1;
                    checkowin();
                    b7.setText("O");

                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Xturn){
                    Xarray[7] = 1;
                    checkXwin();
                    b8.setText("X");
                }
                else {
                    oarray[7]=1;
                    checkowin();
                    b8.setText("O");

                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Xturn){
                    Xarray[8] = 1;
                    checkXwin();
                    b9.setText("X");
                }
                else {
                    oarray[8]=1;
                    checkowin();
                    b9.setText("O");

                }
            }
        });
    }


    public void checkXwin(){
        Xturn = false ;
        P1t.setText("");
        P2t.setText("your turn");
        if (Xarray[0] == 1 && Xarray[1]==1 && Xarray[2] == 1){
            Nextactivity();
        }
        else if (Xarray[3] == 1 && Xarray[4]==1 && Xarray[5] == 1){
            Nextactivity();
        }
        else if (Xarray[6] == 1 && Xarray[7]==1 && Xarray[8] == 1){
            Nextactivity();
        }
        else if (Xarray[0] == 1 && Xarray[3]==1 && Xarray[6] == 1){
            Nextactivity();
        }
        else if (Xarray[1] == 1 && Xarray[4]==1 && Xarray[7] == 1){
            Nextactivity();
        }
        else if (Xarray[0] == 1 && Xarray[4]==1 && Xarray[8] == 1){
            Nextactivity();
        }
        else if (Xarray[2] == 1 && Xarray[4]==1 && Xarray[6] == 1){
            Nextactivity();
        }
        else{
            reset();
        }





    }
    public void checkowin() {
        Xturn = true;
        P2t.setText("");
        P1t.setText("your turn");
        if (oarray[0] == 1 && oarray[1]==1 && oarray[2] == 1){
            Nextactivity();
        }
        else if (oarray[3] == 1 && oarray[4]==1 && oarray[5] == 1){
            Nextactivity();
        }
        else if (oarray[6] == 1 && oarray[7]==1 && oarray[8] == 1){
            Nextactivity();
        }
        else if (oarray[0] == 1 && oarray[3]==1 && oarray[6] == 1){
            Nextactivity();
        }
        else if (oarray[1] == 1 && oarray[4]==1 && oarray[7] == 1) {
            Nextactivity();
        }
        else if (oarray[0] == 1 && oarray[4]==1 && oarray[8] == 1){
            Nextactivity();
        }
        else if (oarray[2] == 1 && oarray[4]==1 && oarray[6] == 1){
            Nextactivity();
        }
        else{
            reset();
        }






    }

    public void Nextactivity(){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
    public void reset(){
        b1.setText(" ");
        b2.setText(" ");
        b3.setText(" ");
        b4.setText(" ");
        b5.setText(" ");
        b6.setText(" ");
        b7.setText(" ");
        b8.setText(" ");
        b9.setText(" ");
        P2t.setText(" ");
        P1t.setText(" ");


    }

}

