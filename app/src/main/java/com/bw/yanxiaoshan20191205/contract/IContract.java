package com.bw.yanxiaoshan20191205.contract;

import com.bw.yanxiaoshan20191205.app.MyApp;
import com.bw.yanxiaoshan20191205.bean.Goods;
import com.bw.yanxiaoshan20191205.bean.MyBean;

public interface IContract {
    interface IPersent{
        void toRequest();
    }
    interface IView{
        void sucess(MyBean myBean);
    }

    interface CallBack{
        void sucess(MyBean myBean);
        void error(String er);
    }
}
