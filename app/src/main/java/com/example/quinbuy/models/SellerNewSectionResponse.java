package com.example.quinbuy.models;

import com.google.gson.annotations.SerializedName;

public class SellerNewSectionResponse{

	@SerializedName("newSellerProdBadge")
	private String newSellerProdBadge;

	@SerializedName("newSellerProdBg")
	private String newSellerProdBg;

	@SerializedName("newSellerProdSecRow")
	private int newSellerProdSecRow;

	@SerializedName("newSellerProdTitle")
	private String newSellerProdTitle;

	public void setNewSellerProdBadge(String newSellerProdBadge){
		this.newSellerProdBadge = newSellerProdBadge;
	}

	public String getNewSellerProdBadge(){
		return newSellerProdBadge;
	}

	public void setNewSellerProdBg(String newSellerProdBg){
		this.newSellerProdBg = newSellerProdBg;
	}

	public String getNewSellerProdBg(){
		return newSellerProdBg;
	}

	public void setNewSellerProdSecRow(int newSellerProdSecRow){
		this.newSellerProdSecRow = newSellerProdSecRow;
	}

	public int getNewSellerProdSecRow(){
		return newSellerProdSecRow;
	}

	public void setNewSellerProdTitle(String newSellerProdTitle){
		this.newSellerProdTitle = newSellerProdTitle;
	}

	public String getNewSellerProdTitle(){
		return newSellerProdTitle;
	}

	@Override
 	public String toString(){
		return 
			"SellerNewSectionResponse{" + 
			"newSellerProdBadge = '" + newSellerProdBadge + '\'' + 
			",newSellerProdBg = '" + newSellerProdBg + '\'' + 
			",newSellerProdSecRow = '" + newSellerProdSecRow + '\'' + 
			",newSellerProdTitle = '" + newSellerProdTitle + '\'' + 
			"}";
		}
}