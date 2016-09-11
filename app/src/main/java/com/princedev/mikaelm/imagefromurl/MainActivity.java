package com.princedev.mikaelm.imagefromurl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView ivImageFromUrl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivImageFromUrl = (ImageView)findViewById(R.id.iv_image_from_url);

        Picasso.with(getApplicationContext()).load("https://images.trvl-media.com/media/content/shared/images/travelguides/destination/178299/Portland-20917.jpg").into(ivImageFromUrl);

    }
}
