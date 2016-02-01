package com.example.ec13083.swype;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;

public class SettingsMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView t = (TextView)findViewById(R.id.advanced_settings_bigtext);
        Typeface customFont=Typeface.createFromAsset(getAssets(),  "fonts/LANENAR_.ttf");
        t.setTypeface(customFont);

        TextView textLane = (TextView)findViewById(R.id.security_text);
        textLane.setTypeface(customFont);
        TextView tLane= (TextView)findViewById(R.id.notifications_text);
        tLane.setTypeface(customFont);
        TextView textL = (TextView)findViewById(R.id.themes_text);
        textL.setTypeface(customFont);
        TextView tL = (TextView)findViewById(R.id.intruders_text);
        tL.setTypeface(customFont);
//        TextView textadsettings = (TextView)findViewById(R.id.advancedsettings_btn);



        Button advancedSettings=(Button)findViewById(R.id.advancedsettings_btn);
        Typeface buttoncustomFont=Typeface.createFromAsset(getAssets(),"fonts/Generica.otf");
        advancedSettings.setTypeface(buttoncustomFont);



        advancedSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SettingsMainActivity.this, AdvancedsettingsMainActivity.class));
            }
        });


        ImageButton securitybtn=(ImageButton)findViewById(R.id.security_btn);

        securitybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SettingsMainActivity.this, SecurityMainActivity.class));
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
