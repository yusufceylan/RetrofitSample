package com.example.yusuf.retrofit2demo;

import android.app.ProgressDialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private UserAdapter mAdapter;
    List<User.İtemsBean> Users;
    private RecyclerView.LayoutManager mLayoutManager;

    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        progressDialog = new ProgressDialog(this);


        if (checkConnection()) {

            // Show dialog
            progressDialog.setTitle("Connecting");
            progressDialog.setMessage("Please wait...");
            progressDialog.show();

            // Creating an object of our api interface
            ApiService myApi = RetroClient.getApiService();

            // Calling JSON
            Call<User> call = myApi.getGithubUser("yusuf");

            // Enqueue Callback will be call when get response...
            call.enqueue(new Callback<User>() {
                @Override
                public void onResponse(Call<User> call, retrofit2.Response<User> response) {

                    Log.v("Response Code", "Response Code is : " + response.code());
                    // Dismiss dialog
                    progressDialog.dismiss();

                    if (response.isSuccessful()) {

                        Users = new ArrayList<User.İtemsBean>();
                        Users = response.body().getİtems();

                        mAdapter = new UserAdapter(Users, getApplicationContext());

                        // Set layout manager
                        mLayoutManager = new LinearLayoutManager(getApplicationContext());
                        mRecyclerView.setLayoutManager(mLayoutManager);

                        mRecyclerView.setAdapter(mAdapter);

                    } else {

                        Toast.makeText(getApplicationContext(), "Something work wrong", Toast.LENGTH_LONG).show();

                    }

                }

                @Override
                public void onFailure(Call<User> call, Throwable t) {

                    Toast.makeText(getApplicationContext(), "On Failure", Toast.LENGTH_LONG).show();

                }
            });

        } else {

            Toast.makeText(getApplicationContext(), "Check Your Internet Connection", Toast.LENGTH_LONG).show();

        }
    }


    // Check internet Connection
    public boolean checkConnection() {

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
