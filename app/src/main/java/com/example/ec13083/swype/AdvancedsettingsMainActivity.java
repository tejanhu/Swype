package com.example.ec13083.swype;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class AdvancedsettingsMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.advancedsettings);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        TextView t = (TextView)findViewById(R.id.advanced_settings_bigtext);
        Typeface customFont=Typeface.createFromAsset(getAssets(),  "fonts/LANENAR_.ttf");
        t.setTypeface(customFont);

        Typeface custom_Font=Typeface.createFromAsset(getAssets(),  "fonts/Roboto-Thin.ttf");
        TextView textLane = (TextView)findViewById(R.id.review_text);
        textLane.setTypeface(custom_Font);
        TextView tLane= (TextView)findViewById(R.id.about_text);
        tLane.setTypeface(custom_Font);


        Button backtoSettings=(Button)findViewById(R.id.backtobacksettings_btn);
        backtoSettings.setTypeface(custom_Font);


        backtoSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdvancedsettingsMainActivity.this, SettingsMainActivity.class));
            }
        });


        ImageButton reviewBtn=(ImageButton)findViewById(R.id.review_btn);
        //Typeface buttoncustomFont=Typeface.createFromAsset(getAssets(),"fonts/Generica.otf");


        reviewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdvancedsettingsMainActivity.this, ReviewMainActivity.class));
            }
        });


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
