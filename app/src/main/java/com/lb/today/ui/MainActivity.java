package com.lb.today.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import com.lb.today.R;

public class MainActivity extends BaseActivity {

    private Toolbar toolbar;
    private ListView mLvData;
    private FloatingActionButton mFabAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void setContentView() {
        setContentView(R.layout.activity_main);
        setTransparentStatus();
    }

    @Override
    public void findViews() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mLvData = (ListView) findViewById(R.id.lv_main_today);
        mFabAdd = (FloatingActionButton)findViewById(R.id.fab_main_add);

        mFabAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,AddEventActivity.class));
            }
        });
    }

    @Override
    public void getData() {

    }

    @Override
    public void showContent() {

    }
}
