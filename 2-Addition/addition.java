// Addition of two Numbers (Write a program to add two numbers)Xml File

package com.example.twosum;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    EditText txt1;
    EditText txt2;
    TextView tv;
    Button bt;

    Float a, b, c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = (EditText) findViewById(R.id.txtNumber1);
        txt2 = (EditText) findViewById(R.id.txtNumber2);
        tv = (TextView) findViewById(R.id.txtResult);
        bt = (Button) findViewById(R.id.btnAdd);

        bt.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                a = Float.parseFloata(firstNumber.getText().toString());
                b = Float.parseFloat(secondNumber.getText().toString());
                c = a + b;
                addResult.setText(Float.toString(c));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        // getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
