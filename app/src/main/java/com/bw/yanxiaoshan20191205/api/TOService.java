package com.bw.yanxiaoshan20191205.api;

import com.bw.yanxiaoshan20191205.bean.Goods;
import com.bw.yanxiaoshan20191205.bean.MyBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface TOService {

    //api/shop/shopcart.json

    //http://172.17.8.100/small/commodity/v1/commodityList
    @GET("small/commodity/v1/commodityList")
    Observable<MyBean> getbean();
}
