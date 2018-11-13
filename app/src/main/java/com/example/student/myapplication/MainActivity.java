package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView player1Text;
    private TextView player2Text;
    private int player1int= 0;
    private int player2int= 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        player1Text = (TextView) findViewById(R.id.textView_player1NumberCount);
        player2Text = (TextView) findViewById(R.id.textView_player2NumberCount);
    }

    public void p1button_func(View view) {
        player1Text.setText(++player1int+"");
    }

    public void p2button_func(View view) {
        player2Text.setText(++player2int+"");
    }

    public void refresh_func(View view) {

        player1Text.setText((player1int-player1int)+"");
        player2Text.setText((player2int-player2int)+"");
        player1int = 0;
        player2int = 0;
    }
}
