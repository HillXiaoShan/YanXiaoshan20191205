package com.bw.yanxiaoshan20191205.util;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bw.yanxiaoshan20191205.R;
import com.bw.yanxiaoshan20191205.app.MyApp;

public class GlideUtil {

    public static void getpic(String url,ImageView imv){

        Glide.with(MyApp.context)
                .load(url)
                .error(R.mipmap.ic_launcher)
                .priority(Priority.HIGH)
                .placeholder(R.mipmap.ic_launcher)
                .into(imv);
    }

}
