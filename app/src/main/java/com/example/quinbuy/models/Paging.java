package com.example.quinbuy.models;

import com.google.gson.annotations.SerializedName;

public class Paging{

	@SerializedName("total_item")
	private int totalItem;

	@SerializedName("total_page")
	private int totalPage;

	@SerializedName("page")
	private int page;

	@SerializedName("item_per_page")
	private int itemPerPage;

	public void setTotalItem(int totalItem){
		this.totalItem = totalItem;
	}

	public int getTotalItem(){
		return totalItem;
	}

	public void setTotalPage(int totalPage){
		this.totalPage = totalPage;
	}

	public int getTotalPage(){
		return totalPage;
	}

	public void setPage(int page){
		this.page = page;
	}

	public int getPage(){
		return page;
	}

	public void setItemPerPage(int itemPerPage){
		this.itemPerPage = itemPerPage;
	}

	public int getItemPerPage(){
		return itemPerPage;
	}

	@Override
 	public String toString(){
		return 
			"Paging{" + 
			"total_item = '" + totalItem + '\'' + 
			",total_page = '" + totalPage + '\'' + 
			",page = '" + page + '\'' + 
			",item_per_page = '" + itemPerPage + '\'' + 
			"}";
		}
}