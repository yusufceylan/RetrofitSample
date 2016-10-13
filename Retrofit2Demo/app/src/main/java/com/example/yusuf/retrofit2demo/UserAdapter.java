package com.example.yusuf.retrofit2demo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Yusuf on 09.10.2016.
 */
public class UserAdapter extends RecyclerView.Adapter<UserAdapter.MyViewHolder>{

    private List<User.İtemsBean> itemsBeanList;
    private Context mContext;

    // Constructor
    public UserAdapter(List<User.İtemsBean> itemsBeanList, Context context) {
        this.itemsBeanList = itemsBeanList;
        this.mContext = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(mContext).inflate(R.layout.row_layout, parent, false);
        MyViewHolder vh = new MyViewHolder(v);

        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.userName.setText(itemsBeanList.get(position).getLogin());
        holder.userId.setText(itemsBeanList.get(position).getİd() + "");

        String url = itemsBeanList.get(position).getAvatar_url();
        Picasso.with(mContext).load(url).placeholder(R.mipmap.ic_launcher).error(R.mipmap.ic_launcher).into(holder.profileImg);

    }

    @Override
    public int getItemCount() {
        return itemsBeanList.size();
    }

    // View Holder
    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView userName, userId;
        public ImageView profileImg;

        public MyViewHolder(View itemView) {
            super(itemView);

            userName = (TextView) itemView.findViewById(R.id.textViewName);
            userId = (TextView) itemView.findViewById(R.id.textViewId);
            profileImg = (ImageView) itemView.findViewById(R.id.imageView);
        }
    }



}
