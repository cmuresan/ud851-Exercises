package com.example.android.explicitintent;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Cristian on 11/25/2017.
 */

public class ChildActivity extends AppCompatActivity {
    private TextView mTextViewDisplay;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mTextViewDisplay = (TextView) findViewById(R.id.tv_display);
    }
}
