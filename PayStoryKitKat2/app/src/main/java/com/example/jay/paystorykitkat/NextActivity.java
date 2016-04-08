package com.example.jay.paystorykitkat;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class NextActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);
    }

    public void onClick(View v)
    {
        this.setResult(RESULT_OK);
        this.finish();
    }
}