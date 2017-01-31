
package com.example.ex2;

import android.app.Activity;
import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
 
public class MainActivity extends Activity implements OnClickListener
{
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
 
        Num1 = (EditText) findViewById(R.id.n1);
        Num2 = (EditText) findViewById(R.id.n2);
        Add = (Button) findViewById(R.id.add);
        Sub = (Button) findViewById(R.id.subtract);
        Mul = (Button) findViewById(R.id.multiply);
        Div = (Button) findViewById(R.id.divide);
        Result = (TextView) findViewById(R.id.result);

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

        if (TextUtils.isEmpty(Num1.getText().toString()) || TextUtils.isEmpty(Num2.getText().toString()))
                return;

        num1 = Float.parseFloat(Num1.getText().toString());
        num2 = Float.parseFloat(Num2.getText().toString());

        switch (v.getId()) 
        {
            case R.id.add:
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
        Result.setText(num1 + " " + oper + " " + num2 + " = " + result);
    }
}
