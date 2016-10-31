package com.example.yusuf.retrofit3demo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Yusuf on 29.10.2016.
 */

public class instaAdapter extends RecyclerView.Adapter <instaAdapter.MyViewHolder> {

    private List<instaData.DataBean> dataList;
    private Context mContext;

    //Constructor
    public instaAdapter(List<instaData.DataBean> dataList, Context mContext) {
        this.dataList = dataList;
        this.mContext = mContext;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(mContext).inflate(R.layout.row_layout2, parent, false);
        MyViewHolder vh = new MyViewHolder(v);

        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {


        holder.usernameTv.setText(dataList.get(position).getUser().getUsername());

        String url = dataList.get(position).getİmages().getStandard_resolution().getUrl();
        Picasso.with(mContext).load(url).placeholder(R.mipmap.ic_launcher).error(R.mipmap.ic_launcher).into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView usernameTv;
        public ImageView imageView;

        public MyViewHolder(View itemView) {
            super(itemView);

            usernameTv = (TextView) itemView.findViewById(R.id.username);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
        }
    }

}
