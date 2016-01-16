package com.lb.today.ui;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.lb.today.R;

public class MainActivity extends BaseActivity {

    private Toolbar toolbar;

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
        toolbar.setTitle(R.string.app_name);
    }

    @Override
    public void getData() {

    }

    @Override
    public void showContent() {

    }
}
