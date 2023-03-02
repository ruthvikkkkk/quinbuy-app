package com.example.quinbuy.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Badge implements Serializable {

	@SerializedName("merchantBadge")
	private String merchantBadge;

	@SerializedName("merchantBadgeUrl")
	private String merchantBadgeUrl;

	public void setMerchantBadge(String merchantBadge){
		this.merchantBadge = merchantBadge;
	}

	public String getMerchantBadge(){
		return merchantBadge;
	}

	public void setMerchantBadgeUrl(String merchantBadgeUrl){
		this.merchantBadgeUrl = merchantBadgeUrl;
	}

	public String getMerchantBadgeUrl(){
		return merchantBadgeUrl;
	}

	@Override
 	public String toString(){
		return 
			"Badge{" + 
			"merchantBadge = '" + merchantBadge + '\'' + 
			",merchantBadgeUrl = '" + merchantBadgeUrl + '\'' + 
			"}";
		}
}