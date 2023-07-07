package com.example.asus.imc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.chrisbanes.photoview.PhotoView;


public class MainActivity extends AppCompatActivity  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PhotoView photoView = (PhotoView) findViewById(R.id.pv_image);
        photoView.setImageResource(R.drawable.adolecentehombre);
    }


}
