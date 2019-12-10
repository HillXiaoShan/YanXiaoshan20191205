package com.bw.yanxiaoshan20191205.util;

import com.bw.yanxiaoshan20191205.api.API;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitUtil {

    public static RetrofitUtil util;
    private OkHttpClient okHttpClient;
    private Retrofit retrofit;
    private RetrofitUtil(){
        okHttpClient=new OkHttpClient.Builder()
                .addNetworkInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                .connectTimeout(5, TimeUnit.SECONDS)
                .writeTimeout(5, TimeUnit.SECONDS)
                .readTimeout(5, TimeUnit.SECONDS)
                .addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                .build();

        retrofit=new Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl(API.uel)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }
    public static RetrofitUtil getInstance(){
        if (util==null){
            synchronized (RetrofitUtil.class){
                if (util==null){
                    util=new RetrofitUtil();
                }
            }
        }
        return util;
    }


    public <T> T createServce(Class<T> tClass){
        return retrofit.create(tClass);
    }




}
