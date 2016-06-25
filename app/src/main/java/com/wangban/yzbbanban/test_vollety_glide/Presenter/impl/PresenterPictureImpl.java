package com.wangban.yzbbanban.test_vollety_glide.Presenter.impl;

import com.wangban.yzbbanban.test_vollety_glide.Presenter.IPresenterPicture;
import com.wangban.yzbbanban.test_vollety_glide.entity.Picture;
import com.wangban.yzbbanban.test_vollety_glide.model.IModelCallback;
import com.wangban.yzbbanban.test_vollety_glide.model.IModelPicture;
import com.wangban.yzbbanban.test_vollety_glide.model.impl.ModelPictureImpl;
import com.wangban.yzbbanban.test_vollety_glide.view.IViewPicture;


import java.util.List;

/**
 * Created by YZBbanban on 16/6/20.
 */
public class PresenterPictureImpl implements IPresenterPicture {
    private IViewPicture view;
    private IModelPicture model;

    public PresenterPictureImpl(IViewPicture view) {
        this.view = view;
        model = new ModelPictureImpl();
    }


    @Override
    public void loadAllData() {
        model.findAllPicture(new IModelCallback() {
            @Override
            public void loadPics(List<Picture> pics) {
                view.setData(pics);
                view.showData();

            }
        });
    }
}
