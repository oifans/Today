package com.lb.today.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.lb.today.R;
import com.lb.today.entity.Event;

public class EventDetialActivity extends BaseActivity {

    private TextView mTvContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void setContentView() {
        setContentView(R.layout.activity_event_detial);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public void findViews() {
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public void getData() {
        Intent intent = getIntent();
        Event event = (Event) intent.getSerializableExtra("event");
        TextView mTvContent = (TextView)findViewById(R.id.tv_eventdetial_content);
        mTvContent.setText(event.getTitle());
        setTitle(event.getTitle());
    }

    @Override
    public void showContent() {

    }
}
