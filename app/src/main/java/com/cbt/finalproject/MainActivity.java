package com.cbt.finalproject;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout linear_guide, linear_inventory, linear_techniques, linear_charts,
            linear_review, linear_setting;
    TextView tvOnState, tvOffState, tvSMSstate, tvstart_silent, tvstop_silent,
            tvWallpaperState;
    ImageView guide_icon, inventory_icon, charts_icon, techniques_icon, review_icon,
            setting_icon;
    boolean flag = false;
    SharedPreferences.Editor edit;
    Handler mHandler;
    Runnable timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mHandler = new Handler();

        linear_guide = (LinearLayout)findViewById(R.id.linear_appGuide);
        linear_inventory = (LinearLayout)findViewById(R.id.linear_inventory);
        linear_techniques = (LinearLayout)findViewById(R.id.linear_techniques);
        linear_charts = (LinearLayout)findViewById(R.id.linear_charts);
        linear_review = (LinearLayout)findViewById(R.id.linear_review);
        linear_setting = (LinearLayout)findViewById(R.id.linear_setting);

        //%%%%%%%%%%%%%%%%%%%% App guide start activity %%%%%%%%%%%%%%
        linear_guide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),AppGuideListActivity.class);
                startActivity(intent);

            }
        });

        //%%%%%%%%%%%%%%%%%%%% cbtTechniques start activity %%%%%%%%%%%%%%
        linear_techniques.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),CbtTechniquesListActivity.class);
                startActivity(intent);

            }
        });


    }
}
