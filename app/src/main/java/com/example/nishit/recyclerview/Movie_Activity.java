package com.example.nishit.recyclerview;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Movie_Activity extends AppCompatActivity {
    private TextView tvtitle,tvdescription,tvcategory;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_);

        tvtitle=(TextView)findViewById(R.id.txttitle);
        tvdescription=(TextView)findViewById(R.id.textDescription);
        tvcategory=(TextView)findViewById(R.id.textCat);
        img=(ImageView)findViewById(R.id.moviethumbnail) ;

        //Recieve the DAta
        Intent intent =getIntent();
        String Title=intent.getExtras().getString("Title");
        String Description=intent.getExtras().getString("Description");
        int image=intent.getExtras().getInt("Thumbnail");
        //setting Values
        tvtitle.setText(Title);
        tvdescription.setText(Description);
        img.setImageResource(image);


    }


}
