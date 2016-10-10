package com.jhs.circulateview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ImageCycleView mAdView;
    private ArrayList<String> mImageUrl = null;
    // 此处的url一部获取到
    private String imageUrl1 = "http://pic31.nipic.com/20130702/2926417_003653575119_2.jpg";
    private String imageUrl2 = "http://pic.58pic.com/58pic/11/22/39/458PICK58PICgAk.jpg";
    private String imageUrl3 = "http://pic2.ooopic.com/12/52/76/42bOOOPIC81_1024.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAdView = (ImageCycleView) findViewById(R.id.cycleview);

        mImageUrl = new ArrayList<String>();
        mImageUrl.add(imageUrl1);
        mImageUrl.add(imageUrl2);
        mImageUrl.add(imageUrl3);
        mAdView.setImageResources(mImageUrl, mImageUrl, new ImageCycleView.ImageCycleViewListener() {
            @Override
            public void onImageClick(int position, View imageView) {


            }
        }, 0);


    }
}
