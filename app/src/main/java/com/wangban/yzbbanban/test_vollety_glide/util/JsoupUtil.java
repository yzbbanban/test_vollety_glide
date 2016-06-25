package com.wangban.yzbbanban.test_vollety_glide.util;

import android.graphics.Bitmap;
import android.util.Log;

import com.wangban.yzbbanban.test_vollety_glide.entity.Picture;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by YZBbanban on 16/6/20.
 */
public class JsoupUtil {
    private static final String TAG = "supergirl";

    public static List<Picture> findAllData() {
        try {
            String url = "http://pic.yesky.com/tag/meinv/1/美女/";
            Document doc = Jsoup.connect(url).get();
            Elements e = doc.getElementsByClass("mode_box");
            List<Picture> path = new ArrayList<Picture>();
            Elements a = e.first().getElementsByTag("a");
            for (int i = 0; i < a.size(); i++) {
                //String href = a.first().attr("href");
                String picPath = a.get(i).getElementsByTag("img").attr("src");

                if (!("".equals(picPath))) {
                    Picture pic = new Picture(picPath);
                    path.add(pic);
                   // Log.i(TAG, "findAllData: path: " + path.get(i));
                }else {
                    continue;
                }
            }
            return path;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}
