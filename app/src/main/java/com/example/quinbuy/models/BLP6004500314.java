package com.example.quinbuy.models;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class BLP6004500314{

	@SerializedName("tags")
	private List<String> tags;

	public void setTags(List<String> tags){
		this.tags = tags;
	}

	public List<String> getTags(){
		return tags;
	}

	@Override
 	public String toString(){
		return 
			"BLP6004500314{" + 
			"tags = '" + tags + '\'' + 
			"}";
		}
}