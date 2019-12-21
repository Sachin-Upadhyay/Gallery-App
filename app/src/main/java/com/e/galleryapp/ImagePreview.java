package com.e.galleryapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class ImagePreview extends AppCompatActivity {
    ImageView img;
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_preview);
        img=findViewById(R.id.imageView2);
        Intent intent=getIntent();

        ArrayList<Integer> imgages = (ArrayList<Integer>) getIntent().getSerializableExtra("images");
        int image=intent.getIntExtra("image",0);
        int serial=intent.getIntExtra("serialnumber",0);

        viewPager=findViewById(R.id.viewpager);
        viewPagerAdapter=new ViewPagerAdapter(this,imgages,image,serial);
        viewPager.setAdapter(viewPagerAdapter);

    }
}
