package kr.co.woobi.imyeon.recyvlerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class RecyclerAdapter extends RecyclerView.Adapter{

    ArrayList<HashMap<String, Object>>  arrayList=null;
    public  RecyclerAdapter(ArrayList<HashMap<String, Object>>arrayList){
       //s this.arrayList=new ArrayList<HashMap<String, Object>>();
        this.arrayList=arrayList;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflate = LayoutInflater.from(viewGroup.getContext());
        View view=inflate.inflate(R.layout.item_cardlayout,viewGroup,false);
        return new MyViewHoler(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int i) {
        HashMap<String, Object>hashMap=arrayList.get(i);
        ((MyViewHoler)holder).item_title.setText((String)hashMap.get("title"));
        ((MyViewHoler)holder).item_detail.setText((String)hashMap.get("detail"));
        ((MyViewHoler)holder).item_lmage.setImageResource((Integer) hashMap.get("image"));
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    private class MyViewHoler extends RecyclerView.ViewHolder {
        public ImageView item_lmage;
        public TextView item_title;
        public  TextView item_detail;

        public MyViewHoler(View view) {
            super(view);
            item_lmage=(ImageView)itemView.findViewById(R.id.item_image);
            item_title=(TextView)itemView.findViewById(R.id.item_title);
            item_detail=(TextView)itemView.findViewById(R.id.item_detail);
        }
    }
}
