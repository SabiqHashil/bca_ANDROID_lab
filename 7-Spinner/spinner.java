// Spinner (Write a Program to Spin the four items)

package com.andoubleos.spinnercontrol;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity implements OnItemSelectedListener {
    Spinner sp;
    TextView tv;
    String[] items = { "Keybord", "Mouse", "Printer", "Speaker" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp = (Spinner) findViewById(R.id.spinner1);
        tv = (TextView) findViewById(R.id.textView1);
        sp.setOnItemSelectedListener(this);
        ArrayAdapter<String> adt = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        sp.setAdapter(adt);
    }

    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
            long arg3) {
        // TODO Auto-generated method stub tv.setText(items[arg2]);
    }
}
