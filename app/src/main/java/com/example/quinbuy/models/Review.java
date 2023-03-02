package com.example.quinbuy.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Review implements Serializable {

	@SerializedName("absoluteRating")
	private Object absoluteRating;

	@SerializedName("rating")
	private int rating;

	@SerializedName("count")
	private int count;

	public void setAbsoluteRating(Object absoluteRating){
		this.absoluteRating = absoluteRating;
	}

	public Object getAbsoluteRating(){
		return absoluteRating;
	}

	public void setRating(int rating){
		this.rating = rating;
	}

	public int getRating(){
		return rating;
	}

	public void setCount(int count){
		this.count = count;
	}

	public int getCount(){
		return count;
	}

	@Override
 	public String toString(){
		return 
			"Review{" + 
			"absoluteRating = '" + absoluteRating + '\'' + 
			",rating = '" + rating + '\'' + 
			",count = '" + count + '\'' + 
			"}";
		}
}