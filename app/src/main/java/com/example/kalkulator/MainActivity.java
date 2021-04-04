package com.example.kalkulator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView input;
    Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnZero, btnDot, btnAdd, btnSubtract, btnMultiply, btnDivide,
            btnEqual, btnClear;

    double num1 = 0;
    int indikator = 0;

    ModelActivity model;
    ControllerActivity rumus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input       = findViewById(R.id.input);
        btnOne      = findViewById(R.id.btnOne);
        btnTwo      = findViewById(R.id.btnTwo);
        btnThree    = findViewById(R.id.btnThree);
        btnFour     = findViewById(R.id.btnFour);
        btnFive     = findViewById(R.id.btnFive);
        btnSix      = findViewById(R.id.btnSix);
        btnSeven    = findViewById(R.id.btnSeven);
        btnEight    = findViewById(R.id.btnEight);
        btnNine     = findViewById(R.id.btnNine);
        btnZero     = findViewById(R.id.btnZero);
        btnDot      = findViewById(R.id.btnDot);
        btnAdd      = findViewById(R.id.btnAdd);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnDivide   = findViewById(R.id.btnDivide);
        btnEqual    = findViewById(R.id.btnEqual);
        btnClear    = findViewById(R.id.btnClear);


        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
        btnFour.setOnClickListener(this);
        btnFive.setOnClickListener(this);
        btnSix.setOnClickListener(this);
        btnSeven.setOnClickListener(this);
        btnEight.setOnClickListener(this);
        btnNine.setOnClickListener(this);
        btnZero.setOnClickListener(this);
        btnDot.setOnClickListener(this);
        btnAdd.setOnClickListener(this);
        btnSubtract.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnEqual.setOnClickListener(this);
        btnClear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        try{
            switch(v.getId()){
                case R.id.btnOne:
                    input.setText(input.getText().toString()+btnOne.getText().toString());
                    break;

                case R.id.btnTwo:
                    input.setText(input.getText().toString()+btnTwo.getText().toString());
                    break;

                case R.id.btnThree:
                    input.setText(input.getText().toString()+btnThree.getText().toString());
                    break;

                case R.id.btnFour:
                    input.setText(input.getText().toString()+btnFour.getText().toString());
                    break;

                case R.id.btnFive:
                    input.setText(input.getText().toString()+btnFive.getText().toString());
                    break;

                case R.id.btnSix:
                    input.setText(input.getText().toString()+btnSix.getText().toString());
                    break;

                case R.id.btnSeven:
                    input.setText(input.getText().toString()+btnSeven.getText().toString());
                    break;

                case R.id.btnEight:
                    input.setText(input.getText().toString()+btnEight.getText().toString());
                    break;

                case R.id.btnNine:
                    input.setText(input.getText().toString()+btnNine.getText().toString());
                    break;

                case R.id.btnZero:
                    input.setText(input.getText().toString()+btnZero.getText().toString());
                    break;

                case R.id.btnDot:
                    input.setText(input.getText().toString()+btnDot.getText().toString());
                    break;

                case R.id.btnAdd:
                    num1 = Double.parseDouble(input.getText().toString());
                    input.setText("");
                    indikator = 1;
                    break;

                case R.id.btnSubtract:
                    num1 = Double.parseDouble(input.getText().toString());
                    input.setText("");
                    indikator = 2;
                    break;

                case R.id.btnMultiply:
                    num1 = Double.parseDouble(input.getText().toString());
                    input.setText("");
                    indikator = 3;
                    break;

                case R.id.btnDivide:
                    num1 = Double.parseDouble(input.getText().toString());
                    input.setText("");
                    indikator = 4;
                    break;

                case R.id.btnClear:
                    input.setText("");
                    break;

                case R.id.btnEqual:

                    model = new ModelActivity(num1, Double.parseDouble(input.getText().toString()));
                    rumus = new ControllerActivity();
                    switch(indikator){
                        case 1:
                            input.setText(Double.toString(rumus.addition(model)));
                            break;
                        case 2:
                            input.setText(Double.toString(rumus.subtraction(model)));
                            break;
                        case 3:
                            input.setText(Double.toString(rumus.multiplication(model)));
                            break;
                        case 4:
                            input.setText(Double.toString(rumus.divistion(model)));
                            break;
                    }

                    break;
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }


}