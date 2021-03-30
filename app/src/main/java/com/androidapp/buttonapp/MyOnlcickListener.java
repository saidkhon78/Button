package com.androidapp.buttonapp;

import android.view.View;

public class MyOnlcickListener implements View.OnClickListener {
    private final MainActivity mainActivity;

    public MyOnlcickListener(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View view) {
        mainActivity.mTextView1.setText("You clicked ???의 button");
    }
}
