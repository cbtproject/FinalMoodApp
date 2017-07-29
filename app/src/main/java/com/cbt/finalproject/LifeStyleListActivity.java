package com.cbt.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class LifeStyleListActivity extends AppCompatActivity {

    //Views & Widgets
    ListView listView;
    private TransitionListAdapter mAdapter;
    //Vars
    private String PACKAGE = "IDENTIFY";

    //String List from Strings File....
    String healthTrackingTitle,healthTrackingSub,lifeStyletipsTitle,lifeStyletipsSub,
            moodGalleryTitle,moodGallerySub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_style_list);

        this.setTitle("Lifestyle");

        healthTrackingTitle        = getResources().getString(R.string.healthTrackingTitle);
        healthTrackingSub          = getResources().getString(R.string.healthTrackingSub);
        lifeStyletipsTitle        = getResources().getString(R.string.lifeStyletipsTitle);
        lifeStyletipsSub          = getResources().getString(R.string.lifeStyletipsSub);
        moodGalleryTitle          = getResources().getString(R.string.moodGalleryTitle);
        moodGallerySub            = getResources().getString(R.string.moodGallerySub);

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
//                    Intent intent = new Intent(getApplicationContext(),DeepBreathing.class);
//                    startActivity(intent);
                    Toast.makeText(getApplicationContext(),"Not Available Yet ", Toast.LENGTH_LONG).show();

                }
                if(position == 1){
                    Intent intent = new Intent(getApplicationContext(),LifeStyleTipsListActivity.class);
                    startActivity(intent);

                }
                if(position == 2){
//                    Intent intent = new Intent(getApplicationContext(),AboutBeck.class);
//                    startActivity(intent);
                    Toast.makeText(getApplicationContext(),"Not Available Yet ", Toast.LENGTH_LONG).show();

                }
//                if(position == 3){
//                    Intent intent = new Intent(getApplicationContext(),AboutRlaxation.class);
//                    startActivity(intent);
//                    Toast.makeText(getApplicationContext(),"About us ",Toast.LENGTH_LONG).show();
//                }
//                if(position == 4){
//                    Intent intent = new Intent(getApplicationContext(),AboutLifeStyle.class);
//                    startActivity(intent);
//                    Toast.makeText(getApplicationContext(),"About Life Style ",Toast.LENGTH_LONG).show();
//                }
//                if(position == 5){
//                    Intent intent = new Intent(getApplicationContext(),AboutthoughtRecords.class);
//                    startActivity(intent);
//                    Toast.makeText(getApplicationContext(),"thought records ",Toast.LENGTH_LONG).show();
//                }
            }
        });
    }
    private ArrayList<ListItem> getListData(){
        ArrayList<ListItem> listData = new ArrayList<ListItem>();
        listData.add(new ListItem(R.drawable.health_track,healthTrackingTitle,healthTrackingSub,null,null));
        listData.add(new ListItem(R.drawable.tips,lifeStyletipsTitle,lifeStyletipsSub,null,null));
        listData.add(new ListItem(R.drawable.wallpaper_img,moodGalleryTitle,moodGallerySub,null,null));

//        listData.add(new ListItem(R.drawable.relax,relaxTitle,relaxSub,null,null));
//        listData.add(new ListItem(R.drawable.lifestyle,lifeStyleTitle,lifeStyleSub,null,null));
//        listData.add(new ListItem(R.drawable.lightbulb,thoughTitle,thoughtSub,null,null));
        return listData;
    }
}
