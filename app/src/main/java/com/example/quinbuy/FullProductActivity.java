package com.example.quinbuy;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.quinbuy.models.ProductsItem;
import com.google.gson.Gson;

public class FullProductActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_full_detail);

        SharedPreferences sharedPreferences = getSharedPreferences("wishlist", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Gson gson = new Gson();

        ProductsItem productsItem = (ProductsItem) getIntent().getSerializableExtra("product");
        ((TextView) findViewById(R.id.tv_full_product_name)).setText(productsItem.getName());
        ((TextView) findViewById(R.id.tv_full_product_price)).setText(productsItem.getPrice().getPriceDisplay());
        ((TextView) findViewById(R.id.tv_full_product_type)).setText(productsItem.getRootCategory().getName());
        ((TextView) findViewById(R.id.tv_full_product_rating)).setText(productsItem.getReview().getRating() + " stars");
        //ScrollView scrollView = findViewById(R.id.full_product_scroll);
        //LinearLayout layout = scrollView.findViewById(R.id.full_scroll_linear);
//        for(String url : productsItem.getImages()){
//            ImageView imageView = new ImageView(getApplicationContext());
//            imageView.setId();
//        }
        Glide.with(getApplicationContext()).load(productsItem.getImages().get(0)).into(((ImageView) findViewById(R.id.tv_full_product_image)));
        ImageView wishlistImage = findViewById(R.id.full_product_wish);
        if(sharedPreferences.getString(productsItem.getId(), "1").equals("1")) {
            wishlistImage.setImageDrawable(getDrawable(R.drawable.no_wishlist));
        }else{
            wishlistImage.setImageDrawable(getDrawable(R.drawable.yes_wishlist));
        }
        wishlistImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(wishlistImage.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.no_wishlist).getConstantState())) {
                    wishlistImage.setImageDrawable(getDrawable(R.drawable.yes_wishlist));
                    editor.putString(productsItem.getId(), gson.toJson(productsItem));
                    editor.commit();
                    //wishProducts.add(productsItem);
                }else{
                    wishlistImage.setImageDrawable(getDrawable(R.drawable.no_wishlist));
                    editor.remove(productsItem.getId());
                    editor.commit();
                    //wishProducts.remove(productsItem);
                }
            }
        });

        findViewById(R.id.tv_buy_product).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String productUrl = "https://www.blibli.com";
                productUrl += productsItem.getUrl();
                Intent intent = new Intent(FullProductActivity.this, WebProduct.class);
                intent.putExtra("url", productUrl);
                startActivity(intent);
            }
        });
    }
}
