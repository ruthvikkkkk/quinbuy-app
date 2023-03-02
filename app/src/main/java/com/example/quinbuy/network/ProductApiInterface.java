package com.example.quinbuy.network;

import com.example.quinbuy.models.ProductDetails;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface ProductApiInterface {
    @Headers({"user-agent:BlibliAndroid/0.0.1"})
    @GET("/backend/search/products")
    public Call<ProductDetails> getProducts(@Query("searchTerm") String searchTerm, @Query("showFacets") boolean showFacets, @Query("itemPerPage") int itemPerPage, @Query("page") int page, @Query("start") int start);
}
