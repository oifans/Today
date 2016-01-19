package com.lb.today.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.lb.today.R;
import com.lb.today.entity.Event;
import com.lb.today.util.NavigationUtil;

import java.util.List;

/**
 * Created by lb on 16-1-18.
 * 首页事件列表Adapter
 */
public class EventsAdapter extends BaseAdapter {
    private Context mContext;
    private List<Event> data;
    private ViewHolder holder;

    public EventsAdapter(Context context, List<Event> data) {
        this.data = data;
        this.mContext = context;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Event curEvent = data.get(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_main_event, null);
            holder = new ViewHolder();
            holder.mLlEvent = (LinearLayout) convertView.findViewById(R.id.ll_event);
            holder.mTvYear = (TextView) convertView.findViewById(R.id.tv_year);
            holder.mTvTitle = (TextView) convertView.findViewById(R.id.tv_title);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.mTvYear.setText(curEvent.getYear() + mContext.getString(R.string.year));
        holder.mTvTitle.setText(curEvent.getTitle());

        holder.mLlEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavigationUtil.toEventDetial(mContext, curEvent);
            }
        });

        return convertView;
    }

    class ViewHolder {
        LinearLayout mLlEvent;
        TextView mTvYear;
        TextView mTvTitle;
    }
}
