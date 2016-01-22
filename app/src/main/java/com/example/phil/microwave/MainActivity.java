package com.example.phil.microwave;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView clocks;

    Button btn0;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btnStart;
    Button btnStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView clocks = (TextView) findViewById(R.id.clock);

        btn0 = (Button) findViewById(R.id.btn_0);
        btn1 = (Button) findViewById(R.id.btn_1);
        btn2 = (Button) findViewById(R.id.btn_2);
        btn3 = (Button) findViewById(R.id.btn_3);
        btn4 = (Button) findViewById(R.id.btn_4);
        btn5 = (Button) findViewById(R.id.btn_5);
        btn6 = (Button) findViewById(R.id.btn_6);
        btn7 = (Button) findViewById(R.id.btn_7);
        btn8 = (Button) findViewById(R.id.btn_8);
        btn9 = (Button) findViewById(R.id.btn_9);
        btnStart = (Button) findViewById(R.id.btn_start);
        btnStop = (Button) findViewById(R.id.btn_stop);

        btn0.setOnClickListener(toggle);
        btn1.setOnClickListener(toggle);
        btn2.setOnClickListener(toggle);
        btn3.setOnClickListener(toggle);
        btn4.setOnClickListener(toggle);
        btn5.setOnClickListener(toggle);
        btn6.setOnClickListener(toggle);
        btn7.setOnClickListener(toggle);
        btn8.setOnClickListener(toggle);
        btn9.setOnClickListener(toggle);
        btnStart.setOnClickListener(toggle);
        btnStop.setOnClickListener(toggle);
    }

    private final View.OnClickListener toggle = new View.OnClickListener() {

        public void onClick(View btn) {
            clocks.setText("Pressed");

        }

    };
}
