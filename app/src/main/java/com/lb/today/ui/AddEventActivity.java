package com.lb.today.ui;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import com.lb.today.R;
import com.lb.today.entity.Event;
import com.lb.today.model.EventModel;

/**
 * 添加事件Activity
 */
public class AddEventActivity extends BaseActivity {

    private Toolbar toolbar;
    private DatePicker mDpDate;  //日期
    private EditText mEtTitle;   //标题
    private EditText mEtContent; //内容
    private Button mBtAdd;       //添加内容提交按钮

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void setContentView() {
        setContentView(R.layout.activity_add_event);
        setTransparentStatus();
    }

    @Override
    public void findViews() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mDpDate = (DatePicker)findViewById(R.id.dp_addevent_date);
        mEtTitle = (EditText)findViewById(R.id.et_addevent_title);
        mEtContent = (EditText)findViewById(R.id.et_addevent_content);
        mBtAdd =(Button)findViewById(R.id.bt_addevent_add);
    }

    @Override
    public void getData() {
        mBtAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Event event = new Event();
                event.setTitle(mEtTitle.getText().toString());
                event.setContent(mEtContent.getText().toString());
                event.setYear(mDpDate.getYear());
                event.setMonth(mDpDate.getMonth()+1);
                event.setDay(mDpDate.getDayOfMonth());

                EventModel.addEvent(AddEventActivity.this,event);
            }
        });
    }

    @Override
    public void showContent() {

    }
}
