package com.bw.yanxiaoshan20191205.mdoel;

import com.bw.yanxiaoshan20191205.api.TOService;
import com.bw.yanxiaoshan20191205.bean.Goods;
import com.bw.yanxiaoshan20191205.bean.MyBean;
import com.bw.yanxiaoshan20191205.contract.IContract;
import com.bw.yanxiaoshan20191205.util.RetrofitUtil;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class MyModel {
    public void getData(final IContract.CallBack callBack){
        RetrofitUtil.getInstance().createServce(TOService.class).getbean()
                .subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<MyBean>() {
                    @Override
                    public void accept(MyBean myBean) throws Exception {
                        callBack.sucess(myBean);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        callBack.error("mymodel异常");
                    }
                });
    }
}
