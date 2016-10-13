package com.example.yusuf.retrofit2demo;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Yusuf on 09.10.2016.
 */

public class RetroClient {

    private static final String ROOT_URL = "https://api.github.com/";

    // Get Retrofit instance
    private static Retrofit getRefrofitInstance(){
        Retrofit rf = new Retrofit.Builder()
                .baseUrl(ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return rf;
    }

    // Get API Service
    // Return Api Service
    public static ApiService getApiService(){
        ApiService api = getRefrofitInstance().create(ApiService.class);
        return api;
    }

}
