package com.example.yusuf.retrofit2demo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Yusuf on 09.10.2016.
 */

public interface ApiService {

    @GET("search/users")
    Call<User> getGithubUser(@Query("q") String name);

}
