package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ask;
       final TextView text;
        ask=findViewById(R.id.askbutton);
        text=findViewById(R.id.textView_YESNO);

       final String[] sec={
          " YES"," NO"
        };

       final Random numbergen=new Random();


        ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num=numbergen.nextInt(2);
                if(num==1)
                {
                   text.setText("YES");
                }
                else
                {
                   text.setText("NO");
                }



            }
        });
    }
}
