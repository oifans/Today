package com.lb.today.ui;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.lb.today.R;
import com.lb.today.adapter.EventsAdapter;
import com.lb.today.entity.Event;
import com.lb.today.model.EventModel;
import com.lb.today.util.NavigationUtil;
import com.lb.today.util.TimeUtil;

import java.util.ArrayList;

public class MainActivity extends BaseActivity {

    private Toolbar toolbar;
    private ListView mLvData;
    private TextView mTvDate;
    private FloatingActionButton mFabAdd;

    private int year;
    private int month;
    private int day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void setContentView() {
        setContentView(R.layout.activity_main);
    }

    @Override
    public void findViews() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mLvData = (ListView) findViewById(R.id.lv_main_today);
        mTvDate = (TextView) findViewById(R.id.tv_main_date);
        mFabAdd = (FloatingActionButton) findViewById(R.id.fab_main_add);

        mFabAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavigationUtil.toAddEvent(MainActivity.this);
            }
        });
    }

    @Override
    public void getData() {
        year = TimeUtil.getYear();
        month = TimeUtil.getMonth();
        day = TimeUtil.getDay();

        ArrayList<Event> events = (ArrayList<Event>) EventModel.findByDateInSqlite(this,month,day);
        mLvData.setAdapter(new EventsAdapter(this,events ));
    }

    @Override
    public void showContent() {
        mTvDate.setText("那年的" + month + getString(R.string.month) + day + getString(R.string.day));
    }
}
