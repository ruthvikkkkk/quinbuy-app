package com.example.quinbuy.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Price implements Serializable {

	@SerializedName("priceDisplay")
	private String priceDisplay;

	@SerializedName("offerPriceDisplay")
	private String offerPriceDisplay;

	@SerializedName("minPrice")
	private Object minPrice;

	@SerializedName("discount")
	private int discount;

	@SerializedName("strikeThroughPriceDisplay")
	private String strikeThroughPriceDisplay;

	public void setPriceDisplay(String priceDisplay){
		this.priceDisplay = priceDisplay;
	}

	public String getPriceDisplay(){
		return priceDisplay;
	}

	public void setOfferPriceDisplay(String offerPriceDisplay){
		this.offerPriceDisplay = offerPriceDisplay;
	}

	public String getOfferPriceDisplay(){
		return offerPriceDisplay;
	}

	public void setMinPrice(Object minPrice){
		this.minPrice = minPrice;
	}

	public Object getMinPrice(){
		return minPrice;
	}

	public void setDiscount(int discount){
		this.discount = discount;
	}

	public int getDiscount(){
		return discount;
	}

	public void setStrikeThroughPriceDisplay(String strikeThroughPriceDisplay){
		this.strikeThroughPriceDisplay = strikeThroughPriceDisplay;
	}

	public String getStrikeThroughPriceDisplay(){
		return strikeThroughPriceDisplay;
	}

	@Override
 	public String toString(){
		return 
			"Price{" + 
			"priceDisplay = '" + priceDisplay + '\'' + 
			",offerPriceDisplay = '" + offerPriceDisplay + '\'' + 
			",minPrice = '" + minPrice + '\'' + 
			",discount = '" + discount + '\'' + 
			",strikeThroughPriceDisplay = '" + strikeThroughPriceDisplay + '\'' + 
			"}";
		}
}