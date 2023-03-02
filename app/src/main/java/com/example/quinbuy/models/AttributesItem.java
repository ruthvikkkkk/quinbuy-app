package com.example.quinbuy.models;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public class AttributesItem implements Serializable {

	@SerializedName("values")
	private List<String> values;

	@SerializedName("count")
	private int count;

	@SerializedName("optionListingType")
	private String optionListingType;

	public void setValues(List<String> values){
		this.values = values;
	}

	public List<String> getValues(){
		return values;
	}

	public void setCount(int count){
		this.count = count;
	}

	public int getCount(){
		return count;
	}

	public void setOptionListingType(String optionListingType){
		this.optionListingType = optionListingType;
	}

	public String getOptionListingType(){
		return optionListingType;
	}

	@Override
 	public String toString(){
		return 
			"AttributesItem{" + 
			"values = '" + values + '\'' + 
			",count = '" + count + '\'' + 
			",optionListingType = '" + optionListingType + '\'' + 
			"}";
		}
}