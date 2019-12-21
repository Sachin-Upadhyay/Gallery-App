package com.e.galleryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    adapter Adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView=findViewById(R.id.gridview);
        final ArrayList<Integer> image = new ArrayList<Integer>();
        image.add(R.drawable.activity_lifecycle);
        image.add(R.drawable.background);
        image.add(R.drawable.backgroundone);
        image.add(R.drawable.biceps);
        image.add(R.drawable.bicepscurl);
        image.add(R.drawable.bicepscurlone);
        image.add(R.drawable.bicepsone);
        image.add(R.drawable.cable);
        image.add(R.drawable.cableone);
        image.add(R.drawable.download);
        image.add(R.drawable.downloadone);
        image.add(R.drawable.downloadthree);
        image.add(R.drawable.downloadtwo);
        image.add(R.drawable.edit_profile);
        image.add(R.drawable.edit_status);
        image.add(R.drawable.email);
        image.add(R.drawable.fragment_lifecycle);
        image.add(R.drawable.images);
        image.add(R.drawable.imagesone);
        image.add(R.drawable.login_photo);
        image.add(R.drawable.online);
        image.add(R.drawable.password);
        image.add(R.drawable.phone);
        image.add(R.drawable.profile_image);
        image.add(R.drawable.pushups);
        image.add(R.drawable.send_message);
        image.add(R.drawable.shoulder);
        image.add(R.drawable.shoulderone);
        image.add(R.drawable.signup_photo);
        image.add(R.drawable.sm);
        image.add(R.drawable.talabat);
        image.add(R.drawable.theme);
        image.add(R.drawable.tricepsex);
        image.add(R.drawable.tricepsexone);
        image.add(R.drawable.tricepspush);
        image.add(R.drawable.tricepspushone);
        image.add(R.drawable.send_message);

        Adapter=new adapter(this,image);
        gridView.setAdapter(Adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int k=position;
                Intent intent=new Intent(MainActivity.this,ImagePreview.class);
                intent.putExtra("image",image.get(position));
                intent.putExtra("images",image);
                intent.putExtra("serialnumber",k);
                startActivity(intent);
            }
        });
    }


}
