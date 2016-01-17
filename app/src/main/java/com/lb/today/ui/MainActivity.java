package com.lb.today.ui;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import com.lb.today.R;

public class MainActivity extends BaseActivity {

    private Toolbar toolbar;
    private ListView mLvData;

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
        mLvData = (ListView) findViewById(R.id.lv_main_today);
        setSupportActionBar(toolbar);
    }

    @Override
    public void getData() {

    }

    @Override
    public void showContent() {

    }
}
