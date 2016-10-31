package com.example.yusuf.retrofit3demo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Yusuf on 25.10.2016.
 */

public interface ApiService {

    @GET("/maps/api/geocode/json")
    Call<Data> getCoords(@Query("address") String address);

    @GET("/v1/media/search")
    Call<instaData> getPhotos(@Query("lat") String lat, @Query("lng") String lng, @Query("access_token") String token);

}
