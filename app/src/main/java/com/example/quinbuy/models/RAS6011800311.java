package com.example.quinbuy.models;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class RAS6011800311{

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
			"RAS6011800311{" + 
			"tags = '" + tags + '\'' + 
			"}";
		}
}