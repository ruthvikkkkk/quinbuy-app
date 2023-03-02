package com.example.quinbuy.models;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ProductsItem implements Serializable {

	@SerializedName("storeClosingInfo")
	private StoreClosingInfo storeClosingInfo;

	@SerializedName("expandedProducts")
	private List<Object> expandedProducts;

	@SerializedName("soldRangeCount")
	private SoldRangeCount soldRangeCount;

	@SerializedName("isCheap")
	private boolean isCheap;

	@SerializedName("official")
	private boolean official;

	@SerializedName("merchantVoucherMessage")
	private String merchantVoucherMessage;

	@SerializedName("numLocations")
	private int numLocations;

	@SerializedName("merchantName")
	private String merchantName;

	@SerializedName("price")
	private Price price;

	@SerializedName("review")
	private Review review;

	@SerializedName("level0Id")
	private String level0Id;

	@SerializedName("id")
	private String id;

	@SerializedName("sku")
	private String sku;

	@SerializedName("brand")
	private String brand;

	@SerializedName("merchantVoucherCount")
	private int merchantVoucherCount;

	@SerializedName("productFeatures")
	private String productFeatures;

	@SerializedName("promoEndTime")
	private long promoEndTime;

	@SerializedName("categoryIdHierarchy")
	private List<String> categoryIdHierarchy;

	@SerializedName("merchantCode")
	private String merchantCode;

	@SerializedName("images")
	private List<String> images;

	@SerializedName("formattedId")
	private String formattedId;

	@SerializedName("itemSku")
	private String itemSku;

	@SerializedName("uniqueSellingPoint")
	private String uniqueSellingPoint;

	@SerializedName("cartLogisticOptions")
	private List<Object> cartLogisticOptions;

	@SerializedName("url")
	private String url;

	@SerializedName("itemCount")
	private int itemCount;

	@SerializedName("defaultSku")
	private String defaultSku;

	@SerializedName("tags")
	private List<String> tags;

	@SerializedName("badge")
	private Badge badge;

	@SerializedName("allCategories")
	private List<String> allCategories;

	@SerializedName("name")
	private String name;

	@SerializedName("attributes")
	private List<AttributesItem> attributes;

	@SerializedName("debugData")
	private DebugData debugData;

	@SerializedName("location")
	private String location;

	@SerializedName("rootCategory")
	private RootCategory rootCategory;

	@SerializedName("preorder")
	private boolean preorder;

	@SerializedName("status")
	private String status;

	public void setStoreClosingInfo(StoreClosingInfo storeClosingInfo){
		this.storeClosingInfo = storeClosingInfo;
	}

	public StoreClosingInfo getStoreClosingInfo(){
		return storeClosingInfo;
	}

	public void setExpandedProducts(List<Object> expandedProducts){
		this.expandedProducts = expandedProducts;
	}

	public List<Object> getExpandedProducts(){
		return expandedProducts;
	}

	public void setSoldRangeCount(SoldRangeCount soldRangeCount){
		this.soldRangeCount = soldRangeCount;
	}

	public SoldRangeCount getSoldRangeCount(){
		return soldRangeCount;
	}

	public void setIsCheap(boolean isCheap){
		this.isCheap = isCheap;
	}

	public boolean isIsCheap(){
		return isCheap;
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

	public void setNumLocations(int numLocations){
		this.numLocations = numLocations;
	}

	public int getNumLocations(){
		return numLocations;
	}

	public void setMerchantName(String merchantName){
		this.merchantName = merchantName;
	}

	public String getMerchantName(){
		return merchantName;
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

	public void setLevel0Id(String level0Id){
		this.level0Id = level0Id;
	}

	public String getLevel0Id(){
		return level0Id;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setSku(String sku){
		this.sku = sku;
	}

	public String getSku(){
		return sku;
	}

	public void setBrand(String brand){
		this.brand = brand;
	}

	public String getBrand(){
		return brand;
	}

	public void setMerchantVoucherCount(int merchantVoucherCount){
		this.merchantVoucherCount = merchantVoucherCount;
	}

	public int getMerchantVoucherCount(){
		return merchantVoucherCount;
	}

	public void setProductFeatures(String productFeatures){
		this.productFeatures = productFeatures;
	}

	public String getProductFeatures(){
		return productFeatures;
	}

	public void setPromoEndTime(int promoEndTime){
		this.promoEndTime = promoEndTime;
	}

	public long getPromoEndTime(){
		return promoEndTime;
	}

	public void setCategoryIdHierarchy(List<String> categoryIdHierarchy){
		this.categoryIdHierarchy = categoryIdHierarchy;
	}

	public List<String> getCategoryIdHierarchy(){
		return categoryIdHierarchy;
	}

	public void setMerchantCode(String merchantCode){
		this.merchantCode = merchantCode;
	}

	public String getMerchantCode(){
		return merchantCode;
	}

	public void setImages(List<String> images){
		this.images = images;
	}

	public List<String> getImages(){
		return images;
	}

	public void setFormattedId(String formattedId){
		this.formattedId = formattedId;
	}

	public String getFormattedId(){
		return formattedId;
	}

	public void setItemSku(String itemSku){
		this.itemSku = itemSku;
	}

	public String getItemSku(){
		return itemSku;
	}

	public void setUniqueSellingPoint(String uniqueSellingPoint){
		this.uniqueSellingPoint = uniqueSellingPoint;
	}

	public String getUniqueSellingPoint(){
		return uniqueSellingPoint;
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

	public void setAllCategories(List<String> allCategories){
		this.allCategories = allCategories;
	}

	public List<String> getAllCategories(){
		return allCategories;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setAttributes(List<AttributesItem> attributes){
		this.attributes = attributes;
	}

	public List<AttributesItem> getAttributes(){
		return attributes;
	}

	public void setDebugData(DebugData debugData){
		this.debugData = debugData;
	}

	public DebugData getDebugData(){
		return debugData;
	}

	public void setLocation(String location){
		this.location = location;
	}

	public String getLocation(){
		return location;
	}

	public void setRootCategory(RootCategory rootCategory){
		this.rootCategory = rootCategory;
	}

	public RootCategory getRootCategory(){
		return rootCategory;
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
			"ProductsItem{" + 
			"storeClosingInfo = '" + storeClosingInfo + '\'' + 
			",expandedProducts = '" + expandedProducts + '\'' + 
			",soldRangeCount = '" + soldRangeCount + '\'' + 
			",isCheap = '" + isCheap + '\'' + 
			",official = '" + official + '\'' + 
			",merchantVoucherMessage = '" + merchantVoucherMessage + '\'' + 
			",numLocations = '" + numLocations + '\'' + 
			",merchantName = '" + merchantName + '\'' + 
			",price = '" + price + '\'' + 
			",review = '" + review + '\'' + 
			",level0Id = '" + level0Id + '\'' + 
			",id = '" + id + '\'' + 
			",sku = '" + sku + '\'' + 
			",brand = '" + brand + '\'' + 
			",merchantVoucherCount = '" + merchantVoucherCount + '\'' + 
			",productFeatures = '" + productFeatures + '\'' + 
			",promoEndTime = '" + promoEndTime + '\'' + 
			",categoryIdHierarchy = '" + categoryIdHierarchy + '\'' + 
			",merchantCode = '" + merchantCode + '\'' + 
			",images = '" + images + '\'' + 
			",formattedId = '" + formattedId + '\'' + 
			",itemSku = '" + itemSku + '\'' + 
			",uniqueSellingPoint = '" + uniqueSellingPoint + '\'' + 
			",cartLogisticOptions = '" + cartLogisticOptions + '\'' + 
			",url = '" + url + '\'' + 
			",itemCount = '" + itemCount + '\'' + 
			",defaultSku = '" + defaultSku + '\'' + 
			",tags = '" + tags + '\'' + 
			",badge = '" + badge + '\'' + 
			",allCategories = '" + allCategories + '\'' + 
			",name = '" + name + '\'' + 
			",attributes = '" + attributes + '\'' + 
			",debugData = '" + debugData + '\'' + 
			",location = '" + location + '\'' + 
			",rootCategory = '" + rootCategory + '\'' + 
			",preorder = '" + preorder + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}