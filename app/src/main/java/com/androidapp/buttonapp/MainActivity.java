package com.androidapp.buttonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
    public BreakIterator mTextView1;
    Button mButton1;
    TextView mtextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton1 = (Button)findViewById(R.id.button1);
        mtextView = (TextView)findViewById(R.id.textView1);

        mButton1.setOnClickListener(new MyOnlcickListener(this));
    }
}