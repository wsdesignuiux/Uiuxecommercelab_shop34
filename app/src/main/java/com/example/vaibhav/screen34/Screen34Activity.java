package com.example.vaibhav.screen34;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Screen34Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView img1,img2,img3,img4,img5,img6;

    LinearLayout linear1,linear2,linear3,linear4,linear5;

    View u_line1,u_line2,u_line3,u_line4,u_line5;

    View d_line1,d_line2,d_line3,d_line4,d_line5;

    TextView size_text1,size_text2,size_text3,size_text4,size_text5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen34);

        img1 = (ImageView) findViewById(R.id.dot1);
        img2 = (ImageView) findViewById(R.id.dot2);
        img3 = (ImageView) findViewById(R.id.dot3);
        img4 = (ImageView) findViewById(R.id.dot4);
        img5 = (ImageView) findViewById(R.id.dot5);
        img6 = (ImageView) findViewById(R.id.dot6);

        linear1 = findViewById(R.id.sl_linear);
        linear2 = findViewById(R.id.x_linear);
        linear3 = findViewById(R.id.xl_linear);
        linear4 = findViewById(R.id.xs_linear);
        linear5 = findViewById(R.id.ls_linear);

        u_line1 = findViewById(R.id.sl_view_up);
        u_line2 = findViewById(R.id.x_view_up);
        u_line3 = findViewById(R.id.xl_view_up);
        u_line4 = findViewById(R.id.xs_view_up);
        u_line5 = findViewById(R.id.ls_view_up);

        d_line1 = findViewById(R.id.sl_view_down);
        d_line2 = findViewById(R.id.x_view_down);
        d_line3 = findViewById(R.id.xl_view_down);
        d_line4 = findViewById(R.id.xs_view_down);
        d_line5 = findViewById(R.id.ls_view_down);

        size_text1 = findViewById(R.id.sl_text);
        size_text2 = findViewById(R.id.x_text);
        size_text3 = findViewById(R.id.xl_text);
        size_text4 = findViewById(R.id.xs_text);
        size_text5 = findViewById(R.id.ls_text);


        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);
        img4.setOnClickListener(this);
        img5.setOnClickListener(this);
        img6.setOnClickListener(this);

        linear1.setOnClickListener(this);
        linear2.setOnClickListener(this);
        linear3.setOnClickListener(this);
        linear4.setOnClickListener(this);
        linear5.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.dot1:
                img1.setImageResource(R.drawable.ic_ic_radiobutton);
                img2.setImageResource(R.drawable.circle_darkgray);
                img3.setImageResource(R.drawable.circle_gray);
                img4.setImageResource(R.drawable.circle_darkgray);
                img5.setImageResource(R.drawable.circle_gray);
                img6.setImageResource(R.drawable.circle_darkgray);
                break;

            case R.id.dot2:
                img1.setImageResource(R.drawable.circle_gray);
                img2.setImageResource(R.drawable.ic_ic_radiobutton);
                img3.setImageResource(R.drawable.circle_gray);
                img4.setImageResource(R.drawable.circle_darkgray);
                img5.setImageResource(R.drawable.circle_gray);
                img6.setImageResource(R.drawable.circle_darkgray);
                break;

            case R.id.dot3:
                img1.setImageResource(R.drawable.circle_gray);
                img2.setImageResource(R.drawable.circle_darkgray);
                img3.setImageResource(R.drawable.ic_ic_radiobutton);
                img4.setImageResource(R.drawable.circle_darkgray);
                img5.setImageResource(R.drawable.circle_gray);
                img6.setImageResource(R.drawable.circle_darkgray);
                break;

            case R.id.dot4:
                img1.setImageResource(R.drawable.circle_gray);
                img2.setImageResource(R.drawable.circle_darkgray);
                img3.setImageResource(R.drawable.circle_gray);
                img4.setImageResource(R.drawable.ic_ic_radiobutton);
                img5.setImageResource(R.drawable.circle_gray);
                img6.setImageResource(R.drawable.circle_darkgray);
                break;

            case R.id.dot5:
                img1.setImageResource(R.drawable.circle_gray);
                img2.setImageResource(R.drawable.circle_darkgray);
                img3.setImageResource(R.drawable.circle_gray);
                img4.setImageResource(R.drawable.circle_darkgray);
                img5.setImageResource(R.drawable.ic_ic_radiobutton);
                img6.setImageResource(R.drawable.circle_darkgray);
                break;

            case R.id.dot6:
                img1.setImageResource(R.drawable.circle_gray);
                img2.setImageResource(R.drawable.circle_darkgray);
                img3.setImageResource(R.drawable.circle_gray);
                img4.setImageResource(R.drawable.circle_darkgray);
                img5.setImageResource(R.drawable.circle_gray);
                img6.setImageResource(R.drawable.ic_ic_radiobutton);
                break;

            case R.id.sl_linear:
                u_line1.setVisibility(View.VISIBLE);
                d_line1.setVisibility(View.VISIBLE);
                size_text1.setTextSize(12);

                u_line2.setVisibility(View.INVISIBLE);
                d_line2.setVisibility(View.INVISIBLE);
                size_text2.setTextSize(10);

                u_line3.setVisibility(View.INVISIBLE);
                d_line3.setVisibility(View.INVISIBLE);
                size_text3.setTextSize(10);

                u_line4.setVisibility(View.INVISIBLE);
                d_line4.setVisibility(View.INVISIBLE);
                size_text4.setTextSize(10);

                u_line5.setVisibility(View.INVISIBLE);
                d_line5.setVisibility(View.INVISIBLE);
                size_text5.setTextSize(10);

                break;

            case R.id.x_linear:
                u_line1.setVisibility(View.INVISIBLE);
                d_line1.setVisibility(View.INVISIBLE);
                size_text1.setTextSize(10);

                u_line2.setVisibility(View.VISIBLE);
                d_line2.setVisibility(View.VISIBLE);
                size_text2.setTextSize(12);

                u_line3.setVisibility(View.INVISIBLE);
                d_line3.setVisibility(View.INVISIBLE);
                size_text3.setTextSize(10);

                u_line4.setVisibility(View.INVISIBLE);
                d_line4.setVisibility(View.INVISIBLE);
                size_text4.setTextSize(10);

                u_line5.setVisibility(View.INVISIBLE);
                d_line5.setVisibility(View.INVISIBLE);
                size_text5.setTextSize(10);

                break;


            case R.id.xl_linear:
                u_line1.setVisibility(View.INVISIBLE);
                d_line1.setVisibility(View.INVISIBLE);
                size_text1.setTextSize(10);

                u_line2.setVisibility(View.INVISIBLE);
                d_line2.setVisibility(View.INVISIBLE);
                size_text2.setTextSize(10);

                u_line3.setVisibility(View.VISIBLE);
                d_line3.setVisibility(View.VISIBLE);
                size_text3.setTextSize(12);

                u_line4.setVisibility(View.INVISIBLE);
                d_line4.setVisibility(View.INVISIBLE);
                size_text4.setTextSize(10);

                u_line5.setVisibility(View.INVISIBLE);
                d_line5.setVisibility(View.INVISIBLE);
                size_text5.setTextSize(10);

                break;

            case R.id.xs_linear:
                u_line1.setVisibility(View.INVISIBLE);
                d_line1.setVisibility(View.INVISIBLE);
                size_text1.setTextSize(10);

                u_line2.setVisibility(View.INVISIBLE);
                d_line2.setVisibility(View.INVISIBLE);
                size_text2.setTextSize(10);

                u_line3.setVisibility(View.INVISIBLE);
                d_line3.setVisibility(View.INVISIBLE);
                size_text3.setTextSize(10);

                u_line4.setVisibility(View.VISIBLE);
                d_line4.setVisibility(View.VISIBLE);
                size_text4.setTextSize(12);

                u_line5.setVisibility(View.INVISIBLE);
                d_line5.setVisibility(View.INVISIBLE);
                size_text5.setTextSize(10);

                break;

            case R.id.ls_linear:
                u_line1.setVisibility(View.INVISIBLE);
                d_line1.setVisibility(View.INVISIBLE);
                size_text1.setTextSize(10);

                u_line2.setVisibility(View.INVISIBLE);
                d_line2.setVisibility(View.INVISIBLE);
                size_text2.setTextSize(10);

                u_line3.setVisibility(View.INVISIBLE);
                d_line3.setVisibility(View.INVISIBLE);
                size_text3.setTextSize(10);

                u_line4.setVisibility(View.INVISIBLE);
                d_line4.setVisibility(View.INVISIBLE);
                size_text4.setTextSize(10);

                u_line5.setVisibility(View.VISIBLE);
                d_line5.setVisibility(View.VISIBLE);
                size_text5.setTextSize(12);
                break;
        }
    }
}
