package com.example.newcalc;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    private MaterialButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, equal, add, minus, div, mult,clean;
    private EditText t1, t2;
    public String a, b, u = "",si="",con="", e = "Math error";
    char ch=' ';
    double exp1=Math.exp(1),v=0.0,pie=Math.PI;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        b0 = findViewById(R.id.Button11);
        b1 = findViewById(R.id.Button01);
        b2 = findViewById(R.id.Button02);
        b3 = findViewById(R.id.Button03);
        b4 = findViewById(R.id.Button04);
        b5 = findViewById(R.id.Button05);
        b6 = findViewById(R.id.Button06);
        b7 = findViewById(R.id.Button07);
        b8 = findViewById(R.id.Button08);
        b9 = findViewById(R.id.Button09);
        equal = findViewById(R.id.Button12);
        add = findViewById(R.id.ButtonPlus);
        minus = findViewById(R.id.ButtonMinus);
        div = findViewById(R.id.ButtonDivide);
        mult = findViewById(R.id.ButtonMul);
        clean = findViewById(R.id.ButtonC);


        t1 = findViewById(R.id.display1);
        t2 = findViewById(R.id.display2);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                u = u + "0";
                con=si+u;
                t1.setText(con);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                u = u + "1";
                con=si+u;
                t1.setText(con);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                u = u + "2";
                con=si+u;
                t1.setText(con);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                u = u + "3";
                con=si+u;
                t1.setText(con);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                u = u + "4";
                con=si+u;
                t1.setText(con);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                u = u + "5";
                con=si+u;
                t1.setText(con);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                u = u + "6";
                con=si+u;
                t1.setText(con);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                u = u + "7";
                con=si+u;
                t1.setText(con);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                u = u + "8";
                con=si+u;
                t1.setText(con);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                u = u + "9";
                con=si+u;
                t1.setText(con);
            }
        });


        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                cal();
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                u = u + "+";
                con=si+u;
                t1.setText(con);
                ch = '+';

            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                u = u + "-";
                con=si+u;
                t1.setText(con);
                ch = '-';
            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                u = u + "*";
                con=si+u;
                t1.setText(con);
                ch = '*';
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                u = u + "/";
                con=si+u;
                t1.setText(con);
                ch = '/';
            }
        });
        clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                t1.setText("");
                u="";
                si="";
                con="";
                t2.setText("");
            }
        });


    }
    public void cal() {
        if(ch==' ')
            t2.setText(u);

        b = t1.getText().toString();
        if (si.length() > 0) {
            u = change(u);
            v = Double.parseDouble(u);
            double val = 0.0d;
            if (si.equals("log ")) {
                val = Math.log10(v);
            }
            if (si.equals("ln ")) {
                val = Math.log(v);
            }
            if (si.equals("sin ")) {
                val = Math.sin(Math.toRadians(v));
            }
            if (si.equals("cos "))
                val = Math.cos(Math.toRadians(v));
            if (si.equals("tan ")) {
                if (v == 90) {
                    t2.setText(e);
                    return;
                }
                if (v == 45) {
                    t2.setText("1");
                    return;
                }


                val = Math.tan(Math.toRadians(v));
            }
            a = "" + val;
            t2.setText(a);
            si = "";
            u = "";
            return;


        }
        if (u.equals("e")) {

            String x = "" + exp1;
            t2.setText(x);
            return;
        }
        if (u.equals("π")) {

            String x = "" + pie;
            t2.setText(x);
            return;
        }

        b = change(b);
        double a1 = Double.parseDouble(b.substring(0, b.indexOf(ch)));
        if(u.charAt(u.length()-1)==ch)
            Toast.makeText(getApplicationContext(),"Operand missing", Toast.LENGTH_LONG).show();
        else {
            double a2 = Double.parseDouble(b.substring(b.indexOf(ch) + 1));
            if (ch == '+')
                a1 = a1 + a2;
            if (ch == '-')
                a1 = a1 - a2;
            if (ch == '*')
                a1 = a1 * a2;
            if (ch == '/') {
                if (a2 == 0) {

                    Toast.makeText(getApplicationContext(), e, Toast.LENGTH_LONG).show();
                    return;
                } else
                    a1 = a1 / a2;
            }
            if (ch == 'P') {
                if(a2>a1){
                    Toast.makeText(getApplicationContext(),"Not possible", Toast.LENGTH_LONG).show();
                    return;}

                if(a1==a2)
                    a1=1.0;
                else{
                    Double a = fact(a1);
                    Double x = a1 - a2;
                    Double b = fact(x);
                    a1 = a / b;}
            }
            if (ch == 'C') {
                if(a2>a1){
                    Toast.makeText(getApplicationContext(),"Not possible", Toast.LENGTH_LONG).show();
                    return;}
                if(a1==a2)
                    a1=1.0;
                else{
                    Double a = fact(a1);
                    Double c = fact(a2);
                    Double x = a1 - a2;
                    Double b = fact(x);
                    a1 = a / (b * c);}
            }
            if (ch == '^') {
                a1 = Math.pow(a1, a2);
            }
            a = "" + a1;
            t2.setText(a);
            u = a;
        }
    }

    public String change(String t)
    {
        String v=""+exp1,val="",ti=""+pie;
        int p=0;
        for(int i=0;i<t.length();i++)
        {
            char ch=t.charAt(i);
            if(ch=='e')
            {
                val=val+t.substring(p,i)+v;
                p=i+1;
            }
            if(ch=='π')
            {
                val=val+t.substring(p,i)+ti;
                p=i+1;
            }
        }
        val=val+t.substring(p);
        return val;
    }
    public Double fact(Double a)    {
        if(a==0)
            return 1.0;

        Double i, f=1.0;
        for(i=2.0;i<=a;i++)
            f=f*i;
        return f;
    }
}