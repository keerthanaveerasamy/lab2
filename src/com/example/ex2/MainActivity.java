package com.example.ex2;
 
import android.app.AliasActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
 
public class MainActivity extends AliasActivity implements OnClickListener
{
    //Defining the Views
    EditText Num1;
    EditText Num2;
    Button Add;
    Button Sub;
    Button Mul;
    Button Div;
    TextView Result;
 
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 
        //Referring the Views
        Num1 = (EditText) findViewById(R.id.n1);
        Num2 = (EditText) findViewById(R.id.n2);
        Add = (Button) findViewById(R.id.plus);
        Sub = (Button) findViewById(R.id.subtract);
        Mul = (Button) findViewById(R.id.multiply);
        Div = (Button) findViewById(R.id.divide);
        Result = (TextView) findViewById(R.id.result);
 
        // set a listener
        Add.setOnClickListener(this);
        Sub.setOnClickListener(this);
        Mul.setOnClickListener(this);
        Div.setOnClickListener(this);
    }
     
    @Override
    public void onClick (View v)
    {
         
        float num1 = 0;
        float num2 = 0;
        float result = 0;
        String oper = "";
 
        // check if the fields are empty
        if (TextUtils.isEmpty(Num1.getText().toString()) || TextUtils.isEmpty(Num2.getText().toString()))
                return;
 
        // read EditText and fill variables with numbers
        num1 = Float.parseFloat(Num1.getText().toString());
        num2 = Float.parseFloat(Num2.getText().toString());
 
        // defines the button that has been clicked and performs the corresponding operation
        // write operation into oper, we will use it later for output
        switch (v.getId()) 
        {
            case R.id.plus:
                oper = "+";
                result = num1 + num2;
                break;
            case R.id.subtract:
                oper = "-";
                result = num1 - num2;
                break;
            case R.id.multiply:
                oper = "*";
                result = num1 * num2;
                break;
            case R.id.divide:
                oper = "/";
                result = num1 / num2;
                break;
            default:
                break;
        }
        // form the output line
        Result.setText(num1 + " " + oper + " " + num2 + " = " + result);
    }
}