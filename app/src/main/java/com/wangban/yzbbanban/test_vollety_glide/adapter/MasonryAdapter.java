package com.wangban.yzbbanban.test_vollety_glide.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.*;

import com.bumptech.glide.Glide;
import com.wangban.yzbbanban.test_vollety_glide.R;
import com.wangban.yzbbanban.test_vollety_glide.entity.Picture;

/**
 * Created by YZBbanban on 16/6/21.
 */
public class MasonryAdapter extends RecyclerView.Adapter<MasonryAdapter.MasonryView> {
    private List<Picture> pictures;
    private ViewGroup v;
    public MasonryAdapter(List<Picture> pictures) {
        this.pictures = pictures;
    }

    @Override
    public MasonryView onCreateViewHolder(ViewGroup parent, int viewType) {
        this.v=parent;
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_picture,null);

        return new MasonryView(view);
    }

    @Override
    public void onBindViewHolder(MasonryView holder, int position) {
        Picture picture=pictures.get(position);
        Glide.with(v.getContext()).load(picture.getPath()).into(holder.iv);
    }

    @Override
    public int getItemCount() {
        return pictures.size();
    }

    public class MasonryView extends RecyclerView.ViewHolder {
        ImageView iv;
        public MasonryView(View itemView) {
            super(itemView);
            iv= (ImageView) itemView.findViewById(R.id.iv_pic);
        }
    }
}
