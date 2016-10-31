package com.example.yusuf.retrofit3demo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Yusuf on 25.10.2016.
 */

public class DataAdapter extends RecyclerView.Adapter <DataAdapter.MyViewHolder> {

    private List<Data.ResultsBean> dataList;
    private Context mContext;

    // Constructor
    public DataAdapter(Context mContext, List<Data.ResultsBean> dataList) {
        this.mContext = mContext;
        this.dataList = dataList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(mContext).inflate(R.layout.row_layout, parent, false);
        MyViewHolder vh = new MyViewHolder(v);

        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        //holder.lang.setText(String.valueOf(dataList.get(position).getGeometry().getLocation().getLng()));
        //holder.lat.setText(String.valueOf(dataList.get(position).getGeometry().getLocation().getLat()));

        holder.fullAddress.setText(dataList.get(position).getFormatted_address());

        for(int i=0; i < dataList.get(position).getAddress_components().size(); i++){

            if (dataList.get(position).getAddress_components().get(i).getTypes().get(0).equals("administrative_area_level_1")){
                //Log.v("MEKAN", "Mekan Adı : " + dataList.get(position).getAddress_components().get(i).toString());
                holder.shortName.setText(dataList.get(position).getAddress_components().get(i).getShort_name());
            }

        }

        //holder.lat.setText(dataList.get(position).getAddress_components().get(position).getShort_name());

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }



    public class MyViewHolder extends RecyclerView.ViewHolder {

        public String coordLat, coordLng;

        public TextView fullAddress, shortName;
        //public ImageView img;

        public MyViewHolder(View itemView) {
            super(itemView);

            fullAddress = (TextView) itemView.findViewById(R.id.textViewAddress);
            shortName = (TextView) itemView.findViewById(R.id.textViewName);
            //img = (ImageView) itemView.findViewById(R.id.imageView);


            // Click the item view
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    coordLat = String.valueOf(dataList.get(getAdapterPosition()).getGeometry().getLocation().getLat());
                    coordLng = String.valueOf(dataList.get(getAdapterPosition()).getGeometry().getLocation().getLng());
                    Log.v("TEST" , "LAT : " + coordLat);
                    Log.v("TEST" , "LNG : " + coordLng);

                    Intent instaIntent = new Intent(mContext, SecondActivity.class);
                    instaIntent.putExtra("LAT", coordLat);
                    instaIntent.putExtra("LNG", coordLng);
                    instaIntent.addFlags(instaIntent.FLAG_ACTIVITY_NEW_TASK);
                    mContext.startActivity(instaIntent);

                }
            });

        }
    }

}
