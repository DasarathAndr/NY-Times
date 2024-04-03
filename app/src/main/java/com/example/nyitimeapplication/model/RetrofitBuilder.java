package com.example.nyitimeapplication.model;

import com.example.nyitimeapplication.apiinterface.ApiInterface;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitBuilder {
    private static RetrofitBuilder instance = null;
   ApiInterface apiInterface;

    private RetrofitBuilder() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiInterface.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        apiInterface = retrofit.create(ApiInterface.class);
    }

    public static synchronized RetrofitBuilder getInstance() {
        if (instance == null) {
            instance = new RetrofitBuilder();
        }
        return instance;
    }

    public ApiInterface getApiInterface() {
        return apiInterface;
    }
}
