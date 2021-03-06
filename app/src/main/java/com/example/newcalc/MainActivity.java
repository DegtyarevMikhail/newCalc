package com.example.newcalc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    private final static String KeyStorage = "KeyStorage";


    Storage data = new Storage();

    private EditText display1;
    private EditText display2;

    private MaterialButton btn0;
    private MaterialButton btn1;
    private MaterialButton btn2;
    private MaterialButton btn3;
    private MaterialButton btn4;
    private MaterialButton btn5;
    private MaterialButton btn6;
    private MaterialButton btn7;
    private MaterialButton btn8;
    private MaterialButton btn9;
    private MaterialButton btnPlus;
    private MaterialButton btnMinus;
    private MaterialButton btnDivision;
    private MaterialButton btnMultiply;
    private MaterialButton btnEqual;
    private MaterialButton btnС;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn0 = findViewById(R.id.Button11);
        btn1 = findViewById(R.id.Button01);
        btn2 = findViewById(R.id.Button02);
        btn3 = findViewById(R.id.Button03);
        btn4 = findViewById(R.id.Button04);
        btn5 = findViewById(R.id.Button05);
        btn6 = findViewById(R.id.Button06);
        btn7 = findViewById(R.id.Button07);
        btn8 = findViewById(R.id.Button08);
        btn9 = findViewById(R.id.Button09);

        btnPlus = findViewById(R.id.ButtonPlus);
        btnMinus = findViewById(R.id.ButtonMinus);
        btnDivision = findViewById(R.id.ButtonDivide);
        btnMultiply = findViewById(R.id.ButtonMul);
        btnEqual = findViewById(R.id.Button12);
        btnС = findViewById(R.id.ButtonC);

        if (savedInstanceState != null  && savedInstanceState.containsKey(KeyStorage))
        {

            data = savedInstanceState.getParcelable(KeyStorage);
        }
        //display1.setText(data.getDisplay1());
        //display2.setText(data.getDisplay2());

        display1 = (EditText) findViewById(R.id.display1);

        display2 = (EditText) findViewById(R.id.display2);

        btn0.setOnClickListener(view -> display1.setText("0"));
        btn1.setOnClickListener(view -> display1.setText("1"));
        btn2.setOnClickListener(view -> display1.setText("2"));
        btn3.setOnClickListener(view -> display1.setText("3"));
        btn4.setOnClickListener(view -> display1.setText("4"));
        btn5.setOnClickListener(view -> display1.setText("5"));
        btn6.setOnClickListener(view -> display1.setText("6"));
        btn7.setOnClickListener(view -> display1.setText("7"));
        btn8.setOnClickListener(view -> display1.setText("8"));
        btn9.setOnClickListener(view -> display1.setText("9"));
        btnPlus.setOnClickListener(view -> display2.setText("+"));
        btnMinus.setOnClickListener(view -> display2.setText("-"));
        btnDivision.setOnClickListener(view -> display2.setText("/"));
        btnMultiply.setOnClickListener(view -> display2.setText("*"));
        btnEqual.setOnClickListener(view -> display2.setText("="));
        btnС.setOnClickListener(view -> {
            display1.setText("");
            display2.setText("");
        });

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState){
        outState.putParcelable(KeyStorage, data);
        super.onSaveInstanceState(outState);

    }

}