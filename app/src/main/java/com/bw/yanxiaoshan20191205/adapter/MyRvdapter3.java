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

public class MyRvdapter3 extends RecyclerView.Adapter<MyRvdapter3.Holder> {
    List<MyBean.ResultBean.RxxpBean.CommodityListBean> list;
    Context context;


    public MyRvdapter3(List<MyBean.ResultBean.RxxpBean.CommodityListBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.rv_item3, null);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        String commodityName = list.get(position).getCommodityName();
        holder.tv3.setText(commodityName);
        String pic = list.get(position).getMasterPic();
        Glide.with(context).load(pic).into(holder.imv3);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class Holder extends RecyclerView.ViewHolder{
        ImageView imv3;
        TextView tv3;

        public Holder(@NonNull View itemView) {
            super(itemView);
            imv3=itemView.findViewById(R.id.imv3);
            tv3=itemView.findViewById(R.id.tv3);
        }
    }
}
