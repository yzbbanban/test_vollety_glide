package com.wangban.yzbbanban.test_vollety_glide.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.GridView;

import com.wangban.yzbbanban.test_vollety_glide.Presenter.IPresenterPicture;
import com.wangban.yzbbanban.test_vollety_glide.Presenter.impl.PresenterPictureImpl;
import com.wangban.yzbbanban.test_vollety_glide.R;
import com.wangban.yzbbanban.test_vollety_glide.adapter.MasonryAdapter;
import com.wangban.yzbbanban.test_vollety_glide.adapter.Myadapter;
import com.wangban.yzbbanban.test_vollety_glide.entity.Picture;
import com.wangban.yzbbanban.test_vollety_glide.util.SpacesItemDecorationUtil;
import com.wangban.yzbbanban.test_vollety_glide.view.IViewPicture;

import java.util.List;

public class MainActivity extends AppCompatActivity implements IViewPicture{
    //private GridView gvPic;
    private RecyclerView recyclerView;
    //private Myadapter myadapter;
    private MasonryAdapter adapter;

    private IPresenterPicture ipp;
    private List<Picture> pics;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ipp=new PresenterPictureImpl(this);
        setView();
        ipp.loadAllData();

    }

    private void setView() {
        //gvPic= (GridView) findViewById(R.id.gv_pic);
        recyclerView= (RecyclerView) findViewById(R.id.rv_pic);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL));

    }

    @Override
    public void setData(List<Picture> pics) {
        this.pics=pics;
    }

    @Override
    public void showData() {
        //myadapter=new Myadapter(this,pics);
        //gvPic.setAdapter(myadapter);
        adapter=new MasonryAdapter(pics);
        recyclerView.setAdapter(adapter);
        SpacesItemDecorationUtil s=new SpacesItemDecorationUtil(16);
        recyclerView.addItemDecoration(s);

    }
}
