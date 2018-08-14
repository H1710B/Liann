package com.example.lian.ui.mondelku.home.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.lian.R;
import com.example.lian.model.entity.TouBeen;

import java.util.List;

/**
 * never gonna give you up, never gonna let you down,
 * never gonna run around and desert you. Never gonna make you cry,
 * never gonna say goodbye. Never gonna tell a lie and hurt you.
 * 永远不要放弃，永远不要对自己失望，永远不要逃走，辜负了自己，
 * 永远不要哭啼，永远不要说再见，永远不要说谎来伤害自己。
 */
public class LvAdapter extends BaseAdapter {
    private Context context;
    private List<TouBeen.BodyBean.ResultBean> data;


    public LvAdapter(Context context, List<TouBeen.BodyBean.ResultBean> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewhon;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.dd, null);
            viewhon= new ViewHolder(view);
            view.setTag(viewhon);
        }else {
            viewhon = (ViewHolder) view.getTag();
        }
        viewhon.name.setText(data.get(i).getTitle());

        return view;
    }
    public static class ViewHolder {
        public View rootView;
        public TextView name;

        public ViewHolder(View rootView) {
            this.rootView = rootView;
            this.name = (TextView) rootView.findViewById(R.id.name);
        }

    }
}
