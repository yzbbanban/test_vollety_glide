package com.wangban.yzbbanban.test_vollety_glide.util;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by YZBbanban on 16/6/21.
 */
public class SpacesItemDecorationUtil extends RecyclerView.ItemDecoration {
    private int space;

    public SpacesItemDecorationUtil(int space) {
        this.space = space;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        outRect.left=space;
        outRect.right=space;
        outRect.bottom=space;
        if (parent.getChildAdapterPosition(view)==0){
            outRect.top=space;
        }


    }
}
