package com.bw.yanxiaoshan20191205.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bw.yanxiaoshan20191205.R;
import com.bw.yanxiaoshan20191205.bean.MyBean;

import java.util.List;

public class MyRvdapter1 extends RecyclerView.Adapter<MyRvdapter1.Holder> {
    List<MyBean.ResultBean.MlssBean.CommodityListBeanXX> list;
    Context context;


    public MyRvdapter1(List<MyBean.ResultBean.MlssBean.CommodityListBeanXX> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.rv_item1, null);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        String commodityName = list.get(position).getCommodityName();
        holder.tv1.setText(commodityName);
        String pic = list.get(position).getMasterPic();
        Glide.with(context).load(pic).into(holder.imv1);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class Holder extends RecyclerView.ViewHolder{
        ImageView imv1;
        TextView tv1;

        public Holder(@NonNull View itemView) {
            super(itemView);
            imv1=itemView.findViewById(R.id.imv1);
            tv1=itemView.findViewById(R.id.tv1);
        }
    }
}
