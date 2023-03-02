package com.example.quinbuy;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quinbuy.adapter.ProductListingAdapter;
import com.example.quinbuy.models.ProductsItem;
import com.example.quinbuy.utils.Constants;
import com.google.gson.Gson;

import java.util.ArrayList;

public class ProductWishlist extends AppCompatActivity implements ProductListingAdapter.IFullProductDetailCommunicator {

    SharedPreferences sharedPreferences;
    ArrayList<ProductsItem> wishList;
    Gson gson;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_wishlist);
        gson = new Gson();

        sharedPreferences = getSharedPreferences("wishlist", MODE_PRIVATE);

        wishList = new ArrayList<>();
        for(String key : sharedPreferences.getAll().keySet()){
            wishList.add(gson.fromJson(sharedPreferences.getString(key, "no object"), ProductsItem.class));
        }
        RecyclerView recyclerView = findViewById(R.id.wish_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(new ProductListingAdapter(wishList, ProductWishlist.this, Constants.LAYOUT_LINEAR));
    }

    @Override
    public void openFullProductActivity(ProductsItem productsItem) {
        Intent intent = new Intent(this, FullProductActivity.class);
        intent.putExtra("product",  productsItem);
        startActivity(intent);
    }

    @Override
    protected void onRestart() {
        sharedPreferences = getSharedPreferences("wishlist", MODE_PRIVATE);
        gson = new Gson();
        wishList = new ArrayList<>();
        for (String key : sharedPreferences.getAll().keySet()) {
            wishList.add(gson.fromJson(sharedPreferences.getString(key, "no object"), ProductsItem.class));
        }
        RecyclerView recyclerView = findViewById(R.id.wish_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(new ProductListingAdapter(wishList, ProductWishlist.this, Constants.LAYOUT_LINEAR));
        if(sharedPreferences.getAll().size() <= 0) {
            Toast.makeText(this, "Wishlist Empty :(", Toast.LENGTH_SHORT).show();
        }
        super.onRestart();
    }
}
