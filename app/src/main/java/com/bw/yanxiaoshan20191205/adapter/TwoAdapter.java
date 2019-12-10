package com.bw.yanxiaoshan20191205.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bw.yanxiaoshan20191205.R;
import com.bw.yanxiaoshan20191205.bean.Goods;

import java.util.List;

public class TwoAdapter extends RecyclerView.Adapter<TwoAdapter.Holder> {
   public List<Goods.ResultBean.ShoppingCartListBean> twolist;
    Context context;

    public TwoAdapter(List<Goods.ResultBean.ShoppingCartListBean> twolist, Context context) {
        this.twolist = twolist;
        this.context = context;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.two_item, null);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {

        String categoryName = twolist.get(position).getCommodityName();
        holder.two_tv.setText(categoryName);
        String pic = twolist.get(position).getPic();
        Glide.with(context).load(pic).placeholder(R.drawable.ic_launcher_background).into(holder.two_imv);
        int price = twolist.get(position).getPrice();
        holder.two_price.setText(price+"");

        if (twolist.get(position).isChecked){
            holder.two_chb.setChecked(true);
        }else {
            holder.two_chb.setChecked(false);
        }
    }









    @Override
    public int getItemCount() {
        return twolist.size();
    }

    class Holder extends RecyclerView.ViewHolder{

        TextView two_tv,two_price;
        ImageView two_imv;
        CheckBox two_chb;
        public Holder(@NonNull View itemView) {
            super(itemView);
            two_tv=itemView.findViewById(R.id.two_tv);
            two_imv=itemView.findViewById(R.id.two_imv);
            two_price=itemView.findViewById(R.id.two_price);
            two_chb=itemView.findViewById(R.id.two_chb);
        }
    }
}
