package com.example.quinbuy.models;

import com.google.gson.annotations.SerializedName;

public class PageMetaDataResponse{

	@SerializedName("c3SimilarityMap")
	private C3SimilarityMap c3SimilarityMap;

	@SerializedName("c2SimilarityMap")
	private C2SimilarityMap c2SimilarityMap;

	public void setC3SimilarityMap(C3SimilarityMap c3SimilarityMap){
		this.c3SimilarityMap = c3SimilarityMap;
	}

	public C3SimilarityMap getC3SimilarityMap(){
		return c3SimilarityMap;
	}

	public void setC2SimilarityMap(C2SimilarityMap c2SimilarityMap){
		this.c2SimilarityMap = c2SimilarityMap;
	}

	public C2SimilarityMap getC2SimilarityMap(){
		return c2SimilarityMap;
	}

	@Override
 	public String toString(){
		return 
			"PageMetaDataResponse{" + 
			"c3SimilarityMap = '" + c3SimilarityMap + '\'' + 
			",c2SimilarityMap = '" + c2SimilarityMap + '\'' + 
			"}";
		}
}