package com.cbt.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class AppGuideListActivity extends AppCompatActivity {



    //Views & Widgets
    ListView listView;
    private TransitionListAdapter mAdapter;
    //Vars
    private String PACKAGE = "IDENTIFY";

    //String List from Strings File....
    String AboutTitle,AboutSub,cbtTitle,cbtSub,beckScaleTitle,beckScaleSub,
            relaxTitle,relaxSub,lifeStyleTitle,lifeStyleSub,thoughTitle,thoughtSub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_guide_list);
        this.setTitle("App Guide");
        // toolbar
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        AboutTitle     = getResources().getString(R.string.aboutTitle);
        AboutSub       = getResources().getString(R.string.aboutSub);
        cbtTitle       = getResources().getString(R.string.cbtTitle);
        cbtSub         = getResources().getString(R.string.cbtSub);
        beckScaleTitle = getResources().getString(R.string.beckScaleTitle);
        beckScaleSub   = getResources().getString(R.string.beckScaleSub);
        relaxTitle     = getResources().getString(R.string.relaxTitle);
        relaxSub       = getResources().getString(R.string.relaxSub);
        lifeStyleTitle = getResources().getString(R.string.lifeStyleTitle);
        lifeStyleSub   = getResources().getString(R.string.lifeStyleSub);
        thoughTitle    = getResources().getString(R.string.thoughTitle);
        thoughtSub     = getResources().getString(R.string.thoughtSub);


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
                    Intent intent = new Intent(getApplicationContext(),About.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(),"About us ",Toast.LENGTH_LONG).show();
                }
                if(position == 1){
                    Intent intent = new Intent(getApplicationContext(),AboutCBT.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(),"About CBT ",Toast.LENGTH_LONG).show();
                }
                if(position == 2){
                    Intent intent = new Intent(getApplicationContext(),AboutBeck.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(),"About Beck Scale ",Toast.LENGTH_LONG).show();
                }
                if(position == 3){
                    Intent intent = new Intent(getApplicationContext(),AboutRlaxation.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(),"About us ",Toast.LENGTH_LONG).show();
                }
                if(position == 4){
                    Intent intent = new Intent(getApplicationContext(),AboutLifeStyle.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(),"About Life Style ",Toast.LENGTH_LONG).show();
                }
                if(position == 5){
                    Intent intent = new Intent(getApplicationContext(),AboutthoughtRecords.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(),"thought records ",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private ArrayList<ListItem> getListData(){
        ArrayList<ListItem> listData = new ArrayList<ListItem>();
        listData.add(new ListItem(R.drawable.info,AboutTitle,AboutSub,null,null));
        listData.add(new ListItem(R.drawable.cbt,cbtTitle,cbtSub,null,null));
        listData.add(new ListItem(R.drawable.beckk,beckScaleTitle,beckScaleSub,null,null));

        listData.add(new ListItem(R.drawable.relax,relaxTitle,relaxSub,null,null));
        listData.add(new ListItem(R.drawable.lifestyle,lifeStyleTitle,lifeStyleSub,null,null));
        listData.add(new ListItem(R.drawable.lightbulb,thoughTitle,thoughtSub,null,null));
        return listData;
    }
}
