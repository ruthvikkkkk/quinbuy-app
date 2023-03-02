package com.example.quinbuy.models;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ExpandedProductsItem{

	@SerializedName("promoEndTime")
	private int promoEndTime;

	@SerializedName("images")
	private List<String> images;

	@SerializedName("official")
	private boolean official;

	@SerializedName("merchantVoucherMessage")
	private String merchantVoucherMessage;

	@SerializedName("cartLogisticOptions")
	private List<Object> cartLogisticOptions;

	@SerializedName("url")
	private String url;

	@SerializedName("numLocations")
	private int numLocations;

	@SerializedName("itemCount")
	private int itemCount;

	@SerializedName("defaultSku")
	private String defaultSku;

	@SerializedName("tags")
	private List<String> tags;

	@SerializedName("badge")
	private Badge badge;

	@SerializedName("price")
	private Price price;

	@SerializedName("review")
	private Review review;

	@SerializedName("merchantVoucherCount")
	private int merchantVoucherCount;

	@SerializedName("preorder")
	private boolean preorder;

	@SerializedName("status")
	private String status;

	public void setPromoEndTime(int promoEndTime){
		this.promoEndTime = promoEndTime;
	}

	public int getPromoEndTime(){
		return promoEndTime;
	}

	public void setImages(List<String> images){
		this.images = images;
	}

	public List<String> getImages(){
		return images;
	}

	public void setOfficial(boolean official){
		this.official = official;
	}

	public boolean isOfficial(){
		return official;
	}

	public void setMerchantVoucherMessage(String merchantVoucherMessage){
		this.merchantVoucherMessage = merchantVoucherMessage;
	}

	public String getMerchantVoucherMessage(){
		return merchantVoucherMessage;
	}

	public void setCartLogisticOptions(List<Object> cartLogisticOptions){
		this.cartLogisticOptions = cartLogisticOptions;
	}

	public List<Object> getCartLogisticOptions(){
		return cartLogisticOptions;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setNumLocations(int numLocations){
		this.numLocations = numLocations;
	}

	public int getNumLocations(){
		return numLocations;
	}

	public void setItemCount(int itemCount){
		this.itemCount = itemCount;
	}

	public int getItemCount(){
		return itemCount;
	}

	public void setDefaultSku(String defaultSku){
		this.defaultSku = defaultSku;
	}

	public String getDefaultSku(){
		return defaultSku;
	}

	public void setTags(List<String> tags){
		this.tags = tags;
	}

	public List<String> getTags(){
		return tags;
	}

	public void setBadge(Badge badge){
		this.badge = badge;
	}

	public Badge getBadge(){
		return badge;
	}

	public void setPrice(Price price){
		this.price = price;
	}

	public Price getPrice(){
		return price;
	}

	public void setReview(Review review){
		this.review = review;
	}

	public Review getReview(){
		return review;
	}

	public void setMerchantVoucherCount(int merchantVoucherCount){
		this.merchantVoucherCount = merchantVoucherCount;
	}

	public int getMerchantVoucherCount(){
		return merchantVoucherCount;
	}

	public void setPreorder(boolean preorder){
		this.preorder = preorder;
	}

	public boolean isPreorder(){
		return preorder;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"ExpandedProductsItem{" + 
			"promoEndTime = '" + promoEndTime + '\'' + 
			",images = '" + images + '\'' + 
			",official = '" + official + '\'' + 
			",merchantVoucherMessage = '" + merchantVoucherMessage + '\'' + 
			",cartLogisticOptions = '" + cartLogisticOptions + '\'' + 
			",url = '" + url + '\'' + 
			",numLocations = '" + numLocations + '\'' + 
			",itemCount = '" + itemCount + '\'' + 
			",defaultSku = '" + defaultSku + '\'' + 
			",tags = '" + tags + '\'' + 
			",badge = '" + badge + '\'' + 
			",price = '" + price + '\'' + 
			",review = '" + review + '\'' + 
			",merchantVoucherCount = '" + merchantVoucherCount + '\'' + 
			",preorder = '" + preorder + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}