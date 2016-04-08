package com.bluehack.paystorykitkat3;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TabFragment1 extends Fragment {
    private View mTab1Layout = null;
    private LinearLayout mContentsLayout = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mTab1Layout = inflater.inflate(R.layout.tab_fragment_1, container, false);
        mContentsLayout = (LinearLayout)mTab1Layout.findViewById(R.id.contentsLayout);

        // Example Data
        View content1 = createContentLayout(inflater, mContentsLayout,
                                            "Michael", "Im a michael. nice to meet u.",
                                            R.color.primary_material_light);

        View content2 = createContentLayout(inflater, mContentsLayout,
                "Jane", "Mother father gentle man~",
                R.color.primary_dark_material_light);

        View content3 = createContentLayout(inflater, mContentsLayout,
                "Jay", "Day by day...",
                R.color.primary_material_light);

        mContentsLayout.addView(content1);
        mContentsLayout.addView(content2);
        mContentsLayout.addView(content3);

        return mTab1Layout;
    }

    public View createContentLayout(LayoutInflater inflater, ViewGroup layout, String publisherName,
                                    String textContent, int color)
    {
        View contentLayout = inflater.inflate(R.layout.content, layout, false);

        // background color
        contentLayout.setBackgroundResource(color);

        // publisher
        TextView publisher = (TextView)contentLayout.findViewById(R.id.publisher);
        publisher.setText(publisherName);

        // contents
        TextView txt = (TextView)contentLayout.findViewById(R.id.contentsCellText);
        txt.setText(textContent);

        return contentLayout;
    }
}