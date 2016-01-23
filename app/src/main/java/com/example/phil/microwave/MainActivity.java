package com.example.phil.microwave;

import android.media.Image;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    TextView clocks;
    ImageView image;
    CountDownTimer timer;
    SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm");
    SimpleDateFormat dateFormat2 = new SimpleDateFormat("hmm");
    long milliseconds;
    int pressed;
    int[] btnPressed = new int[4];

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

        clocks = (TextView) findViewById(R.id.clock);
        image = (ImageView) findViewById(R.id.image);

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

    private View.OnClickListener toggle = new View.OnClickListener() {
        @Override
        public void onClick(View btn) {

            image.setImageResource(R.drawable.microwave);
            pressed++;

            switch (btn.getId()) {
                case R.id.btn_1:
                    if (pressed == 1) {
                        btnPressed[0] = 1;
                        milliseconds += 1000;
                        clocks.setText("00:0"+btnPressed[0]);
                    }
                    if (pressed == 2) {
                        btnPressed[1] = 1;
                        milliseconds *= 10;
                        milliseconds += 1000;
                        clocks.setText("00:"+btnPressed[0]+btnPressed[1]);
                    }
                    if (pressed == 3) {
                        btnPressed[2] = 1;
                        milliseconds *= 6;
                        milliseconds += 1000;
                        clocks.setText("0"+btnPressed[0]+":"+btnPressed[1]+btnPressed[2]);
                    }
                    if (pressed == 4) {
                        btnPressed[3] = 1;
                        milliseconds *= 10;
                        milliseconds += 1000;
                        clocks.setText(btnPressed[0]+""+btnPressed[1]+":"+btnPressed[2]+btnPressed[3]);
                    }

                    break;

                case R.id.btn_2:
                    if (pressed == 1) {
                        btnPressed[0] = 2;
                        milliseconds += 2000;
                        clocks.setText("00:0"+btnPressed[0]);
                    }
                    if (pressed == 2) {
                        btnPressed[1] = 2;
                        milliseconds *= 10;
                        milliseconds += 2000;
                        clocks.setText("00:"+btnPressed[0]+btnPressed[1]);
                    }
                    if (pressed == 3) {
                        btnPressed[2] = 2;
                        milliseconds *= 6;
                        milliseconds += 2000;
                        clocks.setText("0"+btnPressed[0]+":"+btnPressed[1]+btnPressed[2]);
                    }
                    if (pressed == 4) {
                        btnPressed[3] = 2;
                        milliseconds *= 10;
                        milliseconds += 2000;
                        clocks.setText(btnPressed[0]+""+btnPressed[1]+":"+btnPressed[2]+btnPressed[3]);
                    }

                    break;

                case R.id.btn_3:
                    if (pressed == 1) {
                        btnPressed[0] = 3;
                        milliseconds += 3000;
                        clocks.setText("00:0"+btnPressed[0]);
                    }
                    if (pressed == 2) {
                        btnPressed[1] = 3;
                        milliseconds *= 10;
                        milliseconds += 3000;
                        clocks.setText("00:"+btnPressed[0]+btnPressed[1]);
                    }
                    if (pressed == 3) {
                        btnPressed[2] = 3;
                        milliseconds *= 6;
                        milliseconds += 3000;
                        clocks.setText("0"+btnPressed[0]+":"+btnPressed[1]+btnPressed[2]);
                    }
                    if (pressed == 4) {
                        btnPressed[3] = 3;
                        milliseconds *= 10;
                        milliseconds += 3000;
                        clocks.setText(btnPressed[0]+""+btnPressed[1]+":"+btnPressed[2]+btnPressed[3]);
                    }

                    break;

                case R.id.btn_4:
                    if (pressed == 1) {
                        btnPressed[0] = 4;
                        milliseconds += 4000;
                        clocks.setText("00:0"+btnPressed[0]);
                    }
                    if (pressed == 2) {
                        btnPressed[1] = 4;
                        milliseconds *= 10;
                        milliseconds += 4000;
                        clocks.setText("00:"+btnPressed[0]+btnPressed[1]);
                    }
                    if (pressed == 3) {
                        btnPressed[2] = 4;
                        milliseconds *= 6;
                        milliseconds += 4000;
                        clocks.setText("0"+btnPressed[0]+":"+btnPressed[1]+btnPressed[2]);
                    }
                    if (pressed == 4) {
                        btnPressed[3] = 4;
                        milliseconds *= 10;
                        milliseconds += 4000;
                        clocks.setText(btnPressed[0]+""+btnPressed[1]+":"+btnPressed[2]+btnPressed[3]);
                    }

                    break;

                case R.id.btn_5:
                    if (pressed == 1) {
                        btnPressed[0] = 5;
                        milliseconds += 5000;
                        clocks.setText("00:0"+btnPressed[0]);
                    }
                    if (pressed == 2) {
                        btnPressed[1] = 5;
                        milliseconds *= 10;
                        milliseconds += 5000;
                        clocks.setText("00:"+btnPressed[0]+btnPressed[1]);
                    }
                    if (pressed == 3) {
                        btnPressed[2] = 5;
                        milliseconds *= 6;
                        milliseconds += 5000;
                        clocks.setText("0"+btnPressed[0]+":"+btnPressed[1]+btnPressed[2]);
                    }
                    if (pressed == 4) {
                        btnPressed[3] = 5;
                        milliseconds *= 10;
                        milliseconds += 5000;
                        clocks.setText(btnPressed[0]+""+btnPressed[1]+":"+btnPressed[2]+btnPressed[3]);
                    }

                    break;

                case R.id.btn_6:
                    if (pressed == 1) {
                        btnPressed[0] = 6;
                        milliseconds += 6000;
                        clocks.setText("00:0"+btnPressed[0]);
                    }
                    if (pressed == 2) {
                        btnPressed[1] = 6;
                        milliseconds *= 10;
                        milliseconds += 6000;
                        clocks.setText("00:"+btnPressed[0]+btnPressed[1]);
                    }
                    if (pressed == 3) {
                        btnPressed[2] = 6;
                        milliseconds *= 6;
                        milliseconds += 6000;
                        clocks.setText("0"+btnPressed[0]+":"+btnPressed[1]+btnPressed[2]);
                    }
                    if (pressed == 4) {
                        btnPressed[3] = 6;
                        milliseconds *= 10;
                        milliseconds += 6000;
                        clocks.setText(btnPressed[0]+""+btnPressed[1]+":"+btnPressed[2]+btnPressed[3]);
                    }

                    break;

                case R.id.btn_7:
                    if (pressed == 1) {
                        btnPressed[0] = 7;
                        milliseconds += 7000;
                        clocks.setText("00:0"+btnPressed[0]);
                    }
                    if (pressed == 2) {
                        btnPressed[1] = 7;
                        milliseconds *= 10;
                        milliseconds += 7000;
                        clocks.setText("00:"+btnPressed[0]+btnPressed[1]);
                    }
                    if (pressed == 3) {
                        btnPressed[2] = 7;
                        milliseconds *= 6;
                        milliseconds += 7000;
                        clocks.setText("0"+btnPressed[0]+":"+btnPressed[1]+btnPressed[2]);
                    }
                    if (pressed == 4) {
                        btnPressed[3] = 7;
                        milliseconds *= 10;
                        milliseconds += 7000;
                        clocks.setText(btnPressed[0]+""+btnPressed[1]+":"+btnPressed[2]+btnPressed[3]);
                    }

                    break;

                case R.id.btn_8:
                    if (pressed == 1) {
                        btnPressed[0] = 8;
                        milliseconds += 8000;
                        clocks.setText("00:0"+btnPressed[0]);
                    }
                    if (pressed == 2) {
                        btnPressed[1] = 8;
                        milliseconds *= 10;
                        milliseconds += 8000;
                        clocks.setText("00:"+btnPressed[0]+btnPressed[1]);
                    }
                    if (pressed == 3) {
                        btnPressed[2] = 8;
                        milliseconds *= 6;
                        milliseconds += 8000;
                        clocks.setText("0"+btnPressed[0]+":"+btnPressed[1]+btnPressed[2]);
                    }
                    if (pressed == 4) {
                        btnPressed[3] = 8;
                        milliseconds *= 10;
                        milliseconds += 8000;
                        clocks.setText(btnPressed[0]+""+btnPressed[1]+":"+btnPressed[2]+btnPressed[3]);
                    }

                    break;

                case R.id.btn_9:
                    if (pressed == 1) {
                        btnPressed[0] = 9;
                        milliseconds += 9000;
                        clocks.setText("00:0"+btnPressed[0]);
                    }
                    if (pressed == 2) {
                        btnPressed[1] = 9;
                        milliseconds *= 10;
                        milliseconds += 9000;
                        clocks.setText("00:"+btnPressed[0]+btnPressed[1]);
                    }
                    if (pressed == 3) {
                        btnPressed[2] = 9;
                        milliseconds *= 6;
                        milliseconds += 9000;
                        clocks.setText("0"+btnPressed[0]+":"+btnPressed[1]+btnPressed[2]);
                    }
                    if (pressed == 4) {
                        btnPressed[3] = 9;
                        milliseconds *= 10;
                        milliseconds += 9000;
                        clocks.setText(btnPressed[0]+""+btnPressed[1]+":"+btnPressed[2]+btnPressed[3]);
                    }

                    break;

                case R.id.btn_0:
                    if (pressed == 1) {
                        btnPressed[0] = 0;
                        milliseconds += 0;
                        clocks.setText("00:0"+btnPressed[0]);
                    }
                    if (pressed == 2) {
                        btnPressed[1] = 0;
                        milliseconds *= 10;
                        milliseconds += 0;
                        clocks.setText("00:"+btnPressed[0]+btnPressed[1]);
                    }
                    if (pressed == 3) {
                        btnPressed[2] = 0;
                        milliseconds *= 6;
                        milliseconds += 0;
                        clocks.setText("0"+btnPressed[0]+":"+btnPressed[1]+btnPressed[2]);
                    }
                    if (pressed == 4) {
                        btnPressed[3] = 0;
                        milliseconds *= 10;
                        milliseconds += 0;
                        clocks.setText(btnPressed[0]+""+btnPressed[1]+":"+btnPressed[2]+btnPressed[3]);
                    }

                    break;
                case R.id.btn_start:

                    timer = new CountDownTimer(milliseconds, 1000) {

                        public void onTick(long millisUntilFinished) {

                            clocks.setText(""+String.format("%d:%d",
                                    TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished),
                                    TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) -
                                            TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.
                                                    toMinutes(millisUntilFinished))));
                        }

                        public void onFinish() {

                            pressed = 0;
                            milliseconds = 0;

                            btnPressed[0] = 0;
                            btnPressed[1] = 0;
                            btnPressed[2] = 0;
                            btnPressed[3] = 0;
                            clocks.setText("FINISHED");

                            image.setImageResource(R.drawable.microwave_open);
                        }
                    };
                    timer.start();

                    break;
                case R.id.btn_stop:

                    timer.cancel();
                    pressed = 0;
                    milliseconds = 0;

                    btnPressed[0] = 0;
                    btnPressed[1] = 0;
                    btnPressed[2] = 0;
                    btnPressed[3] = 0;
                    clocks.setText(btnPressed[0]+""+btnPressed[1]+":"+btnPressed[2]+btnPressed[3]);

                    image.setImageResource(R.drawable.microwave);

                    break;
            }

        }
    };

}
