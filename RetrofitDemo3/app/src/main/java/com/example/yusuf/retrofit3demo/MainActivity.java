package com.example.yusuf.retrofit3demo;

import android.app.ProgressDialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private DataAdapter mDataAdapter;
    List<Data.ResultsBean> mDataList;

    private RecyclerView.LayoutManager mLayoutManager;
    private ProgressDialog progressDialog;

    private static final String ROOT_URL = "https://maps.googleapis.com/";

    private EditText region;
    private Button searchBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        progressDialog = new ProgressDialog(this);

        region = (EditText) findViewById(R.id.region);
        searchBtn = (Button) findViewById(R.id.btnSearch);

        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String stringRegion = region.getText().toString();

                if(checkConnection()){

                    // Show dialog
                    progressDialog.setTitle("Connecting");
                    progressDialog.setMessage("Please wait...");
                    progressDialog.show();

                    // Get api instance
                    ApiService myApi = RetroClient.getApiService(ROOT_URL);

                    // Calling JSON
                    Call<Data> call = myApi.getCoords(stringRegion);

                    call.enqueue(new Callback<Data>() {
                        @Override
                        public void onResponse(Call<Data> call, Response<Data> response) {

                            Log.v("Response Code", "Response Code is : " + response.code());
                            // Dismiss dialog
                            progressDialog.dismiss();

                            if (response.isSuccessful()){
                                mDataList = new ArrayList<Data.ResultsBean>();
                                mDataList = response.body().getResults();

                                mDataAdapter = new DataAdapter(getApplicationContext(), mDataList);
                                // Set layout manager
                                mLayoutManager = new LinearLayoutManager(getApplicationContext());
                                mRecyclerView.setLayoutManager(mLayoutManager);

                                mRecyclerView.setAdapter(mDataAdapter);

                            } else {

                                Toast.makeText(getApplicationContext(), "Something work wrong", Toast.LENGTH_LONG).show();

                            }

                        }

                        @Override
                        public void onFailure(Call<Data> call, Throwable t) {

                            Toast.makeText(getApplicationContext(), "On Failure", Toast.LENGTH_LONG).show();

                        }
                    });



                } else {

                    Toast.makeText(getApplicationContext(), "Check Your Internet Connection", Toast.LENGTH_LONG).show();

                }


            }
        });


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
