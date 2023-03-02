package com.example.quinbuy.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class StoreClosingInfo implements Serializable {

	@SerializedName("delayShipping")
	private boolean delayShipping;

	@SerializedName("endDate")
	private long endDate;

	@SerializedName("storeClosed")
	private boolean storeClosed;

	public void setDelayShipping(boolean delayShipping){
		this.delayShipping = delayShipping;
	}

	public boolean isDelayShipping(){
		return delayShipping;
	}

	public void setEndDate(int endDate){
		this.endDate = endDate;
	}

	public long getEndDate(){
		return endDate;
	}

	public void setStoreClosed(boolean storeClosed){
		this.storeClosed = storeClosed;
	}

	public boolean isStoreClosed(){
		return storeClosed;
	}

	@Override
 	public String toString(){
		return 
			"StoreClosingInfo{" + 
			"delayShipping = '" + delayShipping + '\'' + 
			",endDate = '" + endDate + '\'' + 
			",storeClosed = '" + storeClosed + '\'' + 
			"}";
		}
}