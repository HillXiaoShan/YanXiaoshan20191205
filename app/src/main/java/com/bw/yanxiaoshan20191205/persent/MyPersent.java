package com.bw.yanxiaoshan20191205.persent;

import android.graphics.YuvImage;

import com.bw.yanxiaoshan20191205.MainActivity;
import com.bw.yanxiaoshan20191205.base.BasePersent;
import com.bw.yanxiaoshan20191205.bean.Goods;
import com.bw.yanxiaoshan20191205.bean.MyBean;
import com.bw.yanxiaoshan20191205.contract.IContract;
import com.bw.yanxiaoshan20191205.mdoel.MyModel;

public class MyPersent extends BasePersent implements IContract.IPersent {
    MyModel myModel;
    public MyPersent(){
        myModel=new MyModel();
    }

    @Override
    public void toRequest() {
        myModel.getData(new IContract.CallBack() {
            @Override
            public void sucess(MyBean myBean) {
              MainActivity mainActivity= (MainActivity) v;
              mainActivity.sucess(myBean);
            }

            @Override
            public void error(String er) {

            }
        });
    }
}
