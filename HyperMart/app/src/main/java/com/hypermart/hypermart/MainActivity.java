package com.hypermart.hypermart;

import android.content.Intent;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int[] IMAGES = {R.drawable.apple,R.drawable.banana,R.drawable.orange,R.drawable.strawberry};
    String[] NAMES = {"Apple","Banana","Orange","Strawberry" };
    String[] DESCRIPTIONS = {"des1","des2","des3","des4"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView)findViewById(R.id.listview);

        CustomAdapter customAdapter = new CustomAdapter();

        listView.setAdapter(customAdapter);



        //Add item
        Button button=(Button)findViewById(R.id.button6);
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(),AddNewItem.class);
                startActivity(i);
            }
        });



    }

    class CustomAdapter extends BaseAdapter{


        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.customlayout,null);

            ImageView imageView = (ImageView)view.findViewById(R.id.imageView);
            TextView textView_name = (TextView)view.findViewById(R.id.textView_name);
            TextView textView_description = (TextView)view.findViewById(R.id.textView_description);

            imageView.setImageResource(IMAGES[i]);
            textView_name.setText(NAMES[i]);
            textView_description.setText(DESCRIPTIONS[i]);

            return view;
        }

    }



}
