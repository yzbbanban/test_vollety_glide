package com.wangban.yzbbanban.test_vollety_glide.entity;

/**
 * Created by YZBbanban on 16/6/20.
 */
public class Picture {
    private String path;

    public Picture() {
    }

    public Picture(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "path='" + path + '\'' +
                '}';
    }
}
