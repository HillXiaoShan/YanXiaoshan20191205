package com.bw.yanxiaoshan20191205.adapter;

import android.content.Context;
import android.content.pm.LabeledIntent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bw.yanxiaoshan20191205.R;
import com.bw.yanxiaoshan20191205.bean.MyBean;

import java.net.ContentHandler;
import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.Holder> {

    private int type=0;
    MyBean myBean;
    Context context;

    public HomeAdapter(MyBean myBean, Context context) {
        this.myBean = myBean;
        this.context = context;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item, null);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {

        if (type==0){
            LinearLayoutManager manager=new LinearLayoutManager(context);
            manager.setOrientation(LinearLayoutManager.VERTICAL);
            holder.item_rv.setLayoutManager(manager);

            List<MyBean.ResultBean.MlssBean.CommodityListBeanXX> commodityList = myBean.getResult().getMlss().getCommodityList();
            MyRvdapter1 myRvdapter1 = new MyRvdapter1(commodityList,context);
            holder.item_rv.setAdapter(myRvdapter1);
        }else if (type==1){

            LinearLayoutManager manager=new LinearLayoutManager(context);
            manager.setOrientation(LinearLayoutManager.HORIZONTAL);
            holder.item_rv.setLayoutManager(manager);

            List<MyBean.ResultBean.PzshBean.CommodityListBeanX> commodityList = myBean.getResult().getPzsh().getCommodityList();
            MyRvdapter2 myRvdapter2=new MyRvdapter2(commodityList,context);
            holder.item_rv.setAdapter(myRvdapter2);

        }else if (type==2){
            GridLayoutManager manager=new GridLayoutManager(context,2);
            holder.item_rv.setLayoutManager(manager);

            List<MyBean.ResultBean.RxxpBean.CommodityListBean> commodityList = myBean.getResult().getRxxp().getCommodityList();
            MyRvdapter3 myRvdapter3=new MyRvdapter3(commodityList,context);
            holder.item_rv.setAdapter(myRvdapter3);
        }

    }

    @Override
    public int getItemCount() {
        return 3;
    }

    @Override
    public int getItemViewType(int position) {
        if (position==0){
             type=0;
        }else if (position==1){

             type=1;
        }else if (position==2){

             type=2;
        }
        return type;
    }

    class Holder extends RecyclerView.ViewHolder{

        RecyclerView item_rv;
        public Holder(@NonNull View itemView) {
            super(itemView);
            item_rv=itemView.findViewById(R.id.item_rv);
        }
    }
}
