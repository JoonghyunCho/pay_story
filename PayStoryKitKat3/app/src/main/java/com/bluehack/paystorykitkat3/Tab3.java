package com.bluehack.paystorykitkat3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Date;

public class Tab3 extends  Fragment {
    private View mTab3Layout = null;
    private LinearLayout mContentsLayout = null;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mTab3Layout = inflater.inflate(R.layout.tab3_layout, container, false);
        mContentsLayout = (LinearLayout)mTab3Layout.findViewById(R.id.tab3_list);

        /*ImageView img1 = new ImageView(this.getActivity());
        img1.setImageResource(R.drawable.list01);
        ImageView img2 = new ImageView(this.getActivity());
        img2.setImageResource(R.drawable.list02);
        ImageView img3 = new ImageView(this.getActivity());
        img3.setImageResource(R.drawable.list03);
        ImageView img4 = new ImageView(this.getActivity());
        img4.setImageResource(R.drawable.list04);
        ImageView img5 = new ImageView(this.getActivity());
        img5.setImageResource(R.drawable.list05);

        mContentsLayout.addView(img1);
        mContentsLayout.addView(img2);
        mContentsLayout.addView(img3);
        mContentsLayout.addView(img4);
        mContentsLayout.addView(img5);
*/
        View img1 = createContentLayout(inflater, mContentsLayout, "16.04.03", "빈폴", "160,200원", R.color.primary_material_light);
        View img2 = createContentLayout(inflater, mContentsLayout, "16.04.03", "회화나무로스터스", "10,500원", R.color.primary_material_light);
        View img3 = createContentLayout(inflater, mContentsLayout, "16.04.04", "배상면주가", "98,000원", R.color.primary_material_light);
        View img4 = createContentLayout(inflater, mContentsLayout, "16.04.05", "올리브영 합정", "11,500d원", R.color.primary_material_light);
        View img5 = createContentLayout(inflater, mContentsLayout, "16.04.05", "카페자스", "12,000원", R.color.primary_material_light);
        View img6 = createContentLayout(inflater, mContentsLayout, "16.04.06", "시카고피자", "43,000원", R.color.primary_material_light);
        View img7 = createContentLayout(inflater, mContentsLayout, "16.04.06", "풋락커", "98,000원", R.color.primary_material_light);
        View img8 = createContentLayout(inflater, mContentsLayout, "16.04.07", "삼성스토어", "650,000원", R.color.primary_material_light);
        View img9 = createContentLayout(inflater, mContentsLayout, "16.04.07", "올리브영", "16,500원", R.color.primary_material_light);
        View img10 = createContentLayout(inflater, mContentsLayout, "16.04.08", "바이크샵", "720,000원", R.color.primary_material_light);

        mContentsLayout.addView(img1);
        mContentsLayout.addView(img2);
        mContentsLayout.addView(img3);
        mContentsLayout.addView(img4);
        mContentsLayout.addView(img5);
        mContentsLayout.addView(img6);
        mContentsLayout.addView(img7);
        mContentsLayout.addView(img8);
        mContentsLayout.addView(img9);
        mContentsLayout.addView(img10);
        return mTab3Layout;
    }

    public View createContentLayout(LayoutInflater inflater, ViewGroup layout, String date,
                                    String shop, String price, int color)
    {
        View contentLayout = inflater.inflate(R.layout.tab1_card_detail_listview, layout, false);

        // background color
        contentLayout.setBackgroundResource(color);

        TextView _date = (TextView)contentLayout.findViewById(R.id.text_listview_date);
        _date.setText(date);

        TextView _shop = (TextView)contentLayout.findViewById(R.id.text_listview_shop);
        _shop.setText(shop);

        TextView _price = (TextView)contentLayout.findViewById(R.id.text_listview_price);
        _price.setText(price);

        return contentLayout;
    }
}
