package com.example.quinbuy.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class SoldRangeCount implements Serializable {

	@SerializedName("en")
	private String en;

	@SerializedName("id")
	private String id;

	public void setEn(String en){
		this.en = en;
	}

	public String getEn(){
		return en;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"SoldRangeCount{" + 
			"en = '" + en + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}