package com.example.ec13083.swype;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class ReviewMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);




//        TextView t = (TextView)findViewById(R.id.review_bigtext);
//        Typeface customFont=Typeface.createFromAsset(getAssets(),  "fonts/LANENAR_.ttf");
//        t.setTypeface(customFont);
//
//        TextView textLane = (TextView)findViewById(R.id.security_text);
//        textLane.setTypeface(customFont);
//        TextView tLane= (TextView)findViewById(R.id.notifications_text);
//        tLane.setTypeface(customFont);
//        TextView textL = (TextView)findViewById(R.id.themes_text);
//        textL.setTypeface(customFont);
//        TextView tL = (TextView)findViewById(R.id.intruders_text);
//        tL.setTypeface(customFont);


//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

}
