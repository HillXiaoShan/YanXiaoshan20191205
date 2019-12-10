package com.bw.yanxiaoshan20191205;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import com.bw.yanxiaoshan20191205.adapter.HomeAdapter;
import com.bw.yanxiaoshan20191205.adapter.OneAdapter;
import com.bw.yanxiaoshan20191205.base.BaseActivity;
import com.bw.yanxiaoshan20191205.base.BasePersent;
import com.bw.yanxiaoshan20191205.bean.Goods;
import com.bw.yanxiaoshan20191205.bean.MyBean;
import com.bw.yanxiaoshan20191205.contract.IContract;
import com.bw.yanxiaoshan20191205.persent.MyPersent;

import java.util.List;

public class MainActivity extends BaseActivity implements IContract.IView{


    private RecyclerView rv1;
    private OneAdapter oneAdapter;
    private CheckBox all;
    private TextView all_price;
    private HomeAdapter homeAdapter;

    @Override
    protected void initData() {
        MyPersent myPersent= (MyPersent) p;
        myPersent.toRequest();
    }

    @Override
    protected void initView() {

        MainActivity mainActivity = new MainActivity();
        rv1 = findViewById(R.id.rv1);
        LinearLayoutManager manager=new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        rv1.setLayoutManager(manager);
        all_price = findViewById(R.id.all_price);

        all = findViewById(R.id.all);

//        all.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                List<Goods.ResultBean> onelist = oneAdapter.onelist;
//                if (oneAdapter!=null){
//                    for (Goods.ResultBean resultBean : onelist) {
//
//                        if (all.isChecked()){
//                            resultBean.isChecked=true;
//                        }else {
//                            resultBean.isChecked=false;
//                        }
//                        for (Goods.ResultBean.ShoppingCartListBean shoppingCartListBean : resultBean.getShoppingCartList()) {
//                            if (all.isChecked()){
//                                shoppingCartListBean.isChecked=true;
//                            }else {
//                                shoppingCartListBean.isChecked=false;
//                            }
//                        }
//                    }
//                oneAdapter.notifyDataSetChanged();
//                    initprice();
//                }
//            }
//        });

    }

//    public void initprice() {
//        double sum=0;
//        StringBuilder sb=new StringBuilder();
//        List<Goods.ResultBean> onelist = oneAdapter.onelist;
//        for (Goods.ResultBean resultBean : onelist) {
//            for (Goods.ResultBean.ShoppingCartListBean shoppingCartListBean : resultBean.getShoppingCartList()) {
//                sb.append(shoppingCartListBean.isChecked+"");
//
//                if (sb.toString().contains("true")){
//                    if (shoppingCartListBean.isChecked){
//                        sum+=Double.parseDouble(String.valueOf(shoppingCartListBean.getPrice()));
//                    }else {
//                        sum=0;
//                    }
//                }
//            }
//            all_price.setText("价格："+String.valueOf(sum));
//
//        }

   // }

    @Override
    protected int initLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected BasePersent PersentProvide() {
        return new MyPersent();
    }


    @Override
    public void sucess(MyBean myBean) {
        homeAdapter = new HomeAdapter(myBean, this);
        rv1.setAdapter(homeAdapter);
    }
}
