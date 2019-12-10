package com.bw.yanxiaoshan20191205.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bw.yanxiaoshan20191205.R;
import com.bw.yanxiaoshan20191205.bean.Shops;

import java.util.List;

public class ShopAdapter extends RecyclerView.Adapter<ShopAdapter.Holder> {
    List<Shops.OrderDataBean> list;
    Context context;

    public ShopAdapter(List<Shops.OrderDataBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.shop_item, null);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {

        String shopName = list.get(position).getShopName();
        holder.shop_tv.setText(shopName);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class Holder extends RecyclerView.ViewHolder{

        TextView shop_tv;
        public Holder(@NonNull View itemView) {
            super(itemView);

            shop_tv=itemView.findViewById(R.id.shop_tv);
        }
    }
}
