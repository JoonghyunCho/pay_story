package com.bluehack.paystorykitkat3;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by drago on 2016-04-08.
 */
public class PaymentHistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab1_card_detail);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_for_paymenthistory);
        toolbar.setTitle(R.string.toolbar_for_paymenthistory_name);
        toolbar.setTitleTextColor(0xFF4E4E50);
        setSupportActionBar(toolbar);
    }
}
