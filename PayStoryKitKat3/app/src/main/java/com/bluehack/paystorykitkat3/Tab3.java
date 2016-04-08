package com.bluehack.paystorykitkat3;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Date;

public class Tab3 extends  Fragment {
    private View mTab3Layout = null;
    private ListView mListView = null;
    private ListViewAdapter mAdapter = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mTab3Layout = inflater.inflate(R.layout.tab3_layout, container, false);
        mListView = (ListView)mTab3Layout.findViewById(R.id.tab3_listview);

        mAdapter = new ListViewAdapter(getActivity());
        mListView.setAdapter(mAdapter);

        mAdapter.addItem("16.04.03", "빈폴", "160,200원");
        mAdapter.addItem("16.04.03", "회화나무로스터스", "10,500원");
        mAdapter.addItem("16.04.04", "배상면주가", "98,000원");
        mAdapter.addItem("16.04.05", "올리브영 합정", "11,500d원");
        mAdapter.addItem("16.04.05", "카페자스", "12,000원");
        mAdapter.addItem("16.04.06", "시카고피자", "43,000원");
        mAdapter.addItem("16.04.06", "풋락커", "98,000원");
        mAdapter.addItem("16.04.07", "삼성스토어", "650,000원");
        mAdapter.addItem("16.04.07", "올리브영", "16,500원");
        mAdapter.addItem("16.04.08", "바이크샵", "720,000원");

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), PostFormActivity.class);
                startActivity(intent);
            }
        });

        return mTab3Layout;
    }

    private class ListViewAdapter extends BaseAdapter {
        private Context mContext = null;
        private ArrayList<ListData> mListData = new ArrayList<ListData>();

        public ListViewAdapter(Context mContext) {
            super();
            this.mContext = mContext;
        }

        @Override
        public int getCount() {
            return mListData.size();
        }

        @Override
        public Object getItem(int position) {
            return mListData.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder holder;
            if (convertView == null) {
                holder = new ViewHolder();

                LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                convertView = inflater.inflate(R.layout.tab3_layout_listview, null);

                holder.mDate = (TextView) convertView.findViewById(R.id.tab3_listview_date);
                holder.mShop = (TextView) convertView.findViewById(R.id.tab3_listview_shop);
                holder.mPrice = (TextView) convertView.findViewById(R.id.tab3_listview_price);

                convertView.setTag(holder);
            } else {
                holder = (ViewHolder) convertView.getTag();
            }

            ListData mData = mListData.get(position);
            holder.mDate.setText(mData.mDate);
            holder.mShop.setText(mData.mShop);
            holder.mPrice.setText(mData.mPrice);

            return convertView;
        }

        public void addItem(String mDate, String mShop, String mPrice) {
            ListData addInfo = null;
            addInfo = new ListData();
            addInfo.mDate = mDate;
            addInfo.mShop = mShop;
            addInfo.mPrice = mPrice;
            mListData.add(addInfo);
        }

        public void remove(int position){
            mListData.remove(position);
            dataChange();
        }

        public void dataChange(){
            mAdapter.notifyDataSetChanged();
        }
    }

    public class ListData {
        public String mDate;
        public String mShop;
        public String mPrice;
    }

    private class ViewHolder {
        public TextView mDate;
        public TextView mShop;
        public TextView mPrice;
    }
}
