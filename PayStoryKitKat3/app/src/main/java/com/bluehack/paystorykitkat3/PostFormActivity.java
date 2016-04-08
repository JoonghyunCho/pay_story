package com.bluehack.paystorykitkat3;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class PostFormActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Post");
        toolbar.setTitleTextColor(0xFF4E4E50);
        setSupportActionBar(toolbar);

        setContentView(R.layout.post_form_layout);
    }
}
