package com.bw.yanxiaoshan20191205.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bw.yanxiaoshan20191205.MainActivity;
import com.bw.yanxiaoshan20191205.R;
import com.bw.yanxiaoshan20191205.bean.Goods;

import java.util.List;

public class OneAdapter extends RecyclerView.Adapter<OneAdapter.Holder> {
    public List<Goods.ResultBean> onelist;
    Context context;
    TwoAdapter twoAdapter;

    public OneAdapter(List<Goods.ResultBean> list, Context context) {
        this.onelist = list;
        this.context = context;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.one_item, null);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final Holder holder, final int position) {

        String categoryName = onelist.get(position).getCategoryName();
        holder.one_tv.setText(categoryName);

        List<Goods.ResultBean.ShoppingCartListBean> cartList = onelist.get(position).getShoppingCartList();
        LinearLayoutManager manager=new LinearLayoutManager(context);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        holder.one_rv.setLayoutManager(manager);
        twoAdapter=new TwoAdapter(cartList,context);
        holder.one_rv.setAdapter(twoAdapter);

        if (onelist.get(position).isChecked){
            holder.one_chb.setChecked(true);
        }else {
            holder.one_chb.setChecked(false);
        }

        holder.one_chb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (twoAdapter!=null){
                    List<Goods.ResultBean.ShoppingCartListBean> twolist = twoAdapter.twolist;
                    if (twolist.size()>0&&twolist!=null){
                        for (Goods.ResultBean.ShoppingCartListBean shoppingCartListBean : twolist) {
                            if (holder.one_chb.isChecked()){
                                shoppingCartListBean.isChecked=true;
                            }else {
                                shoppingCartListBean.isChecked=false;
                            }
                        }

                        twoAdapter.notifyDataSetChanged();
                    }
                }

            }
        });

    }
    @Override
    public int getItemCount() {
        return onelist.size();
    }

    class Holder extends RecyclerView.ViewHolder{

        TextView one_tv;
        RecyclerView one_rv;
        CheckBox one_chb;
        public Holder(@NonNull View itemView) {
            super(itemView);
            one_tv=itemView.findViewById(R.id.one_tv);
            one_rv=itemView.findViewById(R.id.one_rv);
            one_chb=itemView.findViewById(R.id.one_chb);
        }
    }



}
