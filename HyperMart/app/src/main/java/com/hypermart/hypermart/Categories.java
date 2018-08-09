package com.hypermart.hypermart;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Categories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

//        ImageView v=findViewById(R.id.imageView2);
//        v.OnClickListener(clicked(););


        ImageView img = (ImageView) findViewById(R.id.imageView2);
        img.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent jj = new Intent(Categories.this,MainActivity.class);
                   startActivity(jj);

            }
        });

    }

//    public void clicked(View v){
//
//
//        Intent jj = new Intent(Categories.this,MainActivity.class);
//        startActivity(jj);
//
//    }
}
