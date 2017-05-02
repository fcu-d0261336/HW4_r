package com.example.niu.hw4r;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by NIU on 4/26/17.
 */

public class ActivityNotification extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(ActivityNotification.this);
        tv.setText("ActivityNotification!");
        setContentView(tv);
    }
}
