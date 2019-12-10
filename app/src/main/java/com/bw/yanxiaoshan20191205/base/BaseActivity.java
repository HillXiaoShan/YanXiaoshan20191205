package com.bw.yanxiaoshan20191205.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity<P extends BasePersent> extends AppCompatActivity {
    public P p;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(initLayout());
        p=PersentProvide();
        if (p!=null){
            p.attach(this);
        }
        initView();
        initData();
    }

    protected abstract void initData();

    protected abstract void initView();

    protected abstract int initLayout();
    protected abstract P PersentProvide();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (p!=null){
            p.unatach();
            p=null;
        }
    }
}
