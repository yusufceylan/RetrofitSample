package com.example.yusuf.retrofit3demo;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SecondActivity extends AppCompatActivity {

    // http://stackoverflow.com/questions/21332178/sending-multiple-data-with-intent-in-android

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private ProgressDialog progressDialog;

    //private String coordLat, coordLng = null;

    private List<instaData.DataBean> mDataList;
    private instaAdapter mInstaAdapter;

    private String ACCESS_TOKEN = "4084500227.e029fea.746ce6b9fc8543f982134d3f9d5537ce";
    private static final String ROOT_URL = "https://api.instagram.com/";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent instaIntent = getIntent();
        String coordLat = instaIntent.getStringExtra("LAT");
        String coordLng = instaIntent.getStringExtra("LNG");

        Log.v("TEST" , "LAT : " + coordLat);
        Log.v("TEST" , "LNG : " + coordLng);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        progressDialog = new ProgressDialog(this);

        if(checkConnection()){

            // Show dialog
            progressDialog.setTitle("Connecting...");
            progressDialog.setMessage("Please Wait...");
            progressDialog.show();

            // Get api instance
            ApiService myApi = RetroClient.getApiService(ROOT_URL);

            // Calling JSON
            Call<instaData> call = myApi.getPhotos(coordLat,coordLng, ACCESS_TOKEN);

            call.enqueue(new Callback<instaData>() {
                @Override
                public void onResponse(Call<instaData> call, Response<instaData> response) {

                    Log.v("Response Code", "Response Code is : " + response.code());
                    progressDialog.dismiss();

                    if(response.isSuccessful()){

                        mDataList = new ArrayList<instaData.DataBean>();
                        mDataList = response.body().getData();

                        mInstaAdapter = new instaAdapter(mDataList, getApplicationContext());
                        // Set layout manager
                        mLayoutManager = new LinearLayoutManager(getApplicationContext());
                        mRecyclerView.setLayoutManager(mLayoutManager);

                        mRecyclerView.setAdapter(mInstaAdapter);

                    } else {
                        Toast.makeText(getApplicationContext(), "Something work wrong", Toast.LENGTH_LONG).show();
                        Log.v("Response Code", "Response Code is : " + response.code());
                    }
                }

                @Override
                public void onFailure(Call<instaData> call, Throwable t) {

                }
            });



        } else {
            Toast.makeText(getApplicationContext(), "Check Your Internet Connection", Toast.LENGTH_LONG).show();
        }

    }



    // Check Connection
    private boolean checkConnection() {

        ConnectivityManager conMgr = (ConnectivityManager) getSystemService (Context.CONNECTIVITY_SERVICE);

        if (conMgr.getActiveNetworkInfo() != null

                && conMgr.getActiveNetworkInfo().isAvailable()

                && conMgr.getActiveNetworkInfo().isConnected()) {

            return true;

        } else {

            return false;

        }
    }

}
