package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

public class PrintStarActivity extends AppCompatActivity {
    private TextView view1=null;
    private TextView edit1=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print_star);
        getSupportActionBar().setTitle("별찍");
        }

        public void viewc(View aa){
         view1=findViewById(R.id.view1);
         edit1=findViewById(R.id.edit1);

         String s = edit1.getText().toString();
            int ss =0;

         try{
            ss =  Integer.parseInt(s);
         }
         catch (Exception e){
             ss = 0;
         }

         edit1.setText("");
         String q = "";


         for(int i =0;i<ss;i++){
              for(int j =0;j<=i;j++){
                  q = q + "*";
              }
             q = q+"\n";
         }
         view1.setMovementMethod(new ScrollingMovementMethod());

         view1.setText(q);

        }

    }

