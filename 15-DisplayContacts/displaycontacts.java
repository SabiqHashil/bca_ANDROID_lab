// Write a Program to display contacts using Grid View Control

package com.example.gridview;

import android.widget.GridView;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.GridView;

public class MainActivity extends Activity {
    GridView gv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gv = (GridView) findViewById(R.id.gridView1);
        gv.setNumColumns(2);
        Cursor c = managedQuery(Contacts.People.CONTENT_URI, null, null, null, Contacts.People.NAME);

        String[] cols = new String[] { Contacts.People.NAME };
        int[] views = new int[] { android.R.id.text1 };
        SimpleCursorAdapter adpt = new SimpleCursorAdapter(this, android.R.layout.simple_list_item_1, c, cols, views);

        gv.setAdapter(adpt);
    }
}
