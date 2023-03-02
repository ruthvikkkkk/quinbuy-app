package com.example.quinbuy.models;

import com.google.gson.annotations.SerializedName;

public class PageMetadata{

	@SerializedName("productComparisonOverriddenC2s")
	private String productComparisonOverriddenC2s;

	@SerializedName("productComparisonAllowedC1s")
	private String productComparisonAllowedC1s;

	@SerializedName("showProductComparison")
	private String showProductComparison;

	public void setProductComparisonOverriddenC2s(String productComparisonOverriddenC2s){
		this.productComparisonOverriddenC2s = productComparisonOverriddenC2s;
	}

	public String getProductComparisonOverriddenC2s(){
		return productComparisonOverriddenC2s;
	}

	public void setProductComparisonAllowedC1s(String productComparisonAllowedC1s){
		this.productComparisonAllowedC1s = productComparisonAllowedC1s;
	}

	public String getProductComparisonAllowedC1s(){
		return productComparisonAllowedC1s;
	}

	public void setShowProductComparison(String showProductComparison){
		this.showProductComparison = showProductComparison;
	}

	public String getShowProductComparison(){
		return showProductComparison;
	}

	@Override
 	public String toString(){
		return 
			"PageMetadata{" + 
			"productComparisonOverriddenC2s = '" + productComparisonOverriddenC2s + '\'' + 
			",productComparisonAllowedC1s = '" + productComparisonAllowedC1s + '\'' + 
			",showProductComparison = '" + showProductComparison + '\'' + 
			"}";
		}
}