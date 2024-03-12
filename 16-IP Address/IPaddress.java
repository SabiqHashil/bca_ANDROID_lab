// Write a program to Get IP Address of the deviceXml File

package com.andoubleos.ipaddress;

import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.app.Activity;
import android.text.format.Formatter;
import android.widget.TextView;

public class MainActivity extends Activity {
    TextView tv;
    String ipa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.textView1);
        WifiManager wm = (WifiManager) getSystemService(WIFI_SERVICE);
        ipa = Formatter.formatIpAddress(wm.getConnectionInfo().getIpAddress());
        tv.setText(ipa);
    }
}
