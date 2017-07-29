package com.cbt.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class LifeStyleTipsListActivity extends AppCompatActivity {

    //Views & Widgets
    ListView listView;
    private TransitionListAdapter mAdapter;
    //Vars
    private String PACKAGE = "IDENTIFY";

    //String List from Strings File....
    String lessonTitle,LessonSub,
            eatingTipsTitle,eatingTipsSub,
            sleepingTipsTitle,sleepingTipsSub,
            physicalTitle,physicalSub,
            mentalHealthTitle,mentalHealthSub,
            noSmokingTitle,noSmokingSub;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_style_tips_list);

        this.setTitle("Lifestyle Tips");

        lessonTitle        = getResources().getString(R.string.lessonTitle);
        LessonSub          = getResources().getString(R.string.LessonSub);
        eatingTipsTitle    = getResources().getString(R.string.eatingTipsTitle);
        eatingTipsSub      = getResources().getString(R.string.eatingTipsSub);
        sleepingTipsTitle  = getResources().getString(R.string.sleepingTipsTitle);
        sleepingTipsSub    = getResources().getString(R.string.sleepingTipsSub);
        physicalTitle      = getResources().getString(R.string.physicalTitle);
        physicalSub        = getResources().getString(R.string.physicalSub);
        mentalHealthTitle  = getResources().getString(R.string.mentalHealthTitle);
        mentalHealthSub    = getResources().getString(R.string.mentalHealthSub);
        noSmokingTitle     = getResources().getString(R.string.stopSmokingTitle);
        noSmokingSub       = getResources().getString(R.string.stopSmokingSub);


        listView = (ListView)findViewById(R.id.listView);

        initView();

    }

    private void initView(){
        mAdapter = new TransitionListAdapter(this,getListData());
        listView.setAdapter(mAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ListItem item = (ListItem) listView.getAdapter().getItem(position);

                if(position == 0){
                    Intent intent = new Intent(getApplicationContext(),LessonContent.class);
                    startActivity(intent);

                }
                if(position == 1){
                    Intent intent = new Intent(getApplicationContext(),EatingTipsContent.class);
                    startActivity(intent);

                }
                if(position == 2){
                    Intent intent = new Intent(getApplicationContext(),SleepingTipsContent.class);
                    startActivity(intent);

                }
                if(position == 3){
                    Intent intent = new Intent(getApplicationContext(),PhysicalActivitiesContent.class);
                    startActivity(intent);

                }
                if(position == 4){
                    Intent intent = new Intent(getApplicationContext(),MentalHealthContent.class);
                    startActivity(intent);

                }
                if(position == 5){
                    Intent intent = new Intent(getApplicationContext(),NoSmokingContent.class);
                    startActivity(intent);

                }
            }
        });
    }
    private ArrayList<ListItem> getListData(){
        ArrayList<ListItem> listData = new ArrayList<ListItem>();
        listData.add(new ListItem(R.drawable.tips,lessonTitle,LessonSub,null,null));
        listData.add(new ListItem(R.drawable.eating_tips,eatingTipsTitle,eatingTipsSub,null,null));
        listData.add(new ListItem(R.drawable.sleep,sleepingTipsTitle,sleepingTipsSub,null,null));

        listData.add(new ListItem(R.drawable.sport,physicalTitle,physicalSub,null,null));
        listData.add(new ListItem(R.drawable.mentalhealth,mentalHealthTitle,mentalHealthSub,null,null));
        listData.add(new ListItem(R.drawable.no_smoking,noSmokingTitle,noSmokingSub,null,null));
        return listData;
    }
}
