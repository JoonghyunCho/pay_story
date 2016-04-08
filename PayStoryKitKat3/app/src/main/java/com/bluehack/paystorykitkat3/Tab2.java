package com.bluehack.paystorykitkat3;

import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Tab2 extends  Fragment {
    private String LOG_TAG = "Tab2";
    private View mTab2Layout = null;
    private LinearLayout mContentsLayout = null;
    private ImageView mSampleMapImage = null;
    SwitchedImageView[] switchImages = null;
    View.OnClickListener imageClickListener = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mTab2Layout = inflater.inflate(R.layout.tab2_layout, container, false);
        mContentsLayout = (LinearLayout)mTab2Layout.findViewById(R.id.tab2_layout);
        mSampleMapImage = (ImageView)mTab2Layout.findViewById(R.id.tab2_map_image);
        final SwitchedImageView[] switchImages = new SwitchedImageView[4];
        switchImages[0] = new SwitchedImageView(R.drawable.hospital_pressed, R.drawable.hospital,
                                                (ImageView)mTab2Layout.findViewById(R.id.tab2_img1));
        switchImages[1] = new SwitchedImageView(R.drawable.house_pressed, R.drawable.house,
                (ImageView)mTab2Layout.findViewById(R.id.tab2_img2));
        switchImages[2] = new SwitchedImageView(R.drawable.restaurant_pressed, R.drawable.restaurant,
                (ImageView)mTab2Layout.findViewById(R.id.tab2_img3));
        switchImages[3] = new SwitchedImageView(R.drawable.shopping_pressed, R.drawable.shopping_dim,
                (ImageView)mTab2Layout.findViewById(R.id.tab2_img4));

        imageClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView)v;
                int idx = GetIndex(image.getId());
                if (idx < 0) {
                    Log.e(LOG_TAG, "idx: " + idx);
                    return;
                }

                switchImages[idx].toggle = !switchImages[idx].toggle;
                if (switchImages[idx].toggle) {
                    for (int i = 0; i < 4; ++i) {
                        switchImages[i].SetNormal();
                    }
                    switchImages[idx].SetPressed();
                } else {
                    switchImages[idx].SetNormal();
                }
            }

            private int GetIndex(int id) {
                for (int i = 0; i < 4; ++i) {
                    if (id == switchImages[i].image.getId()) {
                        return i;
                    }
                }
                return -1;
            }
        };

        mSampleMapImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(getActivity(), PaymentHistoryActivity.class);
                //startActivity(intent);
            }
        });

        return mTab2Layout;
    }

    public class SwitchedImageView {
        public int pressedImageId;
        public int normalImageId;
        public ImageView image;
        public boolean toggle;

        public SwitchedImageView(int pressed, int normal, ImageView view) {
            pressedImageId = pressed;
            normalImageId = normal;
            image = view;
            toggle = false;
        }

        public void ActionToggle() {
            toggle = !toggle;
            if (toggle) {
                image.setImageResource(pressedImageId);
            } else {
                image.setImageResource(normalImageId);
            }
        }

        public void SetNormal() {
            toggle = false;
            image.setImageResource(normalImageId);
        }

        public void SetPressed() {
            toggle = true;
            image.setImageResource(pressedImageId);
        }
    }
}
