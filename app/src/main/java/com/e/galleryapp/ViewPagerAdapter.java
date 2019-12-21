package com.e.galleryapp;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.ArrayList;

public class ViewPagerAdapter extends PagerAdapter {
    Context context;
    ArrayList<Integer> images;
    int imagess;
    int serial;
    int count=0;
    String TAG="MyMessage";
    int k=1;
    LayoutInflater inflater;

    public ViewPagerAdapter(Context context, ArrayList<Integer> images,int image,int serial) {
        this.context = context;
        this.images = images;
        this.imagess=image;
        this.serial=serial;
    }

    @Override
    public int getCount() {
        return images.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==(RelativeLayout)object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.slidingimages,container,false);
        TextView textView=view.findViewById(R.id.textView2);
        ImageView image=view.findViewById(R.id.imageView2);
        if (count==0) {
            image.setImageResource(imagess);
            //Log.i(TAG, String.valueOf(position));
            count++;
        }
        else {
            position=serial+k;
            image.setImageResource(images.get(position));
            k++;
        }
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout)object);
    }
}
