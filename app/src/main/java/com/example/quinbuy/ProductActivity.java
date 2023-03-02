package com.example.quinbuy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.quinbuy.adapter.ProductListingAdapter;
import com.example.quinbuy.models.Data;
import com.example.quinbuy.models.ProductDetails;
import com.example.quinbuy.models.ProductsItem;
import com.example.quinbuy.network.ProductApiInterface;
import com.example.quinbuy.utils.Constants;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProductActivity extends AppCompatActivity implements ProductListingAdapter.IFullProductDetailCommunicator {

    RecyclerView recyclerView;
    List<ProductsItem> productsItems = new ArrayList<>();
    Data data;
    int layoutType;
    int page = 1;
    int size;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        ProgressBar progressBar = findViewById(R.id.progressBar2);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(View.VISIBLE);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        String searchTerm = getIntent().getStringExtra("searchTerm");
        actionBar.setTitle(searchTerm);

        MyApplication myApplication = (MyApplication) getApplication();
        ProductApiInterface productApiInterface = myApplication.retrofit.create(ProductApiInterface.class);
        recyclerView = findViewById(R.id.product_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));


        productApiInterface.getProducts(searchTerm, false, 20, 0, 0).enqueue(new Callback<ProductDetails>() {
            @Override
            public void onResponse(Call<ProductDetails> call, Response<ProductDetails> response) {
                try {
                    data = response.body().getData();
                    productsItems.addAll(data.getProducts());
//                    if(productsItems.size() == 0){
//                        Toast.makeText(myApplication, "No Data Found!", Toast.LENGTH_SHORT).show();
//                        finish();
//                    }
                    //int productSize = productsItems.size();
                    recyclerView.setAdapter(new ProductListingAdapter(productsItems, ProductActivity.this, layoutType));
                    progressBar.setVisibility(View.INVISIBLE);
                    Log.i("RETROFIT SUCCESS", productsItems.toString());
                }catch (Exception e){
                    Toast.makeText(myApplication, "No Data Found!", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }

            @Override
            public void onFailure(Call<ProductDetails> call, Throwable t) {
                Toast.makeText(myApplication, "Try again!", Toast.LENGTH_SHORT).show();
                finish();
                Log.i("RETROFIT ERROR", t+"");
            }
        });

        //recyclerView.getAdapter().notifyItemRangeChanged(0, 20);
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                if(!recyclerView.canScrollVertically(1)){
                //if(recyclerView.getLayoutManager().getChildCount() >= recyclerView.getLayoutManager().getItemCount()-7){
                    progressBar.setVisibility(View.VISIBLE);
                    //recyclerView.setNestedScrollingEnabled(false);
                    productApiInterface.getProducts(searchTerm, false, 20, page++, productsItems.size()).enqueue(new Callback<ProductDetails>() {
                        @Override
                        public void onResponse(Call<ProductDetails> call, Response<ProductDetails> response) {
                            try{
                                if(response.isSuccessful() && response.body() != null){
                                    //size = productsItems.size();
//                                    for(int i = size; i < response.body().getData().getProducts().size(); i++){
//                                        productsItems.add(response.body().getData().getProducts().get(i));
//                                    }
                                    productsItems = (response.body().getData().getProducts());
                                }
                                recyclerView.getAdapter().notifyItemRangeChanged(productsItems.size(), 20);
                                progressBar.setVisibility(View.INVISIBLE);
                                recyclerView.setNestedScrollingEnabled(true);
                            }catch (Exception e){
                                Toast.makeText(myApplication, "No data Found!", Toast.LENGTH_SHORT).show();
                            }finally {
                                Log.i("RETROFIT SUCCESS", response.toString());
                            }
                        }

                        @Override
                        public void onFailure(Call<ProductDetails> call, Throwable t) {
                            Toast.makeText(myApplication, "Try again!", Toast.LENGTH_SHORT).show();
                            finish();
                            Log.i("RETROFIT ERROR", t+"");
                        }
                    });
                }
            }
        });

    }

    @Override
    public void openFullProductActivity(ProductsItem productsItem) {
        Intent intent = new Intent(ProductActivity.this, FullProductActivity.class);
        intent.putExtra("product",  productsItem);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.layout_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.menu_linear:
                recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
                layoutType = Constants.LAYOUT_LINEAR;
                recyclerView.setAdapter(new ProductListingAdapter(productsItems, ProductActivity.this, layoutType));
                return true;
            case R.id.menu_grid:
                recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 2));
                layoutType = Constants.LAYOUT_GRID;
                recyclerView.setAdapter(new ProductListingAdapter(productsItems, ProductActivity.this, layoutType));
                return true;
            case R.id.menu_staggered:
                recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
                layoutType = Constants.LAYOUT_GRID;
                recyclerView.setAdapter(new ProductListingAdapter(productsItems, ProductActivity.this, layoutType));
                return true;
            case android.R.id.home:
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}