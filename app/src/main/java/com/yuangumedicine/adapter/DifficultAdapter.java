﻿package com.yuangumedicine.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.yuangumedicine.cn.R;
import com.yuangumedicine.ui.frament.DifficultFrament;

import java.util.ArrayList;

/**
 * @作者 RedWolf
 * @时间 2017/6/12 17:35
 * @简介 DifficultAdapter.java
 */
/**
 *
 *
 //  ┏┓　　　┏┓
 //┏┛┻━━━┛┻┓
 //┃　　　　　　　┃
 //┃　　　━　　　┃
 //┃　┳┛　┗┳　┃
 //┃　　　　　　　┃
 //┃　　　┻　　　┃
 //┃　　　　　　　┃
 //┗━┓　　　┏━┛
  //   ┃　　　┃   神兽保佑
  //   ┃　　　┃   阿弥陀佛
  //   ┃　　　┗━━━┓
  //   ┃　　　　　　　┣┓
  //   ┃　　　　　　　┏┛
  //   ┗┓┓┏━┳┓┏┛
  //     ┃┫┫　┃┫┫
  //     ┗┻┛　┗┻┛
  //
  */


public class DifficultAdapter extends BaseAdapter {
    private LayoutInflater inflater;
    private ArrayList<String> list;

    public DifficultAdapter(Context context, ArrayList<String> list) {
        inflater = LayoutInflater.from(context);
        this.list = list;
    }
    /**
     * 
     * 
     */
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
	/**
	*注视你麻痹啊 王凯文
	*/

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null) {
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.item_difficult, null);
            holder.username = (TextView) view.findViewById(R.id.item_difficult_username);
            holder.date = (TextView) view.findViewById(R.id.item_difficult_time);
            holder.title = (TextView) view.findViewById(R.id.item_difficult_title);
            holder.centent = (TextView) view.findViewById(R.id.item_difficult_centent);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
//
//        holder.date.setText();
//        holder.title.setText();
//        holder.centent.setText();


        return view;
    }
    /**
     * 
     * 
     */
    public class ViewHolder {

        TextView username, title, centent, date;
    }


}
