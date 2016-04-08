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
    private ImageView mCardImage1 = null;
    private ImageView mCardImage2 = null;
    private ImageView mCardImage3 = null;
    private ImageView mCardImage4 = null;
    private ImageView mCardImage5 = null;

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getActivity(), PaymentHistoryActivity.class);
            startActivity(intent);
        }
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mTab1Layout = inflater.inflate(R.layout.tab1_layout, container, false);
        mContentsLayout = (LinearLayout)mTab1Layout.findViewById(R.id.tab1_layout);
        mCardImage1 = (ImageView)mTab1Layout.findViewById(R.id.tab1_card_image1);
        mCardImage2 = (ImageView)mTab1Layout.findViewById(R.id.tab1_card_image2);
        mCardImage3 = (ImageView)mTab1Layout.findViewById(R.id.tab1_card_image3);
        mCardImage4 = (ImageView)mTab1Layout.findViewById(R.id.tab1_card_image4);
        mCardImage5 = (ImageView)mTab1Layout.findViewById(R.id.tab1_card_image5);

        mCardImage1.setOnClickListener(onClickListener);
        mCardImage2.setOnClickListener(onClickListener);
        mCardImage3.setOnClickListener(onClickListener);
        mCardImage4.setOnClickListener(onClickListener);
        mCardImage5.setOnClickListener(onClickListener);

        return mTab1Layout;
    }
}
