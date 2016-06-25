package com.wangban.yzbbanban.test_vollety_glide.model.impl;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ListAdapter;

import com.wangban.yzbbanban.test_vollety_glide.entity.Picture;
import com.wangban.yzbbanban.test_vollety_glide.model.IModelCallback;
import com.wangban.yzbbanban.test_vollety_glide.model.IModelPicture;
import com.wangban.yzbbanban.test_vollety_glide.util.JsoupUtil;

import java.util.*;

/**
 * Created by YZBbanban on 16/6/20.
 */
public class ModelPictureImpl implements IModelPicture {
    private static final String TAG = "supergirl";
    @Override
    public void findAllPicture(final IModelCallback callback) {
        new AsyncTask<Void, Void, List<Picture>>() {
            @Override
            protected List<Picture> doInBackground(Void... params) {
                List<Picture> pics = JsoupUtil.findAllData();

                return pics;
            }

            @Override
            protected void onPostExecute(List<Picture> pictures) {
                callback.loadPics(pictures);
            }
        }.execute();

    }

}
