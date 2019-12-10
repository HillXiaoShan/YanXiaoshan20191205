package com.bw.yanxiaoshan20191205.base;

public class BasePersent<V extends BaseActivity> {

    public V v;
    public void attach(V v){
        this.v=v;
    }
    public void unatach(){
        if (v!=null){
            v=null;
        }
    }
}
