// Menu Program (Write a Program to create menu with three menu items)

package com.andoubleos.menuprgm;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        // getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // TODO Auto-generated method stub
        int id = item.getItemId();

        if (id == R.id.copyItem) {
            Toast.makeText(MainActivity.this, "You Clicked Copy Menu Item", 500).show();
        } else if (id == R.id.cutItem) {
            Toast.makeText(MainActivity.this, "You Clicked Cut Menu Item", Toast.LENGTH_LONG).show();
        } else if (id == R.id.copyItem) {
            Toast.makeText(MainActivity.this, "You Clicked Paste Menu Item", 500).show();
        } else if (id == R.id.ggle) {
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("http://www.google.com"));
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}
