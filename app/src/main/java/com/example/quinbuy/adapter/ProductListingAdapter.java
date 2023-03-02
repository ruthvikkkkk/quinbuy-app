package com.example.quinbuy.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.quinbuy.R;
import com.example.quinbuy.models.ProductsItem;
import com.example.quinbuy.utils.Constants;

import java.util.List;

public class ProductListingAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<ProductsItem> productsList;
    Boolean isWish = false;
    IFullProductDetailCommunicator fullProductDetailCommunicator;
    int layoutType;


    public ProductListingAdapter(List<ProductsItem> myWish, int layoutType){
        this.productsList = myWish;
        this.isWish = true;
        this.layoutType = layoutType;
    }

    public ProductListingAdapter(List<ProductsItem> productsList, IFullProductDetailCommunicator communicator, int layoutType){
        this.productsList = productsList;
        fullProductDetailCommunicator = communicator;
        this.layoutType = layoutType;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        if(layoutType == Constants.LAYOUT_GRID) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_vertical_card, parent, false);
        }else{
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_card, parent, false);
        }
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ProductsItem productDetailsItem = productsList.get(position);
        ((ProductViewHolder) holder).productBind(productDetailsItem);
        //String imageUrl = productDetailsItem.getImages().get(0);
    }

    @Override
    public int getItemCount() {
        return productsList.size();
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder{

        View view;
        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    fullProductDetailCommunicator.openFullProductActivity(productsList.get(getAdapterPosition()));
                }
            });
            view.findViewById(R.id.bt_show_product).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    fullProductDetailCommunicator.openFullProductActivity(productsList.get(getAdapterPosition()));
                }
            });
        }

        public void productBind(ProductsItem productDetailsItem){
            if(isWish) {
                ((Button) view.findViewById(R.id.bt_show_product)).setVisibility(View.INVISIBLE);
            }
            if(layoutType == Constants.LAYOUT_GRID) {
                ((TextView) view.findViewById(R.id.vertical_card_product_name2)).setText(productDetailsItem.getName());
                ((TextView) view.findViewById(R.id.vertical_card_product_price2)).setText(productDetailsItem.getPrice().getPriceDisplay());
                ((TextView) view.findViewById(R.id.vertical_card_product_rating2)).setText(String.valueOf(productDetailsItem.getReview().getRating()) + " stars");
                //((ImageView) view.findViewById(R.id.card_product_image)).setImageDrawable(Glide.get());
                Glide.with(view.getContext()).load(productDetailsItem.getImages().get(0)).into((ImageView) view.findViewById(R.id.vertical_card_product_image2));
            }else{
                ((TextView) view.findViewById(R.id.card_product_name)).setText(productDetailsItem.getName());
                ((TextView) view.findViewById(R.id.card_product_price)).setText(productDetailsItem.getPrice().getPriceDisplay());
                ((TextView) view.findViewById(R.id.card_product_rating)).setText(String.valueOf(productDetailsItem.getReview().getRating()) + " stars");
                //((ImageView) view.findViewById(R.id.card_product_image)).setImageDrawable(Glide.get());
                Glide.with(view.getContext()).load(productDetailsItem.getImages().get(0)).into((ImageView) view.findViewById(R.id.card_product_image));
            }
        }
    }

    public interface IFullProductDetailCommunicator{
        void openFullProductActivity(ProductsItem productsItem);
    }
}
