// Program to display date and time using dialog box

package com.example.showdate;

import java.util.Calendar;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
    Button btn;
    int year, month, day;
    String sysdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button1);
        btn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                Calendar c = Calendar.getInstance();
                year = c.get(Calendar.YEAR);
                month = c.get(Calendar.MONTH);
                day = c.get(Calendar.DAY_OF_MONTH);
                sysdate = day + " / " + (month + 1) + " / " + year;

                AlertDialog.Builder b1 = new AlertDialog.Builder(MainActivity.this);
                b1.setTitle("System Date");
                b1.setMessage("Current System Date is: " + sysdate);
                b1.setPositiveButton("OK", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        // TODO Auto-generated method stub

                    }
                });
                AlertDialog d1 = b1.create();
                d1.show();
            }
        });
    }
}
