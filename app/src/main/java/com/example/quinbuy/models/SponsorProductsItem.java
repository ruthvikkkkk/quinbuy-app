package com.example.quinbuy.models;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class SponsorProductsItem{

	@SerializedName("salePrice")
	private Object salePrice;

	@SerializedName("uclid")
	private String uclid;

	@SerializedName("soldRangeCount")
	private SoldRangeCount soldRangeCount;

	@SerializedName("discount")
	private int discount;

	@SerializedName("official")
	private boolean official;

	@SerializedName("mrp")
	private Object mrp;

	@SerializedName("destinationUrl")
	private String destinationUrl;

	@SerializedName("tags")
	private List<Object> tags;

	@SerializedName("badge")
	private Badge badge;

	@SerializedName("score")
	private int score;

	@SerializedName("sellerId")
	private String sellerId;

	@SerializedName("sclid")
	private String sclid;

	@SerializedName("review")
	private Review review;

	@SerializedName("imageUrl")
	private String imageUrl;

	@SerializedName("name")
	private String name;

	@SerializedName("rank")
	private int rank;

	@SerializedName("location")
	private String location;

	@SerializedName("skuId")
	private String skuId;

	public void setSalePrice(Object salePrice){
		this.salePrice = salePrice;
	}

	public Object getSalePrice(){
		return salePrice;
	}

	public void setUclid(String uclid){
		this.uclid = uclid;
	}

	public String getUclid(){
		return uclid;
	}

	public void setSoldRangeCount(SoldRangeCount soldRangeCount){
		this.soldRangeCount = soldRangeCount;
	}

	public SoldRangeCount getSoldRangeCount(){
		return soldRangeCount;
	}

	public void setDiscount(int discount){
		this.discount = discount;
	}

	public int getDiscount(){
		return discount;
	}

	public void setOfficial(boolean official){
		this.official = official;
	}

	public boolean isOfficial(){
		return official;
	}

	public void setMrp(Object mrp){
		this.mrp = mrp;
	}

	public Object getMrp(){
		return mrp;
	}

	public void setDestinationUrl(String destinationUrl){
		this.destinationUrl = destinationUrl;
	}

	public String getDestinationUrl(){
		return destinationUrl;
	}

	public void setTags(List<Object> tags){
		this.tags = tags;
	}

	public List<Object> getTags(){
		return tags;
	}

	public void setBadge(Badge badge){
		this.badge = badge;
	}

	public Badge getBadge(){
		return badge;
	}

	public void setScore(int score){
		this.score = score;
	}

	public int getScore(){
		return score;
	}

	public void setSellerId(String sellerId){
		this.sellerId = sellerId;
	}

	public String getSellerId(){
		return sellerId;
	}

	public void setSclid(String sclid){
		this.sclid = sclid;
	}

	public String getSclid(){
		return sclid;
	}

	public void setReview(Review review){
		this.review = review;
	}

	public Review getReview(){
		return review;
	}

	public void setImageUrl(String imageUrl){
		this.imageUrl = imageUrl;
	}

	public String getImageUrl(){
		return imageUrl;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setRank(int rank){
		this.rank = rank;
	}

	public int getRank(){
		return rank;
	}

	public void setLocation(String location){
		this.location = location;
	}

	public String getLocation(){
		return location;
	}

	public void setSkuId(String skuId){
		this.skuId = skuId;
	}

	public String getSkuId(){
		return skuId;
	}

	@Override
 	public String toString(){
		return 
			"SponsorProductsItem{" + 
			"salePrice = '" + salePrice + '\'' + 
			",uclid = '" + uclid + '\'' + 
			",soldRangeCount = '" + soldRangeCount + '\'' + 
			",discount = '" + discount + '\'' + 
			",official = '" + official + '\'' + 
			",mrp = '" + mrp + '\'' + 
			",destinationUrl = '" + destinationUrl + '\'' + 
			",tags = '" + tags + '\'' + 
			",badge = '" + badge + '\'' + 
			",score = '" + score + '\'' + 
			",sellerId = '" + sellerId + '\'' + 
			",sclid = '" + sclid + '\'' + 
			",review = '" + review + '\'' + 
			",imageUrl = '" + imageUrl + '\'' + 
			",name = '" + name + '\'' + 
			",rank = '" + rank + '\'' + 
			",location = '" + location + '\'' + 
			",skuId = '" + skuId + '\'' + 
			"}";
		}
}