package com.wangban.yzbbanban.test_vollety_glide.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.sql.Ref;
import java.util.*;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.target.Target;
import com.wangban.yzbbanban.test_vollety_glide.R;
import com.wangban.yzbbanban.test_vollety_glide.entity.Picture;

/**
 * Created by YZBbanban on 16/6/20.
 */
public class Myadapter extends BaseAdapter {
    private Context context;
    private List<Picture> pics;
    private LayoutInflater layoutInflater;

    public Myadapter(Context contextl, List<Picture> pics) {
        this.context = contextl;
        this.pics = pics;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return pics.size();
    }

    @Override
    public Picture getItem(int position) {
        return pics.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.item_picture, null);
            holder = new ViewHolder();
            holder.ivPic = (ImageView) convertView.findViewById(R.id.iv_pic);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Glide.with(context).load(getItem(position).getPath()).into(holder.ivPic);
        //Log.i("supergirl", "getView: "+position+"path: "+getItem(position).getPath());
        return convertView;
    }

    class ViewHolder {
        ImageView ivPic;
    }
}
