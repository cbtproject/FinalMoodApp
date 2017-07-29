package com.cbt.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class CbtTechniquesListActivity extends AppCompatActivity {

    //Views & Widgets
    ListView listView;
    private TransitionListAdapter mAdapter;
    //Vars
    private String PACKAGE = "IDENTIFY";

    //String List from Strings File....
    String relaxationTitle,relaxationSub,thoughtRecordTitle,thoughtRecordSub,
            lifestyleTitle,lifestyleSub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cbt_techniques_list);

        this.setTitle("CBT Techniques");

        relaxationTitle    = getResources().getString(R.string.relaxationTitle);
        relaxationSub      = getResources().getString(R.string.relaxationSub);
        thoughtRecordTitle = getResources().getString(R.string.thoughtRecordTitle);
        thoughtRecordSub   = getResources().getString(R.string.thoughtRecordSub);
        lifestyleTitle     = getResources().getString(R.string.lifeStyle_Title);
        lifestyleSub       = getResources().getString(R.string.lifeStyle_Sub);

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
                    Intent intent = new Intent(getApplicationContext(),RelaxationListActivity.class);
                    startActivity(intent);

                }
                if(position == 1){
//                    Intent intent = new Intent(getApplicationContext(),AboutCBT.class);
//                    startActivity(intent);
                    Toast.makeText(getApplicationContext(),"Not Available yet ",Toast.LENGTH_LONG).show();

                }
                if(position == 2){
                    Intent intent = new Intent(getApplicationContext(),LifeStyleListActivity.class);
                    startActivity(intent);

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
        listData.add(new ListItem(R.drawable.relax,relaxationTitle,relaxationSub,null,null));
        listData.add(new ListItem(R.drawable.lightbulb,thoughtRecordTitle,thoughtRecordSub,null,null));
        listData.add(new ListItem(R.drawable.lifestyle,lifestyleTitle,lifestyleSub,null,null));

//        listData.add(new ListItem(R.drawable.relax,relaxTitle,relaxSub,null,null));
//        listData.add(new ListItem(R.drawable.lifestyle,lifeStyleTitle,lifeStyleSub,null,null));
//        listData.add(new ListItem(R.drawable.lightbulb,thoughTitle,thoughtSub,null,null));
        return listData;
    }
}
