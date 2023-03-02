package com.example.quinbuy;

import android.app.Application;

import com.example.quinbuy.models.ProductsItem;
import com.example.quinbuy.utils.Constants;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MyApplication extends Application {
    Retrofit retrofit;
    //public static Set<ProductsItem> wishProducts = new HashSet<>();


    @Override
    public void onCreate() {

        super.onCreate();
        okhttp3.OkHttpClient client = new okhttp3.OkHttpClient.Builder().build();
        retrofit = new Retrofit.Builder()
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(Constants.HOST)
                .build();
    }
}
