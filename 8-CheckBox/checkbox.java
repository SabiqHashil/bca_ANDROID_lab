// Check box (Write a Program to check the items listed)

package com.andoubleos.mycheckbox;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
    CheckBox chk1, chk2, chk3, chk4;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chk1 = (CheckBox) findViewById(R.id.checkBox1);
        chk2 = (CheckBox) findViewById(R.id.checkBox2);
        chk3 = (CheckBox) findViewById(R.id.checkBox3);
        chk4 = (CheckBox) findViewById(R.id.checkBox4);
        btn = (Button) findViewById(R.id.button1);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View arg0) {
        // TODO Auto-generated method stub StringBuffer strb = new StringBuffer();
        strb.append("Android: ").append(chk1.isChecked());
        strb.append("\nJava: ").append(chk2.isChecked());
        strb.append("\nPHP: ").append(chk3.isChecked());
        strb.append("\nShell Script: ").append(chk4.isChecked());
        Toast.makeText(MainActivity.this, strb.toString(), Toast.LENGTH_LONG).show();
    }
}
