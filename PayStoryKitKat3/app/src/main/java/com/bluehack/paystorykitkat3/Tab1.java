package com.bluehack.paystorykitkat3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Tab1 extends  Fragment {
    private View mTab1Layout = null;
    private LinearLayout mContentsLayout = null;
    private ImageView mCardImage = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mTab1Layout = inflater.inflate(R.layout.tab1_layout, container, false);
        mContentsLayout = (LinearLayout)mTab1Layout.findViewById(R.id.tab1_layout);
        mCardImage = (ImageView)mTab1Layout.findViewById(R.id.tab1_card_image);

        mCardImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PaymentHistoryActivity.class);
                startActivity(intent);
            }
        });

        return mTab1Layout;
    }
}
