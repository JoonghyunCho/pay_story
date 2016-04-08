package com.example.jay.paystorykitkat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TabFragment2 extends Fragment {
    private LayoutInflater mInflater;
    private LinearLayout mXmlFavoriteLayout;
    private int mCnt = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mInflater = inflater;
        View layout = inflater.inflate(R.layout.tab_fragment_2, container, false);

        // profile
        LinearLayout xmlProfileLayout = (LinearLayout)layout.findViewById(R.id.tab_fragment_2_profile);
        View profileLayout = inflater.inflate(R.layout.tab_fragment_2_profile, xmlProfileLayout, false);
        xmlProfileLayout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), NextActivity.class);
                getActivity().startActivityForResult(intent, Activity.RESULT_OK);
            }
        });
        xmlProfileLayout.addView(profileLayout);

        // favorite list
        LinearLayout xmlFavoriteLayout = (LinearLayout)layout.findViewById(R.id.tab_fragment_2_favorite);
        mXmlFavoriteLayout = xmlFavoriteLayout;

        View favoriteLayout = inflater.inflate(R.layout.tab_fragment_2_favorite, xmlFavoriteLayout, false);
        favoriteLayout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                View favoriteLayout = mInflater.inflate(R.layout.tab_fragment_2_favorite, mXmlFavoriteLayout, false);
                TextView title = (TextView)favoriteLayout.findViewById(R.id.favorite_title);
                title.setText("This is added");
                TextView etc = (TextView)favoriteLayout.findViewById(R.id.favorite_etc);
                etc.setText("+" + mCnt++);
                mXmlFavoriteLayout.addView(favoriteLayout);
            }
        });
        TextView title = (TextView)favoriteLayout.findViewById(R.id.favorite_title);
        title.setText("More");
        xmlFavoriteLayout.addView(favoriteLayout);

        favoriteLayout = inflater.inflate(R.layout.tab_fragment_2_favorite, xmlFavoriteLayout, false);
        favoriteLayout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), NextActivity.class);
                getActivity().startActivityForResult(intent, Activity.RESULT_OK);
            }
        });
        title = (TextView)favoriteLayout.findViewById(R.id.favorite_title);
        title.setText("Recent writes");
        TextView etc = (TextView)favoriteLayout.findViewById(R.id.favorite_etc);
        etc.setText(">");
        xmlFavoriteLayout.addView(favoriteLayout);

        return layout;
    }
}