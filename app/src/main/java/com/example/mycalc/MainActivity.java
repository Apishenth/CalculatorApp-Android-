package com.example.mycalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialization
        EditText Operand1,Operand2;
        TextView Results;
        Button Add,Sub,Mul,Divide;

        Operand1 = (EditText) findViewById(R.id.UserVal01);
        Operand2 = (EditText) findViewById(R.id.UserVal02);
        Results = (TextView) findViewById(R.id.Results);
        Add = (Button) findViewById(R.id.buttonAdd);
        Sub = (Button) findViewById(R.id.buttonSubract);
        Mul = (Button) findViewById(R.id.buttonMultiply);
        Divide = (Button) findViewById(R.id.buttonDivision);

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable editable;
                String str;
                Double Val1,Val2,result;

                //Avoid App crash when user inputs are empty
                if (!Operand1.getText().toString().equals("") && !Operand2.getText().toString().equals("")){

                    editable = Operand1.getText();
                    str = editable.toString();
                    Val1 = Double.parseDouble(str);
                    editable = Operand2.getText();
                    str = editable.toString();
                    Val2 = Double.parseDouble(str);

                    result = Val1 + Val2;
                    Results.setText(Double.toString(result));
                }
                else{
                    Results.setText("");
                }
            }
        });

        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable editable;
                String str;
                Double Val1,Val2,result;

                if (!Operand1.getText().toString().equals("") && !Operand2.getText().toString().equals("")){

                    editable = Operand1.getText();
                    str = editable.toString();
                    Val1 = Double.parseDouble(str);
                    editable = Operand2.getText();
                    str = editable.toString();
                    Val2 = Double.parseDouble(str);

                    result = Val1 - Val2;
                    Results.setText(Double.toString(result));
                }
                else{
                    Results.setText("");
                }
            }
        });

        Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Editable editable;
                String str;
                Double Val1,Val2,result;

                if (!Operand1.getText().toString().equals("") && !Operand2.getText().toString().equals("")){

                    editable = Operand1.getText();
                    str = editable.toString();
                    Val1 = Double.parseDouble(str);
                    editable = Operand2.getText();
                    str = editable.toString();
                    Val2 = Double.parseDouble(str);

                    result = Val1 * Val2;
                    Results.setText(Double.toString(result));
                }
                else{
                    Results.setText("");
                }
            }
        });

        Divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Editable editable;
                String str;
                Double Val1,Val2,result;

                if (!Operand1.getText().toString().equals("") && !Operand2.getText().toString().equals("")){

                    editable = Operand1.getText();
                    str = editable.toString();
                    Val1 = Double.parseDouble(str);
                    editable = Operand2.getText();
                    str = editable.toString();
                    Val2 = Double.parseDouble(str);
                    // Setting up a if statement to catch 0/0 error
                    if(Val1 == 0 && Val2 ==0) {
                        Results.setText("Error");
                    }
                    else{
                        result = Val1 / Val2;
                        Results.setText(Double.toString(result));
                    }

                }
                else{
                    Results.setText("");
                }
            }
        });

    }
}