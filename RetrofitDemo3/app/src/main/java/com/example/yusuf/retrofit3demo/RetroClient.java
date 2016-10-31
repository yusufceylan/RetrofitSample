package com.example.yusuf.retrofit3demo;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Yusuf on 25.10.2016.
 */

public class RetroClient {

    //private static final String ROOT_URL = "https://maps.googleapis.com/";

    // Get retrofit instance
    private static Retrofit getRetrofitInstance(String url){

        Retrofit rf = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return rf;
    }

    public static ApiService getApiService(String url){
        ApiService api = getRetrofitInstance(url).create(ApiService.class);
        return api;
    }

}
