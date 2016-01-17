package com.lb.today.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.lb.today.R;
import com.lb.today.util.SystemBarTintManager;

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

    //Android 4.4(API19)以上版本状态栏透明相关设置
    public void setTransparentStatus() {
        SystemBarTintManager tintManager = new SystemBarTintManager(this);
        tintManager.setStatusBarTintEnabled(true);
        tintManager.setTintResource(R.color.colorPrimary);
    }

}
