// Image View (Write a Program to Display images from local drive of thecomputer)

package com.andoubleos.imgview;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity implements OnClickListener {
    ImageView img;
    Button b1, b2, b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = (ImageView) findViewById(R.id.imageView1);
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);

    }

    @Override
    public void onClick(View arg0) {
        // TODO Auto-generated method stub
        switch (arg0.getId()) {
            case R.id.button1:
                img.setBackgroundResource(R.drawable.image1);
                break;
            case R.id.button2:
                img.setBackgroundResource(R.drawable.image2);
                break;
            case R.id.button3:
                img.setBackgroundResource(R.drawable.image3);
                break;

            default:
                break;
        }
    }
}
