package com.lb.today.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by lb on 16-1-17.
 */
public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    private void init() {
        setContentView();
        findViews();
        getData();
        showContent();
    }

    public abstract void setContentView();

    public abstract void findViews();

    public abstract void getData();

    public abstract void showContent();

}
