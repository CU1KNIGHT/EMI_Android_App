package com.example.mahmoud.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends Activity {
EditText e   ;
TextView Text;
Button b;
Button Berchne;
TextView fabView;
    float summe;
    ArrayList<String> listNumbers= new ArrayList<>();

   /* System.out.print( + summe + " summe: ");
    int n = summe, t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");

        for (int i = 1; i <= n; ++i)
    {
        System.out.print(t1 + " + ");

        int sum = t1 + t2;
        t1 = t2;
        t2 = sum;
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e   = (EditText) findViewById(R.id.editText);
        Text  = (TextView ) findViewById( R.id.textView);
        b= (Button) findViewById(R.id.button);
        fabView   = (TextView ) findViewById( R.id.fabView);
fabView.setMovementMethod(new ScrollingMovementMethod());

//+++++++++++++++++++++++++++++++++++++++++++++[   =   ]+++++++++++++++++++
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num= e.getText().toString();
                Float f= Float.parseFloat(num);
              //  float f= Math.round(c);
               // Integer f= Integer.parseInt(num);
                 summe = 0;
          while (0 != f) {
            // addiere die letzte ziffer der uebergebenen zahl zur summe
             summe = summe + (f % 10);
            // entferne die letzte ziffer der uebergebenen zahl
            f = f / 10;

        }

                //int s=Integer.parseInt(num);
               Text.setText(String.valueOf(/*Math.round(*/summe)/*)*/);

            }
        });
//+++++++++++++++++++++++++++++++++++++++++++Brechne
        Berchne= (Button) findViewById(R.id.Berchne);
        Berchne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listNumbers.clear();
                fabView.setText("");
                int s= (int) summe;


                int n = s, t1 = 0, t2 = 1;


                for (int i = 1; i <= s; ++i)
                {
                  //  fabView.setText(t1 +"\n");



                   /* System.getProperty("line.separator");
                    for( i=0 ; i < listNumbers.size();i++){
                        fabView.setText(listNumbers.get(i));

                        Log.d( " value",listNumbers.get(i));
                    }
*/


                    listNumbers.add(String.valueOf(t1));
                    int sum = t1 + t2 ;
                    String sumS= sum+"\n";
                    t1 = t2;
                    t2 = sum;
                  //  fabView.setText(sumS);
                  //  fabView.setText("sum\r\nNext line");




            }
                if (listNumbers.size()> 30) {

                    for( int x=0 ; x <= 30;++x){
                        // fabView.setText(listNumbers.get(f)+" \n");
                        String s4= listNumbers.get(x) + "\r\n";
                        fabView.append(s4);
                        Log.d("Fab n", s4);
                    }}else{
                for( int f=0 ; f < listNumbers.size();f++){
               // fabView.setText(listNumbers.get(f)+" \n");
                    String s3= listNumbers.get(f) + "\r\n";
                    fabView.append(s3);}}





            }
        });

//String num= e.getText().toString();
     //   Float f= Float.parseFloat(num);
   // int s=Integer.parseInt(num);
     int summe = 3;
       /*   while (0 != s) {
            // addiere die letzte ziffer der uebergebenen zahl zur summe
            summe = summe + (s % 10);
            // entferne die letzte ziffer der uebergebenen zahl
            s = s / 10;

        }*/


    }
}
