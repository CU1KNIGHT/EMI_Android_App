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
    //e ist die Eingabe vom User
    //Text ist die Ausgabe


EditText e   ;
    TextView Quersumme;
TextView Text;
Button b;
Button Berchne;
TextView fabView;
    int summe;
    ArrayList<String> listNumbers = new ArrayList<>();

    void calculateDigitSum() {//+++++++++++++++++++++++++++++++++++++++++++++[   =   ]+++++++++++++++++++
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num = e.getText().toString();
             
                Integer f = Integer.parseInt(num);
                summe = 0;
                while (0 != f) {
                    // addiere die letzte ziffer der uebergebenen zahl zur summe
                    summe = summe + (f % 10);
                    // entferne die letzte ziffer der uebergebenen zahl
                    f = f / 10;

                }

                
                Text.setText(String.valueOf(/*Math.round(*/summe)/*)*/);

            }
        });
    }

    void calculateFibonacciRow() {//+++++++++++++++++++++++++++++++++++++++++++Brechne
        Berchne = findViewById(R.id.Berchne);
        Berchne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listNumbers.clear();
                fabView.setText("");
                int s = summe;


                int n = s, t1 = 0, t2 = 1;


                for (int i = 1; i <= s; ++i) {


                    listNumbers.add(String.valueOf(t1));
                    int sum = t1 + t2;
                    String sumS = sum + "\n";
                    t1 = t2;
                    t2 = sum;


                }
                if (listNumbers.size() > 30) {

                    for (int x = 0; x <= 30; ++x) {
                        String s4 = listNumbers.get(x) + "\r\n";
                        fabView.append(s4);
                        Log.d("Fab n", s4);
                    }
                } else {
                    for (int f = 0; f < listNumbers.size(); f++) {
                        String s3 = listNumbers.get(f) + "\r\n";
                        fabView.append(s3);
                    }
                }


            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e = findViewById(R.id.editText);
        Text = findViewById(R.id.textView);
        b = findViewById(R.id.button);
        fabView = findViewById(R.id.fabView);
fabView.setMovementMethod(new ScrollingMovementMethod());

        calculateDigitSum();
        calculateFibonacciRow();




    }
}
