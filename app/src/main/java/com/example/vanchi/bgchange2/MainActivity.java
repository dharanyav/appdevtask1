package com.example.vanchi.bgchange2;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    //int color = 0xffffffff;
   // int color = Color.parseColor("#0000FF");
    int r=0;
    int g=0;
    int b=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void colorchange(View view){
        ConstraintLayout currentLayout =
                (ConstraintLayout) findViewById(R.id.main_layout);


        currentLayout.setBackgroundColor(Color.rgb(r,g,b));
        b = b+5;
        if(b>255)
            b=0;
        TextView bvalue = (TextView)findViewById(R.id.bluevalue);
        bvalue.setText(Integer.toString(b));
     //   color = color - 10;
       // if(color > Color.parseColor("#0000FF"))
         //   color = Color.parseColor("#0000FF");
    }
    public void colorchange2(View view){
        ConstraintLayout currentLayout =
               (ConstraintLayout) findViewById(R.id.main_layout);
        currentLayout.setBackgroundColor(Color.rgb(r,g,b));
        r=r+5;
        if(r>255) {
            r = 0;
        }
        TextView rvalue = (TextView)findViewById(R.id.redvalue);
        rvalue.setText(Integer.toString(r));
    }
    public void colorchange3(View view){
        ConstraintLayout currentLayout =
                (ConstraintLayout) findViewById(R.id.main_layout);
        currentLayout.setBackgroundColor(Color.rgb(r,g,b));
        g=g+5;
        if(g>255)
            g=0;
        TextView gvalue = (TextView)findViewById(R.id.greenvalue);
        gvalue.setText(Integer.toString(g));
    }
    public void colorchange4(View view){
        r=0;
        g=0;
        b=0;
        ConstraintLayout currentLayout =
                (ConstraintLayout) findViewById(R.id.main_layout);
        currentLayout.setBackgroundColor(Color.rgb(r,g,b));
        TextView rvalue = (TextView)findViewById(R.id.redvalue);
        rvalue.setText(Integer.toString(r));
        TextView gvalue = (TextView)findViewById(R.id.greenvalue);
        gvalue.setText(Integer.toString(g));
        TextView bvalue = (TextView)findViewById(R.id.bluevalue);
        bvalue.setText(Integer.toString(b));

    }
}
