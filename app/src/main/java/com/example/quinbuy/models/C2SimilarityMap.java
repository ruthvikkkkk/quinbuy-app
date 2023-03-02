package com.example.quinbuy.models;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class C2SimilarityMap{

	@SerializedName("KA-1000004")
	private List<String> kA1000004;

	@SerializedName("KA-1000002")
	private List<String> kA1000002;

	@SerializedName("TA-1000003")
	private List<String> tA1000003;

	@SerializedName("HA-1000002")
	private List<String> hA1000002;

	@SerializedName("TU-1000021")
	private List<String> tU1000021;

	public void setKA1000004(List<String> kA1000004){
		this.kA1000004 = kA1000004;
	}

	public List<String> getKA1000004(){
		return kA1000004;
	}

	public void setKA1000002(List<String> kA1000002){
		this.kA1000002 = kA1000002;
	}

	public List<String> getKA1000002(){
		return kA1000002;
	}

	public void setTA1000003(List<String> tA1000003){
		this.tA1000003 = tA1000003;
	}

	public List<String> getTA1000003(){
		return tA1000003;
	}

	public void setHA1000002(List<String> hA1000002){
		this.hA1000002 = hA1000002;
	}

	public List<String> getHA1000002(){
		return hA1000002;
	}

	public void setTU1000021(List<String> tU1000021){
		this.tU1000021 = tU1000021;
	}

	public List<String> getTU1000021(){
		return tU1000021;
	}

	@Override
 	public String toString(){
		return 
			"C2SimilarityMap{" + 
			"kA-1000004 = '" + kA1000004 + '\'' + 
			",kA-1000002 = '" + kA1000002 + '\'' + 
			",tA-1000003 = '" + tA1000003 + '\'' + 
			",hA-1000002 = '" + hA1000002 + '\'' + 
			",tU-1000021 = '" + tU1000021 + '\'' + 
			"}";
		}
}