package com.example.quinbuy.models;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Data{

	@SerializedName("relatedSearchTermsPosition")
	private int relatedSearchTermsPosition;

	@SerializedName("code")
	private String code;

	@SerializedName("productsPerRow")
	private int productsPerRow;

	@SerializedName("showRestrictedMsg")
	private boolean showRestrictedMsg;

	@SerializedName("interspersedCardPos")
	private InterspersedCardPos interspersedCardPos;

	@SerializedName("sellerNewSectionResponse")
	private SellerNewSectionResponse sellerNewSectionResponse;

	@SerializedName("materiallResponse")
	private boolean materiallResponse;

	@SerializedName("searchPageUrl")
	private String searchPageUrl;

	@SerializedName("responseFlags")
	private List<Object> responseFlags;

	@SerializedName("sellerAdsPosition")
	private List<Integer> sellerAdsPosition;

	@SerializedName("products")
	private List<ProductsItem> products;

	@SerializedName("intentApplied")
	private boolean intentApplied;

	@SerializedName("sponsorProducts")
	private List<SponsorProductsItem> sponsorProducts;

	@SerializedName("intentAttributes")
	private IntentAttributes intentAttributes;

	@SerializedName("sellerAdsPositionWebListView")
	private List<Integer> sellerAdsPositionWebListView;

	@SerializedName("nearbyLocationFailed")
	private boolean nearbyLocationFailed;

	@SerializedName("pageType")
	private List<Object> pageType;

	@SerializedName("searchTerm")
	private String searchTerm;

	@SerializedName("sorting")
	private Sorting sorting;

	@SerializedName("pageMetaDataResponse")
	private PageMetaDataResponse pageMetaDataResponse;

	@SerializedName("redirectionUrl")
	private String redirectionUrl;

	@SerializedName("ageRestricted")
	private boolean ageRestricted;

	@SerializedName("quickFilters")
	private List<Object> quickFilters;

	@SerializedName("maxOffers")
	private int maxOffers;

	@SerializedName("correctedSearchResponses")
	private List<Object> correctedSearchResponses;

	@SerializedName("nerApplied")
	private boolean nerApplied;

	@SerializedName("nerAttributes")
	private NerAttributes nerAttributes;

	@SerializedName("catIntentFailed")
	private boolean catIntentFailed;

	@SerializedName("paging")
	private Paging paging;

	@SerializedName("pageMetadata")
	private PageMetadata pageMetadata;

	@SerializedName("filters")
	private List<Object> filters;

	@SerializedName("sellerNewProducts")
	private List<Object> sellerNewProducts;

	@SerializedName("productInfo")
	private ProductInfo productInfo;

	@SerializedName("interspersedCardFilters")
	private List<Object> interspersedCardFilters;

	@SerializedName("selectedCategoryIds")
	private List<Object> selectedCategoryIds;

	@SerializedName("showAllCategories")
	private boolean showAllCategories;

	@SerializedName("suggestions")
	private List<Object> suggestions;

	@SerializedName("serverCurrentTime")
	private long serverCurrentTime;

	@SerializedName("trackerFields")
	private TrackerFields trackerFields;

	@SerializedName("topRatedProduct")
	private TopRatedProduct topRatedProduct;

	@SerializedName("needMoreSearchResponse")
	private boolean needMoreSearchResponse;

	@SerializedName("correctedNearbyLocation")
	private String correctedNearbyLocation;

	public void setRelatedSearchTermsPosition(int relatedSearchTermsPosition){
		this.relatedSearchTermsPosition = relatedSearchTermsPosition;
	}

	public int getRelatedSearchTermsPosition(){
		return relatedSearchTermsPosition;
	}

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	public void setProductsPerRow(int productsPerRow){
		this.productsPerRow = productsPerRow;
	}

	public int getProductsPerRow(){
		return productsPerRow;
	}

	public void setShowRestrictedMsg(boolean showRestrictedMsg){
		this.showRestrictedMsg = showRestrictedMsg;
	}

	public boolean isShowRestrictedMsg(){
		return showRestrictedMsg;
	}

	public void setInterspersedCardPos(InterspersedCardPos interspersedCardPos){
		this.interspersedCardPos = interspersedCardPos;
	}

	public InterspersedCardPos getInterspersedCardPos(){
		return interspersedCardPos;
	}

	public void setSellerNewSectionResponse(SellerNewSectionResponse sellerNewSectionResponse){
		this.sellerNewSectionResponse = sellerNewSectionResponse;
	}

	public SellerNewSectionResponse getSellerNewSectionResponse(){
		return sellerNewSectionResponse;
	}

	public void setMateriallResponse(boolean materiallResponse){
		this.materiallResponse = materiallResponse;
	}

	public boolean isMateriallResponse(){
		return materiallResponse;
	}

	public void setSearchPageUrl(String searchPageUrl){
		this.searchPageUrl = searchPageUrl;
	}

	public String getSearchPageUrl(){
		return searchPageUrl;
	}

	public void setResponseFlags(List<Object> responseFlags){
		this.responseFlags = responseFlags;
	}

	public List<Object> getResponseFlags(){
		return responseFlags;
	}

	public void setSellerAdsPosition(List<Integer> sellerAdsPosition){
		this.sellerAdsPosition = sellerAdsPosition;
	}

	public List<Integer> getSellerAdsPosition(){
		return sellerAdsPosition;
	}

	public void setProducts(List<ProductsItem> products){
		this.products = products;
	}

	public List<ProductsItem> getProducts(){
		return products;
	}

	public void setIntentApplied(boolean intentApplied){
		this.intentApplied = intentApplied;
	}

	public boolean isIntentApplied(){
		return intentApplied;
	}

	public void setSponsorProducts(List<SponsorProductsItem> sponsorProducts){
		this.sponsorProducts = sponsorProducts;
	}

	public List<SponsorProductsItem> getSponsorProducts(){
		return sponsorProducts;
	}

	public void setIntentAttributes(IntentAttributes intentAttributes){
		this.intentAttributes = intentAttributes;
	}

	public IntentAttributes getIntentAttributes(){
		return intentAttributes;
	}

	public void setSellerAdsPositionWebListView(List<Integer> sellerAdsPositionWebListView){
		this.sellerAdsPositionWebListView = sellerAdsPositionWebListView;
	}

	public List<Integer> getSellerAdsPositionWebListView(){
		return sellerAdsPositionWebListView;
	}

	public void setNearbyLocationFailed(boolean nearbyLocationFailed){
		this.nearbyLocationFailed = nearbyLocationFailed;
	}

	public boolean isNearbyLocationFailed(){
		return nearbyLocationFailed;
	}

	public void setPageType(List<Object> pageType){
		this.pageType = pageType;
	}

	public List<Object> getPageType(){
		return pageType;
	}

	public void setSearchTerm(String searchTerm){
		this.searchTerm = searchTerm;
	}

	public String getSearchTerm(){
		return searchTerm;
	}

	public void setSorting(Sorting sorting){
		this.sorting = sorting;
	}

	public Sorting getSorting(){
		return sorting;
	}

	public void setPageMetaDataResponse(PageMetaDataResponse pageMetaDataResponse){
		this.pageMetaDataResponse = pageMetaDataResponse;
	}

	public PageMetaDataResponse getPageMetaDataResponse(){
		return pageMetaDataResponse;
	}

	public void setRedirectionUrl(String redirectionUrl){
		this.redirectionUrl = redirectionUrl;
	}

	public String getRedirectionUrl(){
		return redirectionUrl;
	}

	public void setAgeRestricted(boolean ageRestricted){
		this.ageRestricted = ageRestricted;
	}

	public boolean isAgeRestricted(){
		return ageRestricted;
	}

	public void setQuickFilters(List<Object> quickFilters){
		this.quickFilters = quickFilters;
	}

	public List<Object> getQuickFilters(){
		return quickFilters;
	}

	public void setMaxOffers(int maxOffers){
		this.maxOffers = maxOffers;
	}

	public int getMaxOffers(){
		return maxOffers;
	}

	public void setCorrectedSearchResponses(List<Object> correctedSearchResponses){
		this.correctedSearchResponses = correctedSearchResponses;
	}

	public List<Object> getCorrectedSearchResponses(){
		return correctedSearchResponses;
	}

	public void setNerApplied(boolean nerApplied){
		this.nerApplied = nerApplied;
	}

	public boolean isNerApplied(){
		return nerApplied;
	}

	public void setNerAttributes(NerAttributes nerAttributes){
		this.nerAttributes = nerAttributes;
	}

	public NerAttributes getNerAttributes(){
		return nerAttributes;
	}

	public void setCatIntentFailed(boolean catIntentFailed){
		this.catIntentFailed = catIntentFailed;
	}

	public boolean isCatIntentFailed(){
		return catIntentFailed;
	}

	public void setPaging(Paging paging){
		this.paging = paging;
	}

	public Paging getPaging(){
		return paging;
	}

	public void setPageMetadata(PageMetadata pageMetadata){
		this.pageMetadata = pageMetadata;
	}

	public PageMetadata getPageMetadata(){
		return pageMetadata;
	}

	public void setFilters(List<Object> filters){
		this.filters = filters;
	}

	public List<Object> getFilters(){
		return filters;
	}

	public void setSellerNewProducts(List<Object> sellerNewProducts){
		this.sellerNewProducts = sellerNewProducts;
	}

	public List<Object> getSellerNewProducts(){
		return sellerNewProducts;
	}

	public void setProductInfo(ProductInfo productInfo){
		this.productInfo = productInfo;
	}

	public ProductInfo getProductInfo(){
		return productInfo;
	}

	public void setInterspersedCardFilters(List<Object> interspersedCardFilters){
		this.interspersedCardFilters = interspersedCardFilters;
	}

	public List<Object> getInterspersedCardFilters(){
		return interspersedCardFilters;
	}

	public void setSelectedCategoryIds(List<Object> selectedCategoryIds){
		this.selectedCategoryIds = selectedCategoryIds;
	}

	public List<Object> getSelectedCategoryIds(){
		return selectedCategoryIds;
	}

	public void setShowAllCategories(boolean showAllCategories){
		this.showAllCategories = showAllCategories;
	}

	public boolean isShowAllCategories(){
		return showAllCategories;
	}

	public void setSuggestions(List<Object> suggestions){
		this.suggestions = suggestions;
	}

	public List<Object> getSuggestions(){
		return suggestions;
	}

	public void setServerCurrentTime(long serverCurrentTime){
		this.serverCurrentTime = serverCurrentTime;
	}

	public long getServerCurrentTime(){
		return serverCurrentTime;
	}

	public void setTrackerFields(TrackerFields trackerFields){
		this.trackerFields = trackerFields;
	}

	public TrackerFields getTrackerFields(){
		return trackerFields;
	}

	public void setTopRatedProduct(TopRatedProduct topRatedProduct){
		this.topRatedProduct = topRatedProduct;
	}

	public TopRatedProduct getTopRatedProduct(){
		return topRatedProduct;
	}

	public void setNeedMoreSearchResponse(boolean needMoreSearchResponse){
		this.needMoreSearchResponse = needMoreSearchResponse;
	}

	public boolean isNeedMoreSearchResponse(){
		return needMoreSearchResponse;
	}

	public void setCorrectedNearbyLocation(String correctedNearbyLocation){
		this.correctedNearbyLocation = correctedNearbyLocation;
	}

	public String getCorrectedNearbyLocation(){
		return correctedNearbyLocation;
	}

	@Override
 	public String toString(){
		return 
			"Data{" + 
			"relatedSearchTermsPosition = '" + relatedSearchTermsPosition + '\'' + 
			",code = '" + code + '\'' + 
			",productsPerRow = '" + productsPerRow + '\'' + 
			",showRestrictedMsg = '" + showRestrictedMsg + '\'' + 
			",interspersedCardPos = '" + interspersedCardPos + '\'' + 
			",sellerNewSectionResponse = '" + sellerNewSectionResponse + '\'' + 
			",materiallResponse = '" + materiallResponse + '\'' + 
			",searchPageUrl = '" + searchPageUrl + '\'' + 
			",responseFlags = '" + responseFlags + '\'' + 
			",sellerAdsPosition = '" + sellerAdsPosition + '\'' + 
			",products = '" + products + '\'' + 
			",intentApplied = '" + intentApplied + '\'' + 
			",sponsorProducts = '" + sponsorProducts + '\'' + 
			",intentAttributes = '" + intentAttributes + '\'' + 
			",sellerAdsPositionWebListView = '" + sellerAdsPositionWebListView + '\'' + 
			",nearbyLocationFailed = '" + nearbyLocationFailed + '\'' + 
			",pageType = '" + pageType + '\'' + 
			",searchTerm = '" + searchTerm + '\'' + 
			",sorting = '" + sorting + '\'' + 
			",pageMetaDataResponse = '" + pageMetaDataResponse + '\'' + 
			",redirectionUrl = '" + redirectionUrl + '\'' + 
			",ageRestricted = '" + ageRestricted + '\'' + 
			",quickFilters = '" + quickFilters + '\'' + 
			",maxOffers = '" + maxOffers + '\'' + 
			",correctedSearchResponses = '" + correctedSearchResponses + '\'' + 
			",nerApplied = '" + nerApplied + '\'' + 
			",nerAttributes = '" + nerAttributes + '\'' + 
			",catIntentFailed = '" + catIntentFailed + '\'' + 
			",paging = '" + paging + '\'' + 
			",pageMetadata = '" + pageMetadata + '\'' + 
			",filters = '" + filters + '\'' + 
			",sellerNewProducts = '" + sellerNewProducts + '\'' + 
			",productInfo = '" + productInfo + '\'' + 
			",interspersedCardFilters = '" + interspersedCardFilters + '\'' + 
			",selectedCategoryIds = '" + selectedCategoryIds + '\'' + 
			",showAllCategories = '" + showAllCategories + '\'' + 
			",suggestions = '" + suggestions + '\'' + 
			",serverCurrentTime = '" + serverCurrentTime + '\'' + 
			",trackerFields = '" + trackerFields + '\'' + 
			",topRatedProduct = '" + topRatedProduct + '\'' + 
			",needMoreSearchResponse = '" + needMoreSearchResponse + '\'' + 
			",correctedNearbyLocation = '" + correctedNearbyLocation + '\'' + 
			"}";
		}
}