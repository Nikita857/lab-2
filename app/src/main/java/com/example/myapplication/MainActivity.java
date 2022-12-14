package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView hello;
    private ImageButton button;
    private ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         button = (ImageButton) findViewById(R.id.start);
         image = (ImageView) findViewById(R.id.img);
         hello = (TextView) findViewById(R.id.textView2);
    }
    public void onclick (View view){
        image.setVisibility(View.VISIBLE);
        hello.setVisibility(View.VISIBLE);
        button.setVisibility(View.INVISIBLE);
        button.setClickable(false);
    }
}