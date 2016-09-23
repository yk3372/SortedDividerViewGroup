package com.example.yukai.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    LineView view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view = (LineView)findViewById(R.id.activity_main);


        findViewById(R.id.btn_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add0();
            }
        });
        findViewById(R.id.btn_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add1();
            }
        });
        findViewById(R.id.btn_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add2();
            }
        });
        findViewById(R.id.btn_4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add3();
            }
        });
        findViewById(R.id.btn_5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add4();
            }
        });


        findViewById(R.id.divider_btn_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.configNoDividerByIndex(LineView.KEY_0);
            }
        });
        findViewById(R.id.divider_btn_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.configNoDividerByIndex(LineView.KEY_1);
            }
        });
        findViewById(R.id.divider_btn_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.configNoDividerByIndex(LineView.KEY_2);
            }
        });
        findViewById(R.id.divider_btn_4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.configNoDividerByIndex(LineView.KEY_3);
            }
        });
        findViewById(R.id.divider_btn_5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.configNoDividerByIndex(LineView.KEY_4);
            }
        });

        findViewById(R.id.remove_btn_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.removeViewByIndex(LineView.KEY_0);
            }
        });
        findViewById(R.id.remove_btn_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.removeViewByIndex(LineView.KEY_1);
            }
        });
        findViewById(R.id.remove_btn_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.removeViewByIndex(LineView.KEY_2);
            }
        });
        findViewById(R.id.remove_btn_4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.removeViewByIndex(LineView.KEY_3);
            }
        });
        findViewById(R.id.remove_btn_5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.removeViewByIndex(LineView.KEY_4);
            }
        });
    }


    public void add0() {
        Button button = new Button(this);
        button.setLayoutParams(new ViewGroup.LayoutParams(150, 150));
        button.setText("1");
        button.setTextColor(0xff0330ff);
        button.setBackgroundColor(0xffff0000);
        view.addIndexView(LineView.KEY_0, button);
    }

    public void add1() {
        Button button = new Button(this);
        button.setLayoutParams(new ViewGroup.LayoutParams(150, 150));
        button.setText("2");
        button.setTextColor(0xff0ff0ff);
        button.setBackgroundColor(0xffff0000);
        view.addIndexView(LineView.KEY_1, button);
    }

    public void add2() {
        Button button = new Button(this);
        button.setLayoutParams(new ViewGroup.LayoutParams(150, 150));
        button.setText("3");
        button.setTextColor(0xff0540ff);
        button.setBackgroundColor(0xffff0100);
        view.addIndexView(LineView.KEY_2, button);
    }

    public void add3() {
        Button button = new Button(this);
        button.setLayoutParams(new ViewGroup.LayoutParams(150, 150));
        button.setText("4");
        button.setTextColor(0xfff000ff);
        button.setBackgroundColor(0xffff0000);
        view.addIndexView(LineView.KEY_3, button);
    }

    public void add4() {
        Button button = new Button(this);
        button.setLayoutParams(new ViewGroup.LayoutParams(150, 150));
        button.setText("5");
        button.setTextColor(0xfff100ff);
        button.setBackgroundColor(0xff1ff0f0);
        view.addIndexView(LineView.KEY_4, button);
    }
}
