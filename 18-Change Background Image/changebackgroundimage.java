// Write a program to Change the Background image

package com.andoubleos.background;

import java.util.Random;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

    Button btn;
    View screenView;
    int[] images;

@Override
protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);
btn =(Button) findViewById(R.id.button1); screenView = findViewById(R.id.rView);
images = new int[]
{R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4,R.drawa ble.image6};
btn.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View arg0) {
// TODO Auto-generated method stub int aryLength = images.length; Random rand = new Random();
int randNum = rand.nextInt(aryLength); screenView.setBackgroundResource(images[randNum]);
}
});
}
}
